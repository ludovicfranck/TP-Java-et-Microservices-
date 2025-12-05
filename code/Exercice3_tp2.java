import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = Cette classe est relative a l'ensemble des taches demandes a L'exercice 3 du TP1
 * @topic = 1 ere lettre , derniere lettre d'un mot et la taille d'un mot
 */

public class Exercice3_tp2 {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Entrez votre mot : ");
            String word = bf.readLine();
            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length()-1);
            System.out.println("Premiere lettre : " + firstLetter);
            System.out.println("Derniere lettre : " + lastLetter);
            System.out.println("La taille du mot saisit : " + word.length());
        }catch(IOException exception){
            System.err.println("Message not found !");
        }
    }
    
}
