package com.bruno.personagem;

import com.bruno.ataque.Ataque;
import com.bruno.estado.Estado;
import com.bruno.pulo.Pulo;
import com.bruno.velocidade.Velocidade;

public abstract class Personagem {
    private Ataque ataque;
    private Pulo pulo;
    private Velocidade velocidade;
    private Integer energia;
    private Estado estado;
    private int shield;

    public void setShield(int shield) { this.shield = shield;};

    public void setAtaque(Ataque ataque){
        this.ataque = ataque;
    }

    public void setPulo(Pulo pulo) {
        this.pulo = pulo;
    }

    public void setVelocidade(Velocidade corrida) {
        this.velocidade = corrida;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getShiled() {return shield;};

    public void atacar(){
        ataque.atacar();
    }

    public void pular() {
        pulo.pular();
    }

    public void correr() {
        velocidade.correr();
    }

}
