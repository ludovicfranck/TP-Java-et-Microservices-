import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 6 du TP1 "
 * @topic =  Compteur
 */


public class Exercice6_tp1 {
    public static void main(String[] args) {

        // compter jusqu'a 20 :

        for(int compt = 1 ; compt <= 20 ; compt ++){
            System.out.println("compteur : " + compt);
        }

        // Compteur dynamique .... avec BufferedReader
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Entrer le nombre entier d'arret de compte :");

        try{
            String compt_string = bufferedReader.readLine();

            int compt = Integer.parseInt(compt_string);
            for (int i = 1 ; i<=compt ; i++){
                System.out.println("compt : " + i);
            } 
        }catch(IOException exception){
            System.err.println("Number not found !");
        }
    }
}
