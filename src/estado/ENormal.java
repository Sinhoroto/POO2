package estado;

import atacar.AMedio;
import correr.CMedio;
import personagem.Personagem;

public class ENormal extends Estado {
    public ENormal(Personagem p) {
        super(p);
        this.getP().setAtaque(new AMedio());
        this.getP().setCorrida(new CMedio());
    }

    public void setLimites() {
        this.setLimiteInferior(30);
        this.setLimiteSuperior(70);
    }

    public void mudarVida(int newLife) {
        if (newLife < this.getLimiteInferior()) {
            this.getP().setEstado(new EPerigo(this.getP()));
            this.getP().getEstado().mudarVida(newLife);
        } else if (newLife > this.getLimiteSuperior()) {
            this.getP().setEstado(new EForte(this.getP()));
            this.getP().getEstado().mudarVida(newLife);
        } else
            this.getP().setVida(newLife);
    }
}