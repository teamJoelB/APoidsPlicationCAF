/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import bean.User;
import dao.UserDao;
import dao.HistoDao;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ESIC
 */
public class Profile extends javax.swing.JFrame {

    static User u;
    
    
    public Profile(User u) {
        initComponents();
        this.u = u;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        butPoids = new javax.swing.JButton();
        butHisto = new javax.swing.JButton();
        lbPoids = new javax.swing.JLabel();
        iconPoids = new javax.swing.JLabel();
        iconObjective = new javax.swing.JLabel();
        lbObjectif = new javax.swing.JLabel();
        lbSSTitre = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbTitre = new javax.swing.JLabel();
        lbSSTitre1 = new javax.swing.JLabel();
        iconNom = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbProfile = new javax.swing.JLabel();
        lbSSTitre2 = new javax.swing.JLabel();
        butJeu = new javax.swing.JButton();
        butPoids1 = new javax.swing.JButton();
        butTendancesPoids = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 206, 224));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 206, 224));

        butPoids.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        butPoids.setForeground(new java.awt.Color(0, 0, 0));
        butPoids.setText("<html><center>Ajouter Poids<br/>Du Jour</center></html>\n");
        butPoids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPoidsActionPerformed(evt);
            }
        });

        butHisto.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        butHisto.setForeground(new java.awt.Color(0, 0, 0));
        butHisto.setText("Historique Objectifs");
        butHisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butHistoActionPerformed(evt);
            }
        });

        lbPoids.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbPoids.setForeground(new java.awt.Color(0, 0, 0));
        lbPoids.setText("Poids");

        iconPoids.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihm/weight-scale.png"))); // NOI18N

        iconObjective.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihm/objective.png"))); // NOI18N

        lbObjectif.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbObjectif.setForeground(new java.awt.Color(0, 0, 0));
        lbObjectif.setText("Objectif actuel : ");

        lbSSTitre.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lbSSTitre.setForeground(new java.awt.Color(0, 0, 0));
        lbSSTitre.setText("Nous espérons que vous passez une bonne journée.");

        jPanel4.setBackground(new java.awt.Color(73, 73, 255));
        jPanel4.setForeground(new java.awt.Color(73, 73, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        lbTitre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitre.setForeground(new java.awt.Color(0, 0, 0));
        lbTitre.setText("<html><center>Bienvenue, </center></html>");

        lbSSTitre1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbSSTitre1.setForeground(new java.awt.Color(0, 0, 0));
        lbSSTitre1.setText("Voici vos dernières tendances de poids et vos objectifs.");

        iconNom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihm/avatar.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(73, 73, 255));

        lbProfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbProfile.setForeground(new java.awt.Color(255, 255, 255));
        lbProfile.setText("<html><center>Mon <br/> Profil</center></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbSSTitre2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbSSTitre2.setForeground(new java.awt.Color(0, 0, 0));
        lbSSTitre2.setText("Et un petit jeu pour passer le temps !");

        butJeu.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        butJeu.setForeground(new java.awt.Color(0, 0, 0));
        butJeu.setText("Jeu");
        butJeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJeuActionPerformed(evt);
            }
        });

        butPoids1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        butPoids1.setForeground(new java.awt.Color(0, 0, 0));
        butPoids1.setText("Ajouter Objectif");
        butPoids1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPoids1ActionPerformed(evt);
            }
        });

        butTendancesPoids.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        butTendancesPoids.setForeground(new java.awt.Color(0, 0, 0));
        butTendancesPoids.setText("Tendances Poids");
        butTendancesPoids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butTendancesPoidsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iconPoids)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbObjectif))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(iconObjective)
                                .addGap(12, 12, 12)
                                .addComponent(lbPoids)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butPoids1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(butPoids))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butHisto)
                            .addComponent(butTendancesPoids, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbSSTitre1)
                        .addGap(98, 98, 98))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconNom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSSTitre)
                            .addComponent(lbTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(butJeu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbSSTitre2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconNom, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSSTitre)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPoids))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbSSTitre1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(iconPoids, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(butTendancesPoids)
                                        .addGap(9, 9, 9)))
                                .addGap(32, 32, 32)
                                .addComponent(iconObjective, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lbObjectif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(butPoids1)
                                    .addComponent(butHisto)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(butPoids, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(48, 48, 48)
                .addComponent(lbSSTitre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butJeu)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butHistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butHistoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butHistoActionPerformed

    private void butJeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butJeuActionPerformed
        Magic m = new Magic();
        this.setVisible(false);
        m.setVisible(true);
 
    }//GEN-LAST:event_butJeuActionPerformed

    private void butPoids1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPoids1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butPoids1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
       String nom = u.getNom();
       String prenom = u.getPrenom();
       lbTitre.setText("Bienvenue, " + prenom + " " + nom);
       double poids = u.getPoids();
       lbPoids.setText("Poids : " + poids + " kg");
       
        
        



    }//GEN-LAST:event_formWindowOpened

    private void butPoidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPoidsActionPerformed
     
        this.setVisible(false);
        
        String poidS = JOptionPane.showInputDialog("Poids du jours");
        int poids = Integer.parseInt(poidS);
        u.setPoids(poids);
        try {
          UserDao.newPoids(poids, u);  
          
          HistoDao.newEvoPoids(u, poids);
          
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        Profile p = new Profile(u);
        p.setVisible(true);
        
        
        // ajouter dans le evoPoids



    }//GEN-LAST:event_butPoidsActionPerformed

    private void butTendancesPoidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butTendancesPoidsActionPerformed
        TendancePoids tp = new TendancePoids(u);
        tp.setVisible(true);
    }//GEN-LAST:event_butTendancesPoidsActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile(u).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butHisto;
    private javax.swing.JButton butJeu;
    private javax.swing.JButton butPoids;
    private javax.swing.JButton butPoids1;
    private javax.swing.JButton butTendancesPoids;
    private javax.swing.JLabel iconNom;
    private javax.swing.JLabel iconObjective;
    private javax.swing.JLabel iconPoids;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbObjectif;
    private javax.swing.JLabel lbPoids;
    private javax.swing.JLabel lbProfile;
    private javax.swing.JLabel lbSSTitre;
    private javax.swing.JLabel lbSSTitre1;
    private javax.swing.JLabel lbSSTitre2;
    private javax.swing.JLabel lbTitre;
    // End of variables declaration//GEN-END:variables
}
