/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class seven extends javax.swing.JFrame {

    /**
     * Creates new form seven
     */
    public seven() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rb7 = new javax.swing.JRadioButton();
        rb21 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        rb15 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rb16 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        rb17 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb18 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        rb19 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        rb20 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        rb7.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup7.add(rb7);
        rb7.setText("Yes");

        rb21.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup7.add(rb21);
        rb21.setText("No");

        rb1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rb1);
        rb1.setText("Yes");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        rb15.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rb15);
        rb15.setText("No");

        rb2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(rb2);
        rb2.setText("Yes");

        jLabel1.setText("PLEASE ANSWER THE FOLLOWING QUESTIONS:");

        jLabel2.setText("Day 1 having any symptoms?");

        jLabel3.setText("Day 2 having any symptoms?");

        jLabel4.setText("Day 3 having any symptoms?");

        jLabel5.setText("Day 4 having any symptoms?");

        jLabel6.setText("Day 5 having any symptoms?");

        jLabel7.setText("Day 6 having any symptoms?");

        jLabel8.setText("Day 7 having any symptoms?");

        rb16.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(rb16);
        rb16.setText("No");

        rb3.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup3.add(rb3);
        rb3.setText("Yes");

        jButton2.setText("DONE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        rb17.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup3.add(rb17);
        rb17.setText("No");

        rb4.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup4.add(rb4);
        rb4.setText("Yes");

        rb18.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup4.add(rb18);
        rb18.setText("No");

        rb5.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup5.add(rb5);
        rb5.setText("Yes");
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });

        rb19.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup5.add(rb19);
        rb19.setText("No");

        rb6.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup6.add(rb6);
        rb6.setText("Yes");

        rb20.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup6.add(rb20);
        rb20.setText("No");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rb6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb19)
                                    .addComponent(rb20)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb15))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rb1)
                    .addComponent(rb15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rb2)
                    .addComponent(rb16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rb3)
                    .addComponent(rb17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb4)
                    .addComponent(rb18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rb5)
                    .addComponent(rb19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rb6)
                    .addComponent(rb20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rb7)
                    .addComponent(rb21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code h
        int wan=0;//yes
        int tu=0;//no

        if(rb1.isSelected()){
            wan += 1;
        }
        if (rb2.isSelected()){
            wan += 1;
        }
        if (rb3.isSelected()){
            wan += 1;
        }
        if (rb4.isSelected()){
            wan += 1;
        }
        if (rb5.isSelected()){
            wan += 1;
        }
        if (rb6.isSelected()){
            wan += 1;
        }
        if (rb7.isSelected()){
            wan += 1;
        }
        if(rb15.isSelected()){
            tu += 1;
        }
        if (rb16.isSelected()){
            tu += 1;
        }
        if (rb17.isSelected()){
            tu += 1;
        }
        if (rb18.isSelected()){
            tu += 1;
        }
        if (rb19.isSelected()){
            tu += 1;
        }
        if (rb20.isSelected()){
            tu += 1;
        }
        if (rb21.isSelected()){
            tu += 1;
        }

        switch (wan){
            case 1:
            JOptionPane.showMessageDialog(this, "Case Category: Mild Case!");
            break;
            case 2:
            JOptionPane.showMessageDialog(this, "Case Category: Mild Case!");
            break;
            case 3:
            JOptionPane.showMessageDialog(this, "Case Category: Mild Case!");
            break;
            case 4:
            JOptionPane.showMessageDialog(this, "Case Category: Severe Case!");
            break;
            case 5:
            JOptionPane.showMessageDialog(this, "Case Category: Severe Case!");
            break;
            case 6:
            JOptionPane.showMessageDialog(this, "Case Category: Severe Case!");
            break;
            case 7:
            JOptionPane.showMessageDialog(this, "Case Category: Severe Case!");
            break;
        }
        switch (tu){
            case 7:
            JOptionPane.showMessageDialog(this, "Case Category: Asymptomatic!");
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        second fr = new second();
        fr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb5ActionPerformed

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
            java.util.logging.Logger.getLogger(seven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seven().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb15;
    private javax.swing.JRadioButton rb16;
    private javax.swing.JRadioButton rb17;
    private javax.swing.JRadioButton rb18;
    private javax.swing.JRadioButton rb19;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb20;
    private javax.swing.JRadioButton rb21;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JRadioButton rb7;
    // End of variables declaration//GEN-END:variables
}
