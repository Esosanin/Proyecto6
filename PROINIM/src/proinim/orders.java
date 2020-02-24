/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proinim;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 *
 * @author usuariolocal
 */
public class orders extends javax.swing.JFrame {

    static String urlDB;
    static String userDB;
    static String passwordDB;
    static String driverDB;
    static ResultSet res;
    
    static ArrayList<Integer> l = new ArrayList();
    static TableModel tm_cu;
    public orders() {
        initComponents();
    }
    
    static public void create(String url, String user, String password, String driver){
        
        urlDB = url;
        userDB = user;
        passwordDB = password;
        driverDB = driver;
        
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        
        try{
            DBConexion db = new DBConexion(url, user, password);
            TableModel tm = (TableModel) db.ejecutaSelect("Select * FROM order_detail ");
            
            for (int i = 0; i < tm.getRowCount(); i++) {
                if (!l.isEmpty()){
                    for (int j = 0; j < l.size(); j++){
                        if (!(l.get(i-1) >= Integer.parseInt(tm.getValueAt(j, 0).toString()))) 
                            l.add(Integer.parseInt(tm.getValueAt(j, 0).toString()));
                    }
                }else{
                    l.add(Integer.parseInt(tm.getValueAt(i, 0).toString()));
                    System.out.println(l.size());
                }
            }
            String Code[] = new String [l.size()];
            for (int i = 0; i < l.size(); i++) 
                Code[i] = "- "+l.get(i);
            
            list.setListData(Code);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void fill_customer(){
        Label1.setText(tm_cu.getValueAt(0, 1)+" "+tm_cu.getValueAt(0, 2));
        Label2.setText(tm_cu.getValueAt(0, 13).toString());
        Label3.setText(tm_cu.getValueAt(0, 5).toString());
        if (tm_cu.getValueAt(0, 11).toString().equals("false"))
            Label4.setText("No valido");
        else
            Label4.setText("Valido");
        Label5.setText(l.get(list.getSelectedIndex()).toString());
//        System.out.println(tm_cu.getColumnCount());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        B_return = new javax.swing.JButton();
        B_save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(750, 550));

        Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Panel.setMaximumSize(new java.awt.Dimension(680, 480));
        Panel.setMinimumSize(new java.awt.Dimension(680, 480));
        Panel.setPreferredSize(new java.awt.Dimension(680, 480));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Modificar Pedidos");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        list.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        list.setMaximumSize(new java.awt.Dimension(100, 150));
        list.setMinimumSize(new java.awt.Dimension(80, 130));
        list.setPreferredSize(new java.awt.Dimension(80, 130));
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

        B_return.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        B_return.setText("Regresar a Menu Principal");
        B_return.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        B_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_returnActionPerformed(evt);
            }
        });

        B_save.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        B_save.setText("Guardar cambios");
        B_save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        B_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_saveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del Cliente:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de Pedido:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Empresa");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Estatus:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Num. de Pedido:");

        Label1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Label1.setText(".");

        Label2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Label2.setText(".");

        Label3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Label3.setText(".");

        Label4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Label4.setText(".");

        Label5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Label5.setText(".");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Codigo");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Puedes: Cambiar Cantidad");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label1)
                                    .addComponent(Label2)
                                    .addComponent(Label3)
                                    .addComponent(Label4)
                                    .addComponent(Label5))
                                .addGap(0, 423, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(B_save)
                .addGap(18, 18, 18)
                .addComponent(B_return)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(263, 263, 263))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(Label1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3))
                                            .addComponent(Label2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addComponent(Label3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addComponent(Label4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(Label5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_return)
                    .addComponent(B_save))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        
        String c = l.get(list.getSelectedIndex()).toString();
        try{
            DBConexion db = new DBConexion(urlDB, userDB, passwordDB);
            TableModel tm = (TableModel) db.ejecutaSelect("SELECT * FROM order_detail WHERE order_id = "+c+"");
            tm_cu = (TableModel) db.ejecutaSelect("SELECT * FROM customer c, order_sale o WHERE (c.customer_id = o.customer_id)AND(o.order_id = "+c+")");
            
            fill_customer();
            if (tm != null) {
                    table.setModel(tm);
            }else {
                JOptionPane.showMessageDialog(this, "No se encontraron registros en la tabla.");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_listMouseClicked

    private void B_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_returnActionPerformed
        Base0 main= new Base0();
        
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_B_returnActionPerformed

    private void B_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_saveActionPerformed
        
        String c = l.get(list.getSelectedIndex()).toString();
        try{
            String consulta = "";
            Object[][] rows = new Object[table.getRowCount()][table.getColumnCount()];
            DBConexion db = new DBConexion(urlDB, userDB, passwordDB);
            
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    rows[i][j] = table.getValueAt(i, j);
                }
                Double Total = Double.parseDouble(rows[i][4].toString())*Double.parseDouble(rows[i][5].toString());
                consulta = "UPDATE order_detail "
                        + "SET cant_unit = '"+rows[i][5].toString()+"', "
                        + "cost_total = '"+Total+"' "
                        + "WHERE (order_id = "+c+")AND(customer_id="+tm_cu.getValueAt(0, 0).toString()+")AND(product_id = "+rows[i][1]+")";
                db.ejecutaInsert(consulta);
            }
            
            TableModel tm = (TableModel) db.ejecutaSelect("SELECT * FROM order_detail WHERE (order_id = "+c+")AND(customer_id="+tm_cu.getValueAt(0, 0).toString()+")");
            
            fill_customer();
            if (tm != null) {
                    table.setModel(tm);
            }else {
                JOptionPane.showMessageDialog(this, "No se encontraron registros en la tabla.");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_B_saveActionPerformed

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
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_return;
    private javax.swing.JButton B_save;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JList<String> list;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}