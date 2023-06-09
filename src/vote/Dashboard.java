/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vote;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sakib
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    boolean f;
    
    public Dashboard() {
        initComponents();
        DisplayElections();
    }
    public Dashboard(boolean flg) {
        initComponents();
        f=flg;
        
        DisplayElections();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ElectionTbl = new javax.swing.JTable();
        PhotoLbl1 = new javax.swing.JLabel();
        Namelbl3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PhotoLbl3 = new javax.swing.JLabel();
        PhotoLbl4 = new javax.swing.JLabel();
        PhotoLbl2 = new javax.swing.JLabel();
        Namelbl1 = new javax.swing.JLabel();
        Namelbl4 = new javax.swing.JLabel();
        Namelbl2 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(0, 255, 0));

        jPanel6.setBackground(new java.awt.Color(0, 51, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("    Online Election System ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("Winner of President");

        ElectionTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        ElectionTbl.setSelectionBackground(new java.awt.Color(0, 204, 204));
        ElectionTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ElectionTbl);

        PhotoLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhotoLbl1.setForeground(new java.awt.Color(255, 51, 0));

        Namelbl3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Namelbl3.setForeground(new java.awt.Color(0, 255, 0));
        Namelbl3.setText("Name of VP(Admin)");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 51));
        jLabel10.setText("Winner of GS");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 51));
        jLabel11.setText("Winner of VP(Office)");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 51));
        jLabel12.setText("Winner of VP(Admin)");

        PhotoLbl3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhotoLbl3.setForeground(new java.awt.Color(255, 51, 0));

        PhotoLbl4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhotoLbl4.setForeground(new java.awt.Color(255, 51, 0));

        PhotoLbl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhotoLbl2.setForeground(new java.awt.Color(255, 51, 0));

        Namelbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Namelbl1.setForeground(new java.awt.Color(0, 255, 0));
        Namelbl1.setText("Name of President");

        Namelbl4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Namelbl4.setForeground(new java.awt.Color(0, 255, 0));
        Namelbl4.setText("Name of VP(Office)");

        Namelbl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Namelbl2.setForeground(new java.awt.Color(0, 255, 0));
        Namelbl2.setText("Name Of GS");

        BackBtn.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        BackBtn.setText("BACK");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhotoLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(PhotoLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Namelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(Namelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Namelbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(Namelbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PhotoLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhotoLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(BackBtn)
                        .addGap(449, 449, 449))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PhotoLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhotoLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(PhotoLbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PhotoLbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Namelbl1)
                    .addComponent(Namelbl2)
                    .addComponent(Namelbl3)
                    .addComponent(Namelbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackBtn)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection conn =null ;
    PreparedStatement pst =null;
    ResultSet Rs=null;
    Statement St=null;
    private void DisplayElections(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St=conn.createStatement();
            Rs=St.executeQuery("Select * from ElectionTbl");
            ElectionTbl.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception ex){
            
        }
    }
    int WinnerId;
    
    private void GetWinner1(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St=conn.createStatement();
            String Q="Select CandidateId,Count(CandidateId) from VotesTbl where Designation ='President' and ElectionId="+Key+" Group BY CandidateId ORDER BY CandidateId DESC LIMIT 1";
            Rs=St.executeQuery(Q);
            while(Rs.next()){
                WinnerId=Rs.getInt(1);
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    private void  GetWinnerData1(){
        String q="Select Cphoto,Cname from CandidateTbl where CId="+WinnerId;
        Statement St;
        ResultSet Rs;
        
        try{
            Image img;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St=conn.createStatement();
            Rs=St.executeQuery(q);
            
            while(Rs.next()){
                photo=Rs.getBytes(1);
                img=getToolkit().createImage(photo);
                ImageIcon icon=new ImageIcon(img);
                PhotoLbl1.setIcon(icon);
                Namelbl1.setText(Rs.getString("Cname"));
            }
        }
        catch(Exception ex){
            
        }
    }
    private void GetWinner2(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St=conn.createStatement();
            String Q="Select CandidateId,Count(CandidateId) from VotesTbl where Designation ='General Secretary' and ElectionId="+Key+" Group BY CandidateId ORDER BY CandidateId DESC LIMIT 1";
            Rs=St.executeQuery(Q);
            while(Rs.next()){
                WinnerId=Rs.getInt(1);
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    private void  GetWinnerData2(){
        String q="Select Cphoto,Cname from CandidateTbl where CId="+WinnerId;
        Statement St;
        ResultSet Rs;
        
        try{
            Image img;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St=conn.createStatement();
            Rs=St.executeQuery(q);
            
            while(Rs.next()){
                photo=Rs.getBytes(1);
                img=getToolkit().createImage(photo);
                ImageIcon icon=new ImageIcon(img);
                PhotoLbl2.setIcon(icon);
                Namelbl2.setText(Rs.getString("Cname"));
            }
        }
        catch(Exception ex){
            
        }
    }
    private void GetWinner3(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St=conn.createStatement();
            String Q="Select CandidateId,Count(CandidateId) from VotesTbl where Designation ='Vice-President(Admin)' and ElectionId="+Key+" Group BY CandidateId ORDER BY CandidateId DESC LIMIT 1";
            Rs=St.executeQuery(Q);
            while(Rs.next()){
                WinnerId=Rs.getInt(1);
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    private void  GetWinnerData3(){
        String q="Select Cphoto,Cname from CandidateTbl where CId="+WinnerId;
        Statement St;
        ResultSet Rs;
        
        try{
            Image img;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St=conn.createStatement();
            Rs=St.executeQuery(q);
            
            while(Rs.next()){
                photo=Rs.getBytes(1);
                img=getToolkit().createImage(photo);
                ImageIcon icon=new ImageIcon(img);
                PhotoLbl3.setIcon(icon);
                Namelbl3.setText(Rs.getString("Cname"));
            }
        }
        catch(Exception ex){
            
        }
    }
    private void GetWinner4(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St=conn.createStatement();
            String Q="Select CandidateId,Count(CandidateId) from VotesTbl where Designation ='Vice-President(Office)' and ElectionId="+Key+" Group BY CandidateId ORDER BY CandidateId DESC LIMIT 1";
            Rs=St.executeQuery(Q);
            while(Rs.next()){
                WinnerId=Rs.getInt(1);
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    private void  GetWinnerData4(){
        String q="Select Cphoto,Cname from CandidateTbl where CId="+WinnerId;
        Statement St;
        ResultSet Rs;
        
        try{
            Image img;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electiondb","root","");
            St=conn.createStatement();
            Rs=St.executeQuery(q);
            
            while(Rs.next()){
                photo=Rs.getBytes(1);
                img=getToolkit().createImage(photo);
                ImageIcon icon=new ImageIcon(img);
                PhotoLbl4.setIcon(icon);
                Namelbl4.setText(Rs.getString("Cname"));
            }
        }
        catch(Exception ex){
            
        }
    }
    int Key=-1;
    
    private void ElectionTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionTblMouseClicked
        DefaultTableModel model =(DefaultTableModel)ElectionTbl.getModel();
        int MyIndex=ElectionTbl.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString() );
        
        GetWinner1();
        GetWinnerData1();
        GetWinner2();
        GetWinnerData2();
        GetWinner3();
        GetWinnerData3();
        GetWinner4();
        GetWinnerData4();

    }//GEN-LAST:event_ElectionTblMouseClicked

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // TODO add your handling code here:
        new MainMenu(f).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTable ElectionTbl;
    private javax.swing.JLabel Namelbl1;
    private javax.swing.JLabel Namelbl2;
    private javax.swing.JLabel Namelbl3;
    private javax.swing.JLabel Namelbl4;
    private javax.swing.JLabel PhotoLbl1;
    private javax.swing.JLabel PhotoLbl2;
    private javax.swing.JLabel PhotoLbl3;
    private javax.swing.JLabel PhotoLbl4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
byte[] photo =null;
String filename=null;

}
