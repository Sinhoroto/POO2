package com.bruno.estado;

import com.bruno.ataque.AtaqueMedio;
import com.bruno.personagem.Personagem;
import com.bruno.velocidade.VelocidadeMedio;

public class EstadoNormal extends Estado{

    public EstadoNormal(Personagem personagem) {
        super(personagem);
        setLimitesEnergia();
        setAtributos();
        verificaAlteracaoEstado();
    }

    protected void setLimitesEnergia() {
        this.setEnergiaMinima(30);
        this.setEnergiaMaxima(70);
    }

    public void verificaAlteracaoEstado() {
        Personagem personagem = this.getPersonagem();
        Integer energiaPersonagem = personagem.getEnergia();

        if (energiaPersonagem < this.getEnergiaMinima()) {
            personagem.setEstado(new EstadoPerigo(personagem));
        } else if (energiaPersonagem > this.getEnergiaMaxima()) {
            personagem.setEstado(new EstadoForte(personagem));
        }
    }

    protected void setAtributos() {
        this.getPersonagem().setAtaque(new AtaqueMedio());
        this.getPersonagem().setVelocidade(new VelocidadeMedio());
    }
}
