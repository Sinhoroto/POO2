package shield;

public abstract class Shield {
    private Shield ShieldSucessor;

    public Shield getShieldSucessor() {
        return ShieldSucessor;
    }

    public void setShieldSucessor(Shield ShieldSucessor) {
        this.ShieldSucessor = ShieldSucessor;
    }

    public abstract int getDanoTotalUsandoShields(int dano);
}
