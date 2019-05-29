/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DCL
 */
public class Meals_table extends javax.swing.JFrame {

    static String date;
    static Connection connection;
    static PreparedStatement st;
    static ResultSet rs;
    /**
     * Creates new form Meals_table
     */
    public Meals_table() {
        initComponents();
    }
    
    public Meals_table(ResultSet rst, String date){
        initComponents();
        
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rst));
        this.date = date;
        
        sum();
        
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-A5U3RHS:1521:ORCL", "hr", "hr");
        } catch (SQLException ex) {
            Logger.getLogger(Meals.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void sum(){
        int sum_b=0, sum_l=0, sum_d=0;
        for (int i = 0; i< jTable1.getRowCount(); i++){
            sum_b = sum_b + Integer.parseInt(jTable1.getValueAt(i, 0).toString());
            sum_l = sum_l + Integer.parseInt(jTable1.getValueAt(i, 1).toString());
            sum_d = sum_d + Integer.parseInt(jTable1.getValueAt(i, 2).toString());
        }
        
        jLabel_breakFast.setText(Integer.toString(sum_b));
        jLabel_lunch.setText(Integer.toString(sum_l));
        jLabel_dinner.setText(Integer.toString(sum_d));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_breakFast = new javax.swing.JLabel();
        jLabel_lunch = new javax.swing.JLabel();
        jLabel_dinner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Total:");

        jLabel_breakFast.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_breakFast.setText("2");

        jLabel_lunch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_lunch.setText("2");

        jLabel_dinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_dinner.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel_breakFast)
                        .addGap(141, 141, 141)
                        .addComponent(jLabel_lunch)
                        .addGap(161, 161, 161)
                        .addComponent(jLabel_dinner)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_breakFast)
                    .addComponent(jLabel_lunch)
                    .addComponent(jLabel_dinner))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Meals_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meals_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meals_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meals_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//        String sql = "SELECT BREAK_FAST , LUNCH , DINNER  FROM MEALS WHERE TODAY_DATE = '"+ date + "' ";
//        try {
//            st = connection.prepareStatement(sql);
//            rs = st.executeQuery();
//            
//            
//            jLabel_breakFast.setText(Integer.toString(rs.getInt("SUM(BREAK_FAST)")));
//            jLabel_lunch.setText(Integer.toString(rs.getInt("SUM(LUNCH)")));
//            jLabel_dinner.setText(Integer.toString(rs.getInt("SUM(DINNER)")));
//        } catch (SQLException ex) {
//            Logger.getLogger(Meals_table.class.getName()).log(Level.SEVERE, null, ex);
//        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meals_table().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_breakFast;
    private javax.swing.JLabel jLabel_dinner;
    private javax.swing.JLabel jLabel_lunch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
