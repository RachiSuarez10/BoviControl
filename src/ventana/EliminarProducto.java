/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventana;

import conectar.Conexion;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author suare
 */
public class EliminarProducto extends javax.swing.JPanel {

    /**
     * Creates new form EliminarProducto
     */
    Color color2 = new Color(0, 148, 104);

    public EliminarProducto() {
        initComponents();
        setSize(920, 440);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_cod_barras = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 148, 104));
        jLabel1.setText("Eliminar producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 80));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Código de barras");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        txt_cod_barras.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txt_cod_barras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 240, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_search_24px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 30, 30));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Descripción ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        txtdescripcion.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        txtdescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtdescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 135, 240, 30));

        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login.png"))); // NOI18N
        btnGuardar.setText("Eliminar");
        btnGuardar.setBorder(null);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login transparente.png"))); // NOI18N
        btnGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        String codbarra = txt_cod_barras.getText();

        if (!codbarra.equals("")) {
            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select nombre_prod from almacen where idalmacen ='" + codbarra + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    txtdescripcion.setText(rs.getString("nombre_prod"));

                    cn.close();

                } else {

                    JOptionPane.showMessageDialog(null, "No existe el produscto");
                }

            } catch (SQLException e) {

                System.err.println("Error al consultar producto " + e);
                JOptionPane.showMessageDialog(null, "Ocurrio un error al buscar producto");
            }
        } else {
            txt_cod_barras.setBackground(color2);
            JOptionPane.showMessageDialog(null, "Debe ingresar el codigo de barras");
            txt_cod_barras.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String codbarra;
        codbarra = txt_cod_barras.getText();
        
        //abrir conexion para eliminar producto
        if (!codbarra.equals("")) {
            
            try {
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "delete from almacen where idalmacen =?");
            
            pst.setString(1, codbarra);
            pst.executeUpdate();
            
            txt_cod_barras.setText("");
            txtdescripcion.setText("");
            JOptionPane.showMessageDialog(null, "El producto se elimino");
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error al eliminar producto");
            System.err.println("Error al eliminar producto " + e);
        }
        } else {
            
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de barras");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cod_barras;
    private javax.swing.JLabel txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
