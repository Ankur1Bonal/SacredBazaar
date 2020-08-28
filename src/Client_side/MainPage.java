package Client_side;

import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




/**
 *
 * @author descifrado
 */




public class MainPage extends javax.swing.JFrame 
{
    private String user_name="";
    private String pass="";
    private String ip="";
    private int port=0;
    private DataInputStream dis;
    private DataOutputStream dos;
    
        
    
    
    
    public MainPage() 
    {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int sht=(int)tk.getScreenSize().getHeight();
        int swd=(int)tk.getScreenSize().getWidth();
        int ht=460;
        int wd=800;
        int x=swd-wd;
        int y=sht-ht;
        this.setBounds(x/2, y/2, wd, ht);
        this.setTitle("SACRED BAZAR: MAIN PAGE");
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UIDLabel = new javax.swing.JLabel();
        UIDTF = new javax.swing.JTextField();
        LOGINBT = new javax.swing.JButton();
        PASSLabel = new javax.swing.JLabel();
        SUBT = new javax.swing.JButton();
        EXITBT = new javax.swing.JButton();
        PASSTF = new javax.swing.JPasswordField();
        SULabel = new javax.swing.JLabel();
        WelcomLabel = new javax.swing.JLabel();
        LOGOIMAGE = new javax.swing.JLabel();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        UIDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UIDLabel.setText("USER NAME");
        jPanel1.add(UIDLabel);
        UIDLabel.setBounds(450, 130, 80, 20);

        UIDTF.setBackground(new java.awt.Color(215, 218, 243));
        UIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIDTFActionPerformed(evt);
            }
        });
        jPanel1.add(UIDTF);
        UIDTF.setBounds(610, 120, 160, 30);

        LOGINBT.setBackground(new java.awt.Color(204, 204, 255));
        LOGINBT.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LOGINBT.setText("LOG IN");
        LOGINBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINBTActionPerformed(evt);
            }
        });
        jPanel1.add(LOGINBT);
        LOGINBT.setBounds(560, 260, 120, 40);

        PASSLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PASSLabel.setText("PASSWORD");
        jPanel1.add(PASSLabel);
        PASSLabel.setBounds(450, 190, 80, 20);

        SUBT.setBackground(new java.awt.Color(204, 204, 255));
        SUBT.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SUBT.setText("SIGN UP");
        SUBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBTActionPerformed(evt);
            }
        });
        jPanel1.add(SUBT);
        SUBT.setBounds(470, 370, 110, 40);

        EXITBT.setBackground(new java.awt.Color(204, 204, 255));
        EXITBT.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EXITBT.setText("EXIT");
        EXITBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBTActionPerformed(evt);
            }
        });
        jPanel1.add(EXITBT);
        EXITBT.setBounds(660, 370, 110, 40);

        PASSTF.setBackground(new java.awt.Color(215, 218, 243));
        jPanel1.add(PASSTF);
        PASSTF.setBounds(610, 180, 160, 30);

        SULabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SULabel.setText("Not A Member....?");
        jPanel1.add(SULabel);
        SULabel.setBounds(470, 340, 120, 20);

        WelcomLabel.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        WelcomLabel.setText("WELCOME");
        jPanel1.add(WelcomLabel);
        WelcomLabel.setBounds(490, 20, 260, 50);

        LOGOIMAGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Client_side/LOGO_BIG.png"))); // NOI18N
        jPanel1.add(LOGOIMAGE);
        LOGOIMAGE.setBounds(20, 20, 400, 390);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAckground.jpg"))); // NOI18N
        jPanel1.add(BGLabel);
        BGLabel.setBounds(0, 0, 800, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void UIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIDTFActionPerformed

    
    
    
    
    
    private void LOGINBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINBTActionPerformed
        user_name=UIDTF.getText();
        pass=PASSTF.getText();
        System.out.println("Connecting To Server...!!");
        try 
        {
            Socket s=new Socket(ip,port);
            System.out.println("Verifying Credentials...!!");
            dis=new DataInputStream(s.getInputStream());
            dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF(user_name);
            dos.writeUTF(pass);
            if(dis.readUTF().equals("Valid"))
            {
                System.out.println("Connected To a Existing Customer "+user_name);
                JOptionPane.showMessageDialog(this,"Welcome Back To Sacred Bazar");
                new first_page(s,user_name).show();
                this.dispose();
            }
            else
            {
                System.out.println("Verification Failed...!!");
                JOptionPane.showMessageDialog(this,"Wrong Credentials");
                closeConnection(s);
            }
        }
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(this,ex.getMessage());
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LOGINBTActionPerformed

    
    private void closeConnection(Socket s)
    {
        System.out.println("Closing The Connection "+s);
        try 
        {
            s.close();
        }
        catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    
    private void SUBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBTActionPerformed
        // TODO add your handling code here:
        new NewCustomer().show();
        this.dispose();
    }//GEN-LAST:event_SUBTActionPerformed

    
    
    
    private void EXITBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EXITBTActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try
        {
            String ser=JOptionPane.showInputDialog(this,"Enter Ip And Port Of Server With a colon in between");
            String data[]=ser.split(":");
            ip=data[0];
            port=Integer.parseInt(data[1]);
        }
        catch(NullPointerException e)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton EXITBT;
    private javax.swing.JButton LOGINBT;
    private javax.swing.JLabel LOGOIMAGE;
    private javax.swing.JLabel PASSLabel;
    private javax.swing.JPasswordField PASSTF;
    private javax.swing.JButton SUBT;
    private javax.swing.JLabel SULabel;
    private javax.swing.JLabel UIDLabel;
    private javax.swing.JTextField UIDTF;
    private javax.swing.JLabel WelcomLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
