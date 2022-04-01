/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetinfo2;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;


/**
 *
 * @author MANGEL
 */
public class Treillis {
    
    //Initialisation des variables principales
    
    public static int idTriangle=1;
    public static int idNoeud=1;
    public static int idBarre=1;
    public static double prixTotal=0;
    public static int nbInconnues=0;
    public static int nbEquations=0;
    
    //Variables globales
    
    public static List<Noeuds> ListeNoeuds = new ArrayList<>();
    public static List<Barres> ListeBarres = new ArrayList<>();
    public static List<Triangle> ListeTriangle = new ArrayList<>();
    public static List<Forces> ListeForces = new ArrayList<>();
    public static List<String> ListeInconnues = new ArrayList<>();
    public static Terrain terrain;
    
    //Variables temporaires
    public static int forceNoeud=0;
    
    //Matrice
    
    public static SystemLineaire6 matrix = new SystemLineaire6();
    
    //Constructeur
    
    public Treillis(Terrain terrain, ArrayList noeud, ArrayList barre, ArrayList triangle){
        this.ListeBarres=barre;
        this.ListeNoeuds=noeud;
        this.terrain=terrain;
        this.ListeTriangle=triangle;
        
    }
    
    //Programme principal
    
    public static void main(String[] args) {
        FrameTerrain interfaceTerrain = new FrameTerrain();
        interfaceTerrain.setVisible(true);
    }
    
    //Sous-programmes
    
    public static void AjouteTriangle(Triangle triangle){
        ListeTriangle.add(triangle);
    }
    
    public static void AjouteNoeud(Noeuds noeud){
        ListeNoeuds.add(noeud);
    }
    
    public static void AjouteBarre(Barres barre){
        ListeBarres.add(barre);
    }
    
    public static void AjouteForce(Forces force){
        ListeForces.add(force);
    }
    
    public static void AjouteInconnue(String inconnue){
        ListeInconnues.add(inconnue);
    }
    
    public static Noeuds RecupNoeud(int id){
        for (int i=0; i<ListeNoeuds.size();i++){
            if (ListeNoeuds.get(i).getId()==id){
                return ListeNoeuds.get(i);
            }
        }
        return null;
    }
    
    public static Triangle RecupTriangle(int id){
        for (int i=0; i<ListeTriangle.size();i++){
            if (ListeTriangle.get(i).getId()==id){
                return ListeTriangle.get(i);
            }
        }
        return null;
    }
    
    public static Barres RecupBarre(int id){
        for (int i=0; i<ListeBarres.size();i++){
            if (ListeBarres.get(i).getId()==id){
                return ListeBarres.get(i);
            }
        }
        return null;
    }
    
    public static Forces RecupForce(int id){
        for (int i=0; i<ListeForces.size();i++){
            if (ListeForces.get(i).getPoint()==id){
                return ListeForces.get(i);
            }
        }
        return null;
    }
    
    public static double RecupForceX(int id){
        for (int i=0; i<ListeForces.size();i++){
            if (ListeForces.get(i).getPoint()==id){
                return ListeForces.get(i).getForceX();
            }
        }
        return 0;
    }
    
    public static double RecupForceY(int id){
        for (int i=0; i<ListeForces.size();i++){
            if (ListeForces.get(i).getPoint()==id){
                return ListeForces.get(i).getForceY();
            }
        }
        return 0;
    }
}
