/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proinim;

import java.sql.ResultSet;

/**
 *
 * @author usuariolocal
 */
public class Base0 extends javax.swing.JFrame {

    /**
     * Creates new form Base0
     */
    
    //DATOS INICIALES PARA LA BASE DE DATOS
    static String urlDB;
    static String userDB;
    static String passwordDB;
    static String driverDB;
    static ResultSet res;
    
    public Base0() {
        initComponents();
    }
    
    //CREACIÓN DE LA BASE FRAME                                                  <<[TERMINADO]>> [100%]
    public static void create(String url, String user, String password, String driver){
        
        urlDB = url;
        userDB = user;
        passwordDB = password;
        driverDB = driver;
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Consult = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 400));
        setMinimumSize(new java.awt.Dimension(300, 400));
        setResizable(false);

        Consult.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Consult.setText("Consultar y validar pedidos");
        Consult.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Consult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Edit.setText("Modificar pedidos");
        Edit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Exit.setText("salir");
        Exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Exit.setMaximumSize(new java.awt.Dimension(40, 40));
        Exit.setMinimumSize(new java.awt.Dimension(40, 40));
        Exit.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Menu principal");

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/proinim.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 125));
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 125));
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 125));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Consult)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(Edit)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultActionPerformed
        consult c = new consult();
        c.setVisible(true);
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        
        c.create(urlDB, userDB, passwordDB, driverDB);
        
        this.dispose();
    }//GEN-LAST:event_ConsultActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        orders o = new orders();
        o.setVisible(true);
        o.setVisible(true);
        o.setLocationRelativeTo(null);
        
        o.create(urlDB, userDB, passwordDB, driverDB);
        
        this.dispose();
    }//GEN-LAST:event_EditActionPerformed

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
            java.util.logging.Logger.getLogger(Base0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Base0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Base0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Base0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consult;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}