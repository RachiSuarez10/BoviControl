/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventana;

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
public class AgregarProductoNuevo extends javax.swing.JPanel {

    int id;

    Color color = new Color(0, 222, 157);
    Color color2 = new Color(0, 148, 104);

    public AgregarProductoNuevo() {
        initComponents();
        JComponent RootPaneUI = null;

        id = Login.iduser;

        //rellenar comboBox
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_cod_barras = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 148, 104));
        jLabel1.setText("Agregar producto nuevo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 80));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Precio");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, -1));

        txt_cantidad.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 90, 25));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Código de barras");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Descripción ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Cantidad");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, -1));

        txt_cod_barras.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        add(txt_cod_barras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 240, 30));

        txt_descripcion.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 240, 25));

        txt_precio.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 90, 25));

        btnLimpiar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login transparente.png"))); // NOI18N
        btnLimpiar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login.png"))); // NOI18N
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 150, -1));

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
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //boton giuardar
        //recuperar datos
        String descripcion, cod_barras, cantidad, precio;

        int bandera = 0;

        cod_barras = txt_cod_barras.getText();
        descripcion = txt_descripcion.getText();
        precio = txt_precio.getText();
        cantidad = txt_cantidad.getText();

        //validar casillas acias
        if (descripcion.equals("")) {
            txt_descripcion.setBackground(color2);
            bandera++;
        }

        if (cod_barras.equals("")) {
            txt_cod_barras.setBackground(color2);
            bandera++;
        }

        if (cantidad.equals("")) {
            txt_cantidad.setBackground(color2);
            bandera++;
        }

        if (precio.equals("")) {
            txt_precio.setBackground(color2);
            bandera++;
        }

        if (bandera == 0) {
            try {
                String barra = txt_cod_barras.getText();

                Connection cn1 = Conexion.conectar();
                PreparedStatement pst1 = cn1.prepareStatement(
                        "select idalmacen from almacen where idalmacen ='" + barra + "'");

                ResultSet rs1 = pst1.executeQuery();
                if (rs1.next()) {

                    JOptionPane.showMessageDialog(null, "El codigo de barra ya esta registrado ");

                } else {

                    //conectar a la base de datos
                    try {

                        Double preci = Double.parseDouble(precio);
                        int canti = Integer.parseInt(cantidad);
                        String fe = fecha();

                        Connection cn = Conexion.conectar();
                        PreparedStatement pst = cn.prepareStatement(
                                "insert into almacen value (?,?,?,?,?,?) ");

                        pst.setString(1, cod_barras);
                        pst.setInt(2, id);
                        pst.setString(3, descripcion);
                        pst.setDouble(4, preci);
                        pst.setString(5, "fgg");
                        pst.setInt(6, canti);

                        pst.executeUpdate();
                        cn.close();

                        txt_cod_barras.setText("");
                        txt_cantidad.setText("");
                        txt_descripcion.setText("");
                        txt_precio.setText("");

                        JOptionPane.showMessageDialog(null, "Resgitro exitoso");

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error al guardar prducto nuevo");
                        System.err.println("Error al guardadar producto nuevo " + e);
                    }

                }
            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "Error al comparar codigo de barras");
                System.err.println("error al comparar cod de barras " + e);
            }

        } else {

            JOptionPane.showMessageDialog(null, "Debe de llenr todo los datos");
            System.err.println("No lleno todo los datos ");
            txt_cantidad.setBackground(Color.WHITE);
            txt_cod_barras.setBackground(Color.WHITE);
            txt_descripcion.setBackground(Color.WHITE);
            txt_precio.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private String fecha() {
        Date fec = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY//MM/DD");

        return dateFormat.format(fec);
    }

    /*public void imprimirMes() {
        Mes.addItem("Enero");
        Mes.addItem("Febrero");
        Mes.addItem("Marzo");
        Mes.addItem("Abril");
        Mes.addItem("Mayo");
        Mes.addItem("Junio");
        Mes.addItem("Julio");
        Mes.addItem("Agosto");
        Mes.addItem("Septiembre");
        Mes.addItem("octubre");
        Mes.addItem("Nomvienbre");
        Mes.addItem("diciembre");

    }*/
    //metodo para llenar combobox de años
    /*private void imprimirAño() {
        int limite;
        limite = anio1 + 10; //para establecer un limite de años
        int contador;
        for (int i = anio1 - 1; i < limite; i++) {//or para aumentar automaticamente los diaS

            contador = i + 1;//contar los años

            anio.addItem(String.valueOf(contador));//volver strin

        }

    }*/
    //metodo para llenar combobox de dias
    /* private void imprimirDias() {

        for (int i = 0; i < 31; i++) {

            int contador = i + 1;

            Dia.addItem(String.valueOf(contador));

        }

    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_cod_barras;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
