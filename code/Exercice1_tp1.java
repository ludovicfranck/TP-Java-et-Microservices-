import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @TP = 1
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 1 du TP1 "
 */
public class Exercice1_tp1{
    public static void main(String[] args) {
        /*
        *  Partie A
        */
        // Avec Scanner ... Et en affichant dans la console ....
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Entrez votre nom : ");
        // String name =  scanner.next();
        // System.out.println("Bonjour " +  name  + "!");
        // scanner.close();


        // Avec JOptionPane ... 
        String name2 = JOptionPane.showInputDialog("Entrez votre nom : ");
        JOptionPane.showMessageDialog(null, "Bonjour " + name2 + "!"); // affiche le message dans une boite de dialogue

        /**
         * Partie B
         */
        System.out.print("Entrer le premier nombre : ");
        int nombre1 = scanner.nextInt(); 
        System.out.print("Entrer le deuxieme nombre : ");
        int nombre2 = scanner.nextInt();
        
        // Avec JoptionPane , Voila comment ci dessous on recupere les deux valeurs num1 et num2 ...
        // String number1 = JOptionPane.showInputDialog("Entrer votre premier nombre :");
        // int num1 = Integer.parseInt(number1);
        // String number2  = JOptionPane.showInputDialog("Entrer le deuxieme nombre :");
        // int num2 = Integer.parseInt(number2);

        System.out.println("L'addition de " + nombre1 + " et " + nombre2 + " est : " + (nombre1+nombre2));
        System.out.println("La soustraction de " + nombre1 + " et " + nombre2 + " est : " + (nombre1-nombre2));
        System.out.println("La multiplication de " + nombre1 + " par " + nombre2 + " est : " + (nombre1*nombre2));
        // We are trying here to manage error 
        try{
            System.out.println("La division de " + nombre1 + " par " + nombre2 + " est : " + ((double)nombre1/nombre2));
        }catch(ArithmeticException exception){
            System.err.println("Cannot divide a number by 0");
        }
        scanner.close();
    }
    
    
}