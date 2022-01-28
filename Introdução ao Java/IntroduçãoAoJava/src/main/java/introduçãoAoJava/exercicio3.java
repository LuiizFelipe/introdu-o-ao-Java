/*
 *Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.

 */

package introduçãoAoJava;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		int seg, min, hora, tempo;
		Scanner id = new Scanner(System.in);

		System.out.println("Digite a duração do evento em segundos: ");
		tempo = id.nextInt();

		hora = tempo / 3600;
		min = (tempo % 3600) / 60;
		seg = (tempo % 3600) % 60;

		System.out.println("A duração do evento foi de " + hora + " horas " + min + " minutos " + seg + " segundos");

	}

}