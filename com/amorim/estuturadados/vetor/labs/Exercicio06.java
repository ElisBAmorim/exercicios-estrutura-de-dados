package com.amorim.estuturadados.vetor.labs;

import java.util.Scanner;

import com.amorim.estuturadados.vetor.Lista;
import com.amorim.estuturadados.vetor.model.Contato;

public class Exercicio06 extends MetodosGenericos{
    public static void main(String[] args) {
        Lista<Contato> lista = new Lista<Contato>(20);
        Scanner scanner = new Scanner(System.in);
        criarContatosDinamicamente(30, lista);
        int opcao = -1;
        while (opcao != 0) {
            opcao = opcaoMenu(scanner);
            switch (opcao) {
                case 1:
                    adicionarContato(scanner, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scanner, lista);
                    break;
                case 3:
                    obterContatoPosicao(scanner, lista);
                    break;
                case 4:
                    obterContato(scanner, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scanner, lista);
                    break;
                case 6:
                    obterContatoExistente(scanner, lista);
                    break;
                case 7:
                    excluirPorPosicao(scanner, lista);
                    break;
                case 8:
                    excluirContato(scanner, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimeVetor(lista);
                    break;

            }
        }

    }

    private static void imprimeVetor(Lista<Contato> lista) {
        System.err.println(lista);
    }

    private static void limparVetor(Lista<Contato> lista) {
        lista.limpar();
        System.out.println("Todos os contatos foram removidos.");
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println(lista.tamanho());
    }

    private static void excluirPorPosicao(Scanner scanner, Lista<Contato> lista) {
        int posicao = lerInformacaoInt("Informe a posição do contato a ser removido:", scanner);
        try {
            lista.remove(posicao);
            System.out.println("Contato excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Contato não foi localizado, por favor verifique a posição informada!");
        }
    }

    private static void excluirContato(Scanner scanner, Lista<Contato> lista) {
        int posicao = lerInformacaoInt("Informe a posição a ser removida", scanner);
        try {
            Contato contato = lista.busca(posicao);
            lista.remove(contato);
            System.out.println("Contato excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Contato não foi localizado, por favor verifique a posição informada!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scanner, Lista<Contato> lista) {
        int posicao = lerInformacaoInt("Informe a posição a ser localizada: ", scanner);
        try {
            Contato contato = lista.busca(posicao);
            System.out.println("\nContato localizado, segue os dados:\n");
            System.out.println(contato);

            System.out.println("Realizando a pesquisa do último índice do contato localizado:");
            posicao = lista.ultimoIndice(contato);
            System.out.println("\nContato localizado na posição: " + posicao);
        } catch (Exception e) {
            System.out.println("Contato não foi localizado, por favor verifique a posição informada!");
        }
    }

    private static void obterContato(Scanner scanner, Lista<Contato> lista) {
        int posicao = lerInformacaoInt("Informe a posição a ser pesquisada", scanner);
        try {
            Contato contato = lista.busca(posicao);
            System.out.println("\nContato localizado, segue os dados:\n");
            System.out.println(contato);
            System.err.println("\nRealizando pesquisa do contato encontrado:");
            posicao = lista.busca(contato);
            System.out.println("\nContato localizado na posição: " + posicao);
        } catch (Exception e) {
            System.out.println("Contato não foi localizado, por favor verifique a posição informada!");
        }
    }

    private static void obterContatoExistente(Scanner scanner, Lista<Contato> lista) {
        int posicao = lerInformacaoInt("Informe a posição a ser pesquisada", scanner);
        try {
            Contato contato = lista.busca(posicao);
            boolean localizado = lista.contem(contato);
            if (localizado) {
                System.out.println("\nContato localizado, segue os dados:\n");
                System.out.println(contato);
            } else {
                System.out.println("Contato não localizado!");
            }
        } catch (Exception e) {
            System.out.println("Contato não foi localizado, por favor verifique a posição informada!");
        }
    }

    private static void obterContatoPosicao(Scanner scanner, Lista<Contato> lista) {
        int posicao = lerInformacaoInt("Informe a posição a ser pesquisada: ", scanner);
        try {
            Contato contato = lista.busca(posicao);
            System.out.println("\nContato localizado, segue os dados:\n");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Contato não foi localizado, por favor verifique a posição informada!");
        }
    }

    private static void adicionarContatoPosicao(Scanner scanner, Lista<Contato> lista) {
        System.out.println("\nCriando um novo contato.");
        System.out.println("Entre com os dados do contato:");
        String nome = lerInformacaoString("Informe o nome:", scanner);
        String telefone = lerInformacaoString("Informe o telefone:", scanner);
        String email = lerInformacaoString("Informe o email:", scanner);
        int posicao = lerInformacaoInt("Informe a posição que o contato deve ser cadastrado: ", scanner);

        try {
            Contato contato = new Contato(nome, telefone, email);
            lista.adiciona(posicao, contato);
            System.out.println("\nContato adicionado com sucesso!");
            System.out.println("\nDados cadastrados: " + contato);
        } catch (Exception e) {
            System.out.println("Não foi possível adicionar o contato, posição inválida!");
        }
    }

    private static void adicionarContato(Scanner scanner, Lista<Contato> lista) {
        System.out.println("\nCriando um novo contato.");
        System.out.println("Entre com os dados do contato:");
        String nome = lerInformacaoString("Informe o nome:", scanner);
        String telefone = lerInformacaoString("Informe o telefone:", scanner);
        String email = lerInformacaoString("Informe o email:", scanner);

        try {
            Contato contato = new Contato(nome, telefone, email);
            lista.adiciona(contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println("Dados cadastrados: " + contato);
        } catch (Exception e) {
            System.out.println("Não foi possível adicionar o contato!");
        }
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        for (int i = 0; i < quantidade; i++) {
            lista.adiciona(new Contato("Contato_" + i, "1234-123" + i, "email_" + i + "@rmail.com"));
        }
    }
    
}