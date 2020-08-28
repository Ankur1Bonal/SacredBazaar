package Server_Side;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author descifrado
 */
public class UpdateCustomer extends javax.swing.JFrame
{
    DefaultComboBoxModel model,model2;
    

    public UpdateCustomer() 
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
        UNLabel = new javax.swing.JLabel();
        DCBT = new javax.swing.JButton();
        BACKBT = new javax.swing.JButton();
        EXITBT = new javax.swing.JButton();
        UNCB = new javax.swing.JComboBox();
        FNLabel = new javax.swing.JLabel();
        FNTF = new javax.swing.JTextField();
        OCLabel = new javax.swing.JLabel();
        OCTF = new javax.swing.JTextField();
        ODLabel = new javax.swing.JLabel();
        ODTF = new javax.swing.JTextField();
        OVLabel = new javax.swing.JLabel();
        OVTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        LOGOLabel.setBounds(70, 10, 70, 70);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        TITLELabel.setText("WELCOME ADMIN");
        jPanel1.add(TITLELabel);
        TITLELabel.setBounds(150, 30, 280, 36);

        StatusLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StatusLabel.setText("Signed In As");
        jPanel1.add(StatusLabel);
        StatusLabel.setBounds(490, 40, 130, 20);

        ADMINCB.setBackground(new java.awt.Color(204, 204, 255));
        ADMINCB.setModel(new DefaultComboBoxModel());
        ADMINCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINCBActionPerformed(evt);
            }
        });
        jPanel1.add(ADMINCB);
        ADMINCB.setBounds(630, 30, 200, 30);

        UNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UNLabel.setText("Enter Or Select User Name");
        jPanel1.add(UNLabel);
        UNLabel.setBounds(70, 120, 160, 20);

        DCBT.setBackground(new java.awt.Color(204, 204, 255));
        DCBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DCBT.setText("UPDATE CUSTOMER");
        DCBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DCBTActionPerformed(evt);
            }
        });
        jPanel1.add(DCBT);
        DCBT.setBounds(70, 300, 160, 40);

        BACKBT.setBackground(new java.awt.Color(204, 204, 255));
        BACKBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BACKBT.setText("BACK");
        BACKBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTActionPerformed(evt);
            }
        });
        jPanel1.add(BACKBT);
        BACKBT.setBounds(70, 360, 160, 40);

        EXITBT.setBackground(new java.awt.Color(204, 204, 255));
        EXITBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EXITBT.setText("EXIT");
        EXITBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBTActionPerformed(evt);
            }
        });
        jPanel1.add(EXITBT);
        EXITBT.setBounds(70, 420, 160, 40);

        UNCB.setBackground(new java.awt.Color(215, 218, 243));
        UNCB.setModel(new DefaultComboBoxModel());
        UNCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNCBActionPerformed(evt);
            }
        });
        jPanel1.add(UNCB);
        UNCB.setBounds(70, 170, 160, 30);

        FNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FNLabel.setText("FULL NAME");
        jPanel1.add(FNLabel);
        FNLabel.setBounds(490, 170, 70, 20);

        FNTF.setEditable(false);
        FNTF.setBackground(new java.awt.Color(215, 218, 243));
        jPanel1.add(FNTF);
        FNTF.setBounds(660, 160, 160, 30);

        OCLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OCLabel.setText("OFFER CODE");
        jPanel1.add(OCLabel);
        OCLabel.setBounds(490, 240, 80, 15);

        OCTF.setBackground(new java.awt.Color(215, 218, 243));
        jPanel1.add(OCTF);
        OCTF.setBounds(660, 230, 160, 30);

        ODLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ODLabel.setText("OFFER DESCRIPTION");
        jPanel1.add(ODLabel);
        ODLabel.setBounds(490, 310, 130, 20);

        ODTF.setBackground(new java.awt.Color(215, 218, 243));
        jPanel1.add(ODTF);
        ODTF.setBounds(660, 300, 160, 30);

        OVLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OVLabel.setText("OFFER VALIDITY");
        jPanel1.add(OVLabel);
        OVLabel.setBounds(490, 380, 98, 15);

        OVTF.setBackground(new java.awt.Color(215, 218, 243));
        jPanel1.add(OVTF);
        OVTF.setBounds(660, 370, 160, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Enter Offer Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(600, 100, 120, 20);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        jPanel1.add(BGLabel);
        BGLabel.setBounds(0, 0, 900, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        model=(DefaultComboBoxModel) ADMINCB.getModel();
        model.addElement("descifrado(Admin)");
        model.addElement("log_out");
        model2=(DefaultComboBoxModel) UNCB.getModel();
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String q1="select USER_NAME from CUSTOMERS;";
            ResultSet rs=stmt.executeQuery(q1);
            while(rs.next())
            {
                model2.addElement(rs.getString("USER_NAME"));
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void ADMINCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINCBActionPerformed
        // TODO add your handling code here:
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

    private void UNCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNCBActionPerformed
        // TODO add your handling code here:
        String user_name=(String) model2.getSelectedItem();
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String query="select FIRST_NAME,LAST_NAME from Customers where user_name='"+(user_name)+"';";
            ResultSet rs=stmt.executeQuery(query);
            rs.next();
            String fn=rs.getString("FIRST_NAME");
            String ln=rs.getString("LAST_NAME");
            FNTF.setText(fn+" "+ln);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
    }//GEN-LAST:event_UNCBActionPerformed

    private void DCBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DCBTActionPerformed
        // TODO add your handling code here:
        String user_name=(String)model2.getSelectedItem();
        String oc=OCTF.getText();
        String od=ODTF.getText();
        String ov=OVTF.getText();
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String query="Update CUSTOMERS set OFFER_CODE='"+(oc)+"',OFFER_DESC='"+(od)+"',OFFER_VALIDITY='"+(ov)+"';";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Record Successfully updated");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_DCBTActionPerformed

    private void BACKBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBTActionPerformed
        // TODO add your handling code here:
        new adminPage().show();
        this.dispose();
    }//GEN-LAST:event_BACKBTActionPerformed

    private void EXITBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBTActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Log Out Successful");
        System.exit(0);
    }//GEN-LAST:event_EXITBTActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ADMINCB;
    private javax.swing.JButton BACKBT;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton DCBT;
    private javax.swing.JButton EXITBT;
    private javax.swing.JLabel FNLabel;
    private javax.swing.JTextField FNTF;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JLabel OCLabel;
    private javax.swing.JTextField OCTF;
    private javax.swing.JLabel ODLabel;
    private javax.swing.JTextField ODTF;
    private javax.swing.JLabel OVLabel;
    private javax.swing.JTextField OVTF;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JComboBox UNCB;
    private javax.swing.JLabel UNLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
