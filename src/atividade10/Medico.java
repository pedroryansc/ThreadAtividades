package atividade10;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Medico extends Thread {
	private int id;
	private BlockingQueue<Paciente> filaPacientes;
	
	public Medico(int id, BlockingQueue<Paciente> filaPacientes) {
		this.id = id;
		this.filaPacientes = filaPacientes;
	}
	
	@Override
	public void run() {
		try {
			while(filaPacientes.size() > 0) {
				Paciente paciente = filaPacientes.take();
				
				System.out.println("Médico " + id + " iniciou o atendimento do " + paciente);
				
				int tempoAtendimento = ThreadLocalRandom.current().nextInt(1, 6);
				
				Thread.sleep(tempoAtendimento * 1000);
				
				System.out.println("Médico " + id + " finalizou o atendimento do " + paciente + " em " + tempoAtendimento + " segundos");
			}
			
			System.out.println("Médico " + id + " encerrou seus atendimentos.");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}