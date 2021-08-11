/*Meu primeiro programa java*
 * 
 */
package meuPrimeiroProgramaJAVA;

import java.util.Scanner;

/**
 * @author Rafael
 *
 */
public class Principal2 { // Classe que mantém o método principal.

	/**
	 * @param args
	 */
	public static void main(String[] args) { // Este é o modo principal.
		System.out.println("Olá amigo!\nQual é o seu nome?"); // print usado para pular linha "println"
		// Ler uma string do console usando a biblioteca scanner
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.printf("Olá %s!\n", nome);
		
		// Comentário para teste para do github..
		

	}

}
