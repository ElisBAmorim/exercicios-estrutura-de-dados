package com.amorim.estuturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

import com.amorim.estuturadados.pilha.model.Livro;

public class Exercicio04 extends MetodosGenericos {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();
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

    private static void exibirLivro(Stack<Livro> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("Pilha está vazia.");
        } else {
            System.out.println(pilha);
        }
    }

    private static void verificaPilhaVazia(Stack<Livro> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("Pilha está vazia.");
        } else {
            System.out.println("Pilha não está vazia.");
        }
    }

    private static void limparVetor(Stack<Livro> pilha) {
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livro: " + pilha.pop());
        }
    }

    private static void imprimeTamanhoPilha(Stack<Livro> lista) {
        System.out.println("Pilha tem o tamanho de :" + lista.size() + " livros.");
    }

    private static void livroTopo(Stack<Livro> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("Pilha está vazia.");
        } else {
            Livro livro = pilha.peek();
            System.out.println("Dados do livro no topo: " + livro);
        }

    }

    private static void desempilharUmLivro(Stack<Livro> pilha) {

        Livro livro = pilha.pop();
        System.out.println("Dados do livro: " + livro);
        System.out.println("Livro desempilhado com sucesso!");

    }

    private static void empilharLivro(Scanner scanner, Stack<Livro> lista) {
        System.out.println("\nEmpilhando um novo livro.");
        System.out.println("Entre com os dados do livro:");
        String nome = lerInformacaoString("Informe o nome:", scanner);
        String isbn = lerInformacaoString("Informe o isbn:", scanner);
        String ano = lerInformacaoString("Informe o ano:", scanner);
        String autor = lerInformacaoString("Informe o autor:", scanner);

        try {
            Livro livro = new Livro(nome, isbn, ano, autor);
            lista.push(livro);
            System.out.println("Livro empilhado com sucesso!");
            System.out.println("Dados cadastrados: " + livro);
        } catch (Exception e) {
            System.out.println("Não foi possível adicionar o livro!");
        }
    }

    private static void criarLivrosDinamicamente(int quantidade, Stack<Livro> lista) {
        for (int i = 0; i < quantidade; i++) {
            lista.push(new Livro("Livro_" + i, "isbn_" + i, "202" + i, "autor_" + i));
        }
    }

}
