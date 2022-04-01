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
public class Terrain {
    
    //Variables globales
    
    public static int id;
    public static double xMin;
    public static double xMax;
    public static double yMin;
    public static double yMax;
    
    //Constructeur
    
    public Terrain(int id, double xmin, double xmax, double ymin, double ymax){
        this.id=id;
        this.xMin=xmin;
        this.xMax=xmax;
        this.yMin=ymin;
        this.yMax=ymax;
    }
    
    //Get et set
    
    public double getxMin(){
        return this.xMin;
    }
    
    public void setxMin(int min){
        this.xMin=min;
    }
    
    public double getxMax(){
        return this.xMax;
    }
    
    public void setxMax(int max){
        this.xMax=max;
    }
    
    public double getyMin(){
        return this.yMin;
    }
    
    public void setyMin(int min){
        this.yMin=min;
    }
    
    public double getyMax(){
        return this.yMax;
    }
    
    public void setyMax(int max){
        this.yMax=max;
    }
}
