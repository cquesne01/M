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
public class SystemLineaire6 {
    
    Matrice m ;
    double x1;
    double x2;
    double x3;
    double x4;
    double x5;
    double x6;
    
    public SystemLineaire6() {
        m = new Matrice(6, 7);
    }
    public void ajoutLigne(int numLigne, double coeff1, double coeff2,double coeff3,
            double coeff4,double coeff5, double coeff6, double val ){
        m.set(numLigne, 0, coeff1);
        m.set(numLigne, 1, coeff2);
        m.set(numLigne, 2, coeff3);
        m.set(numLigne, 3, coeff4);
        m.set(numLigne, 4, coeff5);
        m.set(numLigne, 5, coeff6);
        m.set(numLigne, 6, val);
    }
    
    public void resoud (){
        m = Matrice.descenteGauss(m); 
        x6 = m.get(5, 6) / m.get(5, 5);
        x5 = (m.get(4, 6) - m.get(4, 5)*x6) / m.get(4, 4);       
        x4 = (m.get(3, 6)-m.get(3, 4)*x5-m.get(3, 5)*x6) / m.get(3, 3); 
        x3 = (m.get(2, 6)-m.get(2, 3)*x4-m.get(2, 4)*x5-m.get(2, 5)*x6) / m.get(2, 2);
        x2 = (m.get(1, 6)-m.get(1, 2)*x3-m.get(1, 3)*x4-m.get(1, 4)*x5-m.get(1, 5)*x6) / m.get(1, 1);
        x1 = (m.get(0, 6)-m.get(0, 1)*x2-m.get(0, 2)*x3-m.get(0, 3)*x4-m.get(0, 4)*x5-m.get(0, 5)*x6) / m.get(0, 0) ; 
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
    
    public double getX5 (){
        return x5;
    }
    
    public double getX6 (){
        return x6;
    }
    
    public static void Resout6() {
        SystemLineaire6 s = new SystemLineaire6();
        s.ajoutLigne(0, 0, 0, 1, 3, -6, 4, 2);
        s.ajoutLigne(1, 1, 2, -1, 4, 3, 3, -1);
        s.ajoutLigne(2, 3, 1, 2, 1, 1, 5, -9);
        s.ajoutLigne(3, 7, 8, -3, 4, 2, 4, -2);
        s.ajoutLigne(4, 0, -1, 2, -4, 1, 0, 2);
        s.ajoutLigne(5, 0, -1, -7, -4, 1, 3, 2);
        System.out.println("Le systeme lineaire que l'on va resoudre est:");
        s.resoud();
        System.out.println("x1="+s.getX1());
        System.out.println("x2="+s.getX2());
        System.out.println("x3="+s.getX3());
        System.out.println("x4="+s.getX4());
        System.out.println("x5="+s.getX5());
        System.out.println("x6="+s.getX6());
    }
}
