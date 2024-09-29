package com.theksbd.implementations;

import com.theksbd.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Bose Speakers making sound";
    }
}
