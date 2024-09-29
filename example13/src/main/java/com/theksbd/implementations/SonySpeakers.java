package com.theksbd.implementations;

import com.theksbd.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Sony Speakers making sound";
    }
}
