package atividade09;

public class ThreadImpares extends GeradorNumero implements Runnable {
	public void run() {
		for(int i = 1; i <= getQuantNumeros(); i++) {
			int numero = gerarNumero(false);
			
			System.out.println(i + "º Ímpar: " + numero);
		}
	}
}
