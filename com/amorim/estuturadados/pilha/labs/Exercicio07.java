package com.amorim.estuturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio07 {
    public static void main(String[] args) throws Exception {
        String entrada;
        boolean continua = true;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("\nInforme um número decimal: ");
                entrada = scanner.nextLine();
                if (entrada.equalsIgnoreCase("exit")) {
                    continua = false;
                } else {
                    imprimeResultado(Integer.parseInt(entrada));
                    System.out.println("Para encerrar digite 'exit'.");
                }
            } while (continua);
        }
    }

    public static void imprimeResultado(int entrada) {
        System.out.println("\n" + entrada + " em binário é: " +
                decimalBinario(entrada));
    }

    public static String decimalBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        String numeroBinario = "";
        int resto;
        if (numero == 0) {
            numeroBinario = "0";
        } else {
            do {
                resto = numero % 2;
                pilha.push(resto);
                numero /= 2;
            } while (numero > 0);

            while (!pilha.isEmpty()) {
                numeroBinario += pilha.pop();
            }
        }
        return numeroBinario;
    }

}
