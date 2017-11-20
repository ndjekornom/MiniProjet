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
public class Commerciale extends Employer {
  
    public double chiffreAffaire,salaire;
   
public Commerciale(String nom,String prenom,int age,String date,String matricul,double chiffreAffaire){     
     super(prenom,nom,age,date);
     this.chiffreAffaire=chiffreAffaire;   
}  
    public double  CalculSalaire(){
        return salaire;
    }
}
