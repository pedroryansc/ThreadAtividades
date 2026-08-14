package atividade11;

public class ParteCarro extends Thread {
	private String nome;
	private int tempoTarefa;
	
	public ParteCarro(String nome, int tempoTarefa) {
		this.nome = nome;
		this.tempoTarefa = tempoTarefa;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(tempoTarefa);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Parte do carro construída (" + nome + ") em " + (tempoTarefa / 1000) + "s");
	}
}