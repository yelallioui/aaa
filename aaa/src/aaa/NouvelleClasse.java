

package aaa;

import java.util.Scanner;

public class NouvelleClasse {

	public NouvelleClasse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		final String PWD = "123456";
		final String LOGIN = "abcdef";
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Entrer votre mot de passe : ");
		String pass = scanner.nextLine();
		System.out.print("Entrer votre mot de Login : ");
		String nom = scanner.nextLine();
		
		while (!PWD.equals(pass) || !LOGIN.equals(nom) ) {
			System.out.println("Login ou Mot de passe sont incorrectes. Merci de reesseyer : ");
			System.out.print("Votre mot de passe : ");
			pass = scanner.nextLine();
			System.out.print("Votre login : ");
			nom = scanner.nextLine();
		}
		System.out.println("Login et Mot de passe sont correctes. BRAVO !");
 
	}

}
