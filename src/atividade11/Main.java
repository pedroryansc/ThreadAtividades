package atividade11;

public class Main {
	public static void main(String[] args) {
		String[] partesCarro = {"Chassi", "Motor", "Rodas", "Carroceria"};
		
		Thread[] threadsConstrucao = new Thread[partesCarro.length];
		
		for(int i = 0; i < partesCarro.length; i++)
			threadsConstrucao[i] = new ParteCarro(partesCarro[i]);
		
		System.out.println("Foi iniciada a construção do carro");
		
		for(Thread thread : threadsConstrucao) {
			thread.start();
			
			try {
				thread.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("A construção do carro foi finalizada.");
	}
}
