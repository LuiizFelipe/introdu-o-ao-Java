/*
 * Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:
 */
package introdu��oAoJava;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		float R, S, D;
		int a, b, c;

		Scanner id = new Scanner(System.in);
		System.out.println("Digite o primeiro Numero: ");
		a = id.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = id.nextInt();
		System.out.println("Digite  o terceiro numero : ");
		c = id.nextInt();

		R = (a + b) ^ 2;
		S = (b + c) ^ 2;
		D = (R + S) / 2;

		System.out.println("O resultado �  " + D);
	}

}