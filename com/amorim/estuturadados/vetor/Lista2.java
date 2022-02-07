package com.amorim.estuturadados.vetor;

import com.amorim.estuturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2() {
        super();
    }

    public Lista2(int capacidade) {
        super(capacidade);
    }

    public Boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public Boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }

}
