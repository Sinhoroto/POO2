package estado;

import personagem.Personagem;

public abstract class Estado {
    protected final int VIDA_MINIMA = 0;
    protected final int VIDA_MAXIMA = 100;
    protected int limiteInferior;
    protected int limiteSuperior;
    private Personagem p;

    public Estado(Personagem p) {
        this.p = p;
        this.setLimites();
    }

    public Personagem getP() {
        return this.p;
    }

    public int getLimiteInferior() {
        return this.limiteInferior;
    }

    public int getLimiteSuperior() {
        return this.limiteSuperior;
    }

    public void setLimiteInferior(int l) {
        this.limiteInferior = l;
    }

    public void setLimiteSuperior(int l) {
        this.limiteSuperior = l;
    }

    protected int normalizeLife(int newLife) {
        if (newLife < VIDA_MINIMA)
            return VIDA_MINIMA;
        else if (newLife > VIDA_MAXIMA)
            return VIDA_MAXIMA;
        return newLife;
    }


    public void sofreuAtaque(int percaLife) {
        this.mudarVida(this.normalizeLife(this.getP().getVida() - percaLife));
    }

    public void ganhouVida(int aumentoLife) {
        this.mudarVida(this.normalizeLife(this.getP().getVida() +
                aumentoLife));
    }

    protected abstract void setLimites();

    protected abstract void mudarVida(int life);
}