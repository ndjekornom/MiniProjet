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
public abstract class Manutentionnaire extends Employer {
     double heurTravail;
    public Manutentionnaire(String nom,String prenom,int age,String date,String matricul,double heur){
        super( nom, prenom, age, date);
        this.heurTravail=heur;
    }
    public double CalculSalaire(){
        double salaire;
        return salaire=65*heurTravail;
    }
}
