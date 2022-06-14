package atacar;

public class AFraco extends Atacar {
    public AFraco() {
        this.setDano(30);
    }

    public String getNatureza() {
        return "Ataque: fraco";
    }
}
