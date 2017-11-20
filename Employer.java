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
public abstract class Employer {
 private String nom;
 private String prenom;
 private int age;
 private String date;
 private String matricul;
 private Employer(){
 }
 public Employer (String nom,String prenom,int age,String date){
     this.nom=nom;
     this.prenom=prenom;
     this.age=age;
     this.date=date;
 }
 public abstract double CalculSalaire();
    public String getNom(){
    String str;
    return str ="Employer"+prenom+""+nom+"";
    }
}
         

