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
public abstract class Technicien extends Employer{
    double uniteProduit;
    public Technicien(String nom,String prenom,int age,String date,String matricul,double unite){
        super( nom, prenom, age, date);
        this.uniteProduit=unite;
    }
    public double CalculSalaire(){
        double salaire;
        return salaire=5*uniteProduit;
    }
}
