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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DCL
 */
public class Bazar extends javax.swing.JFrame {

    String date;
    int userId;
    
    Connection connection;
    PreparedStatement st2;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form Bazar
     */
    public Bazar() {
        initComponents();
    }

    public Bazar(int userId, String date) {
        initComponents();
        this.userId = userId;
        this.date = date;
        
        jLabel_date.setText(this.date);
        
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-A5U3RHS:1521:ORCL", "hr", "hr");
        } catch (SQLException ex) {
            Logger.getLogger(Meals.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setResultInTable();
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_itemname = new javax.swing.JTextField();
        jButton_save = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jButton_upadate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_quantity = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField_itemno = new javax.swing.JTextField();
        jLabel_date = new javax.swing.JLabel();
        jLabel_name = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Bazar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Id", "Item No.", "Item name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField_itemname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jButton_save.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_delete.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_upadate.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton_upadate.setText("Update");
        jButton_upadate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_upadateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Item:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Today's Bazar:");

        jTextField_quantity.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jTextField_price.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton4.setText("Show all Bazars");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField_itemno.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel_date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_date.setText("2222-22-22");

        jLabel_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_name.setText("Ashraful");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_date)
                        .addGap(62, 62, 62))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_quantity)
                            .addComponent(jTextField_itemname)
                            .addComponent(jTextField_price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_itemno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_upadate)
                            .addComponent(jButton_delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_date))
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_itemno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jTextField_itemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_save)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_delete)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_upadate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel_name))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        try{
            String sql = "INSERT INTO BAZAR(USER_ID, ITEM_NO,  ITEM_NAME, QUANTITY, PRICE, TODAY_DATE) VALUES(?,?,?,?,?,?)";
           // String auto_increment = "CREATE SEQUENCE USER_ID_SEQ, CREATE TRIGGER USER_ID_BIN,  BEFORE INSERT ON USERS, FOR EACH ROW BEGIN SELECT USER_ID_SEQ.nextval INTO :new.USER_ID FROM dual END";
//            String auto_increment = "CREATE SEQUENCE USER_ID  MINVALUE 1 START WITH 1 CACHE 10";
            st2 = connection.prepareStatement(sql);
            st2.setInt(1, userId);
            st2.setInt(2, Integer.parseInt(jTextField_itemno.getText()));
            st2.setString(3, jTextField_itemname.getText());
            st2.setInt(4, Integer.parseInt(jTextField_quantity.getText()));
            st2.setInt(5, Integer.parseInt(jTextField_price.getText()));
            st2.setString(6, date);
            st2.execute();
            
            setResultInTable();
            
            
            sql = "SELECT F_NAME FROM BAZAR INNER JOIN USERS ON BAZAR.USER_ID = USERS.USER_ID  WHERE BAZAR.TODAY_DATE = '" + date +"'";
            
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            
            rs.next();
            
            jLabel_name.setText(rs.getString("F_NAME"));
            
            JOptionPane.showMessageDialog(null, "Success!");
            
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed

        int itemNo = Integer.parseInt(jTextField_itemno.getText());
                
        String sql = "DELETE FROM BAZAR WHERE ITEM_NO = " + itemNo + " AND TODAY_DATE = '"+ date +"'";
        
        try{
            st2 = connection.prepareStatement(sql);
            st2.execute();
            
            setResultInTable();
            JOptionPane.showMessageDialog(null, "Deleted!");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_upadateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_upadateActionPerformed
        int itemNo = Integer.parseInt(jTextField_itemno.getText());
        String itemName = jTextField_itemname.getText();
        int quantity = Integer.parseInt(jTextField_quantity.getText());
        int price = Integer.parseInt(jTextField_price.getText());
        
        String sql = "UPDATE BAZAR SET ITEM_NO = " + itemNo + ", ITEM_NAME = '" + itemName + "', QUANTITY = " + quantity + ", PRICE = " + price +" WHERE ITEM_NO =" + itemNo + "AND TODAY_DATE = '" + date +"'";
        
        try{
            st2 = connection.prepareStatement(sql);
            st2.execute();
            
            setResultInTable();
            JOptionPane.showMessageDialog(null, "Updated!");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton_upadateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        int itemNo = Integer.parseInt(jTable1.getModel().getValueAt(row, 1).toString());
        
//            JOptionPane.showMessageDialog(null, "itemNo value" + itemNo);
        
        String sql = "SELECT * FROM BAZAR WHERE ITEM_NO = "+ itemNo +" AND TODAY_DATE = '" +date+ "'";
        
        try {
            
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            
//            JOptionPane.showMessageDialog(null, "Before Catch");
            
            if(rs.next()){
                jTextField_itemno.setText(Integer.toString(rs.getInt("ITEM_NO")));
                jTextField_itemname.setText(rs.getString("ITEM_NAME"));
                jTextField_quantity.setText(Integer.toString(rs.getInt("QUANTITY")));
                jTextField_price.setText(Integer.toString(rs.getInt("PRICE")));
                
//                JOptionPane.showMessageDialog(null, "Added to TextField!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error loading");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            String sql = "SELECT * FROM BAZAR";
            st2 = connection.prepareStatement(sql);
            rs = st2.executeQuery();
            Bazar_table bt = new Bazar_table(rs, userId);
            bt.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Bazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bazar().setVisible(true);
            }
        });
    }
    
    
    private void setResultInTable(){
//        String sql = "SELECT ITEM_NO, ITEM_NAME, QUANTITY, PRICE FROM BAZAR WHERE TODAY_DATE = '" + date + "'";     
        String sql = "SELECT * FROM BAZAR WHERE TODAY_DATE = '" + date + "'";     
        
//        try {
//            st = connection.prepareStatement(sql);
//            rs = st.executeQuery();
//            
//            rs.next();
//            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
        
        FillTable(jTable1, sql);
        
    }
    
    
    public void FillTable(JTable table, String Query)
{
    try
    {
        st =  connection.createStatement();
        
        ResultSet rs = st.executeQuery(Query);

        //To remove previously added rows
        while(table.getRowCount() > 0) 
        {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();
        while(rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i);
            }
            ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
        }

        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_upadate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_itemname;
    private javax.swing.JTextField jTextField_itemno;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_quantity;
    // End of variables declaration//GEN-END:variables
}
