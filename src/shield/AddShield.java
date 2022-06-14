package shield;

public class AddShield extends Shield {
    private int quantidade;

    public int getValorEscudo() {
        return quantidade;
    }

    public AddShield(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getDanoTotalUsandoShields(int dano) {
        int aux_dano = Math.max(0, dano - this.getValorEscudo());
        if (aux_dano == 0 || this.getShieldSucessor() == null)
            return aux_dano;

        return this.getShieldSucessor().getDanoTotalUsandoShields(aux_dano);
    }

}
