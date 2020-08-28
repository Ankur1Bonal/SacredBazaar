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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author descifrado
 */
public class first_page extends javax.swing.JFrame 
{
    private final Socket client;
    private final String user_name;
    private DefaultComboBoxModel model;
    private DataInputStream dis;
    private DataOutputStream dos;
    private DefaultTableModel tm;
    
    public first_page(Socket s, String user_name) throws IOException 
    {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int sht=(int)tk.getScreenSize().getHeight();
        int swd=(int)tk.getScreenSize().getWidth();
        int ht=500;
        int wd=900;
        int x=swd-wd;
        int y=sht-ht;
        this.setBounds(x/2, y/2, wd, ht+30);
        this.setResizable(false);
        this.setTitle("SACRED BAZAR: FIRST PAGE");   
        client=s;
        this.user_name=user_name;
        dis=new DataInputStream(client.getInputStream());
        dos=new DataOutputStream(client.getOutputStream());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPanel = new javax.swing.JPanel();
        LOGOLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TITLELabel = new javax.swing.JLabel();
        UNCB = new javax.swing.JComboBox();
        USEROFFERPanel = new javax.swing.JPanel();
        OCLabel = new javax.swing.JLabel();
        OCCLabel = new javax.swing.JLabel();
        OCCTF = new javax.swing.JTextField();
        ODCLB = new javax.swing.JLabel();
        ODCTF = new javax.swing.JTextField();
        OVCLB = new javax.swing.JLabel();
        OVCTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PRODUCTOFFERPanel = new javax.swing.JPanel();
        OPLB = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        POTabel = new javax.swing.JTable();
        POCBT = new javax.swing.JButton();
        SPNLB = new javax.swing.JLabel();
        MPBT = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BGPanel.setLayout(null);

        LOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO_smaller.jpg"))); // NOI18N
        BGPanel.add(LOGOLabel);
        LOGOLabel.setBounds(60, 10, 60, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SIGNED IN AS:");
        BGPanel.add(jLabel1);
        jLabel1.setBounds(520, 30, 110, 20);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        TITLELabel.setText("WELCOME");
        BGPanel.add(TITLELabel);
        TITLELabel.setBounds(140, 20, 200, 40);

        UNCB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UNCB.setModel(new DefaultComboBoxModel());
        UNCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNCBActionPerformed(evt);
            }
        });
        BGPanel.add(UNCB);
        UNCB.setBounds(650, 20, 180, 40);

        USEROFFERPanel.setBackground(new java.awt.Color(224, 226, 244));
        USEROFFERPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        OCLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OCLabel.setText("Exclusive Offers For You");

        OCCLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OCCLabel.setText("OFFER CODE");

        OCCTF.setEditable(false);
        OCCTF.setBackground(new java.awt.Color(228, 230, 245));

        ODCLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ODCLB.setText("OFFER DESCRIPTION");

        ODCTF.setEditable(false);
        ODCTF.setBackground(new java.awt.Color(228, 230, 245));

        OVCLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OVCLB.setText("OFFER VALIDITY");

        OVCTF.setEditable(false);
        OVCTF.setBackground(new java.awt.Color(228, 230, 245));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("USE THIS CODE TO GET DISCOUNT ON BILL");

        javax.swing.GroupLayout USEROFFERPanelLayout = new javax.swing.GroupLayout(USEROFFERPanel);
        USEROFFERPanel.setLayout(USEROFFERPanelLayout);
        USEROFFERPanelLayout.setHorizontalGroup(
            USEROFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USEROFFERPanelLayout.createSequentialGroup()
                .addGroup(USEROFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(USEROFFERPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(USEROFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OCCLabel)
                            .addComponent(ODCLB)
                            .addComponent(OVCLB))
                        .addGap(30, 30, 30)
                        .addGroup(USEROFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ODCTF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OCCTF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OVCTF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(USEROFFERPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(OCLabel))
                    .addGroup(USEROFFERPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        USEROFFERPanelLayout.setVerticalGroup(
            USEROFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USEROFFERPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(USEROFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OCCLabel)
                    .addComponent(OCCTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(USEROFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ODCLB)
                    .addComponent(ODCTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(USEROFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OVCLB)
                    .addComponent(OVCTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        BGPanel.add(USEROFFERPanel);
        USEROFFERPanel.setBounds(10, 90, 310, 300);

        PRODUCTOFFERPanel.setBackground(new java.awt.Color(224, 227, 244));
        PRODUCTOFFERPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        OPLB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OPLB.setText("Special Offers On Products");

        POTabel.setBackground(new java.awt.Color(224, 227, 244));
        POTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "OFFER CODE", "OFFER DESCRIPTION", "OFFER VALIDITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(POTabel);

        POCBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        POCBT.setText("CHECK OUT..");
        POCBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POCBTActionPerformed(evt);
            }
        });

        SPNLB.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        SPNLB.setText("SELECT PRODUCT NAME...");

        javax.swing.GroupLayout PRODUCTOFFERPanelLayout = new javax.swing.GroupLayout(PRODUCTOFFERPanel);
        PRODUCTOFFERPanel.setLayout(PRODUCTOFFERPanelLayout);
        PRODUCTOFFERPanelLayout.setHorizontalGroup(
            PRODUCTOFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
            .addGroup(PRODUCTOFFERPanelLayout.createSequentialGroup()
                .addGroup(PRODUCTOFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRODUCTOFFERPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SPNLB)
                        .addGap(67, 67, 67)
                        .addComponent(POCBT, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PRODUCTOFFERPanelLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(OPLB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PRODUCTOFFERPanelLayout.setVerticalGroup(
            PRODUCTOFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRODUCTOFFERPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OPLB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(PRODUCTOFFERPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(POCBT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPNLB))
                .addGap(29, 29, 29))
        );

        BGPanel.add(PRODUCTOFFERPanel);
        PRODUCTOFFERPanel.setBounds(330, 90, 560, 300);

        MPBT.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        MPBT.setText("EXPLORE MORE AT SACRED BAZAR");
        MPBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPBTActionPerformed(evt);
            }
        });
        BGPanel.add(MPBT);
        MPBT.setBounds(210, 420, 500, 40);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        BGPanel.add(BGLabel);
        BGLabel.setBounds(0, 0, 900, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        model=(DefaultComboBoxModel)UNCB.getModel();
        tm=(DefaultTableModel) POTabel.getModel();
        System.out.println(user_name);
        model.addElement(user_name);
        model.addElement("Profile");
        model.addElement("My Cart");
        model.addElement("My Orders");
        model.addElement("Log out");
        try 
        {
            // Getting Offer For The Current Customer
            String request="Offers For Customer";
            dos.writeUTF(request);//request sent
            String response=dis.readUTF();//response recieved
            String data[]=response.split("~");
            OCCTF.setText(data[0]);
            ODCTF.setText(data[1]);
            OVCTF.setText(data[2]);
            System.out.println("hello");
            
            //Getting All The Products With Offers Applicable
            request="Products With Offers";
            dos.writeUTF(request);//request sent
            response=dis.readUTF();//response recieved
            String data1[]=response.split("`");
            int l=data1.length;
            String Data[];
            for(int i=0;i<l;i++)
            {
                Data=data1[i].split("~");
                tm.addRow(new Object[] {Data[0],Data[1],Data[2],Data[3]});
            }
        }
        catch (IOException ex) 
        {
            Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code he
        
    }//GEN-LAST:event_formWindowClosed

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

    private void MPBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPBTActionPerformed
        try
        {
            new All_Products(client,user_name).show();
            this.dispose();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_MPBTActionPerformed

    private void POCBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POCBTActionPerformed
        // TODO add your handling code here:
        tm=(DefaultTableModel) POTabel.getModel();
        int c=0;
        int r=POTabel.getSelectedRow();
        String prod_id=(String) tm.getValueAt(r, c);
        try 
        {
            new previewProduct(client,user_name,prod_id).show();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(first_page.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_POCBTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JPanel BGPanel;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JButton MPBT;
    private javax.swing.JLabel OCCLabel;
    private javax.swing.JTextField OCCTF;
    private javax.swing.JLabel OCLabel;
    private javax.swing.JLabel ODCLB;
    private javax.swing.JTextField ODCTF;
    private javax.swing.JLabel OPLB;
    private javax.swing.JLabel OVCLB;
    private javax.swing.JTextField OVCTF;
    private javax.swing.JButton POCBT;
    private javax.swing.JTable POTabel;
    private javax.swing.JPanel PRODUCTOFFERPanel;
    private javax.swing.JLabel SPNLB;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JComboBox UNCB;
    private javax.swing.JPanel USEROFFERPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
