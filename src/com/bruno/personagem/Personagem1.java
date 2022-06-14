package com.bruno.personagem;

import com.bruno.atacar.AForte;
import com.bruno.correr.CRapido;
import com.bruno.pular.PAlto;

public class Personagem1 extends Personagem {
    public Personagem1() {
        this.setAtaque(new AForte());
        this.setCorrida(new CRapido());
        this.setPulo(new PAlto());
    }
}
