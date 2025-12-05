import java.util.Scanner;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = Cette classe est relative a l'ensemble des taches demandes a L'exercice 4 du TP1
 * @topic = Nom et prenom ...
 */

public class Exercice4_tp2 {
 public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);

    System.out.print("Veuillez entrer votre nom : ");
    
    String lastName  = sc.nextLine();

    System.out.print("Veuillez entrer votre nom : ");

    String firstName = sc.nextLine();

    System.out.println("Nom : " + lastName.toUpperCase() + " - Taille :" + lastName.length() );
    System.out.println("Prenom : " + firstName.toLowerCase() + " - Taille :" + firstName.length());

    sc.close();
 }
}
