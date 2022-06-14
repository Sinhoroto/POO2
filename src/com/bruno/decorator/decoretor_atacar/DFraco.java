package com.bruno.decorator.decoretor_atacar;

import com.bruno.atacar.Atacar;

public class DFraco extends Decorator {

    public DFraco(Atacar ADecorator) {
        super(ADecorator);
        this.setDano(10);
        this.setNatureza("Não da morena :(");
    }
    
}
