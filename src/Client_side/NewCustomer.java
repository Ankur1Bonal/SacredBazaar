package Client_side;

import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * @author descifrado
 */


public class NewCustomer extends javax.swing.JFrame implements Serializable
{
    String ip="localhost";
    int port=8806;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private DataInputStream dis;
    private DataOutputStream dos;
    
    
    
    
    public NewCustomer() 
    {
        initComponents();
        // Setting Size Of Window To Be Constant
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        FNLabel = new javax.swing.JLabel();
        FNTF = new javax.swing.JTextField();
        LNLabel = new javax.swing.JLabel();
        EIDTF = new javax.swing.JTextField();
        GENDERLabel = new javax.swing.JLabel();
        AGELabel = new javax.swing.JLabel();
        AGETF = new javax.swing.JTextField();
        CNLabel = new javax.swing.JLabel();
        CNTF = new javax.swing.JTextField();
        EIDLabel = new javax.swing.JLabel();
        LNTF = new javax.swing.JTextField();
        UIDLabel = new javax.swing.JLabel();
        UNTF = new javax.swing.JTextField();
        PASSLabel = new javax.swing.JLabel();
        CPASSLabel = new javax.swing.JLabel();
        SIGNUPLabel = new javax.swing.JLabel();
        PASSTF = new javax.swing.JPasswordField();
        SIGNUPBT = new javax.swing.JButton();
        BACKBT = new javax.swing.JButton();
        CPASSTF = new javax.swing.JPasswordField();
        EXITBT = new javax.swing.JButton();
        MRBT = new javax.swing.JRadioButton();
        FRBT = new javax.swing.JRadioButton();
        LOGOLabel = new javax.swing.JLabel();
        TitleLable = new javax.swing.JLabel();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 550));

        jPanel1.setLayout(null);

        FNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FNLabel.setText("FIRST NAME");
        jPanel1.add(FNLabel);
        FNLabel.setBounds(50, 160, 74, 15);

        FNTF.setBackground(new java.awt.Color(215, 218, 243));
        FNTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FNTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNTFActionPerformed(evt);
            }
        });
        jPanel1.add(FNTF);
        FNTF.setBounds(240, 150, 150, 30);

        LNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LNLabel.setText("LAST NAME");
        jPanel1.add(LNLabel);
        LNLabel.setBounds(520, 150, 70, 15);

        EIDTF.setBackground(new java.awt.Color(215, 218, 243));
        EIDTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EIDTF.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel1.add(EIDTF);
        EIDTF.setBounds(700, 240, 150, 30);

        GENDERLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GENDERLabel.setText("GENDER");
        jPanel1.add(GENDERLabel);
        GENDERLabel.setBounds(50, 210, 48, 15);

        AGELabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AGELabel.setText("AGE");
        jPanel1.add(AGELabel);
        AGELabel.setBounds(520, 200, 24, 15);

        AGETF.setBackground(new java.awt.Color(215, 218, 243));
        AGETF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AGETF.setPreferredSize(new java.awt.Dimension(150, 20));
        AGETF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGETFActionPerformed(evt);
            }
        });
        AGETF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AGETFKeyTyped(evt);
            }
        });
        jPanel1.add(AGETF);
        AGETF.setBounds(700, 190, 150, 30);

        CNLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CNLabel.setText("CONTACT NUMBER");
        jPanel1.add(CNLabel);
        CNLabel.setBounds(50, 300, 111, 15);

        CNTF.setBackground(new java.awt.Color(215, 218, 243));
        CNTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CNTF.setPreferredSize(new java.awt.Dimension(150, 20));
        CNTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CNTFKeyTyped(evt);
            }
        });
        jPanel1.add(CNTF);
        CNTF.setBounds(240, 290, 150, 30);

        EIDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EIDLabel.setText("EMAIL ID");
        jPanel1.add(EIDLabel);
        EIDLabel.setBounds(520, 250, 57, 15);

        LNTF.setBackground(new java.awt.Color(215, 218, 243));
        LNTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LNTF.setPreferredSize(new java.awt.Dimension(150, 20));
        LNTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNTFActionPerformed(evt);
            }
        });
        jPanel1.add(LNTF);
        LNTF.setBounds(700, 140, 150, 30);

        UIDLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UIDLabel.setText("USER_NAME");
        jPanel1.add(UIDLabel);
        UIDLabel.setBounds(50, 350, 80, 15);

        UNTF.setBackground(new java.awt.Color(215, 218, 243));
        UNTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UNTF.setToolTipText("Must Be Unique and \nMust Be 6-15 characters long\n");
        jPanel1.add(UNTF);
        UNTF.setBounds(240, 340, 150, 30);

        PASSLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PASSLabel.setText("PASSWORD");
        jPanel1.add(PASSLabel);
        PASSLabel.setBounds(520, 300, 72, 15);

        CPASSLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CPASSLabel.setText("CONFIRM PASSWORD");
        jPanel1.add(CPASSLabel);
        CPASSLabel.setBounds(520, 350, 132, 15);

        SIGNUPLabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        SIGNUPLabel.setText("SIGN UP");
        jPanel1.add(SIGNUPLabel);
        SIGNUPLabel.setBounds(380, 70, 170, 50);

        PASSTF.setBackground(new java.awt.Color(215, 218, 243));
        PASSTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(PASSTF);
        PASSTF.setBounds(700, 290, 150, 30);

        SIGNUPBT.setBackground(new java.awt.Color(204, 204, 255));
        SIGNUPBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SIGNUPBT.setText("SIGN UP");
        SIGNUPBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGNUPBTActionPerformed(evt);
            }
        });
        jPanel1.add(SIGNUPBT);
        SIGNUPBT.setBounds(50, 410, 90, 40);

        BACKBT.setBackground(new java.awt.Color(204, 204, 255));
        BACKBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BACKBT.setText("BACK");
        BACKBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTActionPerformed(evt);
            }
        });
        jPanel1.add(BACKBT);
        BACKBT.setBounds(400, 410, 80, 40);

        CPASSTF.setBackground(new java.awt.Color(215, 218, 243));
        CPASSTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(CPASSTF);
        CPASSTF.setBounds(700, 340, 150, 30);

        EXITBT.setBackground(new java.awt.Color(204, 204, 255));
        EXITBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EXITBT.setText("EXIT");
        EXITBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBTActionPerformed(evt);
            }
        });
        jPanel1.add(EXITBT);
        EXITBT.setBounds(770, 410, 80, 40);

        MRBT.setBackground(new java.awt.Color(215, 218, 243));
        buttonGroup1.add(MRBT);
        MRBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MRBT.setText("MALE");
        jPanel1.add(MRBT);
        MRBT.setBounds(240, 200, 150, 23);

        FRBT.setBackground(new java.awt.Color(215, 218, 243));
        buttonGroup1.add(FRBT);
        FRBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FRBT.setText("FEMALE");
        jPanel1.add(FRBT);
        FRBT.setBounds(240, 240, 150, 23);

        LOGOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO_smaller.jpg"))); // NOI18N
        jPanel1.add(LOGOLabel);
        LOGOLabel.setBounds(140, 20, 70, 60);

        TitleLable.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        TitleLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLable.setText("WELCOME TO THE SACRED BAZAR.....");
        jPanel1.add(TitleLable);
        TitleLable.setBounds(200, 30, 590, 35);

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

    
    private void FNTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNTFActionPerformed

    
    
    private void AGETFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGETFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AGETFActionPerformed

    
    
    private void AGETFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AGETFKeyTyped
        // Allowing Only Integers In This Field
        char ch=evt.getKeyChar();
        if(!(ch>='0' && ch<='9'))
        {
            evt.consume();
        }
        //And Also Checking For Length;
        int l=AGETF.getText().length();
        if(l>2)
            evt.consume();
    }//GEN-LAST:event_AGETFKeyTyped

    
    
    private void CNTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CNTFKeyTyped
        char ch=evt.getKeyChar();
        if(!(ch>='0' && ch<='9'))
        {
            evt.consume();
        }
        int l=CNTF.getText().length();
        if(l>9)
            evt.consume();        
    }//GEN-LAST:event_CNTFKeyTyped

    
    
    private void SIGNUPBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGNUPBTActionPerformed
        String pass=PASSTF.getText();
        String cpass=CPASSTF.getText();
        if(pass.equals(cpass)==false)
        {
            JOptionPane.showMessageDialog(this,"PASSWORD DID NOT MATCH");
        }
        else
        {
            if(isValid(EIDTF.getText())==false)
            {
                JOptionPane.showMessageDialog(this,"Email Id Is Not Valid");
            }
            else
            {
                if(MRBT.isSelected()==false && FRBT.isSelected()==false)
                {
                    JOptionPane.showMessageDialog(this,"Plase Select The Gender");
                }
                else
                {
                    try 
                    {
                        Socket s=new Socket(ip,port);
                        System.out.println("Connected To Server As A new Customer");
                        dos=new DataOutputStream(s.getOutputStream());
                        dis=new DataInputStream((s.getInputStream()));
                        dos.writeUTF("New Customer");
                        sendDetails(s);
                        // Verification Message If Inserted Successfully
                        String done=dis.readUTF();
                        if(done.equals("ho_gya"))
                        {
                            JOptionPane.showMessageDialog(this,"Successful Sign Up Login To Continue");
                            new MainPage().show();
                            this.dispose();
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Sign Up Failed At Server End");
                    } 
                    catch (IOException ex) 
                    {
                        JOptionPane.showMessageDialog(this, ex.getMessage());
                        Logger.getLogger(NewCustomer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_SIGNUPBTActionPerformed

    private void BACKBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBTActionPerformed
        // TODO add your handling code here:
        new MainPage().show();
        this.dispose();
    }//GEN-LAST:event_BACKBTActionPerformed

    private void EXITBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EXITBTActionPerformed

    private void LNTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNTFActionPerformed
    //Using Regexp to Validat Email id
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                             
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    
    
    // Sending Details To Server To Add The User In The Database
    public void sendDetails(Socket s)
    {
        String g="";
        try 
        {
            if(MRBT.isSelected())
                g="MALE";
            else
                g="FEMALE";
            String details="";
            System.out.println("Sending Details");
            String userName=UNTF.getText();
            details=details+userName+"~";
            String firstName=FNTF.getText();
            details=details+firstName+"~";
            String lastName=LNTF.getText();
            details=details+lastName+"~";
            String gender=g;
            details=details+gender+"~";
            String age=AGETF.getText();
            details=details+age+"~";
            String contactNumber=CNTF.getText();
            details=details+contactNumber+"~";
            String emailid=EIDTF.getText();
            details=details+emailid+"~";
            String pass=PASSTF.getText();
            details=details+pass;
            System.out.println(details);
            dos.writeUTF(details);
        }
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(this,ex.getMessage());
            Logger.getLogger(NewCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGELabel;
    private javax.swing.JTextField AGETF;
    private javax.swing.JButton BACKBT;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JLabel CNLabel;
    private javax.swing.JTextField CNTF;
    private javax.swing.JLabel CPASSLabel;
    private javax.swing.JPasswordField CPASSTF;
    private javax.swing.JLabel EIDLabel;
    private javax.swing.JTextField EIDTF;
    private javax.swing.JButton EXITBT;
    private javax.swing.JLabel FNLabel;
    private javax.swing.JTextField FNTF;
    private javax.swing.JRadioButton FRBT;
    private javax.swing.JLabel GENDERLabel;
    private javax.swing.JLabel LNLabel;
    private javax.swing.JTextField LNTF;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JRadioButton MRBT;
    private javax.swing.JLabel PASSLabel;
    private javax.swing.JPasswordField PASSTF;
    private javax.swing.JButton SIGNUPBT;
    private javax.swing.JLabel SIGNUPLabel;
    private javax.swing.JLabel TitleLable;
    private javax.swing.JLabel UIDLabel;
    private javax.swing.JTextField UNTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
