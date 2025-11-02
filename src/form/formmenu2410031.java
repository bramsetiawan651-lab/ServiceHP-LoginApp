/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import config.koneksi;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author THINKPAD
 */
public class formmenu2410031 extends javax.swing.JFrame {
 private String userRole;
    /**
     * Creates new form formmenu2410031
     */
    public formmenu2410031() {
        initComponents();
          applyTheme();
    }
     private void applyTheme() {
        Color warnaUtama = new Color(13, 27, 42);
        Color warnaHover = new Color(65, 90, 119);
        Color warnaKlik = new Color(41, 64, 97);
        Color warnaHeader = new Color(65, 90, 119);
        Color warnaKonten = new Color(27, 38, 59);
        Color warnaLogoutHover = new Color(150, 50, 50);
       

       
        jPanel2.setBackground(warnaUtama);  
        jPanel3.setBackground(warnaHeader); 
        jPanel1.setBackground(warnaHeader); 
        JPanelUtama.setBackground(warnaKonten); 

       
         lblTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER); 
        jLabel6.setForeground(Color.WHITE);
        jLabel7.setForeground(Color.WHITE);
        
           jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(SwingConstants.CENTER);
        jTextField1.setBackground(warnaKonten);
        jTextField1.setForeground(Color.WHITE);
        jTextField1.setFont(new Font("Segoe UI", Font.BOLD, 22));
        jTextField1.setBorder(BorderFactory.createEmptyBorder());

       
       jPanel1.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, warnaHover));
         getContentPane().setLayout(new BorderLayout());

        
        jPanel2.setLayout(new GridLayout(10, 1, 0, 5));

       
          styleButton(jButton1, warnaUtama, warnaHover, warnaKlik);
        styleButton(jButton2, warnaUtama, warnaHover, warnaKlik);
        styleButton(jButton3, warnaUtama, warnaHover, warnaKlik);
        styleButton(jButton4, warnaUtama, warnaHover, warnaKlik);
        styleButton(jButton5, warnaUtama, warnaHover, warnaKlik);
        styleButton(jButton6, warnaUtama, warnaHover, warnaKlik);
        styleButton(jButton7, warnaUtama, warnaHover, warnaKlik);
        styleButton(jButton8, warnaUtama, warnaHover, warnaKlik);
        styleButton(jButton9, warnaUtama, warnaHover, warnaKlik);
       

        
            jPanel2.removeAll();
        jPanel2.add(jButton1);
        jPanel2.add(jButton2);
        jPanel2.add(jButton3);
        jPanel2.add(jButton4);
        jPanel2.add(jButton5);
        jPanel2.add(jButton6);
        jPanel2.add(jButton7);
        jPanel2.add(jButton8);
        jPanel2.add(jButton9);
        
        getContentPane().add(jPanel2, BorderLayout.WEST);
        getContentPane().add(JPanelUtama, BorderLayout.CENTER);
        getContentPane().add(jPanel3, BorderLayout.SOUTH);
        
          jPanel1.setLayout(new BorderLayout());
        jPanel1.add(lblTitle, BorderLayout.CENTER);
        getContentPane().add(jPanel1, BorderLayout.NORTH);

        jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
        jPanel3.add(jLabel6);
        jPanel3.add(jTextField1);
        jPanel3.add(jLabel7);
        
         jTextField1.setEditable(false);
        jTextField1.setFont(new Font("Segoe UI", Font.PLAIN, 24));
    }
   private void styleButton(JButton btn, Color normal, Color hover, Color click) {
         btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setContentAreaFilled(false);
        btn.setOpaque(true);
        btn.setBackground(normal);
        btn.setForeground(Color.WHITE);
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        btn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        btn.setIconTextGap(15);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) { btn.setBackground(hover); }
            @Override
            public void mouseExited(MouseEvent evt) { btn.setBackground(normal); }
            @Override
            public void mousePressed(MouseEvent evt) { btn.setBackground(click); }
            @Override
            public void mouseReleased(MouseEvent evt) { btn.setBackground(hover); }
        });
    }
    public void lblUserLogin(String namaUser) {
    jTextField1.setText(namaUser);
    jTextField1.setEditable(false); 
}
      public void setRoleUser(String role) {
        this.userRole = role;
        aturAksesMenu(role);
    }
