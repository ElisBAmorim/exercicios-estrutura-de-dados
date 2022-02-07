package com.amorim.estuturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

import com.amorim.estuturadados.fila.Fila;
import com.amorim.estuturadados.fila.FilaComPrioridade;
import com.amorim.estuturadados.fila.model.Paciente;

public class Aula24 {

	public static void main(String[] args) {
		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();
		
		fila.enfileira(new Paciente("A", 2));
		fila.enfileira(new Paciente("C", 1));
		fila.enfileira(new Paciente("B", 3));

		System.out.println(fila);
		System.out.println(fila.desenfileira());
		System.out.println(fila);
	}

}
