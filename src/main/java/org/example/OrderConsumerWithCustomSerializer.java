package org.example;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.example.model.OrderV1;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class OrderConsumerWithCustomSerializer {

    public static void main(String[] args) {

        Properties props = new Properties();
        props.setProperty("bootstrap.servers", "localhost:9092");
        props.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.setProperty("value.deserializer", "org.example.deserializer.OrderDeserializer");
        props.setProperty("group.id", "OrderGroup");

        KafkaConsumer<String, OrderV1> consumer = new KafkaConsumer<String, OrderV1>(props);
        consumer.subscribe(Collections.singletonList("OrderCSTopic"));

        ConsumerRecords<String, OrderV1> orders = consumer.poll(Duration.ofSeconds(20));

        for (ConsumerRecord<String, OrderV1> order : orders) {
            System.out.println("Product Name " + order.key());
            System.out.println("Product value " + order.value().toString());
        }

        consumer.close();



    }

}
