package com.amorim.estuturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio05 {
    public static void main(String[] args) throws Exception {
        Stack<Character> pilha = new Stack<>();
        StringBuilder saida = new StringBuilder();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe uma palavra/frase: ");
            String entrada = scanner.nextLine();
            for (char caracter: entrada.toCharArray()) {
                pilha.push(caracter);
            }
            while(!pilha.isEmpty()){
                saida.append(pilha.pop());
            }
            verificaPalidromo(entrada, saida.toString());
            
        }
    }
    public static void verificaPalidromo(String entrada, String saida){
        if(entrada.equalsIgnoreCase(saida.toString() )){
            System.out.println(entrada+" - sim é palíndromo");
        }else{
            System.out.println(entrada+" - não é palíndromo");
        }
    }
}
