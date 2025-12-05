import java.util.Scanner;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 5 du TP1 "
 * @topic = TARIFICATION DÉGRESSIVE
 */

public class Exercice5_tp1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entre votre quantite : ");

        int qte  =  scanner.nextInt();

        double somme = 0 ;

        if (qte < 10) {
            somme = qte * 150;
        }
        else if (qte >= 10 && qte < 49){
            somme = qte * 135;
        }
        else if (qte > 49){
            somme = qte * 110 ;
        }

        System.out.println("Votre depense est de : " + somme);

        scanner.close();
        
    }    
}
