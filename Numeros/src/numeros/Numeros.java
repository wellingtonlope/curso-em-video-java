/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class Numeros {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		int numero, soma = 0;
		String resposta = "";
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Digete um numero: ");
			numero = teclado.nextInt();
			soma += numero;
			System.out.println("Quer continuar? [S/N]");
			resposta = teclado.next();
		} while(resposta.equals("S"));
		System.out.println("A soma de todos os valores é " + soma);
	}
	
}
