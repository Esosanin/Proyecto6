package unimap;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Unimap_1 extends javax.swing.JFrame implements java.awt.event.MouseListener{

    String button = "";
    
    Loader Loader;
    
    ArrayList <JButton> buttons;
    
    private void ButtonsLeft(){
        
        //Cantidad de Botones
        int cantButtons = 7;
        
        Font fuente=new Font("SansSerif", Font.BOLD, 16);
        
        //Creando los botones y asignandoles tamaño.
        for (int i = 0; i < cantButtons; i++) {
            buttons.add(new JButton());
            buttons.get(i).setSize(145,109);
            buttons.get(i).setHorizontalTextPosition(SwingConstants.CENTER);
            buttons.get(i).setForeground(Color.black);
            buttons.get(i).setBackground(Color.WHITE);
            buttons.get(i).setFont(fuente);
        }
        
        buttons.get(0).setIcon(new ImageIcon(getClass().getResource("/iconos/auditorio.png")));
        buttons.get(1).setIcon(new ImageIcon(getClass().getResource("/iconos/banos.png")));
        buttons.get(2).setIcon(new ImageIcon(getClass().getResource("/iconos/biblio.png")));
        buttons.get(3).setIcon(new ImageIcon(getClass().getResource("/iconos/coordi.png")));
        buttons.get(4).setIcon(new ImageIcon(getClass().getResource("/iconos/servicios.png")));
        buttons.get(5).setIcon(new ImageIcon(getClass().getResource("/iconos/iconos.png")));
        buttons.get(6).setIcon(new ImageIcon(getClass().getResource("/iconos/pint.png")));
        
        // Texto a los botones.
          buttons.get(0).setToolTipText("Auditorios");
          buttons.get(1).setToolTipText("Baños");
          buttons.get(2).setToolTipText("Bibliotecas");
          buttons.get(3).setToolTipText("Coordinaciones");
          buttons.get(4).setToolTipText("Papelerias");
          buttons.get(5).setToolTipText("Puestos de Comida");
          buttons.get(6).setToolTipText("Puntos de Interes");
        
        // Nombre a cada boton.
        buttons.get(0).setName("aud");
        buttons.get(1).setName("ba");
        buttons.get(2).setName("bi");
        buttons.get(3).setName("coo");
        buttons.get(4).setName("pp");
        buttons.get(5).setName("pc");
        buttons.get(6).setName("pint");
        
        // Creación de un GridLayout.
        GridLayout gl = new GridLayout();
        gl.setColumns(1);
        gl.setRows(7);
        
        // Integrando componente Grid al Panel "pane1"
        pane1.setLayout(gl);
        
        // Integrando componente Buttons al Panel "pane1" y otorgando Listener
        for (int i = 0; i < cantButtons; i++) {
            pane1.add(buttons.get(i)).addMouseListener(this);
        }
    }
    
    public Unimap_1() {
        this.buttons = new ArrayList<>();
        initComponents();
        
        setIconImage (new ImageIcon(getClass().getResource("/iconos/icon.png")).getImage());
        
        ButtonsLeft();
        setLocationRelativeTo(null);
        setTitle("UniMap");
        // MouseListener a cada panel
        pane1.addMouseListener(this);
        pane2.addMouseListener(this);
        
        Split_uni.setDividerSize(0);
        Split_uni.setOneTouchExpandable(false);
        
        Loader = new Loader();
        
        setResizable(false);
        
    }

    public void changeColor(String dato){
        for (int i = 0; i < buttons.size(); i++) {
            if (dato.equals(buttons.get(i).getName()))
                buttons.get(i).setBackground(Color.gray);
            else
                buttons.get(i).setBackground(Color.white);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        String dato = me.getComponent().getName();
        if (dato != null){
            pane2.removeAll();
            switch(dato){
                case "aud":
                    if (!dato.equals(button)){
                        PanelAuditorios a = new PanelAuditorios(Loader);
                        pane2.add(a);
                        button = dato;
                    }else{
                        button = "";
                    }
                    break;
                case "ba":
                    if (!dato.equals(button)){
                        PanelBaños ba = new PanelBaños();
                        pane2.add(ba);
                        button = dato;
                    }else{
                        button = "";
                    }
                    break;
                case "bi":
                    if (!dato.equals(button)){
                        PanelBibliotecas bi = new PanelBibliotecas(Loader);
                        pane2.add(bi);
                        button = dato;
                    }else{
                        button = "";
                    }
                    break;
                case "pp":
                    if (!dato.equals(button)){
                        PanelPapelerias pa = new PanelPapelerias(Loader);
                        pane2.add(pa);
                        button = dato;
                    }else{
                        button = "";
                    }
                    break;
                case "pc":
                    if (!dato.equals(button)){
                        PanelPuestoDeComida ppc = new PanelPuestoDeComida(Loader);
                        pane2.add(ppc);
                        button = dato;
                    }else{
                        button = "";
                    }
                    break;
                case "coo":
                    if (!dato.equals(button)){
                        PanelCoordinaciones co = new PanelCoordinaciones(Loader);
                        pane2.add(co);
                        button = dato;
                    }else{
                        button = "";
                    }
                    break;
                case "pint":
                    if (!dato.equals(button)){
                        PanelPuntosInteres pi= new PanelPuntosInteres(Loader);
                        pane2.add(pi);
                        button = dato;
                    }else{
                        button = "";
                    }
                    break;
                default:
                    break;
            }
            if (button.isEmpty()){
                label.setIcon(new ImageIcon(getClass().getResource("/image/iconos/LAMINA HERMOSILLO 2020.jpg")));
                pane2.add(label);
            }
            changeColor(button);
            pane2.revalidate();
            pane2.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Split_uni = new javax.swing.JSplitPane();
        pane1 = new javax.swing.JPanel();
        pane2 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        Split_uni.setMaximumSize(new java.awt.Dimension(1024, 768));
        Split_uni.setMinimumSize(new java.awt.Dimension(1024, 768));
        Split_uni.setPreferredSize(new java.awt.Dimension(1024, 768));

        pane1.setBackground(new java.awt.Color(204, 204, 204));
        pane1.setMaximumSize(new java.awt.Dimension(145, 768));
        pane1.setMinimumSize(new java.awt.Dimension(145, 768));

        javax.swing.GroupLayout pane1Layout = new javax.swing.GroupLayout(pane1);
        pane1.setLayout(pane1Layout);
        pane1Layout.setHorizontalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        pane1Layout.setVerticalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        Split_uni.setLeftComponent(pane1);

        pane2.setBackground(new java.awt.Color(0, 102, 204));
        pane2.setMaximumSize(new java.awt.Dimension(879, 768));
        pane2.setMinimumSize(new java.awt.Dimension(879, 768));
        pane2.setLayout(new java.awt.CardLayout());

        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unimap/image/iconos/LAMINA HERMOSILLO 2020.jpg"))); // NOI18N
        pane2.add(label, "card2");

        Split_uni.setRightComponent(pane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Split_uni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Split_uni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Unimap_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Unimap_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Unimap_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unimap_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Unimap_1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane Split_uni;
    private javax.swing.JLabel label;
    private javax.swing.JPanel pane1;
    private javax.swing.JPanel pane2;
    // End of variables declaration//GEN-END:variables
}
