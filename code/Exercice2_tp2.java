import java.util.Scanner;

/**
 * @TP = 2
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 2 du TP2 "
 * @topic =  Longueur d'une phrase ...
 */

public class Exercice2_tp2 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        System.out.print("Entrer votre phrase ! : ");

        String message = sc.nextLine();

        if(message.trim().length() < 20){
            System.out.println("Phrase courte !");
        }
        else if (message.trim().length() > 20 && message.trim().length() <= 50){
            System.out.println("Phrase moyenne !");
        }
        else{
            System.out.println("Phrase Longue !");
        }
    }

}
