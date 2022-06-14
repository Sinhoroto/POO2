package com.bruno.estado;

import com.bruno.atacar.AForte;
import com.bruno.correr.CRapido;
import com.bruno.personagem.Personagem;

public class EForte extends Estado {
    public EForte(Personagem p) {
        super(p);
        this.getP().setAtaque(new AForte());
        this.getP().setCorrida(new CRapido());
    }

    public void setLimites() {
        this.setLimiteInferior(70);
        this.setLimiteSuperior(this.VIDA_MAXIMA);
    }

    public void mudarVida(int vida) {
        if (vida <= this.getLimiteInferior()) {
            this.getP().setEstado(new ENormal(this.getP()));
            this.getP().getEstado().mudarVida(vida);
        } else
            this.getP().setVida(vida);
    }
}
