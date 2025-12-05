import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 7 du TP1 "
 * @topic =  pair ou impair => afficher 2k ou 2k+1 (10 elments)
 */


public class Exercice7_tp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));

        System.out.print("Entrez votre nombre : ");

        String nombre_string;
        try {
            nombre_string = bufferedReader.readLine();
            int nombre = Integer.parseInt(nombre_string);
            if (nombre % 2 == 0){
                System.out.println(nombre + " est un nombre pair !");
                int nombrePair = nombre ;
                for (int i = 0 ; i < 10 ; i++){
                    System.out.print(nombrePair + "|");
                    nombrePair += 2 ;
                }
            }
            else{ // nombre est imapair
                System.out.println(nombre + " est un nombre impair ! ");
                int nombreImpair = nombre ;
                for (int i = 0 ; i <= 10 ; i++){
                    System.out.print(nombreImpair + "|");
                    nombreImpair +=1 ;
                    if(nombreImpair % 2 == 0){
                        nombreImpair +=1 ;
                    }
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.err.println("Number not found !");
        }
        scanner.close();
    }
}
