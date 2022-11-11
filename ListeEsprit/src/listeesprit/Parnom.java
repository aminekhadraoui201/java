
package listeesprit;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class Parnom implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        return o1.getNom().compareTo(o2.getNom());
        //o1 n9arnoha bl o2 w compat to t3yet lo2
    }
    
}
