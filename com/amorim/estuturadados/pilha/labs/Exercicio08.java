package com.amorim.estuturadados.pilha.labs;

import java.util.Stack;

public class Exercicio08 {
    public static void main(String[] args) throws Exception {
        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> destino = new Stack<>();
		Stack<Integer> auxiliar = new Stack<>();
        pilha.push(4);
        pilha.push(3);
        pilha.push(2);
        pilha.push(1);
        torreDeHanoi(pilha.size(), pilha, destino, auxiliar);
    }

    public static void torreDeHanoi(int tamanho, Stack<Integer> original, Stack<Integer> destino,
            Stack<Integer> auxiliar) {
        if (tamanho > 0) {
            torreDeHanoi(tamanho - 1, original, auxiliar, destino);
            
            destino.push(original.pop());
            imprimirPilhas(original, destino, auxiliar);
            
            torreDeHanoi(tamanho - 1, auxiliar, destino, original);
        }

    }

    private static void imprimirPilhas(Stack<Integer> original, Stack<Integer> destino, Stack<Integer> auxiliar) {
        System.out.println("\n------------------------");
        System.out.println("Original: " + original);
        System.out.println("Destino: " + destino);
        System.out.println("Auxiliar: " + auxiliar);
    }

}
