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
public class ManutentionRisk extends Manutentionnaire implements ZoneRisque {
    public ManutentionRisk(String nom,String prenom,int age,String date,String matricul,double heur){
        super( nom, prenom, age, date,matricul,heur);
        this.heurTravail=heur;
    }
    public double CalculSalaire(){
        double salaire;
        return salaire=(65*heurTravail)+prime;
    }
}
