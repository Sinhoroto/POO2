package decorator.decoretor_atacar;

import atacar.Atacar;

public class DMedio extends Decorator{

    public DMedio(Atacar ADecorator) {
        super(ADecorator);
        this.setDano(50);
        this.setNatureza("Pegar dp em SO :O");
    }
    
}
