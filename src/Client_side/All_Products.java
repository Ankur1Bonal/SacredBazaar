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
public class All_Products extends javax.swing.JFrame 
{
    private final Socket client;
    private final String user_name;
    private DataInputStream dis;
    private DataOutputStream dos;
    private DefaultComboBoxModel model; 
    private DefaultTableModel tm;
    

    /**
     * Creates new form All_Products
     */
    public All_Products(Socket client, String user_name) throws IOException 
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
        this.setTitle("SACRED BAZAR: All Products");   
        this.client=client;
        this.user_name=user_name;
        dis=new DataInputStream(client.getInputStream());
        dos=new DataOutputStream(client.getOutputStream());        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LOGOLabel = new javax.swing.JLabel();
        TITLELabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UNCB = new javax.swing.JComboBox();
        SBPBT = new javax.swing.JButton();
        SBCBT = new javax.swing.JButton();
        BKBT = new javax.swing.JButton();
        PPBT = new javax.swing.JButton();
        PPLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PT = new javax.swing.JTable();
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
        LOGOLabel.setBounds(50, 10, 60, 60);

        TITLELabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        TITLELabel.setText("ALL PRODUCTS");
        jPanel1.add(TITLELabel);
        TITLELabel.setBounds(150, 20, 290, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SIGNED IN AS:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(540, 30, 110, 20);

        UNCB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UNCB.setModel(new DefaultComboBoxModel());
        UNCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNCBActionPerformed(evt);
            }
        });
        jPanel1.add(UNCB);
        UNCB.setBounds(670, 20, 180, 40);

        SBPBT.setBackground(new java.awt.Color(204, 204, 255));
        SBPBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SBPBT.setText("SORT BY PRICE");
        SBPBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBPBTActionPerformed(evt);
            }
        });
        jPanel1.add(SBPBT);
        SBPBT.setBounds(40, 430, 160, 50);

        SBCBT.setBackground(new java.awt.Color(204, 204, 255));
        SBCBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SBCBT.setText("SORT BY CATEGORY");
        SBCBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBCBTActionPerformed(evt);
            }
        });
        jPanel1.add(SBCBT);
        SBCBT.setBounds(260, 430, 180, 50);

        BKBT.setBackground(new java.awt.Color(204, 204, 255));
        BKBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BKBT.setText("BACK");
        BKBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKBTActionPerformed(evt);
            }
        });
        jPanel1.add(BKBT);
        BKBT.setBounds(750, 430, 110, 50);

        PPBT.setBackground(new java.awt.Color(204, 204, 255));
        PPBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PPBT.setText("PREVIEW PRODUCT");
        PPBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPBTActionPerformed(evt);
            }
        });
        jPanel1.add(PPBT);
        PPBT.setBounds(510, 430, 180, 50);

        PPLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PPLabel.setText("Select Product Id Only");
        jPanel1.add(PPLabel);
        PPLabel.setBounds(540, 410, 130, 20);

        PT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "BRAND NAME", "CATEGORY", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PT);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 90, 820, 300);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        jPanel1.add(BGLabel);
        BGLabel.setBounds(0, 0, 900, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
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
        if(select.equals("MY Orders"))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        model=(DefaultComboBoxModel) UNCB.getModel();
        tm=(DefaultTableModel) PT.getModel();
        model.addElement(user_name);
        model.addElement("Profile");
        model.addElement("My Cart");
        model.addElement("My Orders");
        model.addElement("Log out");
        try
        {
            //Requesting Server To Give All The Products Order By Prod_name
            String request="All ProductsP";
            dos.writeUTF(request);//request Send
            String response=dis.readUTF();//response received
            System.out.println(response);
            
            String row[]=response.split("@");
            int l=row.length;
            for(int i=0;i<l;i++)
            {
                System.out.println(row[i]);
                String data[]=row[i].split("`");
                tm.addRow(new Object[]{data[0],data[1],data[2],data[3],data[4]});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Kyun??"+e.getMessage());
        }        
        
    }//GEN-LAST:event_formWindowOpened

    private void SBPBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBPBTActionPerformed
        
        // Removing Data From Table Before Inserting Again
        int c=tm.getRowCount();
        while(c>0)
        {
            tm.removeRow(c-1);
            c--;
        }
               
        try 
        {
            // TODO add your handling code here:
            //Requesting Server For All Products Sorted In Order Of Price
            
            String request="All ProductsM";
            dos.writeUTF(request);//request Send
            String response=dis.readUTF();//response received
            System.out.println(response);
            String row[]=response.split("@");
            int l=row.length;
            for(int i=0;i<l;i++)
            {
                System.out.println(row[i]);
                String data[]=row[i].split("`");
                System.out.println("In Display");
                tm.addRow(new Object[]{data[0],data[1],data[2],data[3],data[4]});
            }
            System.out.println("After Display");//Debugging
        } catch (IOException ex) {
            Logger.getLogger(All_Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_SBPBTActionPerformed

    private void SBCBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBCBTActionPerformed
        // TODO add your handling code here:
        //Removing Data From Table Before Insrting Again
        int c=tm.getRowCount();
        while(c>0)
        {
            tm.removeRow(c-1);
            c--;
        }
        try
        {
            //Requesting Server For Products Order By Category
            String request="All ProductsC";
            dos.writeUTF(request);//request Send
            String response=dis.readUTF();//response received
            System.out.println(response);
            
            String row[]=response.split("@");
            int l=row.length;
            for(int i=0;i<l;i++)
            {
                System.out.println(row[i]);
                String data[]=row[i].split("`");
                tm.addRow(new Object[]{data[0],data[1],data[2],data[3],data[4]});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Kyun??"+e.getMessage());
        }        
        
    }//GEN-LAST:event_SBCBTActionPerformed

    private void PPBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPBTActionPerformed
        // TODO add your handling code here:
        int r=PT.getSelectedRow();
        int c=0;
        String prod_id=(String) tm.getValueAt(r, c);
        try 
        {
            new previewProduct(client, user_name, prod_id).show();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(All_Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_PPBTActionPerformed

    private void BKBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKBTActionPerformed
        try
        {
            // TODO add your handling code here:
            new first_page(client, user_name).show();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(All_Products.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_BKBTActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton BKBT;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JButton PPBT;
    private javax.swing.JLabel PPLabel;
    private javax.swing.JTable PT;
    private javax.swing.JButton SBCBT;
    private javax.swing.JButton SBPBT;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JComboBox UNCB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
