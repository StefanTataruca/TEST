// Ensure the package name matches your directory structure
package com.example.Test;

// Correct imports for Jackson annotations
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    private String date;
    private String message;
    private String house;

    @JsonCreator // Jackson annotation to indicate the constructor is used for deserialization
    public Message(@JsonProperty("date") String date,
                   @JsonProperty("message") String message,
                   @JsonProperty("house") String house) {
        this.date = date;
        this.message = message;
        this.house = house;
    }

    // Getters and setters might be used by the serialization/deserialization library even if not explicitly used in your code
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
