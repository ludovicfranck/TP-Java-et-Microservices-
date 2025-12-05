import java.util.Calendar;
import java.util.GregorianCalendar;
public class DVD {
    private String titre ;
    private char couleur;
    private GregorianCalendar dateSortie;

    public String getTitre(){return this.titre ;}
    public char getCouleur(){return this.couleur;}
    public GregorianCalendar getDatedeSortie(){return this.dateSortie;}

    public void setTitre(String titre){
        this.titre = titre;
    }
    public void setCouleur(char couleur){
        this.couleur = couleur;
    }
    public void setDatedeSortie(GregorianCalendar date){
        this.dateSortie = date ;
    }

    public DVD(String titre , char couleur , GregorianCalendar dateSortie){
        this.titre = titre ;
        this.couleur = couleur ; 
        this.dateSortie = dateSortie ;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[ titre: " + titre + "-" + "couleur: " + couleur + "-" + "date de sortie: " + dateSortie;
    }

    public double prixDVD(){
        // rouge => 3 euro (r)
        // vert => 2 euro (v)
        if (couleur == 'R'){
            return (double)3;
        }
        else if (couleur == 'V'){
            return (double)2;
        }
        else{
            return (double)0;
        }
    }

    public boolean isNouveaute(){
        // if (date.now - dateDVD < 3 mois ) => true ...
        // else (date.now - dateDVD >= 03 mois ) => false ...
        GregorianCalendar maintenant  = new GregorianCalendar(2024 , 12 ,5); // Temps actuel
        
        int differanceMois = 0 ;
        
        differanceMois = (Math.abs(dateSortie.get(Calendar.YEAR) - maintenant.get(Calendar.YEAR)))*12 ; // 1 an = 12 mois
        
        differanceMois += (Math.abs(dateSortie.get(Calendar.MONTH) - maintenant.get(Calendar.MONTH)));

        System.out.println(differanceMois);
        if (differanceMois >= 3){
            return false;
        }
        else{
            return true;
        }

    }
    public static void main(String[] args) {
        DVD dvd = new DVD("Les Tribus de Capitoline ", 'R', new GregorianCalendar(2025 , 1 , 30));

        System.out.println(dvd.isNouveaute());
    }
}
