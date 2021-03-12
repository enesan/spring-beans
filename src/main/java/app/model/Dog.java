package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component(value = "dog")
public class Dog extends Animal{

    @Override
    public String toString() {
        return "Гав";
    }
}
