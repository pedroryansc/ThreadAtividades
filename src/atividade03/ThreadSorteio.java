package atividade03;

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
		System.out.println("\nNúmeros sorteados entre " + inicio + " e " + fim +  ": ");
		
		Random sorteador = new Random();
		
		for(int i = 0; i < quantNumeros; i++) {
			int numero = sorteador.nextInt(inicio, fim + 1);
			System.out.print(numero + " | ");
		}
	}
}
