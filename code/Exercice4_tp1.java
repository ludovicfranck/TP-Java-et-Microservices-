import java.util.Scanner;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 4  du TP1"
 * @topic = PRODUITS
 */

public class Exercice4_tp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le premier nombre : ");
        int num1 = sc.nextInt();
        System.out.print("Entrer le deuxieme nombre : ");
        int num2 = sc.nextInt();

        if ((num1>0 && num2>0)||(num1<0 && num2<0))
            System.out.println("Le produit est positif !");

        else if ((num1>0 && num2<0) || (num1<0 && num2>0))
            System.out.println("Le prosuit est negatif !");

        sc.close();
    }
    
}
