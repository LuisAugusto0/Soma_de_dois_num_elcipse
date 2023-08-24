package SomaNum;

import java.util.Scanner;

class somaDoisNumeros {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//declaração de variável
		int num1, num2, soma;
		
		//leituras
		System.out.println("Soma de dois numeros");
		System.out.print("\nEscolha o primeiro valor: ");
		num1 = scan.nextInt();
		System.out.print("\nEscolha o segundo valor: ");
		num2 = scan.nextInt();
		
		//operação (soma)
		soma = num1+num2;
		
		//saída
		System.out.println("Soma: " + soma);
	}
}
