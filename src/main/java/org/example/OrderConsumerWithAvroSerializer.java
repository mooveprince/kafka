package org.example;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.example.model.OrderV1;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class OrderConsumerWithAvroSerializer {

    public static void main(String[] args) {

        Properties props = new Properties();
        props.setProperty("bootstrap.servers", "localhost:9092");
        props.setProperty("key.deserializer", KafkaAvroDeserializer.class.getName());
        props.setProperty("value.deserializer", KafkaAvroDeserializer.class.getName());
        props.setProperty("group.id", "OrderGroup");
        props.setProperty("schema.registry.url", "http://localhost:8081");
        props.setProperty("specific.avro.reader", "true");

        KafkaConsumer<String, com.examples.kafka.avro.Order> consumer = new KafkaConsumer<String, com.examples.kafka.avro.Order>(props);
        consumer.subscribe(Collections.singletonList("OrderAvroTopic"));

        ConsumerRecords<String, com.examples.kafka.avro.Order> orders = consumer.poll(Duration.ofSeconds(20));

        for (ConsumerRecord<String, com.examples.kafka.avro.Order> order : orders) {
            System.out.println("Product Name " + order.key());
            System.out.println("Product value " + order.value().toString());
        }

        consumer.close();



    }
}
