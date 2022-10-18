package org.example.deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import org.example.model.OrderV1;

import java.io.IOException;

public class OrderDeserializer implements Deserializer<OrderV1> {

    @Override
    public OrderV1 deserialize(String s, byte[] bytes) {

        OrderV1 orderV1 = null;
        ObjectMapper mapper = new ObjectMapper();

        try {
            orderV1 = mapper.readValue(bytes, OrderV1.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return orderV1;
    }
}
