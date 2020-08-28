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
public class UpdateProducts extends javax.swing.JFrame 
{
    DefaultComboBoxModel model,model1;
    
    public UpdateProducts()
    {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int sht=(int)tk.getScreenSize().getHeight();
        int swd=(int)tk.getScreenSize().getWidth();
        int ht=540;
        int wd=950;
        int x=swd-wd;
        int y=sht-ht;
        this.setBounds(x/2, y/2, wd+10, ht+40);
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
        PICB = new javax.swing.JComboBox();
        DCBT = new javax.swing.JButton();
        BACKBT = new javax.swing.JButton();
        EXITBT = new javax.swing.JButton();
        PNLabel = new javax.swing.JLabel();
        PNTF = new javax.swing.JTextField();
        BNLabel = new javax.swing.JLabel();
        BNTF = new javax.swing.JTextField();
        CATLabel = new javax.swing.JLabel();
        CATTF = new javax.swing.JTextField();
        PRLabel = new javax.swing.JLabel();
        PRTF = new javax.swing.JTextField();
        PDLabel = new javax.swing.JLabel();
        PDTSB = new javax.swing.JScrollPane();
        PDTA = new javax.swing.JTextArea();
        MDLabel = new javax.swing.JLabel();
        MDTF = new javax.swing.JTextField();
        EDLabel = new javax.swing.JLabel();
        EDTF = new javax.swing.JTextField();
        MDetailsLabel = new javax.swing.JLabel();
        MDTSP = new javax.swing.JScrollPane();
        MDTA = new javax.swing.JTextArea();
        QLabel = new javax.swing.JLabel();
        QTF = new javax.swing.JTextField();
        OCLabel = new javax.swing.JLabel();
        OCTF = new javax.swing.JTextField();
        MVLabel = new javax.swing.JLabel();
        ODLabel = new javax.swing.JLabel();
        ODTF = new javax.swing.JTextField();
        OVTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        LOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO_smaller.jpg"))); // NOI18N
        jPanel1.add(LOGOLabel);
        LOGOLabel.setBounds(70, 10, 70, 50);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        TITLELabel.setText("WELCOME ADMIN");
        jPanel1.add(TITLELabel);
        TITLELabel.setBounds(160, 20, 280, 30);

        StatusLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StatusLabel.setText("Signed In As");
        jPanel1.add(StatusLabel);
        StatusLabel.setBounds(530, 30, 130, 20);

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
        ADMINCB.setBounds(690, 10, 200, 40);

        UNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UNLabel.setText("Enter Or Select Product ID");
        jPanel1.add(UNLabel);
        UNLabel.setBounds(20, 120, 170, 20);

        PICB.setBackground(new java.awt.Color(215, 218, 243));
        PICB.setModel(new DefaultComboBoxModel());
        PICB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PICBActionPerformed(evt);
            }
        });
        jPanel1.add(PICB);
        PICB.setBounds(20, 170, 160, 30);

        DCBT.setBackground(new java.awt.Color(204, 204, 255));
        DCBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DCBT.setText("UPDATE PRODUCT");
        DCBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DCBTActionPerformed(evt);
            }
        });
        jPanel1.add(DCBT);
        DCBT.setBounds(20, 310, 160, 40);

        BACKBT.setBackground(new java.awt.Color(204, 204, 255));
        BACKBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BACKBT.setText("BACK");
        BACKBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTActionPerformed(evt);
            }
        });
        jPanel1.add(BACKBT);
        BACKBT.setBounds(20, 390, 160, 40);

        EXITBT.setBackground(new java.awt.Color(204, 204, 255));
        EXITBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EXITBT.setText("EXIT");
        EXITBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBTActionPerformed(evt);
            }
        });
        jPanel1.add(EXITBT);
        EXITBT.setBounds(20, 470, 160, 40);

        PNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PNLabel.setText("PRODUCT NAME");
        jPanel1.add(PNLabel);
        PNLabel.setBounds(220, 110, 100, 15);

        PNTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(PNTF);
        PNTF.setBounds(360, 100, 170, 30);

        BNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BNLabel.setText("BRAND NAME");
        jPanel1.add(BNLabel);
        BNLabel.setBounds(220, 170, 90, 15);

        BNTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(BNTF);
        BNTF.setBounds(360, 160, 170, 30);

        CATLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CATLabel.setText("CATEGORY");
        jPanel1.add(CATLabel);
        CATLabel.setBounds(220, 220, 80, 20);

        CATTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(CATTF);
        CATTF.setBounds(360, 220, 170, 30);

        PRLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PRLabel.setText("PRICE");
        jPanel1.add(PRLabel);
        PRLabel.setBounds(590, 110, 80, 15);

        PRTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(PRTF);
        PRTF.setBounds(770, 100, 170, 30);

        PDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDLabel.setText("PRODUCT DETAILS");
        jPanel1.add(PDLabel);
        PDLabel.setBounds(220, 280, 120, 15);

        PDTSB.setBackground(new java.awt.Color(215, 218, 243));

        PDTA.setBackground(new java.awt.Color(228, 230, 245));
        PDTA.setColumns(20);
        PDTA.setRows(5);
        PDTSB.setViewportView(PDTA);

        jPanel1.add(PDTSB);
        PDTSB.setBounds(360, 270, 166, 120);

        MDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MDLabel.setText("MANUFACTURING DATE");
        jPanel1.add(MDLabel);
        MDLabel.setBounds(590, 160, 140, 20);

        MDTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(MDTF);
        MDTF.setBounds(770, 160, 170, 30);

        EDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EDLabel.setText("EXPIRY DATE");
        jPanel1.add(EDLabel);
        EDLabel.setBounds(590, 230, 80, 15);

        EDTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(EDTF);
        EDTF.setBounds(770, 220, 170, 30);

        MDetailsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MDetailsLabel.setText("MANUFACTURER DETAILS");
        jPanel1.add(MDetailsLabel);
        MDetailsLabel.setBounds(590, 280, 160, 15);

        MDTA.setBackground(new java.awt.Color(228, 230, 245));
        MDTA.setColumns(20);
        MDTA.setRows(5);
        MDTSP.setViewportView(MDTA);

        jPanel1.add(MDTSP);
        MDTSP.setBounds(770, 270, 166, 120);

        QLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QLabel.setText("QUANTITY");
        jPanel1.add(QLabel);
        QLabel.setBounds(590, 430, 90, 15);

        QTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(QTF);
        QTF.setBounds(770, 420, 170, 30);

        OCLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OCLabel.setText("OFFER CODE");
        jPanel1.add(OCLabel);
        OCLabel.setBounds(220, 430, 90, 15);

        OCTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(OCTF);
        OCTF.setBounds(360, 420, 170, 30);

        MVLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MVLabel.setText("OFFER VALIDITY");
        jPanel1.add(MVLabel);
        MVLabel.setBounds(590, 480, 110, 15);

        ODLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ODLabel.setText("OFFER DESCRIPTION");
        jPanel1.add(ODLabel);
        ODLabel.setBounds(220, 480, 130, 15);

        ODTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(ODTF);
        ODTF.setBounds(360, 470, 170, 30);

        OVTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(OVTF);
        OVTF.setBounds(770, 470, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
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

    private void PICBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PICBActionPerformed
        // TODO add your handling code here:
        try
        {
            String prod_id=(String)model1.getSelectedItem();
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String query="select * from INVENTORY where PROD_ID='"+(prod_id)+"';";
            ResultSet rs=stmt.executeQuery(query);
            rs.next();
            String pn=rs.getString("PRODUCT_NAME");     
            String bn=rs.getString("BRAND_NAME");
            String c=rs.getString("CATEGORY");
            String p=rs.getString("PRICE");
            String pd=rs.getString("PROD_DESC");
            String md=rs.getString("MANUF_DATE");
            String ed=rs.getString("EXP_DATE");
            String mdet=rs.getString("MANUF_DETAILS");
            String q=rs.getString("QUANTITY");
            String oc=rs.getString("OFFER_CODE");
            String od=rs.getString("OFFER_DESC");
            String ov=rs.getString("OFFER_VALIDITY");
            PNTF.setText(pn);
            BNTF.setText(bn);
            CATTF.setText(c);
            PRTF.setText(p);
            MDTF.setText(md);
            OCTF.setText(oc);
            ODTF.setText(od);
            OVTF.setText(ov);
            QTF.setText(q);
            EDTF.setText(ed);
            String M="",P="";
            int l=mdet.length();
            for(int i=0;i<l;i++)
            {
                if(mdet.charAt(i)=='~')
                    M+='\n';
                else
                    M+=mdet.charAt(i);
            }
            l=pd.length();
            for(int i=0;i<l;i++)
            {
                if(pd.charAt(i)=='~')
                    P+='\n';
                else
                    P+=pd.charAt(i);
            }
            PDTA.setText(P);
            MDTA.setText(M);
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_PICBActionPerformed

    private void DCBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DCBTActionPerformed
        // TODO add your handling code here:
        String prod_id=(String)model1.getSelectedItem();
        String pn=PNTF.getText();
        String bn=BNTF.getText();
        String cat=CATTF.getText();
        String pr=PRTF.getText();
        String md=MDTF.getText();
        String oc=OCTF.getText();
        String od=ODTF.getText();
        String ov=OVTF.getText();
        String q=QTF.getText();
        String ed=EDTF.getText();
        String mdet1=MDTA.getText();
        String pd1=PDTA.getText();
        String mdet="",pd="";
        int l=mdet1.length();
        for(int i=0;i<l;i++)
        {
            if(mdet1.charAt(i)=='\n')
            {
                mdet+='~';
            }
            else
                mdet+=mdet1.charAt(i);
        }
        l=pd1.length();
        for(int i=0;i<l;i++)
        {
            if(pd1.charAt(i)=='\n')
            {
                pd+='~';
            }
            else
                pd+=pd1.charAt(i);
        }
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String query="Update INVENTORY set PROD_NAME='"+pn+"',BRAND_NAME='"+bn+"',CATEGORY='"+cat+"',PRICE='"+pr+"',PROD_DESC='"+pd+"',MANUF_DATE='"+md+"',EXP_DATE='"+ed+"',MANUF_DETAILS='"+mdet+"',QUANTITY='"+q+"',OFFER_CODE='"+oc+"',OFFER_DESC='"+od+"',OFFER_VALIDITY='"+ov+"';";
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        model=(DefaultComboBoxModel) ADMINCB.getModel();
        model1=(DefaultComboBoxModel) PICB.getModel();
        model.addElement("descifrado(Admin)");
        model.addElement("log_out");
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String q1="select PROD_ID from INVENTORY;";
            ResultSet rs=stmt.executeQuery(q1);
            while(rs.next())
            {
                model1.addElement(rs.getString("PROD_ID"));
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

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ADMINCB;
    private javax.swing.JButton BACKBT;
    private javax.swing.JLabel BNLabel;
    private javax.swing.JTextField BNTF;
    private javax.swing.JLabel CATLabel;
    private javax.swing.JTextField CATTF;
    private javax.swing.JButton DCBT;
    private javax.swing.JLabel EDLabel;
    private javax.swing.JTextField EDTF;
    private javax.swing.JButton EXITBT;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JLabel MDLabel;
    private javax.swing.JTextArea MDTA;
    private javax.swing.JTextField MDTF;
    private javax.swing.JScrollPane MDTSP;
    private javax.swing.JLabel MDetailsLabel;
    private javax.swing.JLabel MVLabel;
    private javax.swing.JLabel OCLabel;
    private javax.swing.JTextField OCTF;
    private javax.swing.JLabel ODLabel;
    private javax.swing.JTextField ODTF;
    private javax.swing.JTextField OVTF;
    private javax.swing.JLabel PDLabel;
    private javax.swing.JTextArea PDTA;
    private javax.swing.JScrollPane PDTSB;
    private javax.swing.JComboBox PICB;
    private javax.swing.JLabel PNLabel;
    private javax.swing.JTextField PNTF;
    private javax.swing.JLabel PRLabel;
    private javax.swing.JTextField PRTF;
    private javax.swing.JLabel QLabel;
    private javax.swing.JTextField QTF;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JLabel UNLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
