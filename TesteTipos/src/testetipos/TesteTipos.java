/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author wellington
 */
public class TesteTipos {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int idade = 20;
		String valor = Integer.toString(idade);
		idade = Integer.parseInt(valor);
		String valor2 = "20.10";
		float idade2 = Float.parseFloat(valor2);
		System.out.println(idade2);
	}
	
}
