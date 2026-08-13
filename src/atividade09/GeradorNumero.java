package atividade09;

import java.util.Random;

public abstract class GeradorNumero {
	private int quantNumeros;
	private Random sorteador;
	
	public GeradorNumero() {
		this.sorteador = new Random();
		sortearQuantNumeros();
	}

	public int getQuantNumeros() {
		return quantNumeros;
	}
	
	public void sortearQuantNumeros() {
		// Foi definida a quantidade mínima de 1 número e, no máximo, 20 números
		// (para facilitar a contagem e verificação do programa)
		this.quantNumeros = sorteador.nextInt(1, 21);
	}
	
	public int gerarNumero(boolean par) {
		int restoDivisao = par ? 0 : 1;
		
		int numero = sorteador.nextInt(0, 1001);
		
		if(numero % 2 != restoDivisao) {
			numero += 1;
		}
		
		return numero;
	}
}
