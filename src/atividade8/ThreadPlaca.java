package atividade8;

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
			System.out.println("");
			for(int j = 1; j <= 7; j++) {
				if(j <= 3 || j == 5)
					System.out.print(sortearLetra());
				else
					System.out.print(sortearNumero());
			}
		}
	}
	
	public char sortearLetra() {
		int indice = sorteador.nextInt(alfabeto.length());
		
		
	}
	
	public String gerarAlfabeto() {
		StringBuilder alfabeto = new StringBuilder();
		
		for(char c = 'A'; c <= 'Z'; c++) {
			alfabeto.append(c);
		}
		
		return alfabeto.toString();
	}
}
