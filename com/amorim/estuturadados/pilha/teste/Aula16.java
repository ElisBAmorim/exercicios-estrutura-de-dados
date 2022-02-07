package com.amorim.estuturadados.pilha.teste;

import com.amorim.estuturadados.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        System.out.println(pilha.topo());
        System.out.println(pilha);
        for (int i = 1; i <= 15; i++) {
            pilha.empilha(i);
        }
        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}
