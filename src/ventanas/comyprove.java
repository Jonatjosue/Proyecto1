/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexionsql.conexionsql;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Catito
 */
public class comyprove extends javax.swing.JFrame {

    conexionsql cc = new conexionsql();
        Connection con = cc.conexion();
    
    public comyprove() {
        initComponents();
        limpiar();
        mostrardatos();
        
        
        this.setLocationRelativeTo(null);
      
    
    }
    
    void limpiar(){
    t_agregarprove.setText("");
    t_Gmail.setText("");
    t_numero.setText("");
    t_agregarprod.setText("");
    t_monto.setText("");
    t_infoservis.setText("");
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
        b_1 = new javax.swing.JButton();
        jButton1regreamenu = new javax.swing.JButton();
        jButton1salir = new javax.swing.JButton();
        jLabel1agregarprove = new javax.swing.JLabel();
        t_agregarprove = new javax.swing.JTextField();
        jLabel1ingrenum = new javax.swing.JLabel();
        t_Gmail = new javax.swing.JTextField();
        jLabel1corre = new javax.swing.JLabel();
        t_numero = new javax.swing.JTextField();
        jLabel1infodeservis = new javax.swing.JLabel();
        t_infoservis = new javax.swing.JTextField();
        jLabel1agregarprod = new javax.swing.JLabel();
        t_agregarprod = new javax.swing.JTextField();
        jLabel1verificarmont = new javax.swing.JLabel();
        t_monto = new javax.swing.JTextField();
        jLabel1titulo = new javax.swing.JLabel();
        jLabel1fondo = new javax.swing.JLabel();
        jLabel1fondo2 = new javax.swing.JLabel();
        jLabel1fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        tablita.setBackground(new java.awt.Color(0, 102, 102));
        tablita.setForeground(new java.awt.Color(0, 0, 0));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
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
        jScrollPane1.setViewportView(tablita);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 910, 370));

        b_1.setBackground(new java.awt.Color(0, 102, 102));
        b_1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        b_1.setForeground(new java.awt.Color(255, 255, 255));
        b_1.setText("AGREGAR ");
        b_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_1ActionPerformed(evt);
            }
        });
        getContentPane().add(b_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 120, 30));

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
        getContentPane().add(jButton1salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, 20));

        jLabel1agregarprove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1agregarprove.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1agregarprove.setText("AGREGA PROVEEDOR");
        getContentPane().add(jLabel1agregarprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        t_agregarprove.setBackground(new java.awt.Color(0, 102, 102));
        t_agregarprove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_agregarprove.setForeground(new java.awt.Color(255, 255, 255));
        t_agregarprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_agregarproveActionPerformed(evt);
            }
        });
        getContentPane().add(t_agregarprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 240, 30));

        jLabel1ingrenum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1ingrenum.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1ingrenum.setText("INGRESAR NUMERO");
        getContentPane().add(jLabel1ingrenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        t_Gmail.setBackground(new java.awt.Color(0, 102, 102));
        t_Gmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_Gmail.setForeground(new java.awt.Color(255, 255, 255));
        t_Gmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_GmailActionPerformed(evt);
            }
        });
        getContentPane().add(t_Gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 240, 30));

        jLabel1corre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1corre.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1corre.setText("INGRESAR CORREO ELECTRONICO");
        getContentPane().add(jLabel1corre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        t_numero.setBackground(new java.awt.Color(0, 102, 102));
        t_numero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_numero.setForeground(new java.awt.Color(255, 255, 255));
        t_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_numeroActionPerformed(evt);
            }
        });
        getContentPane().add(t_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 240, 30));

        jLabel1infodeservis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1infodeservis.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1infodeservis.setText("INFORMACION DE LOS SERVICIOS");
        getContentPane().add(jLabel1infodeservis, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 230, -1));

        t_infoservis.setBackground(new java.awt.Color(0, 102, 102));
        t_infoservis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_infoservis.setForeground(new java.awt.Color(255, 255, 255));
        t_infoservis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_infoservisActionPerformed(evt);
            }
        });
        getContentPane().add(t_infoservis, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 240, 30));

        jLabel1agregarprod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1agregarprod.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1agregarprod.setText("AGREGAR PRODUCTO");
        getContentPane().add(jLabel1agregarprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        t_agregarprod.setBackground(new java.awt.Color(0, 102, 102));
        t_agregarprod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_agregarprod.setForeground(new java.awt.Color(255, 255, 255));
        t_agregarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_agregarprodActionPerformed(evt);
            }
        });
        getContentPane().add(t_agregarprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, 30));

        jLabel1verificarmont.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1verificarmont.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1verificarmont.setText("CANTIDAD DE PRODUCTOS");
        getContentPane().add(jLabel1verificarmont, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        t_monto.setBackground(new java.awt.Color(0, 102, 102));
        t_monto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        t_monto.setForeground(new java.awt.Color(255, 255, 255));
        t_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_montoActionPerformed(evt);
            }
        });
        getContentPane().add(t_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 240, 30));

        jLabel1titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1titulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1titulo.setText("COMPRAS Y PROVEEDORES");
        getContentPane().add(jLabel1titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel1fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturacion.jpeg"))); // NOI18N
        getContentPane().add(jLabel1fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        jLabel1fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturacion.jpeg"))); // NOI18N
        getContentPane().add(jLabel1fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 360, 620));

        jLabel1fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturacion.jpeg"))); // NOI18N
        getContentPane().add(jLabel1fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 360, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_infoservisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_infoservisActionPerformed
       t_infoservis.transferFocus();
    }//GEN-LAST:event_t_infoservisActionPerformed

    private void t_GmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_GmailActionPerformed
        t_Gmail.transferFocus();
    }//GEN-LAST:event_t_GmailActionPerformed

    private void jButton1salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1salirActionPerformed

    private void jButton1regreamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1regreamenuActionPerformed
        this.setVisible(false);
        menupri c= new menupri();
        c.setVisible(true);
    }//GEN-LAST:event_jButton1regreamenuActionPerformed

    private void t_agregarproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_agregarproveActionPerformed
            t_agregarprove.transferFocus();
    }//GEN-LAST:event_t_agregarproveActionPerformed
             
    private void b_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_1ActionPerformed
       
        b_1.transferFocus();
        try {
            
       String SQL = "insert into comypro (proveedor,gmail,numero,producto,monto,servicios) values(?,?,?,?,?,?) ";
            
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            
            pst.setString(1,t_agregarprove.getText() );
            pst.setString(2,t_Gmail.getText());
            pst.setString(3,t_numero.getText() );
            pst.setString(4,t_agregarprod.getText() );
            pst.setString(5,t_monto.getText() );
            pst.setString(6,t_infoservis.getText() );
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null," Datos guardados ");
            
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Error al guardar datos" + e.getMessage());
        }
        limpiar();
        mostrardatos ();
    }//GEN-LAST:event_b_1ActionPerformed

    private void t_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_numeroActionPerformed
       t_numero.transferFocus();
    }//GEN-LAST:event_t_numeroActionPerformed

    private void t_agregarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_agregarprodActionPerformed
        t_agregarprod.transferFocus();
    }//GEN-LAST:event_t_agregarprodActionPerformed

    private void t_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_montoActionPerformed
        t_monto.transferFocus();
    }//GEN-LAST:event_t_montoActionPerformed

    private void mostrardatos (){
        
        String[] titulos={"Proveedor","Gmail","Numero","Producto","Monto","Servicio"};
        String[] registro=new String[6];
        
        DefaultTableModel modelo = new DefaultTableModel (null, titulos);
        
        String SQL ="select * from comypro";
        
        try {
            
            Statement st = (Statement) con.createStatement();
            java.sql.ResultSet rs = st.executeQuery(SQL);
            
            while (rs.next()) {
                
                registro[0]=rs.getString("proveedor");
                registro[1]=rs.getString("gmail");
                registro[2]=rs.getString("numero");
                registro[3]=rs.getString("producto");
                registro[4]=rs.getString("monto");
                registro[5]=rs.getString("servicios");
                    
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
            java.util.logging.Logger.getLogger(comyprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(comyprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(comyprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(comyprove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comyprove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_1;
    private javax.swing.JButton jButton1regreamenu;
    private javax.swing.JButton jButton1salir;
    private javax.swing.JLabel jLabel1agregarprod;
    private javax.swing.JLabel jLabel1agregarprove;
    private javax.swing.JLabel jLabel1corre;
    private javax.swing.JLabel jLabel1fondo;
    private javax.swing.JLabel jLabel1fondo2;
    private javax.swing.JLabel jLabel1fondo3;
    private javax.swing.JLabel jLabel1infodeservis;
    private javax.swing.JLabel jLabel1ingrenum;
    private javax.swing.JLabel jLabel1titulo;
    private javax.swing.JLabel jLabel1verificarmont;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_Gmail;
    private javax.swing.JTextField t_agregarprod;
    private javax.swing.JTextField t_agregarprove;
    private javax.swing.JTextField t_infoservis;
    private javax.swing.JTextField t_monto;
    private javax.swing.JTextField t_numero;
    private javax.swing.JTable tablita;
    // End of variables declaration//GEN-END:variables
}
