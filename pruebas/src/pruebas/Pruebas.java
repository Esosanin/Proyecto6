
package pruebas;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Pruebas {

    public static void main(String[] args) throws InterruptedException {
        
        base enter = new base();
        enter.setTitle("PLATAFORMA");
        enter.setLocationRelativeTo(null);
        
//        JFrame jf = new JFrame("frame");
//        jf.setLocationRelativeTo(null);
//        jf.setSize(600,500);
        
//        SplitPane_create(jf);
//        GridLayout_create(jf);

        enter.setVisible(true);
    }

    private static void SplitPane_create(JFrame jf) {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
        JTextArea t1 = new JTextArea(5,5);
        JTextArea t2 = new JTextArea(5,5);
        
        t1.setText("this is first text area"); 
        t2.setText("this is second text area");
        
        p1.add(t1); 
        p2.add(t2); 
        
        bibliotecas b = new bibliotecas();
        
        JSplitPane splitPane = new JSplitPane(SwingConstants.VERTICAL, p3, b);
        
        splitPane.setDividerLocation(50);
        
        splitPane.setVisible(true);
        splitPane.setOrientation(SwingConstants.VERTICAL);
        
        jf.add(splitPane);
    }
    
    private static void GridLayout_create(JFrame jf){
        
        JPanel jp = new JPanel(new GridLayout(1,2,2,2));
        
        jp.add(new JTextArea("This is first text area"));
        jp.add(new JTextArea("This is second text area"));
        
        jf.add(jp);
        
    }
}
