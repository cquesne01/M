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
public class SystemLineaire3 {
    
    public Matrice m ;
    public double x1;
    public double x2;
    public double x3;
    
    public SystemLineaire3() {
        m = new Matrice(3, 4);
    }
    public void ajoutLigne(int numLigne, double coeff1, double coeff2,double coeff3,
            double val ){
        m.set(numLigne, 0, coeff1);
        m.set(numLigne, 1, coeff2);
        m.set(numLigne, 2, coeff3);
        m.set(numLigne, 3, val);
    }
    
    public void resoud (){
        m = Matrice.descenteGauss(m); 
        x3 = m.get(2, 3) / m.get(2, 2);
        x2 = (m.get(1, 3) - m.get(1, 2)*x3) / m.get(1, 1); 
        x1 = (m.get(0, 3)-m.get(0, 1)*x2-m.get(0, 2)*x3) / m.get(0, 3) ; 
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
    
    public static void Resout3() {
        SystemLineaire3 s = new SystemLineaire3();
        s.ajoutLigne(0, 0, 0, 1, 3);
        s.ajoutLigne(1, 1, 2, -1, 4);
        s.ajoutLigne(2, 3, 1, 2, 1);
        System.out.println("Le systeme lineaire que l'on va resoudre est:");
        s.resoud();
        System.out.println("x1="+s.getX1());
        System.out.println("x2="+s.getX2());
        System.out.println("x3="+s.getX3());
    }
}
