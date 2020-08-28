package Server_Side;

import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author descifrado
 */
public class adminPage extends javax.swing.JFrame 
{
    DefaultComboBoxModel model;
    
    public adminPage()
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
        DCBT = new javax.swing.JButton();
        UCBT = new javax.swing.JButton();
        PTBT = new javax.swing.JButton();
        APBT = new javax.swing.JButton();
        DPBT = new javax.swing.JButton();
        UPBT = new javax.swing.JButton();
        EXITBT = new javax.swing.JButton();
        LOGOLabel = new javax.swing.JLabel();
        TITLELabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        ADMINCB = new javax.swing.JComboBox();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        DCBT.setBackground(new java.awt.Color(204, 204, 255));
        DCBT.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        DCBT.setText("DELETE EXISTING CUSTOMER");
        DCBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DCBTActionPerformed(evt);
            }
        });
        jPanel1.add(DCBT);
        DCBT.setBounds(70, 150, 350, 40);

        UCBT.setBackground(new java.awt.Color(204, 204, 255));
        UCBT.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        UCBT.setText("UPDATE OFFERS FOR CUSTOMER");
        UCBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UCBTActionPerformed(evt);
            }
        });
        jPanel1.add(UCBT);
        UCBT.setBounds(70, 240, 350, 40);

        PTBT.setBackground(new java.awt.Color(204, 204, 255));
        PTBT.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        PTBT.setText("PREVIEW TRANSACTIONS");
        PTBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTBTActionPerformed(evt);
            }
        });
        jPanel1.add(PTBT);
        PTBT.setBounds(70, 330, 350, 37);

        APBT.setBackground(new java.awt.Color(204, 204, 255));
        APBT.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        APBT.setText("ADD A PRODUCT TO INVENTORY");
        APBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APBTActionPerformed(evt);
            }
        });
        jPanel1.add(APBT);
        APBT.setBounds(490, 150, 350, 40);

        DPBT.setBackground(new java.awt.Color(204, 204, 255));
        DPBT.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        DPBT.setText("DELETE PRODUCTS");
        DPBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DPBTActionPerformed(evt);
            }
        });
        jPanel1.add(DPBT);
        DPBT.setBounds(490, 240, 350, 40);

        UPBT.setBackground(new java.awt.Color(204, 204, 255));
        UPBT.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        UPBT.setText("UPDATE PRODUCT DETAILS");
        UPBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPBTActionPerformed(evt);
            }
        });
        jPanel1.add(UPBT);
        UPBT.setBounds(490, 330, 350, 37);

        EXITBT.setBackground(new java.awt.Color(204, 204, 255));
        EXITBT.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        EXITBT.setText("EXIT");
        EXITBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBTActionPerformed(evt);
            }
        });
        jPanel1.add(EXITBT);
        EXITBT.setBounds(370, 430, 170, 37);

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        model=(DefaultComboBoxModel) ADMINCB.getModel();
        model.addElement("descifrado(Admin)");
        model.addElement("log_out");
    }//GEN-LAST:event_formWindowOpened

    private void DCBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DCBTActionPerformed
        // TODO add your handling code here:
        new DeleteCustomer().show();
        this.dispose();
    }//GEN-LAST:event_DCBTActionPerformed

    private void APBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APBTActionPerformed
        // TODO add your handling code here:
        new AddProduct().show();
        this.dispose();
    }//GEN-LAST:event_APBTActionPerformed

    private void UCBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UCBTActionPerformed
        // TODO add your handling code here:
        new UpdateCustomer().show();
        this.dispose();
    }//GEN-LAST:event_UCBTActionPerformed

    private void DPBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DPBTActionPerformed
        // TODO add your handling code here:
        new DeleteProduct().show();
        this.dispose();
    }//GEN-LAST:event_DPBTActionPerformed

    private void PTBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTBTActionPerformed
        // TODO add your handling code here:
        new PreviewTransaction().show();
        this.dispose();
    }//GEN-LAST:event_PTBTActionPerformed

    private void EXITBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EXITBTActionPerformed

    private void UPBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPBTActionPerformed
        // TODO add your handling code here:
        new UpdateProducts().show();
        this.dispose();
    }//GEN-LAST:event_UPBTActionPerformed

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

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ADMINCB;
    private javax.swing.JButton APBT;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton DCBT;
    private javax.swing.JButton DPBT;
    private javax.swing.JButton EXITBT;
    private javax.swing.JLabel LOGOLabel;
    private javax.swing.JButton PTBT;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TITLELabel;
    private javax.swing.JButton UCBT;
    private javax.swing.JButton UPBT;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
