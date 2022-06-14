package com.bruno.estado;

import com.bruno.atacar.AFraco;
import com.bruno.correr.CDevagar;
import com.bruno.personagem.Personagem;

public class EPerigo extends Estado {
    public EPerigo(Personagem p) {
        super(p);
        this.getP().setAtaque(new AFraco());
        this.getP().setCorrida(new CDevagar());
    }

    public void setLimites() {
        this.setLimiteInferior(0);
        this.setLimiteSuperior(30);
    }

    public void mudarVida(int newLife) {
        if (newLife <= this.getLimiteInferior()) {
            this.getP().setEstado(new EMorto(this.getP()));
            this.getP().getEstado().mudarVida(newLife);
        } else if (newLife >= this.getLimiteSuperior()) {
            this.getP().setEstado(new ENormal(this.getP()));
            this.getP().getEstado().mudarVida(newLife);
        } else
            this.getP().setVida(newLife);
    }
}