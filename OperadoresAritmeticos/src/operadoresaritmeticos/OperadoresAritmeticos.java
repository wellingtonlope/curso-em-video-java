/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author wellington
 */
public class OperadoresAritmeticos {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		int n1 = 3;
		int n2 = 5;
		float m = (n1 + n2) / 2;
		System.out.println("A média é igual a " + m);

		int numero = 5;
		numero++;
		System.out.println(numero);
		System.out.println(++numero);
		System.out.println(numero++);
		System.out.println(numero);

		int x = 4;
		x += 2; // x = x + 2
		System.out.println(x);

		// exponenciação
		System.out.println(Math.pow(5, 2));
		//valor de PIÏ
		System.out.println(Math.PI);
		//raiz quadrada
		System.out.println(Math.sqrt(25));
		//raiz cubica
		System.out.println(Math.cbrt(27));
		//valor absoluto
		System.out.println(Math.abs(-10));
		//arredondar para baixar
		System.out.println(Math.floor(3.9));
		//arredondar para cima
		System.out.println(Math.ceil(4.2));
		//arredonda aritmeticamente
		System.out.println(Math.round(5.6));
		//random gera um numero entre 0 e 1
		System.out.println(Math.random());
		//gerar numero entre 10 e 5
		System.out.println((int) (5 + Math.random() * (10-5)));

	}

}
