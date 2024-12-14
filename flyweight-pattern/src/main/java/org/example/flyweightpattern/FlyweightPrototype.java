package org.example.flyweightpattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FlyweightPrototype {
    private final SharedState sharedState;

    @Autowired
    public FlyweightPrototype(SharedState sharedState) {
        this.sharedState = sharedState;
    }

    public void getSharedState() {
        System.out.println("Shared state: " + sharedState.getValue());
    }

    public void setSharedState(String state) {
        sharedState.setValue(state);
        System.out.println("Shared state: " + sharedState.getValue());
    }
}


