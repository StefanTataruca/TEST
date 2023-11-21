package com.example.Test;

import java.util.Map;

public class HarkonnenDecoder implements MessageDecoder {
    private final Map<Character, Character> config;

    public HarkonnenDecoder() {
        config = DecodingConfiguration.getInstance().getHarkonnenConfig();
    }

    @Override
    public String decode(String message) {
        return message.chars()
                .mapToObj(c -> config.getOrDefault((char) c, (char) c))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}