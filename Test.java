package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	  /*1--7
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant("Taha",25,17.25,"Houmt Souk Djerba");
		
		
		System.out.println("Etudiant 1 : ");
		e1.info();
		
		System.out.println("Etudiant 2 : ");
		e2.info();
		*/
	//8
	Scanner scanner = new Scanner(System.in);
	 System.out.println("Veuillez saisir les informations pour le premier étudiant :");
     System.out.print("Nom : ");
     String nom1 = scanner.nextLine();
     int age1 = lireEntier(scanner, "Âge : ");
     double moyenne1 = lireDouble(scanner, "Moyenne : ");
     System.out.print("Adresse : ");
     String adresse1 = scanner.nextLine();

     // Création de l'étudiant 1 avec les informations saisies
     Etudiant etudiant1 = new Etudiant(nom1, age1, moyenne1, adresse1);

     // Lire les informations pour le deuxième étudiant
     System.out.println("\nVeuillez saisir les informations pour le deuxième étudiant :");
     System.out.print("Nom : ");
     String nom2 = scanner.nextLine();
     int age2 = lireEntier(scanner, "Âge : ");
     double moyenne2 = lireDouble(scanner, "Moyenne : ");
     System.out.print("Adresse : ");
     String adresse2 = scanner.nextLine();

   
     // Création de l'étudiant 2 avec les informations saisies
     Etudiant etudiant2 = new Etudiant(nom2, age2, moyenne2, adresse2);

     // Affichage des informations des deux étudiants
     System.out.println("\nInformations de l'étudiant 1 :");
     etudiant1.info();

     System.out.println("Informations de l'étudiant 2 :");
     etudiant2.info();

     // Fermer le scanner
     scanner.close();
			        
	}



private static int lireEntier(Scanner scanner, String message) {
	 int nombre;
     while (true) {
         System.out.print(message);
         try {
             nombre = scanner.nextInt();
             scanner.nextLine(); // Consommer la nouvelle ligne
             break;
         } catch (InputMismatchException e) {
             System.out.println("Erreur : veuillez saisir un nombre entier.");
             scanner.nextLine(); // Consommer l'entrée incorrecte
         }
     }
     return nombre;
}	
private static double lireDouble(Scanner scanner, String message) {
	   double nombre;
       while (true) {
           System.out.print(message);
           try {
               nombre = scanner.nextDouble();
               scanner.nextLine(); // Consommer la nouvelle ligne
               break;
           } catch (InputMismatchException e) {
               System.out.println("Erreur : veuillez saisir un nombre décimal .");
               scanner.nextLine(); // Consommer l'entrée incorrecte
           }
       }
       return nombre;
   }

}
