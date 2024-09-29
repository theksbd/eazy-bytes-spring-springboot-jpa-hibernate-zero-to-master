package com.theksbd.implementations;

import com.theksbd.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "Michelin tyres are rotating";
    }
}
