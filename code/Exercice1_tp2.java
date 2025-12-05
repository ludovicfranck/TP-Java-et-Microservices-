import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @TP = 2
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 1 du TP2 "
 * @topic =  Nature d'un verbe
 */

 
public class Exercice1_tp2 {

    // message = "manger" => ['m', 'a' , 'n', 'g', 'e', 'r']


    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Entrez votre verbe: ");
        try{
            String message = bf.readLine();
            if (message.endsWith("er")){
                System.out.println(message + " : est un verbe du premier groupe ! ");
            }
            else if (message.endsWith("ir")){
                System.out.println(message + " : est un verbe du deuxieme groupe ! ");
            }
            else if (
                (message.endsWith("oir")) || (message.endsWith("oire"))
                ){
                    System.out.println(message + " : est un verbe du troisieme groupe ! ");
                }
        }catch(IOException exception){
            System.err.println("Message not found !");
        }
        
    }
    
}
