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
public class Barres {
    
    //Variables globales
    
    //Variables relatives à la barre
    public int id;
    public int noeud1;
    public int noeud2;
    public double prix;
    public double angle;
    public String nomForce;
    
    //Variables relatives au type de barre
    private int reference;
    private double prixMetre;
    private double longMin;
    private double longMax;
    private double resTension;
    private double resCompress;
    
    //Constructeur
    
    public Barres(int id, int n1, int n2, double prix, double a, String nomForce,
            int reference, double prixM, double min, double max, double tension, double compress){
        this.id=id;
        this.noeud1=n1;
        this.noeud2=n2;
        this.prix=prix;
        this.angle=a;
        this.nomForce=nomForce;
        this.reference=reference;
        this.prixMetre=prixM;
        this.longMin=min;
        this.longMax=max;
        this.resTension=tension;
        this.resCompress=compress;
    }
    
    public Barres(int id, int n1, int n2, double prix){
        this.id=id;
        this.noeud1=n1;
        this.noeud2=n2;
        this.prix=prix;
    }
    
    //Programmes
    
    
    //Get et set
    
    public double getReference() {
        return this.reference;
    }
    
    public double getPrixBarre() {
        return this.prixMetre;
    }
    
    public void setPrixBarre(double prix){
        this.prixMetre=prix;
    }
    
    public double getLongMinBarre(){
        return this.longMin;
    }
    
    public void setLongMinBarre(double l){
        this.longMin=l;
    }
    
    public double getLongMaxBarre(){
        return this.longMax;
    }
    
    public void setLongMaxBarre(double l){
        this.longMax=l;
    }
    
    public double getResCompressBarre(){
        return this.resCompress;
    }
    
    public void setResCompressBarre(double compress){
        this.resCompress=compress;
    }
    
    public double getResTensionBarre(){
        return this.resTension;
    }
    
    public void setResTensionBarre(double tension){
        this.resTension=tension;
    }
    
    public int getId(){
        return this.id;
    }
    
}
