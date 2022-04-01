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
public class FrameBarre extends javax.swing.JFrame {

    /**
     * Creates new form FrameBarre
     */
    public FrameBarre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        generer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        catalogue = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reference = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        p2 = new javax.swing.JTextPane();
        annuler = new javax.swing.JButton();
        erreurBarre = new javax.swing.JLabel();
        erreurTaille = new javax.swing.JLabel();
        erreurPoint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane3.setViewportView(p1);

        jLabel5.setText("Pour créer une barre, vous devez choisir sa référence dans le catalogue");

        jLabel6.setText("Et ensuite saisir le nom des deux points liés à la barre");

        jLabel7.setText("Avant de la générer");

        generer.setText("Générer");
        generer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genererMouseClicked(evt);
            }
        });
        generer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genererActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Barre");

        jLabel2.setText("Référence :");

        jLabel3.setText("Point 1 :");

        catalogue.setText("Catalogue");
        catalogue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catalogueMouseClicked(evt);
            }
        });
        catalogue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogueActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(reference);

        jLabel4.setText("Point 2 :");

        jScrollPane4.setViewportView(p2);

        annuler.setText("Annuler");
        annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annulerMouseClicked(evt);
            }
        });

        erreurBarre.setForeground(java.awt.Color.red);
        erreurBarre.setText(" ");

        erreurTaille.setText(" ");

        erreurPoint.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 129, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 310, Short.MAX_VALUE)
                                .addComponent(catalogue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(generer))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(erreurBarre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(erreurPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(erreurTaille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(erreurBarre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erreurPoint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generer)
                            .addComponent(catalogue)
                            .addComponent(annuler)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(erreurTaille)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genererMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genererMouseClicked
        // TODO add your handling code here:
        
        //Erreurs
        
        int erreur=0;
        erreurBarre.setText("");
        erreurTaille.setText("");
        
        //Variables a recuperer
        
        int noeud1=Integer.parseInt(p1.getText());
        int noeud2=Integer.parseInt(p2.getText());
        int ref=Integer.parseInt(reference.getText());
        double prix=0;
        double lmin=0;
        double lmax=0;
        double resT=0;
        double resC=0;
        
        //Points
        
        Noeuds n1= Treillis.RecupNoeud(noeud1);
        Noeuds n2=Treillis.RecupNoeud(noeud2);
        double x = n1.getx()-n2.getx();
        double y = n1.gety()-n2.gety();
        double longueur = Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
        
        //Forces
        String nomForce = "T" + Treillis.idBarre;
        double angle;
        if (n1.getx()>n2.getx()){
            angle=Math.acos(y/longueur);
        }
        else {
            angle=Math.acos(-y/longueur);
        }
        
        //References
        
        if (ref==212){
            prix=2.5;
            lmin=10.0;
            lmax=20.0;
            resT=5.0;
            resC=5.0;
        }
        
        else if(ref==514){
            prix=5.67;
            lmin=13.0;
            lmax=40.0;
            resT=17.0;
            resC=21.0;
        }
        
        else if(ref==736){
            prix=7.69;
            lmin=32.0;
            lmax=60.0;
            resT=26.0;
            resC=24.0;
        }
        
        else if(ref==819){
            prix=8.95;
            lmin=1.0;
            lmax=90.0;
            resT=156.0;
            resC=15.6;
        }
        
        else if(ref==127){
            prix=10.45;
            lmin=2.0;
            lmax=90.0;
            resT=14.0;
            resC=68.0;
        }
        
        else if(ref==113){
            prix=14.76;
            lmin=11.0;
            lmax=33.0;
            resT=56779.0;
            resC=56781;
        }
        
        else if(ref==229){
            prix=21.89;
            lmin=24.0;
            lmax=956.0;
            resT=548.0;
            resC=548.0;
        }
        
        else if(ref==311){
            prix=36.48;
            lmin=1.0;
            lmax=10000.0;
            resT=4468;
            resC=46723;
        }
        
        //Erreur
        
        else {
            erreurBarre.setText("La barre n'appartient pas au catalogue");
            erreur+=1;
        }
        
        if (longueur>lmax || longueur<lmin){
            erreurTaille.setText("Les caractéristiques de la barre ne permettent pas d'obtenir une telle longueur");
            erreur+=1;
        }
        
        //Constructeur
        
        if (erreur==0){
            
            //Barre
            
            Barres barreF= new Barres(Treillis.idBarre, 1, 2, prix*longueur, angle, nomForce, ref,prix,lmin,lmax,resT,resC);
            Treillis.AjouteBarre(barreF);
            Treillis.prixTotal+=prix*longueur;
            
            //Forces
            
            Treillis.nbInconnues+=1;
            Treillis.AjouteInconnue(nomForce);
            Forces force1 = new Forces(nomForce, noeud1, Math.cos(angle), Math.sin(angle));
            Treillis.AjouteForce(force1);
            Forces force2 = new Forces(nomForce, noeud2, Math.sin(angle), Math.cos(angle));
            Treillis.AjouteForce(force2);
            
            //Matrice
            
                //Noeud 1
            if (noeud1==1){
                Treillis.matrix.m.set(0, Treillis.idBarre, Math.cos(angle));
                Treillis.matrix.m.set(1, Treillis.idBarre, Math.sin(angle));
            }
            if (noeud1==2){
                Treillis.matrix.m.set(2, Treillis.idBarre, Math.cos(angle));
                Treillis.matrix.m.set(3, Treillis.idBarre, Math.sin(angle));
            }
            if (noeud1==3){
                Treillis.matrix.m.set(4, Treillis.idBarre, Math.cos(angle));
                Treillis.matrix.m.set(5, Treillis.idBarre, Math.sin(angle));
            }
            
                //Noeud 2
            if (noeud2==1){
                Treillis.matrix.m.set(0, Treillis.idBarre, Math.sin(angle));
                Treillis.matrix.m.set(1, Treillis.idBarre, Math.cos(angle));
            }
            if (noeud2==2){
                Treillis.matrix.m.set(2, Treillis.idBarre, Math.sin(angle));
                Treillis.matrix.m.set(3, Treillis.idBarre, Math.cos(angle));
            }
            if (noeud2==3){
                Treillis.matrix.m.set(4, Treillis.idBarre, Math.sin(angle));
                Treillis.matrix.m.set(5, Treillis.idBarre, Math.cos(angle));
            }
            
            Treillis.idBarre+=1;
            this.setVisible(false);
        }
    }//GEN-LAST:event_genererMouseClicked

    private void genererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genererActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genererActionPerformed

    private void catalogueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogueMouseClicked
        // TODO add your handling code here:
        FrameCatalogueBarre catalogue = new FrameCatalogueBarre();
        catalogue.setVisible(true);
    }//GEN-LAST:event_catalogueMouseClicked

    private void catalogueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogueActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_catalogueActionPerformed

    private void annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_annulerMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameBarre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBarre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBarre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBarre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBarre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JButton catalogue;
    private javax.swing.JLabel erreurBarre;
    private javax.swing.JLabel erreurPoint;
    private javax.swing.JLabel erreurTaille;
    private javax.swing.JButton generer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane p1;
    private javax.swing.JTextPane p2;
    private javax.swing.JTextPane reference;
    // End of variables declaration//GEN-END:variables
}
