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
public class FrameNoeud extends javax.swing.JFrame {

    /**
     * Creates new form FrameNoeud
     */
    public FrameNoeud() {
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

        annuler = new javax.swing.JButton();
        annuler1 = new javax.swing.JButton();
        noeudSimple = new javax.swing.JButton();
        noeudAppui = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        annuler2 = new javax.swing.JButton();

        annuler.setText("Annuler");
        annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annulerMouseClicked(evt);
            }
        });

        annuler1.setText("Annuler");
        annuler1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annuler1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        noeudSimple.setText("Noeud simple");
        noeudSimple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noeudSimpleMouseClicked(evt);
            }
        });
        noeudSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noeudSimpleActionPerformed(evt);
            }
        });

        noeudAppui.setText("Noeud appui");
        noeudAppui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noeudAppuiMouseClicked(evt);
            }
        });
        noeudAppui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noeudAppuiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Créer un noeud");

        jLabel2.setText("Il existe deux types de noeuds : les noeuds simples et les noeuds appuis");

        jLabel3.setText("Les noeuds simples se trouvent à l'extérieur des triangles de terrains");

        jLabel4.setText("Les noeuds appuis se trouvent sur un segment de triangle de terrain");

        jLabel5.setText("Que voulez vous créer ?");

        annuler2.setText("Retour");
        annuler2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annuler2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(annuler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noeudSimple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noeudAppui)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noeudSimple)
                    .addComponent(noeudAppui))
                .addGap(26, 26, 26)
                .addComponent(annuler2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noeudSimpleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noeudSimpleMouseClicked
        // TODO add your handling code here:
        FrameNoeudSimple noeudSimple= new FrameNoeudSimple();
        noeudSimple.setVisible(true);
    }//GEN-LAST:event_noeudSimpleMouseClicked

    private void noeudAppuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noeudAppuiMouseClicked
        // TODO add your handling code here:
        FrameAppuis noeud = new FrameAppuis();
        noeud.setVisible(true);
    }//GEN-LAST:event_noeudAppuiMouseClicked

    private void annulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_annulerMouseClicked

    private void annuler1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_annuler1MouseClicked

    private void annuler2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_annuler2MouseClicked

    private void noeudAppuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noeudAppuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noeudAppuiActionPerformed

    private void noeudSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noeudSimpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noeudSimpleActionPerformed

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
            java.util.logging.Logger.getLogger(FrameNoeud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameNoeud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameNoeud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameNoeud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameNoeud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JButton annuler1;
    private javax.swing.JButton annuler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton noeudAppui;
    private javax.swing.JButton noeudSimple;
    // End of variables declaration//GEN-END:variables
}