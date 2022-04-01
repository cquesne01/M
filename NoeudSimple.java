/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetinfo2;

/**
 *
 * @author MANGEL
 */
public class NoeudSimple extends Noeuds {
    
    //Variables globales
    
    //Constructeur
    
    public NoeudSimple(int id, double x, double y) {
        super(id,x,y);
    }
    
    //Get et set
    
    public double getx(){
        return this.x;
    }
    
    public void setx(int x){
        this.x=x;
    }
    
    public double gety(){
        return this.y;
    }
    
    public void sety(int y){
        this.y=y;
    }
    
}
