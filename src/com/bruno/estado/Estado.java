package com.bruno.estado;

import com.bruno.personagem.Personagem;

public abstract class Estado {

    private Personagem personagem;
    private Integer energiaMaxima;
    private Integer energiaMinima;

    public Estado(Personagem personagem) {
        this.personagem = personagem;
    }

    // TODO: Alteracao de energia nao depende do estado.
    public void alteraEnergia(Integer deltaEnergia) {
        Integer energia = this.personagem.getEnergia();
        this.personagem.setEnergia(energia + deltaEnergia);
        this.verificaAlteracaoEstado();
    }

    protected abstract void setLimitesEnergia();

    protected abstract void verificaAlteracaoEstado();

    protected abstract void setAtributos();

    public Personagem getPersonagem() {
        return personagem;
    }

    public Integer getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void setEnergiaMaxima(Integer energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }

    public Integer getEnergiaMinima() {
        return energiaMinima;
    }

    public void setEnergiaMinima(Integer energiaMinima) {
        this.energiaMinima = energiaMinima;
    }
}
