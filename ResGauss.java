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
public class ResGauss {
    public int rang;
    public int signature;
    
    public ResGauss (int r, int s){
        rang=r;
        signature=s;
    }
    
    public String toString() {
        String res = "";
        res= "Le rang est "+rang;
        res = res + " La signature est " + signature;
        return res;
    }
}
