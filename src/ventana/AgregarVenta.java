/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventana;

import java.awt.Color;

import edicionComboBox.EditarComboBox;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;
import conectar.Conexion;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author suare
 */
public class AgregarVenta extends javax.swing.JPanel {

    /**
     * Creates new form AgregarVenta
     */
    Color color2 = new Color(0, 148, 104);
    int id;
    String estado;

    public AgregarVenta() {
        initComponents();
        id = Login.iduser;
        setSize(898, 440);
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
        txtNombreComprador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        txtCostodeVenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtarete = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 148, 104));
        jLabel1.setText("Agregar venta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 80));

        txtNombreComprador.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txtNombreComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 100, 210, 25));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Nombre del comprador");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Precio de la venta");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, -1));

        txtFechaVenta.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        txtFechaVenta.setText("DD/MM/AAAA");
        txtFechaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaVentaMousePressed(evt);
            }
        });
        jPanel1.add(txtFechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 175, 240, 25));

        txtCostodeVenta.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txtCostodeVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 210, 90, 25));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Fecha de nacimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 150, -1));

        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login transparente.png"))); // NOI18N
        btnGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 150, -1));

        btnLimpiar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login transparente.png"))); // NOI18N
        btnLimpiar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 150, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("NO. Arete");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

        txtarete.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txtarete, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 140, 210, 25));

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

    private void txtFechaVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaVentaMousePressed
        txtFechaVenta.setText("");
    }//GEN-LAST:event_txtFechaVentaMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreComprador, fechaVenta, precioVenta, arete;
        int bandera = 0;

        nombreComprador = txtNombreComprador.getText();
        fechaVenta = txtFechaVenta.getText();
        precioVenta = txtCostodeVenta.getText();
        arete = txtarete.getText();

        if (nombreComprador.equals("")) {
            txtNombreComprador.setBackground(color2);
            bandera++;
        }
        if (fechaVenta.equals("")) {
            txtFechaVenta.setBackground(color2);
            bandera++;
        }
        if (precioVenta.equals("")) {
            txtCostodeVenta.setBackground(color2);
            bandera++;
        }
        if (arete.equals("")) {
            txtarete.setBackground(color2);
            bandera++;
        }

        if (bandera == 0) {

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into ventas values(?,?,?,?,?,?)");

                pst.setInt(1, 0);
                pst.setInt(2, id);
                pst.setInt(3, Integer.parseInt(arete));
                pst.setString(4, nombreComprador);
                pst.setString(5, fechaVenta);
                pst.setString(6, precioVenta);

                estado = "Inavtivo";

                pst.executeUpdate();
                cn.close();
                JOptionPane.showMessageDialog(null, "Venta registrada");

                try {

                    String ar = txtarete.getText();
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "update bovinos set estadobov =? where no_arete ='" + ar + "'");

                    pst2.setString(1, "Inactivo");

                    pst2.executeUpdate();
                    cn2.close();

                    txtFechaVenta.setText("DD/MM/AAAA");
                    txtNombreComprador.setText("");
                    txtCostodeVenta.setText("");
                    txtarete.setText("");

                } catch (SQLException e) {

                    System.err.println("Error al desactivar bovino " + e);
                    JOptionPane.showMessageDialog(null, "error al desactivar bovino");
                }

            } catch (SQLException e) {

                System.err.println("Error al registrar venta " + e);
                JOptionPane.showMessageDialog(null, "Error al registrar venta ");

            }

        } else {

            JOptionPane.showMessageDialog(null, "Debe llenar todo los campos");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtFechaVenta.setText("DD/MM/AAAA");
        txtNombreComprador.setText("");
        txtCostodeVenta.setText("");
        txtarete.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCostodeVenta;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtNombreComprador;
    private javax.swing.JTextField txtarete;
    // End of variables declaration//GEN-END:variables
}
