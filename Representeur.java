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
public class Representeur extends Commerciale {
    private double bonusRepresenteur=200;
    public Representeur(String nom,String prenom,int age,String date,String matricul,double chiffreAffaire, double bonus ){
    super(nom,prenom,age,date,matricul,chiffreAffaire);
    this.bonusRepresenteur=bonus;
    }
    public double CalculSalaire(){
   
        return salaire=(0.2*chiffreAffaire)+bonusRepresenteur;
    }

}
    

