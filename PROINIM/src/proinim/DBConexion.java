package proinim;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DBConexion {

    public Connection miConexion;
    private final String URL;
    private final String USER;
    private final String PASS;

    public DBConexion(String URL, String USER, String PASS) {
        this.URL = URL;
        this.USER = USER;
        this.PASS = PASS;
    }

    public DefaultTableModel ejecutaSelect(String consulta) throws SQLException {
        Statement st = null;
        ResultSet rs = null;
        DefaultTableModel dtm = new DefaultTableModel();
        try {
            // Establece conexion con la base de datos
            miConexion = DriverManager.getConnection(URL, USER, PASS);
            // Crea un scroller
            
            st = miConexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            // Hace la consulta Select * Table
            rs = st.executeQuery(consulta);
            // Resultados de la tabla de la base de datos
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                // Se añade cada columna
                dtm.addColumn(rsmd.getColumnName(i));
            }
            int numeroRegistros = 0; // Se agregan los registros al modelo de datos
            if (rs.last()) { // Coloca el cursor en el último registro
                numeroRegistros = rs.getRow(); // Toma la cantidad de renglones
            }
            rs.beforeFirst(); // Coloca el cursor en el primer registro
            if (numeroRegistros > 0) {
                // Se crea un arreglo de Objetos ya que hay diferentes tipos de datos
                Object[] registros = new Object[rsmd.getColumnCount()];
                
                while (rs.next()) {
                    // Por cada columna obtiene el valor de la celda
                    for (int i = 0; i < rsmd.getColumnCount(); i++) {
                        // Toma los registros de cada celda
                        registros[i] = rs.getObject(i + 1);
                    }
                    // Añade los registros a los renglones
                    dtm.addRow(registros);
                }
            }
            
            // Regresa el modelo de la base de datos
            return dtm;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Excepción: " + ex.toString());
            System.out.println("Excepción: " + ex.toString());
        } finally {
            // Cierra las conexiones
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (miConexion != null) {
                    miConexion.close();
                }
            } catch (Exception ex) {
                System.out.println("Excepción: " + ex.toString());
            }

        }

        return null;
    }
    
    public boolean ejecutaEdit(String consulta){
        Statement st = null;
        int regreso = 0;
        try { // try-catch-finally
            miConexion = DriverManager.getConnection(URL, USER, PASS);
            // Inicializar Statement y Resulset
            st = miConexion.createStatement();
            regreso = st.executeUpdate(consulta);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Excepción: " + ex.toString());
            System.out.println("Excepción: " + ex.toString());
        } finally {
            // Cierra o null los objetos
            try {
                if (st != null) {
                    st.close();
                }
                if (miConexion != null) {
                    miConexion.close();
                }
            } catch (SQLException ex) {
                System.out.println("Excepción: " + ex.toString());
            }

        }
        if (regreso > 0) {
            return true;
        }
        return false;
    }

    public boolean ejecutaInsert(String consulta) {
        Statement st = null;
        int regreso = 0;
        try { // try-catch-finally
            miConexion = DriverManager.getConnection(URL, USER, PASS);
            // Inicializar Statement y Resulset
            st = miConexion.createStatement();
            regreso = st.executeUpdate(consulta);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Excepción: " + ex.toString());
            System.out.println("Excepción: " + ex.toString());
        } finally {
            // Cierra o null los objetos
            try {
                if (st != null) {
                    st.close();
                }
                if (miConexion != null) {
                    miConexion.close();
                }
            } catch (SQLException ex) {
                System.out.println("Excepción: " + ex.toString());
            }

        }
        if (regreso > 0) {
            return true;
        }
        return false;

    }

    public boolean DeleteQuery(String consulta) throws SQLException {
        Connection cxn = DriverManager.getConnection(URL, USER, PASS);
        Statement st = cxn.createStatement();    
        int regreso = 0;
        try {
           //regreso = st.executeQuery(consulta);
           regreso = st.executeUpdate(consulta);
        } catch (SQLException sqlex) {
            System.out.println("Excepción: " + sqlex.toString());
        }
        if (regreso > 0) {
            return true;
        }
        return false;
    }
}
