
/*
 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
 */

package introdu��oAoJava;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		double precoFabrica, precoFinal;

		Scanner id = new Scanner(System.in);

		System.out.print("Valor do carro livre de impostos ");
		precoFabrica = id.nextDouble();

		precoFinal = (precoFabrica * 0.73) + precoFabrica;

		System.out.print("O valor do carro com impostos :" + precoFinal);
	}
}
