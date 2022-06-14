package com.bruno.personagem;

import com.bruno.atacar.Atacar;
import com.bruno.correr.Correr;
import com.bruno.estado.ENormal;
import com.bruno.estado.Estado;
import com.bruno.pular.Pular;
import com.bruno.shield.AddShield;
import com.bruno.shield.Shield;

public abstract class Personagem {
    private Atacar atacar;
    private Correr correr;
    private Pular pular;
    private Estado estado;
    private Shield shield;
    private int vida;

    public Personagem() {
        this.setEstado(new ENormal(this));
        this.setVida(100);
        this.shield = null;
    }

    public Shield getShield() {
        return shield;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setAtaque(Atacar atacar) {
        this.atacar = atacar;
    }

    public void setCorrida(Correr correr) {
        this.correr = correr;
    }

    public void setPulo(Pular pular) {
        this.pular = pular;
    }

    public void atacar() {
        this.atacar.atacar();
    }

    public void correr() {
        this.correr.correr();
    }

    public void pular() {
        this.pular.pular();
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void ganhouShield(int value) {
        if (value <= 0)
            return;

        Shield aux_shield = new AddShield(value);

        if (this.getShield() == null)
            aux_shield.setShieldSucessor(null);
        else
            aux_shield.setShieldSucessor(this.getShield());
        this.setShield(aux_shield);
    }

    public void sofreuAtaque(int vida, boolean temShield) {
        if (temShield && this.getShield() != null) {
            vida = this.getShield().getDanoTotalUsandoShields(vida);
        }
        this.getEstado().sofreuAtaque(vida);
    }

    public void ganhouVida(int vida) {
        this.getEstado().ganhouVida(vida);
    }
}