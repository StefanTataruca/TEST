// src/main/java/com/example/test/DecodingConfiguration.java
package com.example.Test;

import java.util.HashMap;
import java.util.Map;

public class DecodingConfiguration {
    private static DecodingConfiguration instance;
    private final Map<Character, Character> atreidesConfig;
    private final Map<Character, Character> harkonnenConfig;

    private DecodingConfiguration() {
        // Configurația pentru Atreides
        atreidesConfig = new HashMap<>();
        atreidesConfig.put('J', 'M');
        atreidesConfig.put('b', 'e');
        atreidesConfig.put('p', 's');
        atreidesConfig.put('f', 'i');

        // Configurația pentru Harkonnen
        harkonnenConfig = new HashMap<>();
        harkonnenConfig.put('O', 'M');
        harkonnenConfig.put('g', 'e');
        harkonnenConfig.put('u', 's');
        harkonnenConfig.put('k', 'i');
    }

    public static synchronized DecodingConfiguration getInstance() {
        if (instance == null) {
            instance = new DecodingConfiguration();
        }
        return instance;
    }

    public Map<Character, Character> getAtreidesConfig() {
        return atreidesConfig;
    }

    public Map<Character, Character> getHarkonnenConfig() {
        return harkonnenConfig;
    }
}
