package atividade10;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
	public static void main(String[] args) {
		BlockingQueue<Paciente> filaPacientes = new LinkedBlockingQueue<>();
		
		for(int i = 1; i <= 10; i++) {
			Paciente paciente = new Paciente(i);
			filaPacientes.add(paciente);
			
			System.out.println(paciente + " entrou na fila do pronto-socorro");
		}
		
		Medico medico1 = new Medico(1, filaPacientes);
		Medico medico2 = new Medico(2, filaPacientes);
		
		System.out.println("\nIniciando os atendimentos\n");
		
		medico1.start();
		medico2.start();
	}
}