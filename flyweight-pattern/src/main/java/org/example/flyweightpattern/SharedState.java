package org.example.flyweightpattern;

import org.springframework.stereotype.Component;

@Component
public class SharedState { // Spring use bean & singleton to applies flyweight pattern
    private String value = "";

    public synchronized String getValue() {
        return value;
    }

    public synchronized void setValue(String value) {
        this.value = value;
    }
}