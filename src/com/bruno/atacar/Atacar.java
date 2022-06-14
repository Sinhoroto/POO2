package com.bruno.atacar;

public abstract class Atacar {
    private int dano;
    private String natureza;

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public String getNatureza() {
        return natureza;
    }

    public void atacar(){
        System.out.println("Natureza: " + this.getNatureza() + "\nDano: " + this.getDano());
    }
}