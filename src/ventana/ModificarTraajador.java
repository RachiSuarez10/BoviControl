/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventana;
import java.sql.*;
import conectar.Conexion;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author suare
 */
public class ModificarTraajador extends javax.swing.JPanel {

    /**
     * Creates new form ModificarTraajador
     */ Color color2 = new Color(0, 148, 104);
     int iduser;
    public ModificarTraajador() {
        initComponents();
        iduser = Login.iduser;
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
        jLabel10 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txtapellidop = new javax.swing.JTextField();
        txtapellidom = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("id trabajador");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, -1));

        txtid.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 240, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_search_24px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 30, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 148, 104));
        jLabel1.setText("Modificar trabajador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 80));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, -1));

        txt_nombre.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 240, 30));

        txtapellidop.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txtapellidop, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 240, 30));

        txtapellidom.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txtapellidom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 240, 30));

        txtedad.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 240, 30));

        txttelefono.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 240, 30));

        txtcorreo.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 240, 30));

        txtdireccion.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 240, 30));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Direccion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 110, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Correo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 110, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Apellido paterno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Apellido materno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Edad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Telefono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 110, -1));

        btnGuardar1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login.png"))); // NOI18N
        btnGuardar1.setText("Actualizar");
        btnGuardar1.setBorder(null);
        btnGuardar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login transparente.png"))); // NOI18N
        btnGuardar1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton login.png"))); // NOI18N
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 150, -1));

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

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        //verificar que no este vacia la casilla de id trabajador
        String idtrabajador;
        idtrabajador = txtid.getText();

        if (!idtrabajador.equals("")) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst =cn.prepareStatement(
                    "select nombre_emp,apellidoP_emp,apellidoM_emp,edad,telefono_emp,direccion_emp,correo_emp from empleados where idempleados='" + idtrabajador+"'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    txt_nombre.setText(rs.getString("nombre_emp"));
                    txtapellidop.setText(rs.getString("apellidoP_emp"));
                    txtapellidom.setText(rs.getString("apellidoM_emp"));
                    txtedad.setText(rs.getString("edad"));
                    txttelefono.setText(rs.getString("telefono_emp"));
                    txtdireccion.setText(rs.getString("direccion_emp"));
                    txtcorreo.setText(rs.getString("correo_emp"));

                    cn.close();
                } else {

                    JOptionPane.showMessageDialog(null, "El trabajador no existe");
                    cn.close();
                }

            } catch (SQLException e) {
                System.err.println("Error al consultar datos " + e);
                JOptionPane.showMessageDialog(null, "Error al Buscar trabajador");
            }

        }else{

            JOptionPane.showMessageDialog(null,"Ingrese el id del trabajador");
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        //recuperar datos para validar casillas

        String nombre,apellidop,apellidom,edad,telefono,direccion,correo;
        int bandera = 0;
        String idtrabajador = txtid.getText();
        nombre = txt_nombre.getText();
        apellidop = txtapellidop.getText();
        apellidom = txtapellidom.getText();
        edad = txtedad.getText();
        telefono = txttelefono.getText();
        direccion = txtdireccion.getText();
        correo = txtcorreo.getText();

        if (nombre.equals("")) {
            txt_nombre.setBackground(color2);
            bandera++;
        }
        if (apellidop.equals("")) {
            txtapellidop.setBackground(color2);
            bandera++;
        }
        if (apellidom.equals("")) {
            txtapellidom.setBackground(color2);
            bandera++;
        }
        if (edad.equals("")) {
            txtedad.setBackground(color2);
            bandera++;
        }
        if (telefono.equals("")) {
            txttelefono.setBackground(color2);
            bandera++;
        }
        if (direccion.equals("")) {
            txtdireccion.setBackground(color2);
            bandera++;
        }
        if (correo.equals("")) {
            txtcorreo.setBackground(color2);
            bandera++;

        }
        if (bandera == 0) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "update empleados set nombre_emp=?,apellidoP_emp=?,apellidoM_emp=?,edad=?,telefono_emp=?,direccion_emp=?,correo_emp=?  where idempleados='" + idtrabajador+"'");

                
                pst.setString(1, nombre);
                pst.setString(2, apellidop);
                pst.setString(3, apellidom);
                pst.setString(4, edad);
                pst.setString(5, telefono);
                pst.setString(6, direccion);
                pst.setString(7, correo);

                pst.executeUpdate();
                cn.close();

                JOptionPane.showMessageDialog(null, "El trabajador se actualizo ");

               

            } catch (SQLException e) {

                System.err.println("Erro al guardar los datos de trabajador " + e);
                JOptionPane.showMessageDialog(null, "Error al modificar usuario");

            }

        }else{

            JOptionPane.showMessageDialog(null, "Debe llenar todo los campos");
            //regresar a balca las casillas
            txt_nombre.setBackground(Color.white);
            txtapellidom.setBackground(Color.white);
            txtapellidop.setBackground(Color.white);
            txtcorreo.setBackground(Color.white);
            txtdireccion.setBackground(Color.white);
            txtedad.setBackground(Color.white);
            txttelefono.setBackground(Color.white);
        }

    }//GEN-LAST:event_btnGuardar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txtapellidom;
    private javax.swing.JTextField txtapellidop;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
