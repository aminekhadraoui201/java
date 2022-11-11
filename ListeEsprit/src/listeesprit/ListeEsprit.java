/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeesprit;

/**
 *
 * @author user
 */
public class ListeEsprit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        EspritArrayList e = new EspritArrayList();
        e.ajouterEtudiant(new Etudiant (1,"BEN CHIK","amine"));
        e.ajouterEtudiant(new Etudiant (8,"tebsi","majed"));
        e.ajouterEtudiant(new Etudiant (23,"bel haj","fatma"));
        e.ajouterEtudiant(new Etudiant (5,"mejri","salma"));
        e.ajouterEtudiant(new Etudiant (0,"wa7ch","med"));
        //e.trierEtudiantsParId();
        e.trierEtudiantsParNom();
        e.supprimerEtudiant(new Etudiant(0,"" ,"" ));
        e.displayEtudiants();
        
    }
    
}
