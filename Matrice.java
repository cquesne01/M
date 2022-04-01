package com.mycompany.projetinfo2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author camillemartin
 */

public class Matrice {

    public int nbrLig;
    public int nbrCol;
    public double[][] coeffs;

    public Matrice(int nl, int nc) {
        this.nbrLig = nl;
        this.nbrCol = nc;
        this.coeffs = new double[nl][nc];
    }

    public int getNbLig() {
        return this.nbrLig;
    }
    
    public int getNbCol() {
        return this.nbrCol;
    }
    
    public void set(int lig, int col, double val) {
        this.coeffs[lig][col] = val;
    }
    
    public double get(int nl, int nc){
        return coeffs[nl][nc];
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < nbrLig; i++) {
        res=  res + "[";
            for (int j = 0; j < nbrCol; j++) {
            res= res+ get(i,j);
            res=res+" ";
            }
        res=res+ "]" ;  
        res=res+"\n";
        }
        return res;
    }
    
    public static Matrice concatLig (Matrice M,Matrice N){
        if (M.getNbCol() != N.getNbCol() ){
            throw new Error("les nombres de colonnes sont différentes concatennation impossible");
        }
        int nl = M.getNbLig()+ N.getNbLig();
        int nc = M.getNbCol();
        Matrice W= new Matrice (nl,nc);
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                double val=0 ;
                if (i<M.getNbLig()){
                    W.set(i,j,M.get(i,j));     
                }
                else {
                    int k = i-M.getNbLig();
                    W.set(i,j,N.get(k,j));  
                }
                  
            }
        }
        return W;
    }
    
    public static Matrice concatCol (Matrice M,Matrice N){
        if (M.getNbLig() != N.getNbLig() ){
            throw new Error("les nombres de lignes sont différentes concatennation impossible");
        }
        int nl = M.getNbLig();
        int nc = M.getNbCol() + N.getNbCol();
        Matrice W= new Matrice (nl,nc);
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                double val=0 ;
                if (j<M.getNbCol()){
                    W.set(i,j,M.get(i,j));     
                }
                else {
                    int k = j-M.getNbCol();
                    W.set(i,j,N.get(i,k));  
                }
                  
            }
        }
        return W;
    }
    
    public static Matrice subLignes (Matrice M, int ligneD, int ligneF) {
        if (ligneD>ligneF){
            throw new Error("les nombres de lignes ne sont pas possibles");
        }
        if (M.getNbLig()<ligneF){
            throw new Error("les nombres de lignes ne sont pas compatibles");
        }
        int nl=ligneF-ligneD+1;
        int nc=M.getNbCol();
        Matrice sL = new Matrice (nl,nc);
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                sL.set(i,j,M.get(i+ligneD,j));
            }
        }
        return sL;
    }
    
    public static Matrice subCols (Matrice M, int colD, int colF) {
        if (colD>colF){
            throw new Error("les nombres de colonnes ne sont pas possibles");
        }
        if (M.getNbCol()<colF){
            throw new Error("les nombres de colonnes ne sont pas compatibles");
        }
        int nl=M.getNbLig();
        int nc=colF-colD+1;
        Matrice sC = new Matrice (nl,nc);
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                sC.set(i,j,M.get(i,j+colD));
            }
        }
        return sC;
    }
    
    public static Matrice copie (Matrice M) {
        int nl=M.getNbLig();
        int nc=M.getNbCol();
        Matrice scc = new Matrice (nl,nc);
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                scc.set(i,j,M.get(i,j));
            }
        }
        return scc;
    }
    
    public static Matrice transposee (Matrice M) {
        int nl=M.getNbCol();
        int nc=M.getNbLig();
        Matrice sT = new Matrice (nl,nc);
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                sT.set(i,j,M.get(j,i));
            }
        }
        return sT;
    }
    
     public static Matrice metAuCarre (Matrice M) {
        Matrice identite = identite(M.getNbLig());
        Matrice sCa=concatCol(M,identite);
        identite=identite(M.getNbCol());
        Matrice tM=transposee(M);
        Matrice sCa1=concatCol(identite, tM);
        sCa=concatLig(sCa,sCa1);
        return sCa;
    }
     
    public static int intAlea (int bmin , int bmax){
        int n= bmax-bmin+1;
        int a = (int) (Math.random() * n);
        a=a+bmin;
        return a;
    }
    
    public static Matrice identite(int n) {
        Matrice mident = new Matrice(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    mident.coeffs[i][j] = 1;

                } else {
                    mident.coeffs[i][j] = 0;
                }
            }
        }
        return mident;
    }
   
    public static Matrice croissante (int n){
    
        Matrice mcrois = new Matrice(n,n);
        int a = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mcrois.coeffs[i][j] = a;
                a = a + 1;
            }
        }
        return mcrois;
    }
    
    public static Matrice croissanteN (int n){
        Matrice mcroisN = new Matrice (n,n);
        int b=0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mcroisN.coeffs[i][j] = b;
                if (i == j) {
                    mcroisN.coeffs[i][j] = -b;
                    b=b+1;
                }
                else{
                b = b + 1;    
                } 
            }
        }
        return mcroisN;
    }
    
     public static int aleaUnOuDeux() {
        if (Math.random() < 0.5) {
            return 1;
        } else {
            return 2;
        }
    }
     
    public static Matrice matAleaZeroUnDeux(int nbrLig, int nbrCol, double proportionDeZero) {
        Matrice res = new Matrice(nbrLig, nbrCol);
        for (int i = 0; i < nbrLig; i++) {
            for (int j = 0; j < nbrCol; j++) {
                if (Math.random() >= proportionDeZero) {
                    res.coeffs[i][j] = aleaUnOuDeux();
                }
            }
        }
        return res;
    }

    public static Matrice creeVecteur(double[] composantes) {
        Matrice res = new Matrice(composantes.length, 1);
        for (int i = 0; i < composantes.length; i++) {
            res.coeffs[i][0] = composantes[i];
        }
        return res;
    }
     
    public static Matrice add (Matrice M, Matrice N) {
        if(M.getNbCol() != N.getNbCol()){
            throw new Error("les nombres de colonnes sont différentes addition impossible");
        }
        if(M.getNbLig() != N.getNbLig()){
            throw new Error("les nombres de lignes sont différentes addition impossible");
        }
        int nl=M.getNbLig();
        int nc=M.getNbCol();
        Matrice add = new Matrice (nl,nc);
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                add.set(i,j,M.get(i,j)+N.get(i, j));
            }
        }
        return add;
    }
    
    public static Matrice opp (Matrice M) {
        int nl=M.getNbLig();
        int nc=M.getNbCol();
        Matrice mopp = new Matrice (nl,nc);
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                mopp.set(i,j,-M.get(i,j));
            }
        }
        return mopp;
    }
    
    public static Matrice moins (Matrice M, Matrice N) {
        if(M.getNbCol() != N.getNbCol()){
            throw new Error("les nombres de colonnes sont différentes addition impossible");
        }
        if(M.getNbLig() != N.getNbLig()){
            throw new Error("les nombres de lignes sont différentes addition impossible");
        }
        int nl=M.getNbLig();
        int nc=M.getNbCol();
        Matrice sous = new Matrice (nl,nc);
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                sous.set(i,j,M.get(i,j)-N.get(i, j));
            }
        }
        return sous;
    }
    
    public static Matrice mult (Matrice M, Matrice N) {
        if(M.getNbCol() != N.getNbLig()){
            throw new Error("les nombres de colonnes et de lignes sont différentes multiplication impossible");
        }
        int nl=M.getNbLig();
        int nc=N.getNbCol();
        Matrice mult = new Matrice (nl,nc);
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                double val;
                val=0;
                for(int c=0; c<M.getNbCol(); c++){
                    val=val+M.get(i, c)*N.get(c, j);
                }
                mult.set(i,j,val);
            }
        }
        return mult;
    }
    
    public static int permutLigne (Matrice M, int La, int Lb){
        Matrice MC=copie(M);
        int nl=M.getNbLig();
        int nc=M.getNbCol();
         for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                double val=0;
                if(i!=La && i!=Lb){
                    val=MC.get(i, j);
                }
                if (i==La){
                   val=MC.get(Lb, j);
                }
                if (i==Lb){
                   val=MC.get(La, j);
                }
                M.set(i,j,val);
            }
         }
         
        int a =0;
        if ((La-Lb)%2==0){
            //a est pair
            a=1;
        }
         else{
            //a est impair
            a=-1;
        }
        
        return a;
    }
    
    public static Matrice transvection (Matrice M, int La, int Lb ) {
        if(La >= M.getNbCol()){
            throw new Error("tranvection impossible");
        }
        double p=0;
        if (M.get(La, La)==0){
           throw new Error("tranvection impossible"); 
        }
        p=(M.get(Lb, La))/(M.get(La, La));
        
        int nl=M.getNbLig();
        int nc=M.getNbCol();
        for (int i=0; i<nl; i++){
            for (int j=0; j<nc; j++){
                if( i==Lb ){
                    if (j==La){
                        M.set(Lb, j, 0);
                    }
                    else {
                        double val= M.get(Lb, j)-p*M.get(La, j);
                        M.set(Lb, j, val);
                    }
                
                }
            }
        }
        return M;
    }
    
    public static int lignePlusGrandPivot (Matrice M, int e ){
       int ligMax =0 ;
       double EPSILON_PIVOT= 10^-8 ;
       double max=0;     
       for(int f=e; f<M.getNbLig(); f++){
           double a=M.get(f, e);
            if (max<a){
               max=a;
               ligMax=f;
           }
       }
       //System.out.println("le maximum est " + max);
       //System.out.println("la ligne maximum est " + ligMax);
       return ligMax; 
    }
    
    public static Matrice descenteGauss (Matrice M){
        //System.out.println("Descente de Gauss");
        System.out.println (M.toString());
        int nbrCol = M.getNbCol();
        int nbrLig = M.getNbLig();
        for (int numCol =0; numCol<nbrCol-2; numCol++){
            int numLPGP = lignePlusGrandPivot(M, numCol);
            if(numLPGP == -1){
                System.out.println(" La matrice n'a pas de solutions");
                return M;
            }
            //System.out.println("LignePlusGrandPivot de la colonne "+ numCol + " est " + numLPGP);
            //System.out.println("Permut Ligne " + numCol + " , " + numLPGP );
            permutLigne(M, numCol, numLPGP); 
            //System.out.println (M.toString());
            for (int numLig = numCol+1; numLig<nbrLig; numLig++){
                //System.out.println("Transvection de la ligne " + numCol + " avec la ligne " + numLig);
                transvection(M, numCol, numLig);
                //System.out.println(M.toString());
            }
      
        }
        //System.out.println ("Le resultat est ");
        //System.out.println (M.toString());
        return M;
    }
    
    public static void test1 (){
        Matrice res = matAleaZeroUnDeux(4, 6, 0.33);
        String s= res.toString();
        System.out.println(s);
    }
    
    public static void test2(){
        int nl=intAlea(1,4);
        int nc=intAlea(1,4);
        Matrice M =matAleaZeroUnDeux(nl, nc, 0.33);
        Matrice MC=metAuCarre(M);
        Matrice Mbis=subLignes(MC,0,nl-1);
        Mbis=subCols(Mbis, 0, nc-1);
        System.out.println(M.toString());
        System.out.println(MC.toString());
        System.out.println(Mbis.toString());
    }
    
    public static void test3 (){
        Matrice M = matAleaZeroUnDeux(2,2, 0.33);
        String s= M.toString();
        System.out.println("M\n"+M);
        Matrice M2=mult(M,M);
        Matrice M3=add(M2,M);
        System.out.println("M*M\n"+M2);
        System.out.println("M^2+M\n"+M3);
    }
            
    public static void main(String[] args) {
        System.out.println("debut");
        int nl = 3;
        int nc = 4;
        Matrice m = new Matrice(nl, nc);
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print(m.coeffs[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Matrice identité ");
        Matrice m2 = identite(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m2.coeffs[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Matrice croissante ");
        Matrice m3 = croissante (3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m3.coeffs[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Matrice croissanteN ");
        Matrice m4 = croissanteN (3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m4.coeffs[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Matrice matAleaZeroUnDeux");
        Matrice m5 = matAleaZeroUnDeux (3,4,0.3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m5.coeffs[i][j] + "\t");
            }
            System.out.println(" ");
        }
        
        System.out.println("Matrice creeVecteur");
        double [] composante = new double [3];
        composante [0] = 1.0; 
        composante [1] = 2.0;
        composante [2] = 3.0;
        Matrice m6 = creeVecteur (composante);
        for (int i = 0; i < composante.length ; i++) {
            //for (int j = 0; j < 3; j++) {
                System.out.print(m6.coeffs[i][0] + "\t");
            //}
            System.out.println(" ");
        }
        
        int n = m6.getNbLig();
        System.out.println("le nombre de ligne est " + n);
        
        n=m6.getNbCol();
        System.out.println("le nombre de colonne est " + n);
       
        for (int i = 0; i < m6.getNbLig() ; i++) 
            {
            System.out.println(m6.get(i, 0));
            }
        
        test1 (); 

        Matrice m8=concatLig(m3, m4);
        System.out.println(m8.toString ());
        
        Matrice m9=concatCol(m3, m4);
        System.out.println(m9.toString ());
        
        System.out.println(m3.toString());
        Matrice m10=subCols(m3, 1,2);
        System.out.println(m10.toString());
        
        System.out.println(m3.toString());
        Matrice m11=copie(m3);
        System.out.println(m11.toString());
        
        System.out.println(m3.toString());
        m11=transposee(m3);
        System.out.println(m11.toString());
        
        System.out.println(m10.toString());
        m11=metAuCarre(m10);
        System.out.println(m11.toString());
        
        for (int i=0; i<10; i++){
            System.out.println(intAlea(5,8));   
        }
        
        System.out.println("test2");
        test2();
        
        System.out.println(m3.toString());
        System.out.println("M4\n"+ m4.toString());
        System.out.println(add(m3,m3).toString());
        System.out.println(opp(m3).toString());
        System.out.println(moins(m3,m4).toString());
        
        System.out.println("test3");
        test3();
        
        System.out.println("permutation");
        System.out.println(m3.toString());
        int a= permutLigne(m3, 0, 1);
        System.out.println(a);
        System.out.println(m3.toString());
        transvection(m3,0 , 2);
        System.out.println(m3.toString());
        
        System.out.println("m4\n"+ m4.toString());
        int ligMax=lignePlusGrandPivot(m4, 0);
        
        ResGauss z = new ResGauss(3, 5);
        System.out.println(z.toString());
        
        descenteGauss(m11);
    }
}
