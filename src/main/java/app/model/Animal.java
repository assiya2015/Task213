package app.model;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Animal {
    @Autowired
    Timer timer;

    Timer getTimer() {
        return timer;
    }
}
