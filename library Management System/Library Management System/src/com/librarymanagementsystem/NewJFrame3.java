/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aaush
 */
public class NewJFrame3 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame3
     */
    public NewJFrame3() {
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

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/librarymanagementsystem/viktor-bystrov-eHRzs3zunvQ-unsplash.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("SEARCH Students'S DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(353, 15, 303, 24);

        jLabel2.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Search by Aadhaar Card no.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(62, 71, 230, 19);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(298, 68, 153, 22);

        jButton1.setFont(new java.awt.Font("Algerian", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 51));
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(504, 68, 86, 26);

        jLabel3.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel3.setText("idproof");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 90, 20);

        jLabel4.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel4.setText("name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 230, 90, 30);

        jLabel5.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel5.setText("nationality");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 310, 130, 30);

        jLabel6.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel6.setText("gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 390, 90, 30);

        jLabel7.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel7.setText("address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(341, 320, 110, 24);

        jLabel8.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel8.setText("mobilenumber");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 240, 150, 24);

        jLabel9.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel9.setText("email");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(350, 150, 110, 24);

        jLabel10.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel10.setText("issue date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(345, 386, 140, 24);

        jLabel12.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel12.setText("Book Name");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(338, 462, 130, 24);

        jLabel13.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel13.setText("Booknumber");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(706, 154, 150, 24);

        jLabel14.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel14.setText("price");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(705, 242, 120, 24);

        jLabel15.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel15.setText("No.of days");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(699, 331, 170, 24);

        jLabel16.setFont(new java.awt.Font("Algerian", 2, 18)); // NOI18N
        jLabel16.setText("Total Fine");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(699, 386, 120, 24);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(187, 151, 86, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 230, 86, 22);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(187, 317, 86, 22);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(187, 393, 86, 22);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(510, 150, 80, 22);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(520, 240, 71, 22);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(513, 317, 71, 22);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10);
        jTextField10.setBounds(513, 383, 77, 22);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(513, 459, 77, 22);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(879, 151, 77, 22);
        getContentPane().add(jTextField13);
        jTextField13.setBounds(887, 239, 77, 22);

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField14);
        jTextField14.setBounds(887, 328, 77, 22);
        getContentPane().add(jTextField15);
        jTextField15.setBounds(887, 393, 77, 22);

        jButton2.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jButton2.setText("SEE ALL  OPTIONS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(750, 470, 210, 31);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/librarymanagementsystem/shunya-koide-tfVi8OAsVLU-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(-270, -60, 1410, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try{   
        Class.forName("com.mysql.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/crud","root","");
       PreparedStatement a = conn.prepareStatement("select idproofs,name,nationality,gender,email,mobilenumber,address,issuedate,bookname,booknumber,price,bookingdays,total from allotebook where idproofs = ?");
      int id = Integer.parseInt(jTextField1.getText());
      a.setInt(1,id);
       ResultSet rs = a.executeQuery();
        if(rs.next()==false)
        {
            JOptionPane.showMessageDialog(this, "SORRY RECORD IS NOT FOUND !!!"); 
            jTextField2.setText(" ");
             jTextField3.setText(" ");
              jTextField4.setText(" ");
               jTextField5.setText(" ");
                 jTextField7.setText(" ");
                  jTextField8.setText(" ");
                   jTextField9.setText(" ");
                    jTextField10.setText(" ");
             jTextField11.setText(" ");
              jTextField12.setText(" ");
               jTextField13.setText(" ");
                jTextField14.setText(" ");
                 jTextField15.setText(" ");           
        }
        else {
             jTextField2.setText(rs.getString("idproofs"));
             jTextField3.setText(rs.getString("name"));
              jTextField4.setText(rs.getString("nationality"));
               jTextField5.setText(rs.getString("gender"));
                jTextField7.setText(rs.getString("email"));
                 jTextField8.setText(rs.getString("mobilenumber"));
                  jTextField9.setText(rs.getString("address"));
                   jTextField10.setText(rs.getString("issuedate"));
                 
             jTextField11.setText(rs.getString("bookname"));
              jTextField12.setText(rs.getString("booknumber"));
               jTextField13.setText(rs.getString("price"));
                jTextField14.setText(rs.getString("bookingdays"));
                 jTextField15.setText(rs.getString("total"));  
        
        }
     }  catch (Exception e) {
           JOptionPane.showMessageDialog(this, e);
        }
              // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 NewJFrame1 jf1 = new NewJFrame1();
       jf1.show();
       dispose();         // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables


}
