/*
 *Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.

 */

package introdu��oAoJava;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		int seg, min, hora, tempo;
		Scanner id = new Scanner(System.in);

		System.out.println("Digite a dura��o do evento em segundos: ");
		tempo = id.nextInt();

		hora = tempo / 3600;
		min = (tempo % 3600) / 60;
		seg = (tempo % 3600) % 60;

		System.out.println("A dura��o do evento foi de " + hora + " horas " + min + " minutos " + seg + " segundos");

	}

}