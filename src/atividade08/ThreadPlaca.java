package atividade08;

import java.util.Random;

public class ThreadPlaca extends Thread {
	private int quantPlacas;
	private String alfabeto;
	private Random sorteador;
	
	public ThreadPlaca(int x) {
		this.quantPlacas = x;
		this.alfabeto = gerarAlfabeto();
		this.sorteador = new Random();
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= quantPlacas; i++) {
			System.out.print(i + "ª placa: ");
			for(int j = 1; j <= 7; j++) {
				if(j <= 3 || j == 5)
					System.out.print(sortearLetra());
				else
					System.out.print(sortearNumero());
			}
			System.out.println();
		}
	}
	
	public char sortearLetra() {
		int indice = sorteador.nextInt(alfabeto.length());
		char letra = alfabeto.charAt(indice);
		
		return letra;
	}
	
	public int sortearNumero() {
		return sorteador.nextInt(10);
	}
	
	public String gerarAlfabeto() {
		StringBuilder alfabeto = new StringBuilder();
		
		for(char c = 'A'; c <= 'Z'; c++) {
			alfabeto.append(c);
		}
		
		return alfabeto.toString();
	}
}
