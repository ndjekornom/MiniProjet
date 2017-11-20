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
public class Vendeur extends Commerciale {
    private double bonusVendeur=100;
     public Vendeur(String nom,String prenom,int age,String date,String matricul,double chiffreAffaire, double bonus ){
    super(nom,prenom,age,date,matricul,chiffreAffaire);
    this.bonusVendeur=bonus;
    }
    public double CalculSalaire(){
   
        return salaire=(0.2*chiffreAffaire)+bonusVendeur;
    }
    
    
}
