package atividade09;

public class ThreadPares extends GeradorNumero implements Runnable {
	public void run() {
		for(int i = 1; i <= getQuantNumeros(); i++) {
			int numero = gerarNumero(true);
			
			System.out.println(i + "º Par: " + numero);
		}
	}
}
