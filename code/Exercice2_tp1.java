import java.util.Scanner;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = Cette classe est relative a l'ensemble des taches demandes a L'exercice 2 du TP1
 * @topic = Tarif reduit => age < 26 , Tarif reduit qui s'applique aux personnes age < 26 ou age > 65 
 */

public class Exercice2_tp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer votre age :");
        int age  = scanner.nextInt();

        if (age < 26)
            System.out.println("Vous etes eligibles au Tarif reduit !");
        else if(age > 65)
            System.out.println("Vous etes eligibles au tarif reduit !"); 
            
        else
            System.out.println("Vous n'etes pas eligibles au Tarif eleligible !");

        scanner.close();
    }
}
