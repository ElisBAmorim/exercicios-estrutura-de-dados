package com.amorim.estuturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidadee) {
        this.elementos = (T[]) new Object[capacidadee];
        this.tamanho = 0;
    }

    public Lista(){
        this(10);
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public Boolean adiciona(T elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public Boolean adiciona(int posicao, T elemento) {
        aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;

    }

    public T busca(int posicao) {
        validarPosicao(posicao);
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (elemento.equals(this.elementos[i])) {
                return i;
            }
        }
        return -1;
    }

    public void limpar() {
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i]=null;
        }
        this.tamanho =0;
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

    public void remove(T elemento) {
        int posicao = busca(elemento);
        if (posicao < 0) {
            throw new IllegalArgumentException("Este elemento não existe!");
        }
        remove(posicao);
    }

    public T obtem(int posicao){
        return busca(posicao);
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
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

    public boolean contem(T elemento){
        int posicao = busca(elemento);
        
        if(posicao < 0 ){
            return false;
        }
        return true;
    }
   
    public int ultimoIndice(T elemento){
        for(int i= tamanho-1; i>=0; i--){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
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
