import java.util.ArrayList;
import java.util.List;

/**
 * @TP = 3
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 1 du TP3 "
 * @topic =  DECLARATION DE TABLEAUX , ArrayList ....
 */


public class Exercice1_tp3 {
    public static void main(String[] args) {

        int[] tabInt = new int[10];

        for (int i=0 ; i<tabInt.length ; i++){
            int aleatoire = (int) (Math.random()*(100 + 1));
            tabInt[i] = aleatoire ;
        }

        for (int element:tabInt){
            System.out.print(element + " | ");  // affichage des elements du tableau ...
        }

        // somme des elements du tableau ...
        int somme = 0 ;
        for (int compt = 0 ; compt < tabInt.length ; compt++){
            somme += tabInt[compt];
        }
        System.out.println("La somme des elements du tableau est : "  + somme);

        // produit des elements du tableau ...

        double produit = 1d;

        for (int i = 0 ; i < tabInt.length ; i++){
            produit *= tabInt[i];
        }
        System.out.println("Le produit des elements du tableau est : " + produit);

        // Max des elememts du tableau ...

        int max = tabInt[0] ;
        for (int compt = 1 ; compt < tabInt.length ; compt++){
            if (tabInt[compt] > max){
                max = tabInt[compt] ;
            }
        }
        System.out.println("Le Max des elements du tableau est : "  + max);

        int min = tabInt[0] ;
        for (int compt = 1 ; compt < tabInt.length ; compt++){
            if (tabInt[compt] < min){
                min = tabInt[compt];
            }
        }
        System.out.println("Le Min des elements du tableau est : " + min);


        List<Integer> nombresPairs = new ArrayList<>();
        // remplissage ....
        for (int cpt = 0 ; cpt < tabInt.length ; cpt++){
            if (tabInt[cpt] % 2 == 0){
                nombresPairs.add(tabInt[cpt]);
            }
        }
        System.out.println("Tableau de nombres pairs : " + nombresPairs);

        List<Integer> nombresImpairs = new ArrayList<>();
        // remplissage ....
        for (int cpt = 0 ; cpt < tabInt.length ; cpt++){
            if((tabInt[cpt] % 2) != 0){
                nombresImpairs.add(tabInt[cpt]);
            }
        }
        System.out.println("Tableau de nombres impairs : " + nombresImpairs);


    }
    
}
