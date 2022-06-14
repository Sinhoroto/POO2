package personagem;

import atacar.AForte;
import correr.CRapido;
import pular.PAlto;

public class Personagem1 extends Personagem {
    public Personagem1() {
        this.setAtaque(new AForte());
        this.setCorrida(new CRapido());
        this.setPulo(new PAlto());
    }
}
