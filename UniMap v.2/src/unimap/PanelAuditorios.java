/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unimap;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author usuariolocal
 */
@SuppressWarnings("serial")
public class PanelAuditorios extends javax.swing.JPanel implements java.awt.event.MouseListener{

    ArrayList <JButton> buttons;
    Loader Loader;
    
    private void ButtonsLeft(){
        
        //Cantidad de Botones
        int cantButtons = Loader.auditorio.size();
        
        Font fuente=new Font("SansSerif", Font.PLAIN, 16);
        
        //Creando los botones y asignandoles tamaño.
        int p = 768/15;
        for (int i = 0; i < cantButtons; i++) {
            buttons.add(new JButton(Loader.auditorio.get(i+"aud").nombre));
            buttons.get(i).setToolTipText(Loader.auditorio.get(i+"aud").nombre);
            buttons.get(i).setName(i+"aud");
            buttons.get(i).setSize(145,p);
            buttons.get(i).setFont(fuente);
            buttons.get(i).setBackground(Color.white);
        }
        
        // Creación de un GridLayout.
        GridLayout gl = new GridLayout();
        gl.setColumns(1);
        gl.setRows(15);
        
        // Integrando componente Grid al Panel "pane1"
        Pbuttons.setLayout(gl);
        
        // Integrando componente Buttons al Panel "pane1" y otorgando Listener
        for (int i = 0; i < cantButtons; i++) {
            Pbuttons.add(buttons.get(i)).addMouseListener(this);
        }
        Pbuttons.revalidate();
        Pbuttons.repaint();
    }
    
    public PanelAuditorios(Loader Loader) {
        this.buttons = new ArrayList<>();
        initComponents();
        
        this.Loader = Loader;
        
        ButtonsLeft();
        
        Split_a.setDividerSize(0);
        SplitVista.setDividerSize(0);
        SplitDescrip.setDividerSize(0);
        Split_a.setOneTouchExpandable(false);
        SplitVista.setOneTouchExpandable(false);
        SplitDescrip.setOneTouchExpandable(false);
    }
    
    public void changeColor(String dato){
        for (int i = 0; i < buttons.size(); i++) {
            if (dato.equals(buttons.get(i).getName()))
                buttons.get(i).setBackground(Color.gray);
            else
                buttons.get(i).setBackground(Color.white);
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

        Split_a = new javax.swing.JSplitPane();
        SplitVista = new javax.swing.JSplitPane();
        SplitDescrip = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrip = new javax.swing.JTextPane();
        Jimage = new javax.swing.JLabel();
        Pmap = new javax.swing.JLabel();
        Pbuttons = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(879, 768));
        setMinimumSize(new java.awt.Dimension(879, 768));

        Split_a.setDividerLocation(145);
        Split_a.setMaximumSize(new java.awt.Dimension(879, 768));
        Split_a.setMinimumSize(new java.awt.Dimension(879, 768));
        Split_a.setPreferredSize(new java.awt.Dimension(879, 768));

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
        descrip.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        descrip.setForeground(new java.awt.Color(255, 255, 255));
        descrip.setMargin(new java.awt.Insets(10, 10, 10, 10));
        descrip.setMaximumSize(new java.awt.Dimension(367, 368));
        descrip.setMinimumSize(new java.awt.Dimension(367, 368));
        jScrollPane1.setViewportView(descrip);

        SplitDescrip.setLeftComponent(jScrollPane1);

        Jimage.setBackground(new java.awt.Color(0, 153, 204));
        Jimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jimage.setMaximumSize(new java.awt.Dimension(367, 368));
        Jimage.setMinimumSize(new java.awt.Dimension(367, 368));
        Jimage.setPreferredSize(new java.awt.Dimension(367, 368));
        SplitDescrip.setRightComponent(Jimage);

        SplitVista.setBottomComponent(SplitDescrip);

        Pmap.setBackground(new java.awt.Color(102, 153, 255));
        Pmap.setMaximumSize(new java.awt.Dimension(734, 400));
        Pmap.setMinimumSize(new java.awt.Dimension(734, 400));
        Pmap.setPreferredSize(new java.awt.Dimension(734, 400));
        SplitVista.setLeftComponent(Pmap);

        Split_a.setRightComponent(SplitVista);

        Pbuttons.setBackground(new java.awt.Color(255, 185, 0));
        Pbuttons.setMaximumSize(new java.awt.Dimension(145, 768));
        Pbuttons.setMinimumSize(new java.awt.Dimension(145, 768));

        javax.swing.GroupLayout PbuttonsLayout = new javax.swing.GroupLayout(Pbuttons);
        Pbuttons.setLayout(PbuttonsLayout);
        PbuttonsLayout.setHorizontalGroup(
            PbuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        PbuttonsLayout.setVerticalGroup(
            PbuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        Split_a.setLeftComponent(Pbuttons);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 879, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Split_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Split_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void mouseClicked(MouseEvent e) {
        String dato; String[]image;
        dato = Loader.LoadAuditorios(e.getComponent().getName());
        image = dato.split("image:");
        if (image[0] != null)
            descrip.setText(image[0]);
        else{
            descrip.removeAll();
            descrip.revalidate();
            descrip.repaint();
        }
        if (image[1] != null){
            ImageIcon ii = new ImageIcon(getClass().getResource("\\image\\aud\\"+image[1].replace(" ", "")));
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
        changeColor(e.getComponent().getName());
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
    private javax.swing.JPanel Pbuttons;
    private javax.swing.JLabel Pmap;
    private javax.swing.JSplitPane SplitDescrip;
    private javax.swing.JSplitPane SplitVista;
    private javax.swing.JSplitPane Split_a;
    private javax.swing.JTextPane descrip;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}