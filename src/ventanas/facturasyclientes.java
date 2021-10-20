
package ventanas;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexionsql.conexionsql;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.ResultSetRow;

public class facturasyclientes extends javax.swing.JFrame {
    
        conexionsql cc = new conexionsql();
        Connection con = cc.conexion();
    

    public facturasyclientes() {
        initComponents();
        limpiar();
        bloquear();
        mostrardatos();

        
        
    this.setLocationRelativeTo(null);
    
    }
    void limpiar(){
    t_ingredatos.setText("");
    t_ingrenit.setText("");
    t_ingrenombre.setText("");
    t_ingrenumero.setText("");
    t_ingrecorreo.setText("");
    }
    void bloquear(){
    t_ingredatos.setEnabled(false);
    t_ingrenit.setEnabled(false);
    t_ingrenombre.setEnabled(false);
    t_ingrenumero.setEnabled(false);
    t_ingrecorreo.setEnabled(false);
    b_1.setEnabled(false);
    compra.setEnabled(true);
    b_3.setEnabled(true);
    }
    void desbloquear(){
    t_ingredatos.setEnabled(true);
    t_ingrenit.setEnabled(true);
    t_ingrenombre.setEnabled(true);
    t_ingrenumero.setEnabled(true);
    t_ingrecorreo.setEnabled(true);
    b_1.setEnabled(true);
    compra.setEnabled(true);
    b_3.setEnabled(false);
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/LOGO.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        jLabel1titulo = new javax.swing.JLabel();
        t_ingredatos = new javax.swing.JTextField();
        t_ingrenit = new javax.swing.JTextField();
        t_ingrenumero = new javax.swing.JTextField();
        t_ingrecorreo = new javax.swing.JTextField();
        t_ingrenombre = new javax.swing.JTextField();
        compra = new javax.swing.JButton();
        jLabel1ingresardatos = new javax.swing.JLabel();
        jLabel1ingresanit = new javax.swing.JLabel();
        jLabel1ingresarnombre = new javax.swing.JLabel();
        jLabel1ingresaremail = new javax.swing.JLabel();
        jLabel1ingresarnumero = new javax.swing.JLabel();
        b_3 = new javax.swing.JButton();
        b_1 = new javax.swing.JButton();
        jButton1regreamenu = new javax.swing.JButton();
        jButton1salir = new javax.swing.JButton();
        jLabel1fondo2 = new javax.swing.JLabel();
        jLabel1fondo = new javax.swing.JLabel();
        jLabel1fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        tablita.setBackground(new java.awt.Color(0, 102, 102));
        tablita.setForeground(new java.awt.Color(255, 255, 255));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablita.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tablita.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablita);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 740, 410));

        jLabel1titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1titulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1titulo.setText("FACTURACION Y CLIENTES ");
        getContentPane().add(jLabel1titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        t_ingredatos.setBackground(new java.awt.Color(0, 102, 102));
        t_ingredatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_ingredatos.setForeground(new java.awt.Color(255, 255, 255));
        t_ingredatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ingredatosActionPerformed(evt);
            }
        });
        getContentPane().add(t_ingredatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 240, 30));

        t_ingrenit.setBackground(new java.awt.Color(0, 102, 102));
        t_ingrenit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_ingrenit.setForeground(new java.awt.Color(255, 255, 255));
        t_ingrenit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ingrenitActionPerformed(evt);
            }
        });
        getContentPane().add(t_ingrenit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 30));

        t_ingrenumero.setBackground(new java.awt.Color(0, 102, 102));
        t_ingrenumero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_ingrenumero.setForeground(new java.awt.Color(255, 255, 255));
        t_ingrenumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ingrenumeroActionPerformed(evt);
            }
        });
        getContentPane().add(t_ingrenumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 240, 30));

        t_ingrecorreo.setBackground(new java.awt.Color(0, 102, 102));
        t_ingrecorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_ingrecorreo.setForeground(new java.awt.Color(255, 255, 255));
        t_ingrecorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ingrecorreoActionPerformed(evt);
            }
        });
        getContentPane().add(t_ingrecorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 240, 30));

        t_ingrenombre.setBackground(new java.awt.Color(0, 102, 102));
        t_ingrenombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_ingrenombre.setForeground(new java.awt.Color(255, 255, 255));
        t_ingrenombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ingrenombreActionPerformed(evt);
            }
        });
        getContentPane().add(t_ingrenombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 240, 30));

        compra.setBackground(new java.awt.Color(0, 102, 102));
        compra.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        compra.setForeground(new java.awt.Color(255, 255, 255));
        compra.setText("COMPRA");
        compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraActionPerformed(evt);
            }
        });
        getContentPane().add(compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 200, 30));

        jLabel1ingresardatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1ingresardatos.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1ingresardatos.setText("INGRESAR PRODUCTO");
        getContentPane().add(jLabel1ingresardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel1ingresanit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1ingresanit.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1ingresanit.setText("INGRESAR NIT");
        getContentPane().add(jLabel1ingresanit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel1ingresarnombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1ingresarnombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1ingresarnombre.setText("INGRESAR NOMBRE");
        getContentPane().add(jLabel1ingresarnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel1ingresaremail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1ingresaremail.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1ingresaremail.setText("INGRESAR CORREO ELECTRONICO");
        getContentPane().add(jLabel1ingresaremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel1ingresarnumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1ingresarnumero.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1ingresarnumero.setText("INGRESAR NUMERO");
        getContentPane().add(jLabel1ingresarnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        b_3.setBackground(new java.awt.Color(0, 102, 102));
        b_3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        b_3.setForeground(new java.awt.Color(255, 255, 255));
        b_3.setText("NUEVO ");
        b_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_3ActionPerformed(evt);
            }
        });
        getContentPane().add(b_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 200, 30));

        b_1.setBackground(new java.awt.Color(0, 102, 102));
        b_1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        b_1.setForeground(new java.awt.Color(255, 255, 255));
        b_1.setText("AGREGAR DATOS ");
        b_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_1ActionPerformed(evt);
            }
        });
        getContentPane().add(b_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 200, 30));

        jButton1regreamenu.setBackground(new java.awt.Color(255, 255, 255));
        jButton1regreamenu.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1regreamenu.setForeground(new java.awt.Color(0, 0, 0));
        jButton1regreamenu.setText("REGRESAR");
        jButton1regreamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1regreamenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1regreamenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jButton1salir.setBackground(new java.awt.Color(255, 255, 255));
        jButton1salir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1salir.setForeground(new java.awt.Color(0, 0, 0));
        jButton1salir.setText("X");
        jButton1salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1salirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, -1, 20));

        jLabel1fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturacion.jpeg"))); // NOI18N
        getContentPane().add(jLabel1fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 360, 620));

        jLabel1fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturacion.jpeg"))); // NOI18N
        getContentPane().add(jLabel1fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        jLabel1fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturacion.jpeg"))); // NOI18N
        getContentPane().add(jLabel1fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 550, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1salirActionPerformed
    
    
    private void t_ingrecorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ingrecorreoActionPerformed
      t_ingrecorreo.transferFocus();
    }//GEN-LAST:event_t_ingrecorreoActionPerformed

    private void t_ingrenombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ingrenombreActionPerformed
      t_ingrenombre.transferFocus();
    }//GEN-LAST:event_t_ingrenombreActionPerformed

    private void t_ingrenumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ingrenumeroActionPerformed
        t_ingrenumero.transferFocus();
    }//GEN-LAST:event_t_ingrenumeroActionPerformed

    private void jButton1regreamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1regreamenuActionPerformed
        this.setVisible(false);
        menupri c= new menupri();
        c.setVisible(true);
    }//GEN-LAST:event_jButton1regreamenuActionPerformed

    private void t_ingredatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ingredatosActionPerformed
        t_ingredatos.transferFocus();
    }//GEN-LAST:event_t_ingredatosActionPerformed

    private void t_ingrenitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ingrenitActionPerformed
       t_ingrenit.transferFocus();
    }//GEN-LAST:event_t_ingrenitActionPerformed

    private void b_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_3ActionPerformed
        limpiar();
        desbloquear();
    }//GEN-LAST:event_b_3ActionPerformed

    private void b_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_1ActionPerformed
      
        try {
            
            String SQL = "insert into facyclie (datos, nit, nombre, numero, gmail) values(?,?,?,?,?) ";
            
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            
            pst.setString(1,t_ingredatos.getText() );
            pst.setString(2,t_ingrenit.getText());
            pst.setString(3,t_ingrenombre.getText() );
            pst.setString(4,t_ingrenumero.getText() );
            pst.setString(5,t_ingrecorreo.getText() );
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null," Datos guardados ");
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Error al guardar datos" + e.getMessage());
        }
        limpiar();
        mostrardatos();
        bloquear();
    }//GEN-LAST:event_b_1ActionPerformed

    private void compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraActionPerformed
        JOptionPane.showMessageDialog(null,"FACTURA REALIZADA CON EXITO"
                + "TECNO COMPUTER JUNIOR"
                + "NO PERDER PARA APLICAR RECLAMO O DEBOLUCION"
                + "ESTA FACTURA PERTENECE A"
                 );
        
    }//GEN-LAST:event_compraActionPerformed

    private void mostrardatos (){
        
        String[] titulos={"Producto","Nit","Nombre","Numero","Gmail"};
        String[] registro=new String[5];
        
        DefaultTableModel modelo = new DefaultTableModel (null, titulos);
        
        String SQL ="select * from facyclie";
        
        try {
            
            Statement st = (Statement) con.createStatement();
            java.sql.ResultSet rs = st.executeQuery(SQL);
            
            while (rs.next()) {
                
                registro[0]=rs.getString("datos");
                registro[1]=rs.getString("nit");
                registro[2]=rs.getString("nombre");
                registro[3]=rs.getString("numero");
                registro[4]=rs.getString("gmail");
                    
                modelo.addRow(registro);
                
                
            }
            tablita.setModel(modelo);
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error al mostrar Datos" + e.getMessage());
        }
        
    }
     
   
        

        
    
    
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
            java.util.logging.Logger.getLogger(facturasyclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturasyclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturasyclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturasyclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facturasyclientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_1;
    private javax.swing.JButton b_3;
    private javax.swing.JButton compra;
    private javax.swing.JButton jButton1regreamenu;
    private javax.swing.JButton jButton1salir;
    private javax.swing.JLabel jLabel1fondo;
    private javax.swing.JLabel jLabel1fondo2;
    private javax.swing.JLabel jLabel1fondo3;
    private javax.swing.JLabel jLabel1ingresanit;
    private javax.swing.JLabel jLabel1ingresardatos;
    private javax.swing.JLabel jLabel1ingresaremail;
    private javax.swing.JLabel jLabel1ingresarnombre;
    private javax.swing.JLabel jLabel1ingresarnumero;
    private javax.swing.JLabel jLabel1titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_ingrecorreo;
    private javax.swing.JTextField t_ingredatos;
    private javax.swing.JTextField t_ingrenit;
    private javax.swing.JTextField t_ingrenombre;
    private javax.swing.JTextField t_ingrenumero;
    private javax.swing.JTable tablita;
    // End of variables declaration//GEN-END:variables
}
