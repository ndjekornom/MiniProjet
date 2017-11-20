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
public class TechnicienRisk extends Technicien implements ZoneRisque{ 
    public TechnicienRisk(String nom,String prenom,int age,String date,String matricul,double unite){
        super( nom, prenom, age, date,matricul,unite);
    }
    public double CalculSalaire(){
        double salaire;
        return salaire=5*uniteProduit;
    }
    }
