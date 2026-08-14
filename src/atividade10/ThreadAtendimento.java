package atividade10;

public class ThreadAtendimento extends Thread {
	int tempoAtendimento;
	
	public ThreadAtendimento(int tempoAtendimento) {
		this.tempoAtendimento = tempoAtendimento;
	}
	
	@Override
	public void run() {
		Thread.currentThread();
		Thread.yield();
		
		try {
			Thread.sleep(tempoAtendimento);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Atendimento finalizado em " + (tempoAtendimento / 1000) + "s");
	}
}