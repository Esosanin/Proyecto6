/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proinim;

/**
 *
 * @author usuariolocal
 */
public class PROINIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String user = "postgres";
        String password = "postgres";
        String driver = "org.postgresql.Driver";
        String host = "localhost";
        String nameDB = "PROINIM";
        String portDB = "6789";
        String url = "jdbc:postgresql://localhost:"+portDB+"/"+nameDB;
        Base0 enter = new Base0();
        Base0.create(url, user, password, driver);
        
        enter.setVisible(true);
        enter.setLocationRelativeTo(null);
        enter.setTitle("DataBase DVDRental");
        
    }
    
}
