import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @TP = 3
 * @author = "Fogang K. Franck Ludovic LIC/GL-A"
 * @TP = "Java Et Microservices"
 * @professeur = Mr Franklin KASSAN'NGA
 * @message = "Cette classe est relative a l'ensemble des taches demandes a L'exercice 3 du TP3 "
 * @topic =  ArrayList -> HashMap
 */


public class Exercice3_tp3 {
    public static void main(String[] args) {

        // Initialisation de la liste ....

        List<String> country = new ArrayList<>(Arrays.asList("France" ,"Allemagne","Russie","USA","Chine"));
        List<Integer> population = new ArrayList<>(Arrays.asList(62,82,288,200,1290));

        System.out.println("Pays: " + country.get(0) + " -"+ "Population: " + population.get(0) + " " + "millions");

        for (Integer pop:population){
            if (pop > 200){
                int index = population.indexOf(pop);
                System.out.println("Pays : "  + country.get(index));
            }
        }


        // Remplacement des deux ArrayList par un HashMap ;
        Map<String,Integer> countryInfo = new HashMap<>();
        countryInfo.put("France", 62);
        countryInfo.put("Allemagne", 82);
        countryInfo.put("Russie", 288);
        countryInfo.put("USA" , 200);
        countryInfo.put("Chine" , 1290);

        System.out.println(countryInfo);
        
    }
}
