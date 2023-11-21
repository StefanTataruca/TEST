// src/main/java/com/example/test/DecoderFactory.java
package com.example.Test;

public class DecoderFactory {
    public static MessageDecoder getDecoder(String house) {
        if ("atreides".equalsIgnoreCase(house)) {
            return new AtreidesDecoder();
        } else if ("harkonnen".equalsIgnoreCase(house)) {
            return new HarkonnenDecoder();
        }
        throw new IllegalArgumentException("Unknown house: " + house);
    }
}
