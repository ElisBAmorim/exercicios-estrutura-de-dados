package com.amorim.estuturadados.pilha.labs;

import java.util.Scanner;

public class MetodosGenericos {

    protected static int lerInformacaoInt(String msg, Scanner scanner) {
        boolean continua = false;
        String entrada;
        int info = 0;
        do {

            System.out.println("\n" + msg);

            try {
                entrada = scanner.nextLine();
                info = Integer.parseInt(entrada);
                continua = false;
            } catch (Exception e) {
                continua = true;
                System.out.println("Entrada inválida, digite novamente.\n");
            }

        } while (continua);
        return info;
    }
    
    protected static String lerInformacaoString(String msg, Scanner scanner) {
        System.out.println("\n" + msg);
        return scanner.nextLine();
    }

    protected static int opcaoMenu(Scanner scanner) {
        String entrada;
        int opcao = -1;
        boolean continua = false;

        do {
            System.out.println("\n               Menu de opções");
            System.out.println("--------------------------------------------------------");
            System.out.println("1: Empilhar um novo livro.");
            System.out.println("2: Desempilhar um livro.");
            System.out.println("3: Verificar o tamanho da pilha.");
            System.out.println("4: Verificar se pilha esta vazia.");
            System.out.println("5: Verificar o livro no topo.");
            System.out.println("6: Desempilhar todos livros.");
            System.out.println("7: Exibir livros da pilha.");
            System.out.println("0: Sair\n");
            System.out.print("Digita a opção desejada: ");

            try {
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao < 0 || opcao > 8) {
                    throw new Exception();
                }
                continua = false;

            } catch (Exception e) {
                continua = true;
                System.out.println("\n - Opção inválida, digite novamente.\n");
            }

        } while (continua);

        return opcao;
    }
}
