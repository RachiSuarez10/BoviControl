/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventana;

import conectar.Conexion;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suare
 */
public class TablaUsuario extends javax.swing.JPanel {

    /**
     * Creates new form TablaUsuario
     */
      DefaultTableModel model = new DefaultTableModel();
    public TablaUsuario() {
        initComponents();
        
         setSize(880, 400);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idusuarios, nombre_us,telefono_us,tipo_us,estado from usuarios");
            /* "select resultadotestpsico, resultadotestcondu from resultados inner join usuarios using(id_usuario) "
                    + "where id_usuario = '" + idusuario + "'");*/

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                Jtableusuario = new JTable(model);
                jScrollPane1.setViewportView(Jtableusuario);

                model.addColumn("id");
                model.addColumn("Nombre");
                model.addColumn("Telefono");
                model.addColumn("Tipo de usuario");
                model.addColumn("Estado");

                while (rs.next()) {   //mientra encuentre datos

                    Object[] fila = new Object[5];

                    for (int i = 0; i < 5; i++) {

                        fila[i] = rs.getObject(i + 1);

                    }
                    model.addRow(fila);
                }
                cn.close();

            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al llenar la tabla");
            System.err.println("Error al llenar la tabla " + e);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtableusuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jtableusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Jtableusuario.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Jtableusuario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 860, 320));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 148, 104));
        jLabel1.setText("Usuarios registrados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 80));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtableusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
