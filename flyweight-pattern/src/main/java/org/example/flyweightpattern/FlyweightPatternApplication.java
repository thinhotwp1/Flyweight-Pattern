package org.example.flyweightpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FlyweightPatternApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FlyweightPatternApplication.class, args);

        // Create manny FlyweightPrototype but using one instance ShareState
        FlyweightPrototype flyweight1 = (FlyweightPrototype) context.getBean("flyweightPrototype");
        FlyweightPrototype flyweight2 = (FlyweightPrototype) context.getBean("flyweightPrototype");

        new Thread(() -> {
            flyweight1.setSharedState("STOPPED"); // Shared state: STOPPED
        }).start();

        new Thread(() -> {
            flyweight2.setSharedState("RUNNING"); // Shared state: RUNNING
        }).start();

        System.out.println("Does flyweight1 equals flyweight2: " + flyweight1.equals(flyweight2));
        flyweight1.getSharedState();          // Shared state: RUNNING
    }

}
