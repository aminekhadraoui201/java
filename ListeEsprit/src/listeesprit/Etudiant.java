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
public class Etudiant implements Comparable<Etudiant>{

    private int id;
    private String nom, prenom;

    public Etudiant() {

    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Etudiant) {
            final Etudiant e = (Etudiant) o;
            if (e.getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + "}\n";
    }

    @Override
    public int compareTo(Etudiant o) {
     return this.id - o.id;
     //ki ne9lb ywli  croissent
     //return o.id - this.id chtar croissent
    
    }

}
