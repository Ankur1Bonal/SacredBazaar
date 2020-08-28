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
 * @author descfirado
 */
public class DeleteProduct extends javax.swing.JFrame 
{
    DefaultComboBoxModel model,model2;
    
    public DeleteProduct() 
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
        PICMLabel = new javax.swing.JLabel();
        PICB = new javax.swing.JComboBox();
        PRDLabel = new javax.swing.JLabel();
        PNLabel = new javax.swing.JLabel();
        CATLabel = new javax.swing.JLabel();
        RLabel = new javax.swing.JLabel();
        QLabel = new javax.swing.JLabel();
        PDLabel = new javax.swing.JLabel();
        PNTF = new javax.swing.JTextField();
        CTF = new javax.swing.JTextField();
        PTF = new javax.swing.JTextField();
        QTF = new javax.swing.JTextField();
        DBT = new javax.swing.JButton();
        BBT = new javax.swing.JButton();
        EBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PDTA = new javax.swing.JTextArea();
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
        LOGOLabel.setBounds(60, 10, 70, 70);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        TITLELabel.setText("WELCOME ADMIN");
        jPanel1.add(TITLELabel);
        TITLELabel.setBounds(130, 30, 280, 36);

        StatusLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StatusLabel.setText("Signed In As");
        jPanel1.add(StatusLabel);
        StatusLabel.setBounds(460, 40, 130, 20);

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
        ADMINCB.setBounds(610, 30, 230, 30);

        PICMLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PICMLabel.setText("SELECT OR ENTER PRODUCT ID");
        jPanel1.add(PICMLabel);
        PICMLabel.setBounds(60, 100, 220, 20);

        PICB.setBackground(new java.awt.Color(228, 230, 245));
        PICB.setModel(new DefaultComboBoxModel());
        PICB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PICBActionPerformed(evt);
            }
        });
        jPanel1.add(PICB);
        PICB.setBounds(80, 150, 160, 30);

        PRDLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PRDLabel.setText("REVIEW PRODUCT DETAILS");
        jPanel1.add(PRDLabel);
        PRDLabel.setBounds(530, 100, 189, 17);

        PNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PNLabel.setText("PRODUCT NAME");
        jPanel1.add(PNLabel);
        PNLabel.setBounds(390, 150, 110, 20);

        CATLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CATLabel.setText("CATEGORY");
        jPanel1.add(CATLabel);
        CATLabel.setBounds(390, 200, 80, 20);

        RLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RLabel.setText("PRICE");
        jPanel1.add(RLabel);
        RLabel.setBounds(390, 260, 50, 15);

        QLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QLabel.setText("QUANTITY");
        jPanel1.add(QLabel);
        QLabel.setBounds(390, 310, 70, 15);

        PDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDLabel.setText("PRODUCT DESCRIPTION");
        jPanel1.add(PDLabel);
        PDLabel.setBounds(390, 360, 150, 20);

        PNTF.setEditable(false);
        PNTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(PNTF);
        PNTF.setBounds(610, 150, 230, 30);

        CTF.setEditable(false);
        CTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(CTF);
        CTF.setBounds(610, 200, 230, 30);

        PTF.setEditable(false);
        PTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(PTF);
        PTF.setBounds(610, 250, 230, 30);

        QTF.setEditable(false);
        QTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(QTF);
        QTF.setBounds(610, 300, 230, 30);

        DBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DBT.setText("DELETE PRODUCT");
        DBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBTActionPerformed(evt);
            }
        });
        jPanel1.add(DBT);
        DBT.setBounds(70, 300, 170, 40);

        BBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BBT.setText("BACK");
        BBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBTActionPerformed(evt);
            }
        });
        jPanel1.add(BBT);
        BBT.setBounds(70, 370, 170, 40);

        EBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EBT.setText("EXIT");
        EBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EBTActionPerformed(evt);
            }
        });
        jPanel1.add(EBT);
        EBT.setBounds(70, 440, 170, 40);

        PDTA.setEditable(false);
        PDTA.setBackground(new java.awt.Color(228, 230, 245));
        PDTA.setColumns(20);
        PDTA.setRows(5);
        jScrollPane1.setViewportView(PDTA);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(610, 350, 230, 130);

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
        model2=(DefaultComboBoxModel) PICB.getModel();
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String q1="select PROD_ID from INVENTORY;";
            ResultSet rs=stmt.executeQuery(q1);
            while(rs.next())
            {
                model2.addElement(rs.getString("PROD_ID"));
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

    private void BBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBTActionPerformed
        // TODO add your handling code here:
        new adminPage().show();
        this.dispose();
    }//GEN-LAST:event_BBTActionPerformed

    private void EBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EBTActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Log Out Successfully");
        System.exit(0);
    }//GEN-LAST:event_EBTActionPerformed

    private void DBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBTActionPerformed
        // TODO add your handling code here:
        try
        {
            String prod_id=(String)model2.getSelectedItem();
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String query="delete from INVENTORY where PROD_ID='"+(prod_id)+"';";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Product Successfully Deleted");
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_DBTActionPerformed

    private void PICBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PICBActionPerformed
        // TODO add your handling code here:
        String prod_id=(String) model2.getSelectedItem();
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            Statement stmt=con.createStatement();
            String query="select * from INVENTORY where PROD_ID='"+(prod_id)+"';";
            //System.out.println("hello");
            ResultSet rs=stmt.executeQuery(query);
            //System.out.println("chalo");
            rs.next();
            //System.out.println("mahalo");
            String pn=rs.getString("PRODUCT_NAME");
            String bn=rs.getString("BRAND_NAME");
            String c=rs.getString("CATEGORY");
            String p=rs.getString("PRICE");
            String q=rs.getString("QUANTITY");
            String pd=rs.getString("PROD_DESC");
            String P="";
            int l=pd.length();
            for(int i=0;i<l;i++)
            {
                if(pd.charAt(i)=='~')
                {
                    P+='\n';
                }
                else
                    P+=pd.charAt(i);
            }
            
            //System.out.println("Aloha");
            PNTF.setText(bn+" "+pn);
            CTF.setText(c);
            PTF.setText(p);
            QTF.setText(q);
            PDTA.setText(P);
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_PICBActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ADMINCB;
    private javax.swing.JButton BBT;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JLabel CATLabel;
    private javax.swing.JTextField CTF;
    private javax.swing.JButton DBT;
    private javax.swing.JButton EBT;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JLabel PDLabel;
    private javax.swing.JTextArea PDTA;
    private javax.swing.JComboBox PICB;
    private javax.swing.JLabel PICMLabel;
    private javax.swing.JLabel PNLabel;
    private javax.swing.JTextField PNTF;
    private javax.swing.JLabel PRDLabel;
    private javax.swing.JTextField PTF;
    private javax.swing.JLabel QLabel;
    private javax.swing.JTextField QTF;
    private javax.swing.JLabel RLabel;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
