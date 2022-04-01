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
public class Forces {
    
    //Variables
    
    public String nom;
    public int point;
    public double projX;
    public double projY;
    public double norme;
    public double angle;
    
    //Constructeur
    
    public Forces(String nom, int point, double x, double y){
        this.nom=nom;
        this.point=point;
        this.projX=x;
        this.projY=y;
        this.norme=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    
    //Get et set
    
    public double getForceX() {
        return this.projX;
    }
    
    public double getForceY() {
        return this.projY;
    }
    
    public int getPoint(){
        return this.point;
    }
    
    
}
