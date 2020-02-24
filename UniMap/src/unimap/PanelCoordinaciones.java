/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unimap;

import java.awt.event.MouseEvent;

/**
 *
 * @author usuariolocal
 */
public class PanelCoordinaciones extends javax.swing.JPanel implements java.awt.event.MouseListener{

    Loader Loader;
    /**
     * Creates new form PanelCoordinaciones
     */
    public PanelCoordinaciones(Loader Loader) {
        initComponents();
        
        this.Loader = Loader;
        Split_c.setDividerSize(0);
        SplitVista.setDividerSize(0);
        SplitDescrip.setDividerSize(0);
        Split_c.setOneTouchExpandable(false);
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
        Pdescrip = new javax.swing.JPanel();
        Pimage = new javax.swing.JPanel();
        Pmap = new javax.swing.JPanel();
        Pbuttons = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(879, 768));
        setMinimumSize(new java.awt.Dimension(879, 768));

        Split_c.setDividerLocation(145);
        Split_c.setMaximumSize(new java.awt.Dimension(879, 768));
        Split_c.setMinimumSize(new java.awt.Dimension(879, 768));
        Split_c.setPreferredSize(new java.awt.Dimension(879, 768));

        SplitVista.setBackground(new java.awt.Color(204, 204, 204));
        SplitVista.setDividerLocation(400);
        SplitVista.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        SplitVista.setMaximumSize(new java.awt.Dimension(734, 768));
        SplitVista.setMinimumSize(new java.awt.Dimension(734, 768));
        SplitVista.setPreferredSize(new java.awt.Dimension(734, 768));

        SplitDescrip.setBackground(new java.awt.Color(153, 153, 153));
        SplitDescrip.setDividerLocation(367);
        SplitDescrip.setMaximumSize(new java.awt.Dimension(367, 368));
        SplitDescrip.setMinimumSize(new java.awt.Dimension(367, 368));
        SplitDescrip.setPreferredSize(new java.awt.Dimension(367, 368));

        javax.swing.GroupLayout PdescripLayout = new javax.swing.GroupLayout(Pdescrip);
        Pdescrip.setLayout(PdescripLayout);
        PdescripLayout.setHorizontalGroup(
            PdescripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        PdescripLayout.setVerticalGroup(
            PdescripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        SplitDescrip.setLeftComponent(Pdescrip);

        javax.swing.GroupLayout PimageLayout = new javax.swing.GroupLayout(Pimage);
        Pimage.setLayout(PimageLayout);
        PimageLayout.setHorizontalGroup(
            PimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        PimageLayout.setVerticalGroup(
            PimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        SplitDescrip.setRightComponent(Pimage);

        SplitVista.setBottomComponent(SplitDescrip);

        javax.swing.GroupLayout PmapLayout = new javax.swing.GroupLayout(Pmap);
        Pmap.setLayout(PmapLayout);
        PmapLayout.setHorizontalGroup(
            PmapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        PmapLayout.setVerticalGroup(
            PmapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        SplitVista.setLeftComponent(Pmap);

        Split_c.setRightComponent(SplitVista);

        javax.swing.GroupLayout PbuttonsLayout = new javax.swing.GroupLayout(Pbuttons);
        Pbuttons.setLayout(PbuttonsLayout);
        PbuttonsLayout.setHorizontalGroup(
            PbuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );
        PbuttonsLayout.setVerticalGroup(
            PbuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );

        Split_c.setLeftComponent(Pbuttons);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 879, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Split_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Split_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pbuttons;
    private javax.swing.JPanel Pdescrip;
    private javax.swing.JPanel Pimage;
    private javax.swing.JPanel Pmap;
    private javax.swing.JSplitPane SplitDescrip;
    private javax.swing.JSplitPane SplitVista;
    private javax.swing.JSplitPane Split_c;
    // End of variables declaration//GEN-END:variables
}
