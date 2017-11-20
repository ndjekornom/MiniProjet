/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniProject;

/**
 *
 * @author JOSUE B
 */
public class Personnel {
    
private Employer [] travailleur;
private int nbreEmployer;
private final static int taillemax = 200;
   public Personnel() {
 travailleur = new Employer[taillemax];
 nbreEmployer = 0;
 }
 public void ajouterEmploye(Employer V) {
 ++nbreEmployer;
 if (nbreEmployer <= taillemax) {
  travailleur[nbreEmployer - 1] =V;
 } else {
 System.out.println( "Pas plus de " + taillemax + " employés");
 }
 }
 public double salaireMoyen() {
 double somme = 0.0;
 for (int i = 0; i < nbreEmployer; i++) {
  somme += travailleur[i].CalculSalaire();
 }
 return somme / nbreEmployer;
 }
 public void afficherSalaires() {
 for (int i = 0; i < nbreEmployer; i++) {
 System.out.println(travailleur[i].getNom() + " gagne "
  + travailleur[i].CalculSalaire() + " francs.");
 }
 }
}

