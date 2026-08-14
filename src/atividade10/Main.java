package atividade10;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random sorteador = new Random();
		int quantPacientes = sorteador.nextInt(1, 11);
		
		ThreadAtendimento[] atendimentos = new ThreadAtendimento[quantPacientes];
		
		int tempoAtendimento = 0;
		for(int i = 0; i < quantPacientes; i++) {
			tempoAtendimento = sorteador.nextInt(1000, 10000);
			ThreadAtendimento atendimento = new ThreadAtendimento(tempoAtendimento);
			atendimentos[i] = atendimento;
		}
		
		
	}
}