package org.example;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.example.model.OrderV1;

import java.util.Properties;

/**
 * Hello world!
 *
 */
public class OrderProducerWithCustomSerializer
{
    public static void main( String[] args ) {

        Properties props = new Properties();
        props.setProperty("bootstrap.servers", "localhost:9092");
        props.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.setProperty("value.serializer", "org.example.serializer.OrderSerializer");

        KafkaProducer<String, OrderV1> producer = new KafkaProducer<String, OrderV1>(props);

        OrderV1 orderV1 = OrderV1.builder()
                .customerName("Moove")
                .quality(2)
                .product("Harry Potter")
                .build();

        ProducerRecord<String, OrderV1> record = new ProducerRecord<String, OrderV1>("OrderCSTopic", "HP Book", orderV1);

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
