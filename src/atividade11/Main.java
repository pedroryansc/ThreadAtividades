package atividade11;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random sorteador = new Random();
		
		String[] partesCarro = {"Chassi", "Motor", "Rodas", "Carroceria"};
		
		Thread[] threadsConstrucao = new Thread[partesCarro.length];
		
		int tempoTarefa = 0;
		for(int i = 0; i < partesCarro.length; i++) {
			tempoTarefa = sorteador.nextInt(1000, 5001);
			threadsConstrucao[i] = new ParteCarro(partesCarro[i], tempoTarefa);
			threadsConstrucao[i].start();
		}
		
		System.out.println("Foi iniciada a construção do carro");
		
		for(Thread thread : threadsConstrucao) {
			try {
				thread.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("A construção do carro foi finalizada.");
	}
}
