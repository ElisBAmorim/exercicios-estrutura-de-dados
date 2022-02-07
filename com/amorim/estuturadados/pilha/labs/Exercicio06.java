package com.amorim.estuturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio06 {
    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static void main(String[] args) throws Exception {
        String entrada;
        boolean continua = true;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("\nInforme uma expressão: ");
                entrada = scanner.nextLine();
                if (entrada.equalsIgnoreCase("exit")) {
                    continua = false;
                } else {
                    imprimeResultado(entrada);
                    System.out.println("Para encerrar digite 'exit'.");
                }
            } while (continua);
        }
    }

    public static void imprimeResultado(String entrada) {
        System.out.println("\n" + entrada + " está balanceado? " +
                verificarSimbolos(entrada));
    }

    private static boolean verificarSimbolos(String entrada) {
        Stack<Character> pilha = new Stack<Character>();
        char[] expressao = entrada.toCharArray();
        int aberto = 0, fechado = 0;
        for (char item : expressao) {
            if (ABRE.indexOf(item) > -1) {
                pilha.add(item);
                aberto++;
            } else {
                if (FECHA.indexOf(item) > -1) {
                    fechado++;
                    if (pilha.isEmpty()) {
                        return false;
                    } else {
                        char topo = pilha.pop();
                        if (ABRE.indexOf(topo) != FECHA.indexOf(item)) {
                            return false;
                        }
                    }
                }
            }
        }
        if (aberto != fechado) {
            return false;
        }
        return true;
    }
}
