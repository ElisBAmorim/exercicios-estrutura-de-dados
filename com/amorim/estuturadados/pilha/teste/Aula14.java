package com.amorim.estuturadados.pilha.teste;

import com.amorim.estuturadados.pilha.Pilha;

public class Aula14 {
    
    public static void main( String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        for(int i=1; i<=15; i++){
            pilha.empilha(i);
        }
        System.out.println(pilha.toString());
        System.out.println(pilha.tamanho());
    }
}
