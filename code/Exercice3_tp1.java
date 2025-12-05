import java.util.Scanner;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 3 du TP1 "
 * @topic = DEPARTEMENTS
 */
public class Exercice3_tp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] departement = {75,77,78,91,92,93,94};

        System.out.print("Veuillez entrer le code de votre ville : ");

        int code = sc.nextInt(); 
        int pos = 0;
        
        for (int i = 0 ; i < departement.length ; i++){
            if (departement[i] == code){
                pos = 1 ;
            }
            else{
                pos = -1 ;
            }
        }
        if (pos == 1)
            System.out.println("Vous faites partir de L'ile de France !");
        else
            System.out.println("Vous ne faites pas partir de L'ile de France !");

        //  code appartient [1 , 99]
        if (code < 1 || code > 99)
            System.out.println("Vous ne faites pas partir de L'ile de France !");
        else
            System.out.println("Vous faites partir de L'ile de France !");
        
        //Fin du programme ...
        sc.close();
    }
    
}
