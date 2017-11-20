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
public class Salary {
    
    
    
    
    
public static void main(String[] arg){
    Commerciale crl = new Commerciale("\nMbaiadéne","\nCharlotte\n",17,"jeudi le 17 Août","15K345BO",120000);
           System.out.println(crl.getNom()+"à un salaire:");
           System.out.println(crl.CalculSalaire());
           ManutentionRisk manu  = new ManutentionRisk( "\nAli","Fadoul\n",28,"+lundi 02 Aout 2015+","+12B11220FS+",10);
           System.out.println(manu.getNom()+"à un salaire:");
           System.out.println(manu.CalculSalaire());
           Representeur rep = new Representeur("\nFouini","\nBeby\n",22,"mardi le 17 Juin","12P340FALCH",500000,200);
           System.out.println(rep.getNom()+"\nà un salaire:");
           System.out.println(rep.CalculSalaire());
           Vendeur vnd =new Vendeur("\nKouma","\nJules\n",46,"mardi le 01 Juin","12R340FALCH",79000,100);
           System.out.println(vnd.getNom()+"à un salaire");
           System.out.println(vnd.CalculSalaire());
    //test personnel
           Personnel psnl = new Personnel();
           psnl.ajouterEmploye(new Vendeur("\nAnne","\nMarie\n",32,"mardi le 06 Juin","12R340FALCH",79000,100));
           psnl.ajouterEmploye(new Representeur("\nDaoud","\nMoussa\n",85,"mardi le 04 Juin","17P340FSJP",500000,200));
           psnl.ajouterEmploye(new ManutentionRisk( "\nRamsi","\nIskrem\n",76,"+Samedi 09 Septembre 2013+","+12B11220FSJP+",43));
               psnl.afficherSalaires();
               
               
               System.out.println("le salaire moyen de la sociétè est\n"+psnl.salaireMoyen()+"Franc");
    }
}
    
    

