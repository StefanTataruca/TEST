package com.example.Test;


import java.util.Map;

public class AtreidesDecoder implements MessageDecoder {
    private final Map<Character, Character> config;

    public AtreidesDecoder() {
        config = DecodingConfiguration.getInstance().getAtreidesConfig();
    }

    @Override
    public String decode(String message) {
        return message.chars()
                .mapToObj(c -> config.getOrDefault((char) c, (char) c))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
