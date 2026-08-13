package atividade11;

public class ParteCarro extends Thread {
	String nome;
	
	public ParteCarro(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void run() {
		System.out.println("Parte do carro construída (" + nome + ")");
	}
}