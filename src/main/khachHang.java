/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import Form.khachHang_DatLich;
import Form.khachHang_History;
import Form.khachHang_Show;
import Form.khachHang_Support;
import Form.khachHang_TrangChu;
import java.awt.Color;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;

/**
 *
 * @author default
 */
public class khachHang extends javax.swing.JFrame {
 private DrawerController drawer;
    /**
     * Creates new form khachHang1
     */
    public khachHang() {
        initComponents();
          init();
    }
    public void init(){
     drawer=Drawer.newDrawer(this)
                 .header(new Header())
                 .space(0)
                 .separator(2, new Color(90,90,90))
                 .backgroundTransparent(0.3f)
                 .enableScroll(true)
                 .drawerBackground(new Color(39,202,132))
                 .addChild(new DrawerItem("Trang Chủ").icon(new ImageIcon(getClass().getResource("/icon/home1.png"))).build())
                 .addChild(new DrawerItem("Đặt Lịch").icon(new ImageIcon(getClass().getResource("/icon/lich.png"))).build())
                 .addChild(new DrawerItem("Xem Lịch Đã Đặt").icon(new ImageIcon(getClass().getResource("/icon/show.png"))).build())
                 .addChild(new DrawerItem("Lịch Sử Đặt Lịch").icon(new ImageIcon(getClass().getResource("/icon/history.png"))).build())
                 .addChild(new DrawerItem("Trợ Giúp").icon(new ImageIcon(getClass().getResource("/icon/help1.png"))).build())
                 .addFooter(new DrawerItem("Exit").icon(new ImageIcon(getClass().getResource("/icon/Exit1.png"))).build())
               .event(new EventDrawer() {
         @Override
         public void selected(int i, DrawerItem di) {
            if(i==0){
                panel1.display(new khachHang_TrangChu());
            }else if(i==1){
                panel1.display(new khachHang_DatLich());
            }else if(i==2){
                 panel1.display(new khachHang_Show());
            }else if(i==3){
                 panel1.display(new khachHang_History());
            }else if(i==4){
                 panel1.display(new khachHang_Support());
            }else{
                System.exit(0);
            }
         }
               })
                .build();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        panel1 = new Swing.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 197, 133));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bell_26px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_26px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/group_message_26px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/male_user_50px.png"))); // NOI18N
        jLabel6.setText("Tài Khoản");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 110, 50));

        jLabel7.setText("Trang Chủ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jLabel8.setText("|");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 20, -1));

        jLabel9.setText("Đặt Lịch");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        btnMenu.setBackground(new java.awt.Color(36, 197, 133));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FiveK Group");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if(drawer.isShow()){
            drawer.hide();
        }else{
            drawer.show();
        }
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(khachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(khachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(khachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(khachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new khachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private Swing.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
