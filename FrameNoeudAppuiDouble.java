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
public class FrameNoeudAppuiDouble extends javax.swing.JFrame {

    /**
     * Creates new form FrameNoeudAppui
     */
    public FrameNoeudAppuiDouble() {
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

        x1 = new javax.swing.JScrollPane();
        P2 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        x4 = new javax.swing.JScrollPane();
        position = new javax.swing.JTextPane();
        Valider = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        x3 = new javax.swing.JScrollPane();
        triangle = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        x = new javax.swing.JScrollPane();
        P1 = new javax.swing.JTextPane();
        annuler2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        erreurPos = new javax.swing.JLabel();
        erreurTri = new javax.swing.JLabel();
        erreurP1 = new javax.swing.JLabel();
        erreurP2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        x1.setViewportView(P2);

        jLabel3.setText("Position :");

        x4.setViewportView(position);

        Valider.setText("Valider");
        Valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValiderMouseClicked(evt);
            }
        });

        jLabel6.setText("Le triangle de terrain qui lui est associé");

        jLabel7.setText("Le numéro des deux points du segment");

        jLabel8.setText("Sa position sur le segment (entre 0 et 1)");

        jLabel9.setText("Triangle :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Créer un noeud appui double");

        x3.setViewportView(triangle);

        jLabel2.setText("Pour créer un noeud appui double, il vous suffit de rentrer :");

        jLabel4.setText("Point 1 :");

        jLabel5.setText("Point 2 :");

        x.setViewportView(P1);

        annuler2.setText("Annuler");
        annuler2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annuler2MouseClicked(evt);
            }
        });

        jLabel10.setText("entre 0 et 1");

        erreurPos.setForeground(java.awt.Color.red);
        erreurPos.setText(" ");

        erreurTri.setForeground(java.awt.Color.red);
        erreurTri.setText(" ");

        erreurP1.setForeground(java.awt.Color.red);
        erreurP1.setText(" ");

        erreurP2.setForeground(java.awt.Color.red);
        erreurP2.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(erreurPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(annuler2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Valider))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(erreurP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(erreurP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(erreurTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(39, 160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addComponent(erreurPos))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Valider)
                                .addComponent(annuler2)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(erreurTri)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(erreurP1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(erreurP2)
                            .addComponent(jLabel5)
                            .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValiderMouseClicked
        // TODO add your handling code here:
        
        //Erreurs 
        int erreur =0;
        erreurPos.setText("");
        erreurP1.setText("");
        erreurP2.setText("");
        erreurTri.setText("");
        
        //Variables a recuperer
        
        int tri=Integer.parseInt(triangle.getText());
        int p1=Integer.parseInt(P1.getText());
        int p2=Integer.parseInt(P2.getText());
        double pos=Double.parseDouble(position.getText());
        
        //Points
        
        Triangle triangle = Treillis.RecupTriangle(tri);
        double xP1 = triangle.getx(p1);
        double yP1 = triangle.gety(p1);
        double xP2 = triangle.getx(p2);
        double yP2 = triangle.gety(p2);
        double x = (xP2-xP1)*pos;
        double y = (yP2-yP1)*pos;
        
        //Forces
        String nomForceX = "RX" + Treillis.idNoeud;
        String nomForceY = "RY" + Treillis.idNoeud;
        
        //Programme
        
        //Erreur
        
        if (pos<0 || pos>1){
            erreur+=1;
            erreurPos.setText("Ce n'est pas entre 0 et 1 !");
        }
        
        //Constructeur
        
        if (erreur==0) {
            
            //Noeud
            
            NoeudAppuiDouble noeudF = new NoeudAppuiDouble(Treillis.idNoeud, tri, p1, p2, pos,x,y);
            Treillis.AjouteNoeud(noeudF);
            
            //Forces
            
            Treillis.nbInconnues+=2;
            Treillis.AjouteInconnue(nomForceX);
            Treillis.AjouteInconnue(nomForceY);
            Forces forceX = new Forces(nomForceX, Treillis.idNoeud, 1, 0);
            Treillis.AjouteForce(forceX);
            Forces forceY = new Forces (nomForceY, Treillis.idNoeud, 0, 1);
            Treillis.AjouteForce(forceY);
            
            //Matrice
            
            if (Treillis.idNoeud==1){
                Treillis.matrix.m.set(0, 4, 1); //sur x
                Treillis.matrix.m.set(0, 5, 0); //sur y
                Treillis.matrix.m.set(1, 5, 1); //sur y
                Treillis.matrix.m.set(1, 4, 0); //sur x
            }
            
            if (Treillis.idNoeud==2){
                Treillis.matrix.m.set(2, 4, 1); //sur x
                Treillis.matrix.m.set(2, 5, 0); //sur y
                Treillis.matrix.m.set(3, 5, 1); //sur y
                Treillis.matrix.m.set(3, 4, 0); //sur x
            }
            
            if (Treillis.idNoeud==3){
                Treillis.matrix.m.set(4, 4, 1); //sur x
                Treillis.matrix.m.set(4, 5, 0); //sur y
                Treillis.matrix.m.set(5, 5, 1); //sur y
                Treillis.matrix.m.set(5, 4, 0); //sur x
            }
            
            Treillis.idNoeud+=1;
            this.setVisible(false);
        }
    }//GEN-LAST:event_ValiderMouseClicked

    private void annuler2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_annuler2MouseClicked

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
            java.util.logging.Logger.getLogger(FrameNoeudAppuiDouble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameNoeudAppuiDouble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameNoeudAppuiDouble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameNoeudAppuiDouble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameNoeudAppuiDouble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane P1;
    private javax.swing.JTextPane P2;
    private javax.swing.JButton Valider;
    private javax.swing.JButton annuler2;
    private javax.swing.JLabel erreurP1;
    private javax.swing.JLabel erreurP2;
    private javax.swing.JLabel erreurPos;
    private javax.swing.JLabel erreurTri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextPane position;
    private javax.swing.JTextPane triangle;
    private javax.swing.JScrollPane x;
    private javax.swing.JScrollPane x1;
    private javax.swing.JScrollPane x3;
    private javax.swing.JScrollPane x4;
    // End of variables declaration//GEN-END:variables
}
