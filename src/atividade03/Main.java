package atividade03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro número do intervalo: ");
		int a = entrada.nextInt();
		
		System.out.print("Segundo número do intervalo: ");
		int b = entrada.nextInt();
		
		System.out.print("Quantidade de números escolhidos dentro do intervalo: ");
		int x = entrada.nextInt();
		
		ThreadSorteio thread = new ThreadSorteio(a, b, x);
		thread.start();
		
		entrada.close();
	}
}