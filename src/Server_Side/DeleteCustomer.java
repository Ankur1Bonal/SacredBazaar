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
public class DeleteCustomer extends javax.swing.JFrame 
{
    DefaultComboBoxModel model1, model2;

    public DeleteCustomer() 
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
        UNCB = new javax.swing.JComboBox();
        ADMINCB = new javax.swing.JComboBox();
        FNTF = new javax.swing.JTextField();
        GENDER = new javax.swing.JTextField();
        AGE = new javax.swing.JTextField();
        CN = new javax.swing.JTextField();
        EID = new javax.swing.JTextField();
        FNLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DCBT = new javax.swing.JButton();
        BACKBT = new javax.swing.JButton();
        EXITBT = new javax.swing.JButton();
        UNLabel = new javax.swing.JLabel();
        PDLabel = new javax.swing.JLabel();
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

        UNCB.setBackground(new java.awt.Color(215, 218, 243));
        UNCB.setModel(new DefaultComboBoxModel());
        UNCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNCBActionPerformed(evt);
            }
        });
        jPanel1.add(UNCB);
        UNCB.setBounds(70, 170, 160, 30);

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

        FNTF.setBackground(new java.awt.Color(215, 218, 243));
        jPanel1.add(FNTF);
        FNTF.setBounds(660, 180, 160, 30);

        GENDER.setBackground(new java.awt.Color(215, 218, 243));
        GENDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENDERActionPerformed(evt);
            }
        });
        jPanel1.add(GENDER);
        GENDER.setBounds(660, 240, 160, 30);

        AGE.setBackground(new java.awt.Color(215, 218, 243));
        jPanel1.add(AGE);
        AGE.setBounds(660, 300, 160, 30);

        CN.setBackground(new java.awt.Color(215, 218, 243));
        jPanel1.add(CN);
        CN.setBounds(660, 360, 160, 30);

        EID.setBackground(new java.awt.Color(215, 218, 243));
        jPanel1.add(EID);
        EID.setBounds(660, 420, 160, 30);

        FNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FNLabel.setText("FULL NAME");
        jPanel1.add(FNLabel);
        FNLabel.setBounds(440, 190, 80, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("GENDER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 250, 60, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("AGE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 310, 40, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CONTACT NUMBER");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(440, 370, 120, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("EMAIL ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 430, 60, 15);

        DCBT.setBackground(new java.awt.Color(204, 204, 255));
        DCBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DCBT.setText("DELETE CUSTOMER");
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

        UNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UNLabel.setText("Enter Or Select User Name");
        jPanel1.add(UNLabel);
        UNLabel.setBounds(70, 120, 160, 20);

        PDLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PDLabel.setText("PREVIEW DETAILS");
        jPanel1.add(PDLabel);
        PDLabel.setBounds(550, 120, 150, 17);

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
        String select=(String)model1.getSelectedItem();
        if(select.equals("log_out"))
        {
            model1.setSelectedItem("descifrado(Admin)");
            JOptionPane.showMessageDialog(this,"Successfully logged out");
            new adminLogin().show();
            this.dispose();
        }
    }//GEN-LAST:event_ADMINCBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        model1=(DefaultComboBoxModel)ADMINCB.getModel();
        model2=(DefaultComboBoxModel)UNCB.getModel();
        model1.addElement("descifrado(Admin)");
        model1.addElement("log_out");
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

    private void GENDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENDERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GENDERActionPerformed

    private void UNCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNCBActionPerformed
        // TODO add your handling code here:
        try
        {
            String user_name=(String)model2.getSelectedItem();
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String q="select * from CUSTOMERS where USER_NAME='"+(user_name)+"';";
            ResultSet rs=stmt.executeQuery(q);
            rs.next();
            String fn=rs.getString("FIRST_NAME");
            String ln=rs.getString("LAST_NAME");
            String g=rs.getString("GENDER");
            String a=rs.getString("AGE");
            String cn=rs.getString("CONTACT_NUMBER");
            String eid=rs.getString("EMAIL_ID");
            FNTF.setText(fn+" "+ln);
            GENDER.setText(g);
            CN.setText(cn);
            AGE.setText(a);
            EID.setText(eid);
            rs.close();
            stmt.close();
            con.close();
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_UNCBActionPerformed

    private void DCBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DCBTActionPerformed
        // TODO add your handling code here:
        String user_name=(String) model2.getSelectedItem();
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String q="Delete from CUSTOMERS where USER_NAME='"+(user_name)+"';";
            int i=JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this Customer",null ,JOptionPane.YES_NO_OPTION);
            if(i==0)
            {
               stmt.executeUpdate(q);
               JOptionPane.showMessageDialog(this,"Customer "+user_name+" Deleted Successfully");
               
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
    private javax.swing.JTextField AGE;
    private javax.swing.JButton BACKBT;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JTextField CN;
    private javax.swing.JButton DCBT;
    private javax.swing.JTextField EID;
    private javax.swing.JButton EXITBT;
    private javax.swing.JLabel FNLabel;
    private javax.swing.JTextField FNTF;
    private javax.swing.JTextField GENDER;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JLabel PDLabel;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JComboBox UNCB;
    private javax.swing.JLabel UNLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
