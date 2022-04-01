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
public class NoeudAppuiEncastre extends Appuis {
    
    //Variables globales
    
    //Constructeur
    
    public NoeudAppuiEncastre(int id, int triangle, int p1, int p2, double pos, double x, double y){
        super(id,triangle, p1, p2, pos,x,y);
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
