/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author wellington
 */
public class ComparacaoString {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		String nome1 = "Wellington";
		String nome2 = "Wellington";
		String nome3 = new String("Wellington");
		String res1 = nome1 == nome2 ? "igual" : "diferente";
		String res2 = nome1.equals(nome3) ? "igual" : "diferente";
		
		System.out.println(res1);
		System.out.println(res2);
	}
	
}
