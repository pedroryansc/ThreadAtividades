package atividade09;

public class Main {
	public static void main(String[] args) {
		ThreadPares pares = new ThreadPares();
		ThreadImpares impares = new ThreadImpares();
		
		while(pares.getQuantNumeros() == impares.getQuantNumeros()) {
			impares.sortearQuantNumeros();
		}
		
		Thread threadPares = new Thread(pares);
		Thread threadImpares = new Thread(impares);
		
		threadPares.start();
		threadImpares.start();
		
		try {
			threadPares.join();
			threadImpares.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}