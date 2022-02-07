package com.amorim.estuturadados.pilha.labs;

import java.util.Scanner;

import com.amorim.estuturadados.pilha.Pilha;

public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();
        int entrada;
        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 0; i < 10; i++) {
                System.out.print("\nInforme um número: ");
                entrada = scanner.nextInt();

                if (entrada == 0) {
                    verificarDesempilha("par", pilhaPar.desempilha());
                    verificarDesempilha("impar", pilhaImpar.desempilha());
                } else {
                    if (entrada % 2 == 0) {
                        System.out.println("Número par, empilhando o número: " + entrada);
                        pilhaPar.empilha(entrada);
                    } else {
                        System.out.println("Número ímpar, empilhando o número: " + entrada);
                        pilhaImpar.empilha(entrada);
                    }
                }

            }

        }
        verificarPilhaVazia("par", pilhaPar);
        verificarPilhaVazia("ímpar", pilhaImpar);
        System.out.println("\nTodos os números foram desempilhados.");
    }

    public static void verificarPilhaVazia(String msg, Pilha<Integer> pilha){
        if (!pilha.estaVazia()) {
            System.out.println("\nAinda existe números empilhados na pilha "+msg+".");
            while (!pilha.estaVazia()) {
                System.out.println("Desempilhando um número da pilha "+msg+": " + pilha.desempilha());
            }
        }
    }

    public static void verificarDesempilha(String msg, Integer desempilha) {
        if (desempilha == null) {
            System.out.println("Pilha " + msg + "está vazia!");
        } else {
            System.out.println("Desempilhando um elemento da pilha " + msg + ": " + desempilha);
        }
    }
}
