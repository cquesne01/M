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
public class Appuis extends Noeuds {
    
    public int id;
    public int triangle;
    public int numPoint1;
    public int numPoint2;
    public double position;
    public double x;
    public double y;
    
    
    //Constructeur
    public Appuis(int id, int triangle, int p1, int p2, double pos, double x, double y){
        super(id,x,y);
        this.triangle=triangle;
        this.numPoint1=p1;
        this.numPoint2=p2;
        this.position=pos;
    }
    
}
