/*Meu primeiro programa java*
 * 
 */
package meuPrimeiroProgramaJAVA;

import java.util.Scanner;

/**
 * @author Rafael
 *
 */
public class Principal2 { // Classe que mant�m o m�todo principal.

	/**
	 * @param args
	 */
	public static void main(String[] args) { // Este � o modo principal.
		System.out.println("Ol� amigo!\nQual � o seu nome?"); // print usado para pular linha "println"
		// Ler uma string do console usando a biblioteca scanner
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.printf("Ol� %s!\n", nome);
		
		// Coment�rio para teste para do github..
		

	}

}
