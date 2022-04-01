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
public class Noeuds {
    
    //Variables globales
    
    public int id;
    public double x;
    public double y;
    
    //Constructeur
    public Noeuds (int id, double x, double y){
        this.id=id;
        this.x=x;
        this.y=y;
    }
    
    //Get et set
    
    public int getId(){
        return this.id;
    }
    
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