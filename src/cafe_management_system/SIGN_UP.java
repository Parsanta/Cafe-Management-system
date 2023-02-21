/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe_management_system;

import model.User;
import DAO.UserDao;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Satguru Pyari
 */
public class SIGN_UP extends javax.swing.JFrame {

    public String emailPattern = "^(.+)@(.+)$";
    public String mobileNumberPattern = "^[0-9]*$";

    /**
     * Creates new form SIGN_UP
     */
    public SIGN_UP() {
        initComponents();
        btncreate.setEnabled(false);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);

    }

    public void clear() {
        textName.setText("");
        textEmail.setText("");
        textMobNum.setText("");
        textPassword.setText("");
        textConfPAass.setText("");
        btncreate.setEnabled(false);
    }

    public void validateFields() {
        String name = textName.getText();
        String email = textEmail.getText();
        String mobileNumber = textMobNum.getText();
        String password = textPassword.getText();
        String ConPass = textConfPAass.getText();
        if (!name.equals("") && email.matches(emailPattern) && mobileNumber.matches(mobileNumberPattern) && !password.equals("") && !ConPass.equals("")) {
            btncreate.setEnabled(true);
        } 
        else {
            btncreate.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MobileNumber = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textMobNum = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        textConfPAass = new javax.swing.JPasswordField();
        btncreate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN UP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 61, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        MobileNumber.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        MobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        MobileNumber.setText("Mobile Number");
        getContentPane().add(MobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        textName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNameKeyReleased(evt);
            }
        });
        getContentPane().add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 270, 30));

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        textEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textEmailKeyReleased(evt);
            }
        });
        getContentPane().add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 270, 30));

        textMobNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMobNumActionPerformed(evt);
            }
        });
        textMobNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textMobNumKeyReleased(evt);
            }
        });
        getContentPane().add(textMobNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 270, 30));

        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });
        textPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 270, 30));

        textConfPAass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textConfPAassKeyReleased(evt);
            }
        });
        getContentPane().add(textConfPAass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 270, 30));

        btncreate.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        btncreate.setText("CREATE ACCOUNT");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        getContentPane().add(btncreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign.jpg"))); // NOI18N
        jLabel7.setText(" ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textMobNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMobNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMobNumActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        User user = new User();
        user.setName(textName.getText());
        user.setEmail(textEmail.getText());
        user.setMobile(textMobNum.getText());
        user.setPassword(textPassword.getText());
        user.setConfirmPassword(textConfPAass.getText());
        UserDao.save(user);
        clear();

    }//GEN-LAST:event_btncreateActionPerformed

    private void textNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_textNameKeyReleased

    private void textEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_textEmailKeyReleased

    private void textMobNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMobNumKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_textMobNumKeyReleased

    private void textPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_textPasswordKeyReleased

    private void textConfPAassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textConfPAassKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_textConfPAassKeyReleased

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
            java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGN_UP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MobileNumber;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField textConfPAass;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textMobNum;
    private javax.swing.JTextField textName;
    private javax.swing.JPasswordField textPassword;
    // End of variables declaration//GEN-END:variables
}
