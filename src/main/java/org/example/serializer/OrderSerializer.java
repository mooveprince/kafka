package org.example.serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;
import org.example.model.OrderV1;

public class OrderSerializer implements Serializer<OrderV1> {

    @Override
    public byte[] serialize(String s, OrderV1 orderV1) {

        byte[] response;

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            response = objectMapper.writeValueAsString(orderV1).getBytes();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return response;
    }
}
