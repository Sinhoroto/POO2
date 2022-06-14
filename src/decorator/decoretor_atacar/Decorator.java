package decorator.decoretor_atacar;

import atacar.Atacar;

public class Decorator extends Atacar{
    private Atacar ADecorator;

    public Decorator(Atacar ADecorator){
        this.ADecorator = ADecorator;
    }

    public int getDano(){
        return ADecorator.getDano() + super.getDano();
    }

    public String getNatureza(){
        return super.getNatureza() + " asdasd " + ADecorator.getNatureza();
    }

}
