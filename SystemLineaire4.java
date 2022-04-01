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
public class SystemLineaire4 {
    
    public Matrice m ;
    public double x1;
    public double x2;
    public double x3;
    public double x4;
    
    public SystemLineaire4() {
        m = new Matrice(4, 5);
    }
    public void ajoutLigne(int numLigne, double coeff1, double coeff2,double coeff3,
            double coeff4, double val ){
        m.set(numLigne, 0, coeff1);
        m.set(numLigne, 1, coeff2);
        m.set(numLigne, 2, coeff3);
        m.set(numLigne, 3, coeff4);
        m.set(numLigne, 4, val);
    }
    
    public void resoud (){
        m = Matrice.descenteGauss(m); 
        x4 = m.get(3, 4) / m.get(3, 3);
        x3 = (m.get(2, 4) - m.get(2, 3)*x4) / m.get(2, 2); 
        x2 = (m.get(1, 4)-m.get(1, 2)*x3-m.get(1, 3)*x4) / m.get(1, 1); 
        x1 = (m.get(0, 4)-m.get(0, 1)*x2-m.get(0, 2)*x3-m.get(0, 3)*x4) / m.get(0, 0);
    }
    
    public double getX1 () {
        return x1;
    }
    
    public double getX2 (){
        return x2;
    }
    
    public double getX3 (){
        return x3;
    }
    
    public double getX4 (){
        return x4;
    }
    
    public static void Resout4() {
        SystemLineaire4 s = new SystemLineaire4();
        s.ajoutLigne(0, 0, 0, 1, 3, -6);
        s.ajoutLigne(1, 1, 2, -1, 4, 3);
        s.ajoutLigne(2, 3, 1, 2, 1, 1);
        s.ajoutLigne(3, 7, 8, -3, 4, 2);
        System.out.println("Le systeme lineaire que l'on va resoudre est:");
        s.resoud();
        System.out.println("x1="+s.getX1());
        System.out.println("x2="+s.getX2());
        System.out.println("x3="+s.getX3());
        System.out.println("x4="+s.getX4());
    }
}
