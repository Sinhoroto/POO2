package decorator.decoretor_atacar;

import atacar.Atacar;

public class DForte extends Decorator {

    public DForte(Atacar ADecorator) {
        super(ADecorator);
        this.setDano(9999);
        this.setNatureza("Chinelo da mãe");
    }
    
}