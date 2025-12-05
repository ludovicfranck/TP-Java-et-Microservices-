import java.util.Scanner;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 9 du TP1 "
 * @topic = DEVINETTE / BOUCLE 
 */


public class Exercice9_tp1 {
    public static void main(String[] args) {
       Scanner scanner  = new Scanner(System.in); 

       int nb_aleatoire = (int) (Math.random()*10 + 1) ;

       int trial_number = 1 ;

       System.out.print("Entrer votre nombre entre 1 et 10 : ");

       int nombre = scanner.nextInt(); 

       if (nb_aleatoire == nombre){
            System.out.println("Bravo vous avez devinez le mot !");
       }
       else{
            while(nombre != nb_aleatoire){
                System.out.print("Oups Mauvais choix , veuillez saisir une nouvelle valeur : ");
                trial_number += 1 ;
                nombre = scanner.nextInt();
            }
        System.out.println("Bravo vous avez enfin trouver apres : " + trial_number  + " tentatives !");
       }

       scanner.close();

    }
    
}
