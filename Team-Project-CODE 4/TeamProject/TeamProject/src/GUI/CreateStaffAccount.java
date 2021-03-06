/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import controller.*;

/**
 *
 * @author sajawal
 */
public class CreateStaffAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateStaffAccount
     */
    public CreateStaffAccount() {
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

        bg = new javax.swing.ButtonGroup();
        BAPERS = new javax.swing.JLabel();
        PaymentLabel = new javax.swing.JLabel();
        PaymentLabel1 = new javax.swing.JLabel();
        createstaffAccountlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        staffIDtxt = new javax.swing.JTextField();
        firstNametxt = new javax.swing.JTextField();
        surnametxt = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        passwordtxt = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        om = new javax.swing.JRadioButton();
        sm = new javax.swing.JRadioButton();
        r = new javax.swing.JRadioButton();
        development = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Copy = new javax.swing.JRadioButton();
        packing = new javax.swing.JRadioButton();
        finishing = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BAPERS.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BAPERS.setText("BAPERS");

        PaymentLabel.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        PaymentLabel.setText("Staff Account");

        PaymentLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        PaymentLabel1.setText("Create Account");

        createstaffAccountlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createstaffAccountlabel.setText("Create Staff Account");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Enter Details");

        jLabel2.setText("StaffID:");

        jLabel3.setText("First Name:");

        jLabel4.setText("Surname");

        jLabel5.setText("Job Title:");

        jLabel6.setText("Password");

        staffIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffIDtxtActionPerformed(evt);
            }
        });

        create.setBackground(new java.awt.Color(204, 255, 255));
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bg.add(om);
        om.setSelected(true);
        om.setText("Office Manager");
        om.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omActionPerformed(evt);
            }
        });

        bg.add(sm);
        sm.setText("Shift Manager");
        sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smActionPerformed(evt);
            }
        });

        bg.add(r);
        r.setText("Receptionist");

        bg.add(development);
        development.setText("Development Area Technician");

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("email");

        bg.add(Copy);
        Copy.setText("Copy Room Technician");

        bg.add(packing);
        packing.setText("Packing Room Technician");

        bg.add(finishing);
        finishing.setText("Finishing Room Technician");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Copy)
                                            .addComponent(om)
                                            .addComponent(sm))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(r)
                                            .addComponent(development)
                                            .addComponent(packing))
                                        .addGap(18, 18, 18))
                                    .addComponent(surnametxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNametxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(staffIDtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordtxt)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(finishing, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createstaffAccountlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BAPERS)
                                .addGap(60, 60, 60)
                                .addComponent(PaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PaymentLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(27, 27, 27)
                .addComponent(create)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAPERS)
                    .addComponent(PaymentLabel)
                    .addComponent(PaymentLabel1))
                .addGap(18, 18, 18)
                .addComponent(createstaffAccountlabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(staffIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(firstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(surnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(om)
                    .addComponent(r))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sm)
                    .addComponent(development))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Copy)
                    .addComponent(packing))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finishing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(create)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        String jobTitle = "";
         if (om.isSelected()){
            jobTitle = "Office Manager";
        }else if (sm.isSelected()){
            jobTitle = "Shift Manager";
        }else if (r.isSelected()){
            jobTitle = "Receptionist";
        }else if (development.isSelected()){
            jobTitle = "Development Technician";
        }else if (Copy.isSelected()){
            jobTitle = "CopyRoom Technician";
        }else if (packing.isSelected()){
            jobTitle = "PackingRoom Technician";
        }else if (finishing.isSelected()){
            jobTitle = "FinishingRoom Technician";
        }
        boolean outcome = controller.addStaffAccount(staffIDtxt.getText(), firstNametxt.getText(), surnametxt.getText(),jobTitle,passwordtxt.getText(),email.getText());
        
         if(staffIDtxt.getText().equals("") || firstNametxt.getText().equals("") || surnametxt.getText().equals("") || jobTitle.equals("")||passwordtxt.getText().equals("")||email.getText().equals("")){
         
            JOptionPane.showMessageDialog(null, "Please input some values",  "Empty!!!", JOptionPane.WARNING_MESSAGE);
         }else if (outcome == true){ 
            JOptionPane.showMessageDialog(null, "New User Account Added ",  "Account Added", JOptionPane.INFORMATION_MESSAGE);
            
        }   
    }//GEN-LAST:event_createActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    StaffAccountNavGUI omh = new StaffAccountNavGUI();
    omh.setVisible(true); 
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void omActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_omActionPerformed

    private void smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //update button
        String jobTitle = ""; 
         if (om.isSelected()){
            jobTitle = "Office Manager";
        }else if (sm.isSelected()){
            jobTitle = "Shift Manager";
        }else if (r.isSelected()){
            jobTitle = "Receptionist";
        }else if (development.isSelected()){
            jobTitle = "Development Technician";
        }else if (Copy.isSelected()){
            jobTitle = "CopyRoom Technician";
        }else if (packing.isSelected()){
            jobTitle = "PackingRoom Technician";
        }else if (finishing.isSelected()){
            jobTitle = "FinishingRoom Technician";
        }
        boolean outcome = controller.updateStaffAcc(staffIDtxt.getText(), firstNametxt.getText(), surnametxt.getText(),jobTitle,passwordtxt.getText(),email.getText());
        if(staffIDtxt.getText().equals("") || firstNametxt.getText().equals("") || surnametxt.getText().equals("") || jobTitle.equals("")||passwordtxt.getText().equals("")||email.getText().equals("")){
         
            JOptionPane.showMessageDialog(null, "Please input some values",  "Empty!!!", JOptionPane.WARNING_MESSAGE);
         }else if (outcome == true){ 
            JOptionPane.showMessageDialog(null, " User Account information updateed ",  "Update Complete", JOptionPane.INFORMATION_MESSAGE);
            
        } else{
            JOptionPane.showMessageDialog(null, "unable to update information",  "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void staffIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffIDtxtActionPerformed

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
            java.util.logging.Logger.getLogger(CreateStaffAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateStaffAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateStaffAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateStaffAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateStaffAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BAPERS;
    private javax.swing.JRadioButton Copy;
    private javax.swing.JLabel PaymentLabel;
    private javax.swing.JLabel PaymentLabel1;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton create;
    private javax.swing.JLabel createstaffAccountlabel;
    private javax.swing.JRadioButton development;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton finishing;
    private javax.swing.JTextField firstNametxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton om;
    private javax.swing.JRadioButton packing;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JRadioButton r;
    private javax.swing.JRadioButton sm;
    private javax.swing.JTextField staffIDtxt;
    private javax.swing.JTextField surnametxt;
    // End of variables declaration//GEN-END:variables
}
