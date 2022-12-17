package com.andre.desafio_1;

import java.util.*;
public class ParesImpares {

	public static void main(String[] args) {

		// Exemplo de Entrada
		List<Integer> lista = new ArrayList<>();
		List<Integer> numeros = Arrays.asList(10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98);
		lista.addAll(numeros);

		// Exemplo de Saída
		System.out.println("Saída:");
		System.out.println(" ");
		Collections.sort(lista);
		for (int i = 0; i < lista.size(); i++) {
			int par = lista.get(i);
			if (par % 2 == 0) {
				System.out.println(par);
			}
		}
		Collections.sort(lista, Collections.reverseOrder());
		for (int i = 0; i < lista.size(); i++){
			int impar = lista.get(i);
			if (impar % 2 != 0) {
				System.out.println(impar);
			}
		}
	}
}
