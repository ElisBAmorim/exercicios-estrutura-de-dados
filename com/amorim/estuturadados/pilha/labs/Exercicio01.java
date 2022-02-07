package com.amorim.estuturadados.pilha.labs;

import java.util.Scanner;

import com.amorim.estuturadados.pilha.Pilha;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        Pilha<Integer> pilha = new Pilha<>();
        int entrada;
        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 0; i < 10; i++) {
                System.out.print("\nInforme um número: ");
                entrada = scanner.nextInt();

                if (entrada % 2 == 0) {
                    System.out.println("Número par, empilhando o número: " + entrada);
                    pilha.empilha(entrada);
                } else {
                    Integer desempilha = pilha.desempilha();
                    if (desempilha == null) {
                        System.out.println("Pilha está vazia!");
                    } else {
                        System.out.println("Número ímpar, desempilhando um elemento da pilha: " + desempilha);
                    }
                }

            }

        }
        if (!pilha.estaVazia()) {
            System.out.println("\nAinda existe números empilhados.");
            while (!pilha.estaVazia()) {
                System.out.println("Desempilhando um número da pilha: " + pilha.desempilha());
            }
        }
        System.out.println("\nTodos os números foram desempilhados.");
    }
}
