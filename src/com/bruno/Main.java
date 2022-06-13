package com.bruno;

import com.bruno.personagem.Personagem1;

public class Main {

    public static void main(String[] args) {

        Personagem1 personagem1 = new Personagem1();


        System.out.println("Atributos estado inicial: ");
        System.out.println("Energia: " + personagem1.getEnergia());          // Energia: 70
        System.out.println("Estado: " + personagem1.getEstado());
        System.out.println("Shield: " + personagem1.getShiled());
        personagem1.pular();
        personagem1.correr();
        personagem1.atacar();
        System.out.println();

        System.out.println("Atributos apos se curar 1 ponto de energia");
        personagem1.getEstado().alteraEnergia(1);                  // Energia: 71
        System.out.println("Energia: " + personagem1.getEnergia());
        System.out.println("Estado: " + personagem1.getEstado());
        System.out.println("Shield: " + personagem1.getShiled());
        personagem1.pular();
        personagem1.correr();
        personagem1.atacar();
        System.out.println();

        System.out.println("Atributos apos perder 41 pontos de energia");
        personagem1.getEstado().alteraEnergia(-41);                 // Energia: 30
        System.out.println("Energia: " + personagem1.getEnergia());
        System.out.println("Estado: " + personagem1.getEstado());
        System.out.println("Shield: " + personagem1.getShiled());
        personagem1.pular();
        personagem1.correr();
        personagem1.atacar();
        System.out.println();

        System.out.println("Atributos apos perder 29 pontos de energia ");
        personagem1.getEstado().alteraEnergia(-29);                 // Energia: 1
        System.out.println("Energia: " + personagem1.getEnergia());
        personagem1.pular();
        personagem1.correr();
        personagem1.atacar();
        System.out.println();

        System.out.println("Atributos apos perder 1 pontos de energia ");
        personagem1.getEstado().alteraEnergia(-1);                 // Energia: 0
        System.out.println("Energia: " + personagem1.getEnergia());
        personagem1.pular();
        personagem1.correr();
        personagem1.atacar();
        System.out.println();
    }
}
