package com.bruno.personagem;

import com.bruno.estado.EstadoNormal;
import com.bruno.pulo.PuloMedio;

public class Personagem1 extends Personagem{

    public Personagem1(){
        this.setEnergia(70);
        this.setShield(10);
        this.setPulo(new PuloMedio());
        this.setEstado(new EstadoNormal(this));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
