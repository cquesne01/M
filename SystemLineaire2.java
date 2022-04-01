/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetinfo2;

/**
 *
 * @author camillemartin
 */
public class SystemLineaire2 {
    
    public Matrice m ;
    public double x1;
    public double x2;
    
    public SystemLineaire2() {
        m = new Matrice(2, 3);
    }
    public void ajoutLigne(int numLigne, double coeff1, double coeff2, double val ){
        m.set(numLigne, 0, coeff1);
        m.set(numLigne, 1, coeff2);
        m.set(numLigne, 2, val);
    }
    
    public void resoud (){
        m = Matrice.descenteGauss(m); 
        x2 = m.get(1, 2) / m.get(1, 1);
        x1 = (m.get(0, 2) - m.get(0, 1)*x2) / m.get(0, 0); 
    }
    
    public double getX1 () {
        return x1;
    }
    
    public double getX2 (){
        return x2;
    }
    public static void Resout2() {
        SystemLineaire2 s = new SystemLineaire2();
        s.ajoutLigne(0, 0, 1, 2);
        s.ajoutLigne(1, 3, 4, 5);
        System.out.println("Le systeme lineaire que l'on va resoudre est:");
        s.resoud();
        System.out.println("x1="+s.getX1());
        System.out.println("x2="+s.getX2());
    }
}
