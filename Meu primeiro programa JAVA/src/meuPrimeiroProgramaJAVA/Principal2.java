/*Meu primeiro programa java*
 * 
 */
package meuPrimeiroProgramaJAVA;

import java.util.Scanner;

/**
 * @author Rafael
 *
 */
public class Principal2 { // Classe que mant�m o todo principal.

	/**
	 * @param args
	 */
	public static void main(String[] args) { // Este � o modo principal.
		System.out.println("Ol�! amigo!\nQual � o seu nome?"); // print usado para pular linha "println"
		// Ler uma string do console usando a biblioteca scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.printf("Ol�! %s!\n", nome);
		
		System.out.printf("Qual a sua idade ?");
		
		Integer idade = in.nextInt();
		
		System.out.printf("%d! Puxa! Como voc� � jovem!", idade);
		print ("Ol� teste");
		
		// Commenter para teste do github.
		
		// mais um coment�rio de teste
		

	}

private static void print(String string) {
	// TODO Auto-generated method stub
	
}

}
