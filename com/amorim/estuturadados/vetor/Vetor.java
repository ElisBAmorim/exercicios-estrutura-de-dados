package com.amorim.estuturadados.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public Vetor(){
        this(10);
    }

    public Boolean adiciona(String elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public Boolean adiciona(int posicao, String elemento) {
        aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;

    }

    public String busca(int posicao) {
        validarPosicao(posicao);
        return this.elementos[posicao];
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (elemento.equals(this.elementos[i])) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void remove(int posicao) {
        validarPosicao(posicao);
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public void remove(String elemento) {
        int posicao = busca(elemento);
        if (posicao < 0) {
            throw new IllegalArgumentException("Este elemento não existe!");
        }
        remove(posicao);
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    private void validarPosicao(int posicao) {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
    }

    @Override
    public String toString() {
        StringBuilder elementosString = new StringBuilder();
        elementosString.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            elementosString.append(this.elementos[i]);
            elementosString.append(", ");
        }

        if (this.tamanho > 0) {
            elementosString.append(this.elementos[this.tamanho - 1]);
        }

        elementosString.append("]");
        return elementosString.toString();
    }

}
