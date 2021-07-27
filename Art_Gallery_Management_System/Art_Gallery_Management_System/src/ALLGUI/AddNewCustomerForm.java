/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALLGUI;

import ALLCLASS.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author A7med_Sa3d
 */
public class AddNewCustomerForm extends javax.swing.JFrame {

    /**
     * Creates new form AddNewCustomerForm
     */
    public AddNewCustomerForm() {
        initComponents();
        this.setLocationRelativeTo(null);
       setidlabel.setText("" + (ReadWriteDataFromFiles.pearsonssize + 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomerHeader = new javax.swing.JPanel();
        formheader = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        minmizbtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        youridlabel = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        namefiled = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        repasswordlabel = new javax.swing.JLabel();
        rePasswordField = new javax.swing.JPasswordField();
        addresslable = new javax.swing.JLabel();
        addressfield = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        setidlabel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        CustomerHeader.setBackground(new java.awt.Color(87, 101, 116));

        formheader.setFont(new java.awt.Font("Algerian", 3, 40)); // NOI18N
        formheader.setForeground(new java.awt.Color(255, 255, 255));
        formheader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formheader.setText("ART GALLERY");

        closebtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        closebtn.setForeground(new java.awt.Color(255, 255, 255));
        closebtn.setText("X");
        closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });

        minmizbtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        minmizbtn.setForeground(new java.awt.Color(255, 255, 255));
        minmizbtn.setText("-");
        minmizbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minmizbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minmizbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CustomerHeaderLayout = new javax.swing.GroupLayout(CustomerHeader);
        CustomerHeader.setLayout(CustomerHeaderLayout);
        CustomerHeaderLayout.setHorizontalGroup(
            CustomerHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerHeaderLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(formheader, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addComponent(minmizbtn)
                .addGap(18, 18, 18)
                .addComponent(closebtn)
                .addGap(36, 36, 36))
        );
        CustomerHeaderLayout.setVerticalGroup(
            CustomerHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerHeaderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(CustomerHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formheader)
                    .addComponent(minmizbtn)
                    .addComponent(closebtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(34, 47, 62));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(218, 218, 233));
        jPanel1.setLayout(null);

        youridlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        youridlabel.setText("Your ID :");
        jPanel1.add(youridlabel);
        youridlabel.setBounds(30, 80, 85, 24);

        namelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namelabel.setText("Name :");
        jPanel1.add(namelabel);
        namelabel.setBounds(50, 140, 85, 24);

        namefiled.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namefiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namefiledKeyTyped(evt);
            }
        });
        jPanel1.add(namefiled);
        namefiled.setBounds(150, 140, 165, 23);

        passwordlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordlabel.setText("Password :");
        jPanel1.add(passwordlabel);
        passwordlabel.setBounds(20, 180, 110, 24);

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(passwordField);
        passwordField.setBounds(150, 180, 165, 23);

        repasswordlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        repasswordlabel.setText("RePassword :");
        jPanel1.add(repasswordlabel);
        repasswordlabel.setBounds(10, 220, 123, 24);

        rePasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(rePasswordField);
        rePasswordField.setBounds(150, 220, 165, 23);

        addresslable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addresslable.setText("Address :");
        jPanel1.add(addresslable);
        addresslable.setBounds(20, 260, 96, 24);

        addressfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressfieldKeyTyped(evt);
            }
        });
        jPanel1.add(addressfield);
        addressfield.setBounds(150, 260, 163, 23);

        registerButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registerButton.setText("Submit");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton);
        registerButton.setBounds(150, 300, 160, 31);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 28)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 10, 200, 60);

        setidlabel.setEditable(false);
        setidlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(setidlabel);
        setidlabel.setBounds(150, 90, 100, 20);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(50, 70, 340, 370);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pexels-photoPHOTORESIZERCROPRESIZEANDSHAREIMAGESINBATCH230840035742م.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, -14, 1021, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CustomerHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CustomerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Boolean checkname()
    {
        for(int i = 0 ; i<ReadWriteDataFromFiles.pearsonssize ; i++)
            if(ReadWriteDataFromFiles.pearsons[i].getName().equals(namefiled.getText()))
                return false;
         return true;
    }
    
    private Boolean checkdata()
    {
        if(namefiled.getText().equals("") || addressfield.getText().equals("") ||passwordField.getText().equals("") || rePasswordField.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this,"Empty Fields.","Message", JOptionPane.WARNING_MESSAGE);
            return false; 
        }
        if(!passwordField.getText().equals(rePasswordField.getText()))
        {
           JOptionPane.showMessageDialog(this,"Passwords isn't the same.","Message", JOptionPane.WARNING_MESSAGE);
            return false; 
        }
        if(!checkname())
         {
           JOptionPane.showMessageDialog(this,"This name is used before.\nChange it.","Message", JOptionPane.WARNING_MESSAGE);
            return false; 
        }
      return true;
    }
    
    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        LOGINFORM xx = new LOGINFORM();
        xx.setVisible(true);
        xx.pack();
        xx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_closebtnMouseClicked

    private void minmizbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minmizbtnMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minmizbtnMouseClicked

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        if(checkdata() == true)
        {
            CUSTOMER customer = new CUSTOMER();
            customer.setId(ReadWriteDataFromFiles.pearsonssize+1);
            customer.setName(namefiled.getText());
            customer.setPassword(passwordField.getText());
            customer.setAddress(addressfield.getText());
            
            ReadWriteDataFromFiles.add_customer(customer);
            JOptionPane.showMessageDialog(this,"Data Saved Sir.","Message", JOptionPane.INFORMATION_MESSAGE);

            LOGINFORM xx = new LOGINFORM();
            xx.setVisible(true);
            xx.pack();
            xx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void namefiledKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namefiledKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_namefiledKeyTyped

    private void addressfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressfieldKeyTyped
        // TODO add your handling code here:
         if(Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_addressfieldKeyTyped

    
    
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
            java.util.logging.Logger.getLogger(AddNewCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewCustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewCustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CustomerHeader;
    private javax.swing.JTextField addressfield;
    private javax.swing.JLabel addresslable;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel formheader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minmizbtn;
    private javax.swing.JTextField namefiled;
    private javax.swing.JLabel namelabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JPasswordField rePasswordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel repasswordlabel;
    private javax.swing.JTextField setidlabel;
    private javax.swing.JLabel youridlabel;
    // End of variables declaration//GEN-END:variables
}