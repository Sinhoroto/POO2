import com.bruno.personagem.Personagem1;

public class main {
    public static void main(String[] args) {
        Personagem1 p = new Personagem1();

        System.out.println("\t Status");
        p.atacar();
        p.correr();
        System.out.println("Vida: " + p.getVida());

        System.out.println("\nGanhou 10 de escudo");
        p.ganhouShield(10);
        

        p.ganhouVida(10);
        p.atacar();
        p.correr();

        p.sofreuAtaque(100,true);
       
    }
}
