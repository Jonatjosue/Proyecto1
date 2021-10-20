
package folder;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conectora {
    Connection conectar= null;
    
    public Connection conexion (){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar =(Connection)  DriverManager.getConnection("jdbc:mysql://localhost/conector", "root","");
            
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error de conexion" + e.getMessage());
        }
        return conectar; 
    }
    
}

