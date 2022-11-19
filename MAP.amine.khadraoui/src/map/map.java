/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

/**
 *
 * @author user
 */
public class map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Employe e1 = new Employe(25365689,"Adfs5212f","amine","khadraoui");
        Employe e2 = new Employe(55985645,"Asfk458gg","slim","abdallah");
        Employe e3 = new Employe(45867465,"DFhghkl","ahmed","boufa7ja");
        
        Departement d1 = new Departement(1,"ijk");
        Departement d2 = new Departement(2,"g");
        Departement d3 = new Departement(3,"Business");
        
        SocieteHashMap s = new SocieteHashMap();
        
        s.ajouterEmployeDepartement(e1, d1);
        s.ajouterEmployeDepartement(e2, d2);
        s.ajouterEmployeDepartement(e3, d3);
        System.out.println("************LES DEPARTEMENTS************");
                
                
        s.afficherLesDepartements();
        System.out.println("************LES EMPLOYES************");
        s.afficherLesEmployes();
        System.out.println("************LES EMPLOYESLEUS DEPARTEMENTS************");
        s.afficherLesEmployesLeursDepartements();
                
        
        
        SocieteTreeMap t = new SocieteTreeMap();
        t.ajouterEmployeDepartement(e3, d3);
        t.ajouterEmployeDepartement(e1, d1);
        t.ajouterEmployeDepartement(e2, d2);
        System.out.println("************LES EMPLOYES TREE MAP************");
        t.afficherLesEmployes();
    }
    
}
