package com.theksbd.implementations;

import com.theksbd.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "BridgeStone tyres are rotating";
    }
}
