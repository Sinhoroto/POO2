package com.bruno.estado;

import com.bruno.personagem.Personagem;

public class EstadoMorto extends Estado {

    public EstadoMorto(Personagem personagem) {
        super(personagem);
        finalizaJogo();
    }

    protected void setLimitesEnergia() {}

    public void verificaAlteracaoEstado() {}

    protected void setAtributos() {}

    private void finalizaJogo(){
        System.out.println("Seus Pontos chegaram a zero, fim de jogo!!!");
        System.exit(0);
    }
}
