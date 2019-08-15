package ejercicioPalindromo;

import java.util.Scanner;

public class Palindromo {
	/**
	 *
	 * @Elba
	 */
	public static void main(String[] args) {
		System.out.println("Introduce una palabra para verificar si es palindromo");
		Scanner leer = new Scanner(System.in);
		String palabra=leer.nextLine();	

		int cont=1;
		for (int i=0 ;i< palabra.length();i++) {
			if(palabra.charAt(i)!= palabra.charAt(palabra.length()-1-i)) {
				cont=0;	
			}		

		}if (cont==1) {
			System.out.println("La palabra es palindromo");
		}else {
			System.out.println("La palabra NO es palindromo");
		}
	}

}
