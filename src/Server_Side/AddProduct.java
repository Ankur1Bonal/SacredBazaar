package Server_Side;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author descifrado
 */
public class AddProduct extends javax.swing.JFrame 
{
    DefaultComboBoxModel model;

    public AddProduct() 
    {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int sht=(int)tk.getScreenSize().getHeight();
        int swd=(int)tk.getScreenSize().getWidth();
        int ht=550;
        int wd=900;
        int x=swd-wd;
        int y=sht-ht;
        this.setBounds(x/2, y/2, wd+10, ht+30);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PILabel = new javax.swing.JLabel();
        PITF = new javax.swing.JTextField();
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
        OVTF = new javax.swing.JTextField();
        ODLabel = new javax.swing.JLabel();
        ODTF = new javax.swing.JTextField();
        LOGOLabel = new javax.swing.JLabel();
        TITLELabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        ADMINCB = new javax.swing.JComboBox();
        INBT = new javax.swing.JButton();
        BACKBT = new javax.swing.JButton();
        EXITBT = new javax.swing.JButton();
        BGLABEL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        PILabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PILabel.setText("PRODUCT ID");
        jPanel1.add(PILabel);
        PILabel.setBounds(20, 90, 80, 15);

        PITF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(PITF);
        PITF.setBounds(180, 80, 230, 30);

        PNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PNLabel.setText("PRODUCT NAME");
        jPanel1.add(PNLabel);
        PNLabel.setBounds(20, 140, 100, 15);

        PNTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(PNTF);
        PNTF.setBounds(180, 130, 230, 30);

        BNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BNLabel.setText("BRAND NAME");
        jPanel1.add(BNLabel);
        BNLabel.setBounds(20, 190, 90, 15);

        BNTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(BNTF);
        BNTF.setBounds(180, 180, 230, 30);

        CATLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CATLabel.setText("CATEGORY");
        jPanel1.add(CATLabel);
        CATLabel.setBounds(20, 240, 80, 15);

        CATTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(CATTF);
        CATTF.setBounds(180, 230, 230, 30);

        PRLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PRLabel.setText("PRICE");
        jPanel1.add(PRLabel);
        PRLabel.setBounds(470, 90, 80, 15);

        PRTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(PRTF);
        PRTF.setBounds(650, 80, 230, 30);

        PDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDLabel.setText("PRODUCT DETAILS");
        jPanel1.add(PDLabel);
        PDLabel.setBounds(20, 290, 120, 15);

        PDTSB.setBackground(new java.awt.Color(215, 218, 243));

        PDTA.setBackground(new java.awt.Color(228, 230, 245));
        PDTA.setColumns(20);
        PDTA.setRows(5);
        PDTSB.setViewportView(PDTA);

        jPanel1.add(PDTSB);
        PDTSB.setBounds(180, 280, 230, 120);

        MDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MDLabel.setText("MANUFACTURING DATE");
        jPanel1.add(MDLabel);
        MDLabel.setBounds(470, 135, 140, 20);

        MDTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(MDTF);
        MDTF.setBounds(650, 130, 230, 30);

        EDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EDLabel.setText("EXPIRY DATE");
        jPanel1.add(EDLabel);
        EDLabel.setBounds(470, 190, 80, 15);

        EDTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(EDTF);
        EDTF.setBounds(650, 180, 230, 30);

        MDetailsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MDetailsLabel.setText("MANUFACTURER DETAILS");
        jPanel1.add(MDetailsLabel);
        MDetailsLabel.setBounds(470, 290, 160, 15);

        MDTA.setBackground(new java.awt.Color(228, 230, 245));
        MDTA.setColumns(20);
        MDTA.setRows(5);
        MDTSP.setViewportView(MDTA);

        jPanel1.add(MDTSP);
        MDTSP.setBounds(650, 280, 230, 120);

        QLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QLabel.setText("QUANTITY");
        jPanel1.add(QLabel);
        QLabel.setBounds(470, 240, 90, 15);

        QTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(QTF);
        QTF.setBounds(650, 230, 230, 30);

        OCLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OCLabel.setText("OFFER CODE");
        jPanel1.add(OCLabel);
        OCLabel.setBounds(20, 430, 90, 15);

        OCTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(OCTF);
        OCTF.setBounds(110, 420, 120, 30);

        MVLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MVLabel.setText("OFFER VALIDITY");
        jPanel1.add(MVLabel);
        MVLabel.setBounds(640, 430, 110, 15);

        OVTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(OVTF);
        OVTF.setBounds(760, 420, 120, 30);

        ODLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ODLabel.setText("OFFER DESCRIPTION");
        jPanel1.add(ODLabel);
        ODLabel.setBounds(270, 430, 130, 15);

        ODTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(ODTF);
        ODTF.setBounds(410, 420, 200, 30);

        LOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO_smaller.jpg"))); // NOI18N
        jPanel1.add(LOGOLabel);
        LOGOLabel.setBounds(20, 10, 60, 60);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        TITLELabel.setText("WELCOME ADMIN");
        jPanel1.add(TITLELabel);
        TITLELabel.setBounds(110, 20, 300, 36);

        StatusLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StatusLabel.setText("Signed In As");
        jPanel1.add(StatusLabel);
        StatusLabel.setBounds(480, 30, 130, 20);

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
        ADMINCB.setBounds(650, 20, 230, 30);

        INBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        INBT.setText("INSERT");
        INBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INBTActionPerformed(evt);
            }
        });
        jPanel1.add(INBT);
        INBT.setBounds(20, 480, 210, 40);

        BACKBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BACKBT.setText("BACK");
        BACKBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTActionPerformed(evt);
            }
        });
        jPanel1.add(BACKBT);
        BACKBT.setBounds(350, 480, 210, 40);

        EXITBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EXITBT.setText("EXIT");
        EXITBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBTActionPerformed(evt);
            }
        });
        jPanel1.add(EXITBT);
        EXITBT.setBounds(650, 480, 230, 40);

        BGLABEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        jPanel1.add(BGLABEL);
        BGLABEL.setBounds(0, 0, 900, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        model=(DefaultComboBoxModel) ADMINCB.getModel();
        model.addElement("descifrado(Admin)");
        model.addElement("log_out");
    }//GEN-LAST:event_formWindowOpened

    private void EXITBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBTActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Log Out Successfully");
        System.exit(0);
    }//GEN-LAST:event_EXITBTActionPerformed

    private void BACKBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBTActionPerformed
        // TODO add your handling code here:
        new adminPage().show();
        this.dispose();
    }//GEN-LAST:event_BACKBTActionPerformed

    private void INBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INBTActionPerformed
        // TODO add your handling code here:
        String pi=PITF.getText();
        String pn=PNTF.getText();
        String bn=BNTF.getText();
        String cat=CATTF.getText();
        String pr=PRTF.getText();
        String pd1=PDTA.getText();
        String md=MDTF.getText();
        String ed=EDTF.getText();
        String mdet1=MDTA.getText();
        String q=QTF.getText();
        String oc=OCTF.getText();
        String od=ODTF.getText();
        String ov=OVTF.getText();
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
            String query="insert into INVENTORY values('"+(pi)+"','"+(pn)+"','"+(bn)+"','"+(cat)+"','"+(pr)+"','"+(pd)+"','"+(md)+"','"+(ed)+"','"+(mdet)+"','"+(q)+"','"+(oc)+"','"+(od)+"','"+(ov)+"');";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Product Added Successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_INBTActionPerformed

    /**
     * '"+()+"',
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ADMINCB;
    private javax.swing.JButton BACKBT;
    private javax.swing.JLabel BGLABEL;
    private javax.swing.JLabel BNLabel;
    private javax.swing.JTextField BNTF;
    private javax.swing.JLabel CATLabel;
    private javax.swing.JTextField CATTF;
    private javax.swing.JLabel EDLabel;
    private javax.swing.JTextField EDTF;
    private javax.swing.JButton EXITBT;
    private javax.swing.JButton INBT;
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
    private javax.swing.JLabel PILabel;
    private javax.swing.JTextField PITF;
    private javax.swing.JLabel PNLabel;
    private javax.swing.JTextField PNTF;
    private javax.swing.JLabel PRLabel;
    private javax.swing.JTextField PRTF;
    private javax.swing.JLabel QLabel;
    private javax.swing.JTextField QTF;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
