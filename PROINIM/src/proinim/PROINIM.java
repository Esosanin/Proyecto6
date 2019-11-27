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
        String password = "1234JMRM0307";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String host = "148.225.60.115";
        String nameDB = "DVDRental";
        String portDB = "1433";
        String url = "jdbc:sqlserver://"+host+":"+portDB+";databaseName="+nameDB;
        
        Base0 enter = new Base0();
        Base0.create(url, user, password, driver);
        
        enter.setVisible(true);
        enter.setLocationRelativeTo(null);
        enter.setTitle("DataBase DVDRental");
        
    }
    
}
