package com.amorim.estuturadados.vetor.labs;

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
            System.out.println("1:  Adicionar contato no final do vetor.");
            System.out.println("2:  Adicionar contato em uma posição específica.");
            System.out.println("3:  Obter contato de uma posição específica.");
            System.out.println("4:  Consultar contato.");
            System.out.println("5:  Consultar último índice de um contato.");
            System.out.println("6:  Verificar se contar existe.");
            System.out.println("7:  Excluir um contato pela posição.");
            System.out.println("8:  Excluir um contato, informando o mesmo.");
            System.out.println("9:  Verificar o tamanho do vetor.");
            System.out.println("10: Excluir todos os contatos do vetor.");
            System.out.println("11: Imprimir o vetor.");
            System.out.println("0:  Sair\n");
            System.out.print("Digita a opção desejada: ");

            try {
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao < 0 || opcao > 11) {
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