private void aturAksesMenu(String role) {
    
    jButton2.setEnabled(false); 
    jButton3.setEnabled(false); 
    jButton4.setEnabled(false); 
    jButton5.setEnabled(false); 
    jButton6.setEnabled(false); 
    jButton7.setEnabled(false); 
    jButton8.setEnabled(false); 
    jButton9.setEnabled(false); 

   
    if (role.equals("1")) {
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jLabel6.setText("SELAMAT DATANG ADMIN");

    
    } else if (role.equals("2")) {
        jButton9.setEnabled(true); 
        jLabel6.setText("SELAMAT DATANG KASIR");

    
    } else if (role.equals("3")) {
        jButton5.setEnabled(true); 
        jButton6.setEnabled(true); 
        jButton8.setEnabled(true); 
        jLabel6.setText("SELAMAT DATANG TEKNISI");

    } else {
        jLabel6.setText("ROLE TIDAK DIKENAL");
    }
}
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JPanelUtama = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(13, 27, 42));
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("_____________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 77, -1, -1));

        jButton3.setBackground(new java.awt.Color(25, 25, 60));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_HP_50px.png"))); // NOI18N
        jButton3.setText("MERK");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, -1));

        jButton4.setBackground(new java.awt.Color(25, 25, 60));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Cell_Phone_50px.png"))); // NOI18N
        jButton4.setText("JENIS");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setOpaque(true);
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 47));

        jButton5.setBackground(new java.awt.Color(25, 25, 60));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Cell_Phone_50px.png"))); // NOI18N
        jButton5.setText("ITEM");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setOpaque(true);
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 130, -1));

        jButton6.setBackground(new java.awt.Color(25, 25, 60));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_User_48px.png"))); // NOI18N
        jButton6.setText("PELANGGAN");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setOpaque(true);
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 150, -1));

        jButton7.setBackground(new java.awt.Color(25, 25, 60));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_User_Group_Man_Woman_48px.png"))); // NOI18N
        jButton7.setText("USER");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 110, -1));

        jButton8.setBackground(new java.awt.Color(25, 25, 60));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Maintenance_48px.png"))); // NOI18N
        jButton8.setText("SERVIS");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusPainted(false);
        jButton8.setOpaque(true);
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, 42));

        jButton9.setBackground(new java.awt.Color(25, 25, 60));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Cash_in_Hand_48px.png"))); // NOI18N
        jButton9.setText("PEMBAYARAN");
        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusPainted(false);
        jButton9.setOpaque(true);
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, -1, -1));

        jButton1.setBackground(new java.awt.Color(25, 25, 60));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Home_48px.png"))); // NOI18N
        jButton1.setText("HOME");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, -1));

        jButton2.setBackground(new java.awt.Color(25, 25, 60));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Coins_48px.png"))); // NOI18N
        jButton2.setText("METODE BAYAR");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setOpaque(true);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("____________________________");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("____________________________");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(65, 90, 119));
        jPanel3.setPreferredSize(new java.awt.Dimension(876, 120));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Checked_User_Male_48px.png"))); // NOI18N
        jLabel6.setText("SELAMAT DATANG");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 256, 48));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_C_Programming_48px.png"))); // NOI18N
        jLabel7.setText("SERVICE HP BRAM SETIAWAN");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        JPanelUtama.setBackground(new java.awt.Color(27, 38, 59));

        jPanel1.setBackground(new java.awt.Color(65, 90, 119));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 119));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("SERVICE HP BRAM SETIAWAN");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ChatGPT Image 22 Okt 2025, 03.07.15.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout JPanelUtamaLayout = new javax.swing.GroupLayout(JPanelUtama);
        JPanelUtama.setLayout(JPanelUtamaLayout);
        JPanelUtamaLayout.setHorizontalGroup(
            JPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1931, Short.MAX_VALUE)
            .addGroup(JPanelUtamaLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanelUtamaLayout.setVerticalGroup(
            JPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelUtamaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addGap(0, 190, Short.MAX_VALUE))
        );

        getContentPane().add(JPanelUtama, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
  formuser2410031 userForm = new formuser2410031();
    userForm.setLocationRelativeTo(this);
    userForm.setAlwaysOnTop(true);
    userForm.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(formmenu2410031.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formmenu2410031.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formmenu2410031.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formmenu2410031.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formmenu2410031().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelUtama;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
