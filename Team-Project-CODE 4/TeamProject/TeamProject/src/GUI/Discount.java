/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/*import Entity.FixedDiscount;
import Entity.FlexibleDiscount;
import Entity.VariableDiscount;*/
import controller.controller;
import javax.swing.JOptionPane;

/**
 *
 * @author Sugan
 */
public class Discount extends javax.swing.JFrame {

    /**
     * Creates new form Discount
     */
    public Discount() {
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
        jLabel1 = new javax.swing.JLabel();
        discountID = new javax.swing.JTextField();
        accNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Variable = new javax.swing.JRadioButton();
        Flexible = new javax.swing.JRadioButton();
        Fixed = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Discount");

        discountID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountIDActionPerformed(evt);
            }
        });

        accNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accNoActionPerformed(evt);
            }
        });

        jLabel2.setText("Discount ID");

        jLabel3.setText("Account Number");

        buttonGroup1.add(Variable);
        Variable.setText("Variable");
        Variable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VariableActionPerformed(evt);
            }
        });

        buttonGroup1.add(Flexible);
        Flexible.setText("Flexible");
        Flexible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlexibleActionPerformed(evt);
            }
        });

        buttonGroup1.add(Fixed);
        Fixed.setText("Fixed");
        Fixed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FixedActionPerformed(evt);
            }
        });

        jLabel4.setText("Discount Type:");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Variable)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Flexible)
                                .addGap(35, 35, 35)
                                .addComponent(Fixed))
                            .addComponent(jLabel1))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(accNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(discountID, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(discountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Variable)
                    .addComponent(Flexible)
                    .addComponent(Fixed))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accNoActionPerformed

    private void VariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VariableActionPerformed
        // TODO add your handling code here:
      //  VariableDiscount variableDiscount = new VariableDiscount();
    }//GEN-LAST:event_VariableActionPerformed

    private void FixedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FixedActionPerformed
        // TODO add your handling code here:
     //   FixedDiscount fixedDiscount = new FixedDiscount();
    }//GEN-LAST:event_FixedActionPerformed

    private void FlexibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlexibleActionPerformed
        // TODO add your handling code here:
     //   FlexibleDiscount flexibleDiscount = new FlexibleDiscount();
    }//GEN-LAST:event_FlexibleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String discountType = " ";
        if(Variable.isSelected()){
        discountType = "1"; // v means Variable
        }else if(Flexible.isSelected()){
          discountType = "2"; //f means Flexible 
        }else if(Fixed.isSelected()){
          discountType = "3"; //f means Fixed
        }
        
        boolean outcome = controller.updateDiscountType(discountID.getText(), accNo.getText(), discountType);
        
        if(discountID.getText().equals("") || accNo.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please can you enter username and password",  "WRONG ", JOptionPane.WARNING_MESSAGE);
        
        }else {
            if (outcome == true && Variable.isSelected()) {
            JOptionPane.showMessageDialog(null, "Discount has been added to the customer account", "Add Discount", JOptionPane.INFORMATION_MESSAGE);
            Discount1 w = new Discount1();
            w.hide();
            w.setVisible(true);
            } else if (outcome == true && Flexible.isSelected()) {
            JOptionPane.showMessageDialog(null, "Discount has been added to the customer account", "Add Discount", JOptionPane.INFORMATION_MESSAGE);
            Discount3 w = new Discount3();
            w.setVisible(true);
            }else if (outcome == true && Fixed.isSelected()) {
            JOptionPane.showMessageDialog(null, "Discount has been added to the customer account", "Add Discount", JOptionPane.INFORMATION_MESSAGE);
            Discount2 w = new Discount2();
            w.setVisible(true);
            }      
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void discountIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        OfficeMgrHome v = new OfficeMgrHome();
        v.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Discount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Fixed;
    private javax.swing.JRadioButton Flexible;
    private javax.swing.JRadioButton Variable;
    private javax.swing.JTextField accNo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField discountID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}