package com.bruno.estado;

import com.bruno.personagem.Personagem;

public class EMorto extends Estado {
    public EMorto(Personagem p) {
        super(p);
    }

    public void setLimites() {
        this.setLimiteInferior(0);
        this.setLimiteSuperior(0);
    }

    public void mudarVida(int newLife) {
        this.getP().setVida(this.VIDA_MINIMA);
    }
}