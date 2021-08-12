/*Meu primeiro programa java*
 * 
 */
package meuPrimeiroProgramaJAVA;

import java.util.Scanner;

/**
 * @author Rafael
 *
 */
public class Principal2 { // Classe que mantém o todo principal.

	/**
	 * @param args
	 */
	public static void main(String[] args) { // Este é o modo principal.
		System.out.println("Olá! amigo!\nQual é o seu nome?"); // print usado para pular linha "println"
		// Ler uma string do console usando a biblioteca scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.printf("Olá! %s!\n", nome);
		
		System.out.printf("Qual a sua idade ?");
		
		Integer idade = in.nextInt();
		
		System.out.printf("%d! Puxa! Como você é jovem!", idade);
		print ("Olá teste");
		
		// Commenter para teste do github.
		
		// mais um comentário de teste
		

	}

private static void print(String string) {
	// TODO Auto-generated method stub
	
}

}
