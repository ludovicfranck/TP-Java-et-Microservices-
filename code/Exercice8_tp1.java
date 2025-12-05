import java.util.Scanner;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 7 du TP1 "
 * @topic =  multiple
 */

public class Exercice8_tp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // ============================================ LES MULTIPLES DE 50 DE FACON STATIQUE ====================================================
        // System.out.println("Les multiples de 5 sont :");

        // for (int i = 0 ; i <=10 ; i++ ){
        //     System.out.println(5*i);
        // }
        // ==================================================================================================================

        System.out.print("Saisir votre nombre : ");

        int num  = scanner.nextInt();

        System.out.print("Veuillez saisir votre nombre seuil : ");

        int max = scanner.nextInt() ;

        int multiple = 0;
        int compt = 1 ;

        while(multiple <= max){
            System.out.println(multiple);
            multiple = num * compt ;
            compt++;
        }
        scanner.close();
    }
}
