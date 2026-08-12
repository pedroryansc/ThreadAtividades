package atividade8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade de placas de veículos para gerar: ");
		int x = entrada.nextInt();
		
		ThreadPlaca geradorPlaca = new ThreadPlaca(x);
		geradorPlaca.start();
		
		entrada.close();
	}
}