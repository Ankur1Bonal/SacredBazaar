package Server_Side;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author descifrado
 */
public class PreviewTransaction extends javax.swing.JFrame 
{
    DefaultComboBoxModel model;
    DefaultTableModel tmodel;
    TableModel tm;
    int c,r;
    
    public PreviewTransaction() 
    {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int sht=(int)tk.getScreenSize().getHeight();
        int swd=(int)tk.getScreenSize().getWidth();
        int ht=500;
        int wd=900;
        int x=swd-wd;
        int y=sht-ht;
        this.setBounds(x/2, y/2, wd, ht+40);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LOGOLabel = new javax.swing.JLabel();
        TITLELabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        ADMINCB = new javax.swing.JComboBox();
        deleteBT = new javax.swing.JButton();
        backBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exitBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TRANT = new javax.swing.JTable();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        LOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO_smaller.jpg"))); // NOI18N
        jPanel1.add(LOGOLabel);
        LOGOLabel.setBounds(50, 10, 70, 70);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        TITLELabel.setText("WELCOME ADMIN");
        jPanel1.add(TITLELabel);
        TITLELabel.setBounds(130, 30, 280, 36);

        StatusLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StatusLabel.setText("Signed In As");
        jPanel1.add(StatusLabel);
        StatusLabel.setBounds(490, 40, 130, 20);

        ADMINCB.setBackground(new java.awt.Color(204, 204, 255));
        ADMINCB.setModel(new DefaultComboBoxModel());
        ADMINCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMINCBMouseClicked(evt);
            }
        });
        ADMINCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINCBActionPerformed(evt);
            }
        });
        jPanel1.add(ADMINCB);
        ADMINCB.setBounds(640, 30, 200, 30);

        deleteBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteBT.setText("DELETE SELECTED TRANSACTION");
        deleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBT);
        deleteBT.setBounds(50, 420, 290, 40);

        backBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBT.setText("BACK");
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });
        jPanel1.add(backBT);
        backBT.setBounds(550, 420, 100, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("SELECT TRANACTION ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 390, 150, 20);

        exitBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitBT.setText("EXIT");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        jPanel1.add(exitBT);
        exitBT.setBounds(740, 420, 100, 40);

        TRANT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRANSACTION ID", "USER NAME", "FULL NAME", "TRANSACTION DATE", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TRANT.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TRANT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRANTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TRANT);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 110, 790, 250);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        jPanel1.add(BGLabel);
        BGLabel.setBounds(0, 0, 900, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADMINCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINCBMouseClicked

    }//GEN-LAST:event_ADMINCBMouseClicked

    private void ADMINCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINCBActionPerformed
        // TODO add your handling code here:
        String select=(String)model.getSelectedItem();
        if(select.equals("log_out"))
        {
            model.setSelectedItem("descifrado(Admin)");
            JOptionPane.showMessageDialog(this,"Successfully logged out");
            new adminLogin().show();
            this.dispose();
        }
    }//GEN-LAST:event_ADMINCBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        model=(DefaultComboBoxModel) ADMINCB.getModel();
        model.addElement("descifrado(Admin)");
        model.addElement("log_out");
        tmodel=(DefaultTableModel) TRANT.getModel();
        tm=TRANT.getModel();
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String query="Select * from TRANSACTION;";
            ResultSet rs=stmt.executeQuery(query);
            for(int i=0;i<tmodel.getRowCount();i++)
            {
                tmodel.removeRow(i);
            }
            while(rs.next())
            {
                String ti=rs.getString("TRANSACT_ID");
                String un=rs.getString("USER_NAME");
                String fn=rs.getString("FULL_NAME");
                String td=rs.getString("TRANSACT_DATE");
                String am=rs.getString("AMOUNT");
                tmodel.addRow(new Object[]{ti,un,fn,td,am} );
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Log Out Successfully");
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        // TODO add your handling code here:
        new adminPage().show();
        this.dispose();
    }//GEN-LAST:event_backBTActionPerformed

    private void deleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTActionPerformed
        // TODO add your handling code here:
        String ti=(String) tmodel.getValueAt(r, c);
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String q="Delete from TRANSACTION where TRANSACT_ID='"+(ti)+"';";
            int i=JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this TRANSACTION",null ,JOptionPane.YES_NO_OPTION);
            if(i==0)
            {
                stmt.executeUpdate(q);
                JOptionPane.showMessageDialog(this,"TRANSACTION "+ti+" Deleted Successfully");
                String query="Select * from TRANSACTION;";
                ResultSet rs=stmt.executeQuery(query);
                for(int j=0;j<tmodel.getRowCount();j++)
                {
                    tmodel.removeRow(j);
                }
                while(rs.next())
                {
                    ti=rs.getString("TRANSACT_ID");
                    String un=rs.getString("USER_NAME");
                    String fn=rs.getString("FULL_NAME");
                    String td=rs.getString("TRANSACT_DATE");
                    String am=rs.getString("AMOUNT");
                    tmodel.addRow(new Object[]{ti,un,fn,td,am} );
                }
            }
            if(i==1)
            {
                JOptionPane.showMessageDialog(this,"DLETION ABORTED");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_deleteBTActionPerformed

    private void TRANTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRANTMouseClicked
        // TODO add your handling code here:
        c=TRANT.getSelectedColumn();
        r=TRANT.getSelectedRow();   
    }//GEN-LAST:event_TRANTMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ADMINCB;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JTable TRANT;
    private javax.swing.JButton backBT;
    private javax.swing.JButton deleteBT;
    private javax.swing.JButton exitBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
