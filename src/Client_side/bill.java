package Client_side;

import java.awt.Toolkit;
import java.awt.print.PrinterException;
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
public class bill extends javax.swing.JFrame 
{
    private DefaultComboBoxModel model;
    private final String user_name;
    private final Socket client;
    private DataInputStream dis;
    private DataOutputStream dos;
    private String bill;
    
    
    public bill(Socket client, String user_name ,String bill) 
    {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int sht=(int)tk.getScreenSize().getHeight();
        int swd=(int)tk.getScreenSize().getWidth();
        int ht=627;
        int wd=665;
        int x=swd-wd;
        int y=sht-ht;
        this.setBounds(x/2, y/2, wd, ht+30);
        this.setResizable(false);
        this.setTitle("SACRED BAZAR: FIRST PAGE");   
        this.client=client;
        this.user_name=user_name;
        this.bill=bill;
        try 
        {
            dis=new DataInputStream(client.getInputStream());
            dos=new DataOutputStream(client.getOutputStream());
        }
        catch (IOException ex) 
        {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        billTA.setText(bill);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        billTA = new javax.swing.JTextArea();
        TITLELabel = new javax.swing.JLabel();
        LOGOLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UNCB = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        billTA.setColumns(20);
        billTA.setRows(5);
        jScrollPane1.setViewportView(billTA);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 80, 600, 470);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        TITLELabel.setText("INVOICE");
        jPanel1.add(TITLELabel);
        TITLELabel.setBounds(110, 20, 200, 40);

        LOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO_smaller.jpg"))); // NOI18N
        jPanel1.add(LOGOLabel);
        LOGOLabel.setBounds(30, 10, 60, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SIGNED IN AS:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 30, 110, 20);

        UNCB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UNCB.setModel(new DefaultComboBoxModel());
        UNCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNCBActionPerformed(evt);
            }
        });
        jPanel1.add(UNCB);
        UNCB.setBounds(450, 20, 180, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("PRINT BILL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 570, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
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
        if(select.equals("Log Out"))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
        {
            // TODO add your handling code here:
            billTA.print();
        }
        catch (PrinterException ex) 
        {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        billTA.setText(bill);
        model=(DefaultComboBoxModel) UNCB.getModel();
        model.addElement(user_name);
        model.addElement("Profile");
        model.addElement("My Cart");
        model.addElement("My Orders");
        model.addElement("Log Out");
    }//GEN-LAST:event_formWindowOpened

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JComboBox UNCB;
    private javax.swing.JTextArea billTA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
