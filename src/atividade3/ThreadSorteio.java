package atividade3;

import java.util.Random;

public class ThreadSorteio extends Thread {
	private int inicio;
	private int fim;
	private int quantNumeros;
	
	public ThreadSorteio(int a, int b, int x) {
		this.inicio = a;
		this.fim = b;
		this.quantNumeros = x;
	}
	
	@Override
	public void run() {
		System.out.print("\nNúmeros sorteados entre " + inicio + " e " + fim +  ": ");
		
		Random sorteador = new Random();
		
		for(int i = 0; i < quantNumeros; i++) {
			int numero = sorteador.nextInt((fim - inicio) + 1) + inicio;
			System.out.print(numero + " | ");
		}
	}
}
