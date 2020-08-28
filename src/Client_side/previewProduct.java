package Client_side;

import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author descifrado
 */
public class previewProduct extends javax.swing.JFrame 
{
    private final Socket client;
    private final String user_name;
    private String prod_id;
    private DataInputStream dis;
    private DataOutputStream dos;
    private DefaultComboBoxModel model;

    /**
     * Creates new form previewProduct
     */
    public previewProduct(Socket client, String user_name, String prod_id) throws IOException 
    {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int sht=(int)tk.getScreenSize().getHeight();
        int swd=(int)tk.getScreenSize().getWidth();
        int ht=500;
        int wd=900;
        int x=swd-wd;
        int y=sht-ht;
        this.setBounds(x/2, y/2, wd, ht+50);
        this.setResizable(false);
        this.setTitle("SACRED BAZAR: FIRST PAGE");   
        this.client=client;
        this.user_name=user_name;
        this.prod_id=prod_id;
        dos=new DataOutputStream(client.getOutputStream());
        dis=new DataInputStream(client.getInputStream());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LOGOLabel = new javax.swing.JLabel();
        TITLELabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UNCB = new javax.swing.JComboBox();
        MDetailsLabel = new javax.swing.JLabel();
        PNTF = new javax.swing.JTextField();
        MDLabel = new javax.swing.JLabel();
        PITF = new javax.swing.JTextField();
        PDLabel = new javax.swing.JLabel();
        OCLabel = new javax.swing.JLabel();
        BNTF = new javax.swing.JTextField();
        MVLabel = new javax.swing.JLabel();
        QLabel = new javax.swing.JLabel();
        ODLabel = new javax.swing.JLabel();
        PRLabel = new javax.swing.JLabel();
        OCTF = new javax.swing.JTextField();
        OVTF = new javax.swing.JTextField();
        PILabel = new javax.swing.JLabel();
        CATTF = new javax.swing.JTextField();
        EDTF = new javax.swing.JTextField();
        PRTF = new javax.swing.JTextField();
        CATLabel = new javax.swing.JLabel();
        EDLabel = new javax.swing.JLabel();
        BNLabel = new javax.swing.JLabel();
        ODTF = new javax.swing.JTextField();
        QTF = new javax.swing.JTextField();
        MDTF = new javax.swing.JTextField();
        PNLabel = new javax.swing.JLabel();
        MDTSP = new javax.swing.JScrollPane();
        MDTA = new javax.swing.JTextArea();
        PDTSB = new javax.swing.JScrollPane();
        PDTA = new javax.swing.JTextArea();
        ATCBT = new javax.swing.JButton();
        BACKBT = new javax.swing.JButton();
        ALLBT = new javax.swing.JButton();
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
        LOGOLabel.setBounds(20, 10, 60, 60);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        TITLELabel.setText("PRODUCT INFO...");
        jPanel1.add(TITLELabel);
        TITLELabel.setBounds(100, 20, 320, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SIGNED IN AS:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(560, 30, 110, 20);

        UNCB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UNCB.setModel(new DefaultComboBoxModel());
        UNCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNCBActionPerformed(evt);
            }
        });
        jPanel1.add(UNCB);
        UNCB.setBounds(700, 20, 180, 40);

        MDetailsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MDetailsLabel.setText("MANUFACTURER DETAILS");
        jPanel1.add(MDetailsLabel);
        MDetailsLabel.setBounds(470, 290, 160, 15);

        PNTF.setEditable(false);
        PNTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(PNTF);
        PNTF.setBounds(180, 130, 230, 30);

        MDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MDLabel.setText("MANUFACTURING DATE");
        jPanel1.add(MDLabel);
        MDLabel.setBounds(470, 135, 140, 20);

        PITF.setEditable(false);
        PITF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(PITF);
        PITF.setBounds(180, 80, 230, 30);

        PDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PDLabel.setText("PRODUCT DETAILS");
        jPanel1.add(PDLabel);
        PDLabel.setBounds(20, 290, 120, 15);

        OCLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OCLabel.setText("OFFER CODE");
        jPanel1.add(OCLabel);
        OCLabel.setBounds(20, 430, 90, 15);

        BNTF.setEditable(false);
        BNTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(BNTF);
        BNTF.setBounds(180, 180, 230, 30);

        MVLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MVLabel.setText("OFFER VALIDITY");
        jPanel1.add(MVLabel);
        MVLabel.setBounds(640, 430, 110, 15);

        QLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        QLabel.setText("QUANTITY Available");
        jPanel1.add(QLabel);
        QLabel.setBounds(470, 240, 120, 15);

        ODLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ODLabel.setText("OFFER DESCRIPTION");
        jPanel1.add(ODLabel);
        ODLabel.setBounds(270, 430, 130, 15);

        PRLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PRLabel.setText("PRICE");
        jPanel1.add(PRLabel);
        PRLabel.setBounds(470, 90, 80, 15);

        OCTF.setEditable(false);
        OCTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(OCTF);
        OCTF.setBounds(110, 420, 120, 30);

        OVTF.setEditable(false);
        OVTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(OVTF);
        OVTF.setBounds(760, 420, 120, 30);

        PILabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PILabel.setText("PRODUCT ID");
        jPanel1.add(PILabel);
        PILabel.setBounds(20, 90, 80, 15);

        CATTF.setEditable(false);
        CATTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(CATTF);
        CATTF.setBounds(180, 230, 230, 30);

        EDTF.setEditable(false);
        EDTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(EDTF);
        EDTF.setBounds(650, 180, 230, 30);

        PRTF.setEditable(false);
        PRTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(PRTF);
        PRTF.setBounds(650, 80, 230, 30);

        CATLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CATLabel.setText("CATEGORY");
        jPanel1.add(CATLabel);
        CATLabel.setBounds(20, 240, 80, 15);

        EDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EDLabel.setText("EXPIRY DATE");
        jPanel1.add(EDLabel);
        EDLabel.setBounds(470, 190, 80, 15);

        BNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BNLabel.setText("BRAND NAME");
        jPanel1.add(BNLabel);
        BNLabel.setBounds(20, 190, 90, 15);

        ODTF.setEditable(false);
        ODTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(ODTF);
        ODTF.setBounds(410, 420, 200, 30);

        QTF.setEditable(false);
        QTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(QTF);
        QTF.setBounds(650, 230, 230, 30);

        MDTF.setEditable(false);
        MDTF.setBackground(new java.awt.Color(228, 230, 245));
        jPanel1.add(MDTF);
        MDTF.setBounds(650, 130, 230, 30);

        PNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PNLabel.setText("PRODUCT NAME");
        jPanel1.add(PNLabel);
        PNLabel.setBounds(20, 140, 100, 15);

        MDTA.setEditable(false);
        MDTA.setBackground(new java.awt.Color(228, 230, 245));
        MDTA.setColumns(20);
        MDTA.setRows(5);
        MDTSP.setViewportView(MDTA);

        jPanel1.add(MDTSP);
        MDTSP.setBounds(650, 280, 230, 120);

        PDTSB.setBackground(new java.awt.Color(215, 218, 243));

        PDTA.setEditable(false);
        PDTA.setBackground(new java.awt.Color(228, 230, 245));
        PDTA.setColumns(20);
        PDTA.setRows(5);
        PDTSB.setViewportView(PDTA);

        jPanel1.add(PDTSB);
        PDTSB.setBounds(180, 280, 230, 120);

        ATCBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ATCBT.setText("ADD TO CART");
        ATCBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATCBTActionPerformed(evt);
            }
        });
        jPanel1.add(ATCBT);
        ATCBT.setBounds(20, 480, 140, 30);

        BACKBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BACKBT.setText("HOME");
        BACKBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTActionPerformed(evt);
            }
        });
        jPanel1.add(BACKBT);
        BACKBT.setBounds(410, 480, 90, 30);

        ALLBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ALLBT.setText("ALL PRODUCTS");
        ALLBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALLBTActionPerformed(evt);
            }
        });
        jPanel1.add(ALLBT);
        ALLBT.setBounds(723, 480, 150, 30);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        jPanel1.add(BGLabel);
        BGLabel.setBounds(0, 0, 900, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UNCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNCBActionPerformed
        // TODO add your handling code here:
         String select=(String)model.getSelectedItem();
        if(select.equals("Profile"))
        {
            try 
            {
                new cust_profile(client, user_name).show();
            }
            catch (IOException ex) 
            {
                System.out.println(ex.getMessage());
                Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        if(select.equals("My Cart"))
        {
            new my_cart(client,user_name).show();
            this.dispose();
        }
        if(select.equals("My Orders"))
        {
            new my_orders(client,user_name).show();
            this.dispose();
        }
        if(select.equals("Log out"))
        {
            int i=JOptionPane.showConfirmDialog(this,"Are You Sure You Want To Log out?",null,JOptionPane.YES_NO_OPTION);
            if(i==0)
            {    
                try 
                {
                    String request="Log_out";
                    dos.writeUTF(request);
                    String response=dis.readUTF();
                    if(response.equals("done"))
                    {
                        JOptionPane.showMessageDialog(this, "Successfully Logged Out");
                        new MainPage().show();
                        this.dispose();
                    }
                }
                catch (IOException ex) 
                {
                    System.out.println("Client Error"+ex.getMessage());
                    Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           
        }
    }//GEN-LAST:event_UNCBActionPerformed

    private void BACKBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBTActionPerformed
        try 
        {
            // TODO add your handling code here:
            new first_page(client, user_name).show();
            this.dispose();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(previewProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BACKBTActionPerformed

    private void ALLBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALLBTActionPerformed
        try 
        {
            // TODO add your handling code here:
            new All_Products(client, user_name).show();
            this.dispose();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(previewProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ALLBTActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        model=(DefaultComboBoxModel)UNCB.getModel();
        System.out.println(user_name);
        model.addElement(user_name);
        model.addElement("Profile");
        model.addElement("My Cart");
        model.addElement("My Orders");
        model.addElement("Log out");
        
       
        try 
        {
            String request="PDet"+prod_id;
            dos.writeUTF(request);
            String response=dis.readUTF();
            String data[]=response.split("`");
            
            String pi=data[0];
            String pn=data[1];
            String bn=data[2];
            String cat=data[3];
            String pr=data[4];
            String pd=data[5];
            String md=data[6];
            String ed=data[7];
            String mdet=data[8];
            String q=data[9];
            String oc=data[10];
            String od=data[11];
            String ov=data[12];
            
            PITF.setText(pi);
            PNTF.setText(pn);
            BNTF.setText(bn);
            CATTF.setText(cat);
            PRTF.setText(pr);
            MDTF.setText(md);
            EDTF.setText(ed);
            QTF.setText(q);
            OCTF.setText(oc);
            ODTF.setText(od);
            OVTF.setText(ov);
            String MD="";
            int l=mdet.length();
            for(int i=0;i<l;i++)
            {
                if(mdet.charAt(i)=='~')
                    MD+='\n';
                else
                    MD+=mdet.charAt(i);
            }
            String PD="";
            int l1=pd.length();
            for(int i=0;i<l1;i++)
            {
                if(pd.charAt(i)=='~')
                    PD+='\n';
                else
                    PD+=pd.charAt(i);
            }
            PDTA.setText(PD);
            MDTA.setText(MD);
        }
        catch (IOException ex) 
        {
            Logger.getLogger(previewProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void ATCBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATCBTActionPerformed
        String quantity=JOptionPane.showInputDialog(this,"Enter The Quantity Required");
        int q1=Integer.parseInt(quantity);
        int q2=Integer.parseInt(QTF.getText());
        if(q1>q2)
            JOptionPane.showMessageDialog(this,"Not Available in that quantity");
        else
        {
            try
            {
                // TODO add your handling code here:
                String request="AddCart";
                dos.writeUTF(request);
                dos.writeUTF(prod_id);
                dos.writeUTF(PNTF.getText());
                dos.writeUTF(PRTF.getText());
                dos.writeUTF(quantity);
                String response=dis.readUTF();
                if(response.equals("done"))
                {
                    JOptionPane.showMessageDialog(this,"Product "+prod_id+" Added To cart");
                    new my_cart(client, user_name).show();
                    this.dispose();
                }
                                
            }
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                Logger.getLogger(previewProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_ATCBTActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALLBT;
    private javax.swing.JButton ATCBT;
    private javax.swing.JButton BACKBT;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JLabel BNLabel;
    private javax.swing.JTextField BNTF;
    private javax.swing.JLabel CATLabel;
    private javax.swing.JTextField CATTF;
    private javax.swing.JLabel EDLabel;
    private javax.swing.JTextField EDTF;
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
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JComboBox UNCB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
