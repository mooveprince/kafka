package org.example;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class OrderProducerWithAvroSerializer {

    public static void main( String[] args ) {

        Properties props = new Properties();
        props.setProperty("bootstrap.servers", "localhost:9092");
        props.setProperty("key.serializer", KafkaAvroSerializer.class.getName());
        props.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
        props.setProperty("schema.registry.url", "http://localhost:8081");

        KafkaProducer<String, com.examples.kafka.avro.Order> producer = new KafkaProducer<String, com.examples.kafka.avro.Order>(props);

        com.examples.kafka.avro.Order order = new com.examples.kafka.avro.Order();
        order.setCustomerName("Moove");
        order.setQuantity(2);
        order.setProduct("Harry Potter");

        ProducerRecord<String, com.examples.kafka.avro.Order> record = new ProducerRecord<String, com.examples.kafka.avro.Order>("OrderAvroTopic", "HP Book", order);

        try {
            producer.send(record);
            System.out.println("Message was sent successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            producer.close();
        }


    }

}
