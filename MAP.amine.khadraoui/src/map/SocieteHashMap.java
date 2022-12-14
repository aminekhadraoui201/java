/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class SocieteHashMap implements InterfaceSociete {

     HashMap<Employe,Departement> ed = new HashMap<Employe,Departement>();
     
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
       
        ed.put(e,d);
        
    }

    @Override
    public void supprimerEmploye(Employe e) {
      ed.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
       for (Map.Entry<Employe,Departement> e : ed.entrySet()){
           System.out.println(e.getKey()+"-"+e.getValue());
        
           
       }
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(ed.keySet());
    }

    @Override
    public void afficherLesDepartements() {
       System.out.println(ed.values());
    }

    @Override
    public void afficherDepartement(Employe e) {
      System.out.println(ed.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
         if (ed.containsKey(e)){
            return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        if (ed.containsValue(e)){
            return true;
        }
        return false;
    }
    
    
}
