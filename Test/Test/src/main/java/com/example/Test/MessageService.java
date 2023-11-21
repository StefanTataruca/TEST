// src/main/java/com/example/test/MessageService.java
package com.example.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MessageService {
    public List<Message> decodeMessages() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Message> messages = objectMapper.readValue(new ClassPathResource("messages.json").getInputStream(), new TypeReference<>() {});

        return messages.stream().map(this::decodeMessage).collect(Collectors.toList());
    }

    private Message decodeMessage(Message message) {
        MessageDecoder decoder = DecoderFactory.getDecoder(message.getHouse());
        String decodedMessage = decoder.decode(message.getMessage());
        message.setMessage(decodedMessage);
        return message;
    }
}
