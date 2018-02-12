/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author wellington
 */
public class Vetor03 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		int numeros[] = {3, 5, 1, 8, 4};
		
		//ordenar array
		Arrays.sort(numeros);
		
		//procurar posição
		int valor = 5;
		int posicao = Arrays.binarySearch(numeros, valor);
		
		System.out.println("Encontrei o valor " + valor + " na posição " + posicao);
		
		//foreach
		for (int numero: numeros) {
			System.out.print(numero + " ");
		}
		System.out.println("");
		
		//preencher todos os elementos
		int v[] = new int[10];
		Arrays.fill(v, 0);
		
		for (int numero: v) {
			System.out.print(numero + " ");
		}
	}
	
}
