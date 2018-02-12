/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author wellington
 */
public class ExercicioRepita {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		int numero, soma = 0, cont = 0, impares = 0, pares = 0, acimaCem = 0;
		double media = 0.0;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: <br/><em>(valor 0 interrompe)</em></html>"));
			soma += numero;
			//total
			cont ++;
			//pares e impares
			if(numero != 0 && numero % 2 == 0) {
				pares++;
			} else if (numero != 0 && numero % 2 == 1){
				impares++;
			}
			//acima de 100
			if (numero > 100) {
				acimaCem++;
			}
			//media
			if (numero != 0) {
				if (cont == 1) {
					media += numero;
				} else {
					media = (media + numero) / 2;
				}
			}
			
		} while(numero != 0);
		cont--;
		
		JOptionPane.showMessageDialog(null, "<html>Resultado final <hr><br/>"
				+ "Total de valores: " + cont 
				+ "<br/>Total de pares: " + pares
				+ "<br/>Total de ímpares: " + impares
				+ "<br/>Acima de 100: " + acimaCem
				+ "<br/>Média dos valores: " + media +
				"</html>");
	}
	
}
