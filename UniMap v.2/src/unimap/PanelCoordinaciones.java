/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unimap;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author usuariolocal
 */

@SuppressWarnings("serial")
public class PanelCoordinaciones extends javax.swing.JPanel implements java.awt.event.MouseListener{

    Loader Loader;
    
    private Integer ButtonsLeft(){
        
        //Cantidad de Botones
        int cantButtons = Loader.coordinacion.size();
        
        Font fuente=new Font("SansSerif", Font.PLAIN, 16);
        String[] dato;
        DefaultListModel<String> m = new DefaultListModel<>();
        ArrayList <String> data = new ArrayList<>();
        //Creando los botones y asignandoles tamaño.
        
        for (int i = 0; i < cantButtons; i++)
            data.add(Loader.coordinacion.get(i+"coo").carrera);
        
        m.addAll(data);
        Pbuttons.setModel(m);
        
        Pbuttons.setFont(fuente);
        
        // Integrando componente Buttons al Panel "pane1" y otorgando Listener
        Pbuttons.addMouseListener(this);
        return cantButtons;
    }
    
    public PanelCoordinaciones(Loader Loader) {
        initComponents();
        
        this.Loader = Loader;
        
        int tamaño = ButtonsLeft();
        
        Pbuttons.setSize(Pbuttons.getSize().width, tamaño*109);
        
        SplitVista.setDividerSize(0);
        SplitDescrip.setDividerSize(0);
        Split_c.setOneTouchExpandable(true);
        SplitVista.setOneTouchExpandable(false);
        SplitDescrip.setOneTouchExpandable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Split_c = new javax.swing.JSplitPane();
        SplitVista = new javax.swing.JSplitPane();
        SplitDescrip = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrip = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        descrip1 = new javax.swing.JTextPane();
        Jimage = new javax.swing.JLabel();
        Pmap = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Pbuttons = new javax.swing.JList<>();

        setMaximumSize(new java.awt.Dimension(879, 768));
        setMinimumSize(new java.awt.Dimension(879, 768));

        Split_c.setDividerLocation(145);
        Split_c.setInheritsPopupMenu(true);
        Split_c.setMaximumSize(new java.awt.Dimension(879, 768));
        Split_c.setMinimumSize(new java.awt.Dimension(879, 768));
        Split_c.setOneTouchExpandable(true);
        Split_c.setPreferredSize(new java.awt.Dimension(879, 768));

        SplitVista.setBackground(new java.awt.Color(102, 153, 255));
        SplitVista.setDividerLocation(400);
        SplitVista.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        SplitVista.setMaximumSize(new java.awt.Dimension(734, 768));
        SplitVista.setMinimumSize(new java.awt.Dimension(734, 768));
        SplitVista.setPreferredSize(new java.awt.Dimension(734, 768));

        SplitDescrip.setBackground(new java.awt.Color(0, 153, 204));
        SplitDescrip.setDividerLocation(367);
        SplitDescrip.setMaximumSize(new java.awt.Dimension(367, 368));
        SplitDescrip.setMinimumSize(new java.awt.Dimension(367, 368));
        SplitDescrip.setPreferredSize(new java.awt.Dimension(367, 368));

        descrip.setEditable(false);
        descrip.setBackground(new java.awt.Color(0, 102, 204));
        descrip.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        descrip.setMargin(new java.awt.Insets(10, 10, 10, 10));
        descrip.setMaximumSize(new java.awt.Dimension(367, 368));
        descrip.setMinimumSize(new java.awt.Dimension(367, 368));
        jScrollPane1.setViewportView(descrip);

        SplitDescrip.setLeftComponent(jScrollPane1);

        descrip1.setEditable(false);
        descrip1.setBackground(new java.awt.Color(0, 102, 204));
        descrip1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        descrip1.setForeground(new java.awt.Color(255, 255, 255));
        descrip1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        descrip1.setMaximumSize(new java.awt.Dimension(367, 368));
        descrip1.setMinimumSize(new java.awt.Dimension(367, 368));
        jScrollPane3.setViewportView(descrip1);

        SplitDescrip.setLeftComponent(jScrollPane3);

        Jimage.setBackground(new java.awt.Color(0, 153, 204));
        Jimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jimage.setMaximumSize(new java.awt.Dimension(367, 368));
        Jimage.setMinimumSize(new java.awt.Dimension(367, 368));
        Jimage.setPreferredSize(new java.awt.Dimension(367, 368));
        SplitDescrip.setRightComponent(Jimage);

        SplitVista.setBottomComponent(SplitDescrip);

        Pmap.setBackground(new java.awt.Color(102, 153, 255));
        Pmap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pmap.setMaximumSize(new java.awt.Dimension(734, 400));
        Pmap.setMinimumSize(new java.awt.Dimension(734, 400));
        Pmap.setPreferredSize(new java.awt.Dimension(734, 400));
        SplitVista.setLeftComponent(Pmap);

        Split_c.setRightComponent(SplitVista);

        Pbuttons.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        Pbuttons.setMaximumSize(new java.awt.Dimension(145, 900));
        Pbuttons.setMinimumSize(new java.awt.Dimension(145, 900));
        Pbuttons.setPreferredSize(new java.awt.Dimension(145, 900));
        jScrollPane2.setViewportView(Pbuttons);

        Split_c.setLeftComponent(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Split_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Split_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void mouseClicked(MouseEvent e) {
        String dato; String[]image;
        int index = Pbuttons.getSelectedIndex();
        dato = Loader.LoadCoordinaciones(index+"coo");
        image = dato.split("image:");
        if (image[0] != null)
            descrip1.setText(image[0]);
        else{
            descrip1.removeAll();
            descrip1.revalidate();
            descrip1.repaint();
        }
        if (image[1] != null){
            ImageIcon ii = new ImageIcon(getClass().getResource("\\image\\coord\\"+image[1].replace(" ", "")));
            ImageIcon icono = new ImageIcon(ii.getImage().getScaledInstance(Jimage.getWidth(), Jimage.getHeight(), Image.SCALE_DEFAULT));
            Jimage.setIcon(icono);
        }else{
            Jimage.removeAll();
            Jimage.revalidate();
            Jimage.repaint();
        }
        if (image[2] != null){
            ImageIcon iii = new ImageIcon(getClass().getResource("\\mapas\\"+image[2].replace(" ", "")));
            ImageIcon icono2 = new ImageIcon(iii.getImage().getScaledInstance(Pmap.getWidth(), Pmap.getHeight(), Image.SCALE_DEFAULT));
            Pmap.setIcon(icono2);
        }else{
            Pmap.removeAll();
            Pmap.revalidate();
            Pmap.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jimage;
    private javax.swing.JList<String> Pbuttons;
    private javax.swing.JLabel Pmap;
    private javax.swing.JSplitPane SplitDescrip;
    private javax.swing.JSplitPane SplitVista;
    private javax.swing.JSplitPane Split_c;
    private javax.swing.JTextPane descrip;
    private javax.swing.JTextPane descrip1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
