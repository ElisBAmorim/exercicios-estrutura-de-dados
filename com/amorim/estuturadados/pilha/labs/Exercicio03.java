package com.amorim.estuturadados.pilha.labs;

import java.util.Scanner;

import com.amorim.estuturadados.pilha.Pilha;
import com.amorim.estuturadados.pilha.model.Livro;

public class Exercicio03 extends MetodosGenericos {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);
        Scanner scanner = new Scanner(System.in);
        criarLivrosDinamicamente(6, pilha);
        int opcao = -1;
        while (opcao != 0) {
            opcao = opcaoMenu(scanner);
            switch (opcao) {
                case 1:
                    empilharLivro(scanner, pilha);
                    break;
                case 2:
                    desempilharUmLivro(pilha);
                    break;
                case 3:
                    imprimeTamanhoPilha(pilha);
                    break;
                case 4:
                    verificaPilhaVazia(pilha);
                    break;
                case 5:
                    livroTopo(pilha);
                    break;
                case 6:
                    limparVetor(pilha);
                    break;
                case 7:
                    exibirLivro(pilha);
                    break;

            }
        }

    }

    private static void exibirLivro(Pilha<Livro> pilha) {
        if (pilha.estaVazia()) {
            System.out.println("Pilha está vazia.");
        } else {
            System.out.println(pilha);
        }
    }

    private static void verificaPilhaVazia(Pilha<Livro> pilha) {
        if (pilha.estaVazia()) {
            System.out.println("Pilha está vazia.");
        } else {
            System.out.println("Pilha não está vazia.");
        }
    }

    private static void limparVetor(Pilha<Livro> pilha) {
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }
    }

    private static void imprimeTamanhoPilha(Pilha<Livro> lista) {
        System.out.println("Pilha tem o tamanho de :" + lista.tamanho() + " livros.");
    }

    private static void livroTopo(Pilha<Livro> pilha) {
        if (pilha.estaVazia()) {
            System.out.println("Pilha está vazia.");
        } else {
            Livro livro = pilha.topo();
            System.out.println("Dados do livro no topo: " + livro);
        }

    }

    private static void desempilharUmLivro(Pilha<Livro> pilha) {

        Livro livro = pilha.desempilha();
        System.out.println("Dados do livro: " + livro);
        System.out.println("Livro desempilhado com sucesso!");

    }

    private static void empilharLivro(Scanner scanner, Pilha<Livro> lista) {
        System.out.println("\nEmpilhando um novo livro.");
        System.out.println("Entre com os dados do livro:");
        String nome = lerInformacaoString("Informe o nome:", scanner);
        String isbn = lerInformacaoString("Informe o isbn:", scanner);
        String ano = lerInformacaoString("Informe o ano:", scanner);
        String autor = lerInformacaoString("Informe o autor:", scanner);

        try {
            Livro livro = new Livro(nome, isbn, ano, autor);
            lista.empilha(livro);
            System.out.println("Livro empilhado com sucesso!");
            System.out.println("Dados cadastrados: " + livro);
        } catch (Exception e) {
            System.out.println("Não foi possível adicionar o livro!");
        }
    }

    private static void criarLivrosDinamicamente(int quantidade, Pilha<Livro> lista) {
        for (int i = 0; i < quantidade; i++) {
            lista.empilha(new Livro("Livro_" + i, "isbn_" + i, "202" + i, "autor_" + i));
        }
    }

}
