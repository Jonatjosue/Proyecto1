
package conexionsql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexionsql {
Connection conectar=null;
 public Connection conexion() {
     
try{

        Class.forName("com.mysql.jdbc.Driver");

          conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/conector","root","");

//          JOptionPane.showMessageDialog(null,"Conexion Exitosa");

        }

        catch (Exception e){
          JOptionPane.showMessageDialog(null,"Eror Conexión"+e.getMessage());

        }

        return conectar;

    }

}

