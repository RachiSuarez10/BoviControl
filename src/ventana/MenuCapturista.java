/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import java.sql.*;
import conectar.Conexion;
import java.util.*;
import java.util.Date;
import fechayhora.Fecha;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author suare
 */
public class MenuCapturista extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form MenuCapturista
     */
    String usuario;
    String nombreusuario;
    int iduser;

    //variables para el reloj
    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread hilo1;

    int anio, mes, dia;
    static Calendar Fecha = Calendar.getInstance();

    Color color = new Color(0, 222, 157);
    Color color2 = new Color(0, 148, 104);

    public MenuCapturista() {
        initComponents();
        //setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
          //setSize(1128, 642);
        setResizable(false);
        setLocationRelativeTo(null);

        //para imprimir fecha
        dia = Fecha.get(Calendar.DATE);
        mes = Fecha.get(Calendar.MONTH);
        anio = Fecha.get(Calendar.YEAR);

        Fecha fe = new Fecha(dia, mes, anio);
        txt_fecha.setText(fe.imprimirFecha());

        iduser = Login.iduser;
        usuario = Login.usuario;
        nombreusuario = Login.nombreusuario;
        // this.setExtendedState(6);//pantalla completa

        txt_nombre.setText(nombreusuario);
        txt_username.setText(usuario);
        txtiduser.setText("ID usuario: " + iduser);

        //ejhecutar reloj
        hilo1 = new Thread(this);
        hilo1.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenido = new javax.swing.JPanel();
        panel_datos = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_nombre = new javax.swing.JLabel();
        txt_username = new javax.swing.JLabel();
        txtiduser = new javax.swing.JLabel();
        btn_bovi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ntn_almacen = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_vwntas = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelcontenedor = new javax.swing.JPanel();
        panelPrecentacion = new javax.swing.JPanel();
        txt_hora = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 890, 470));

        panel_datos.setBackground(new java.awt.Color(0, 148, 104));
        panel_datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        panel_datos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 20));

        txt_nombre.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nombre.setText("Nombre");
        panel_datos.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 90));

        txt_username.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setText("username");
        panel_datos.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        txtiduser.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtiduser.setForeground(new java.awt.Color(255, 255, 255));
        txtiduser.setText("idusuario");
        panel_datos.add(txtiduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 160, -1));

        btn_bovi.setBackground(new java.awt.Color(0, 148, 104));
        btn_bovi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bovi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_boviMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_boviMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_boviMouseExited(evt);
            }
        });
        btn_bovi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bovinos");
        btn_bovi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_year_of_ox_26px.png"))); // NOI18N
        btn_bovi.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        panel_datos.add(btn_bovi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 50));

        ntn_almacen.setBackground(new java.awt.Color(0, 148, 104));
        ntn_almacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ntn_almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ntn_almacenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ntn_almacenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ntn_almacenMouseExited(evt);
            }
        });
        ntn_almacen.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                ntn_almacenComponentMoved(evt);
            }
        });
        ntn_almacen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Almacen");
        ntn_almacen.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_collaborator_male_30px.png"))); // NOI18N
        ntn_almacen.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 30, -1));

        panel_datos.add(ntn_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 50));

        btn_vwntas.setBackground(new java.awt.Color(0, 148, 104));
        btn_vwntas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vwntas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vwntasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_vwntasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_vwntasMouseExited(evt);
            }
        });
        btn_vwntas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ventas");
        btn_vwntas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_sale_price_tag_30px.png"))); // NOI18N
        btn_vwntas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 30, -1));

        panel_datos.add(btn_vwntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 50));

        getContentPane().add(panel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 640));

        panelcontenedor.setBackground(new java.awt.Color(255, 255, 255));
        panelcontenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrecentacion.setBackground(new java.awt.Color(0, 222, 157));
        panelPrecentacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_hora.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        txt_hora.setForeground(new java.awt.Color(255, 255, 255));
        txt_hora.setText("11:37:4");
        panelPrecentacion.add(txt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, -1));

        txt_fecha.setBackground(new java.awt.Color(255, 255, 255));
        txt_fecha.setFont(new java.awt.Font("Roboto Medium", 0, 22)); // NOI18N
        txt_fecha.setForeground(new java.awt.Color(255, 255, 255));
        txt_fecha.setText("BoviControl");
        panelPrecentacion.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 40));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BoviControl");
        panelPrecentacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 280, 60));

        panelcontenedor.add(panelPrecentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 890, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cerrar.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadro_blanco.png"))); // NOI18N
        btn_cerrar.setText("X");
        btn_cerrar.setBorder(null);
        btn_cerrar.setFocusPainted(false);
        btn_cerrar.setFocusable(false);
        btn_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadro_blanco.png"))); // NOI18N
        btn_cerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadro_verde.png"))); // NOI18N
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 30, 30));

        btn_minimizar.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadro_blanco.png"))); // NOI18N
        btn_minimizar.setText("_");
        btn_minimizar.setBorder(null);
        btn_minimizar.setFocusPainted(false);
        btn_minimizar.setFocusable(false);
        btn_minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_minimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadro_blanco.png"))); // NOI18N
        btn_minimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadro_verde.png"))); // NOI18N
        btn_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 30, 30));

        panelcontenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 30));

        getContentPane().add(panelcontenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 890, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_minimizarActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        int xx = 0;
        int xy = 0;
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        //setOpacity((float) 0.8);
        int xx = evt.getX();
        int xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // setOpacity((float) 1.0);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void btn_boviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_boviMouseClicked
        PanelBovinos bovinos = new PanelBovinos();
        showPanel(bovinos);
    }//GEN-LAST:event_btn_boviMouseClicked

    private void btn_boviMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_boviMouseEntered
        btn_bovi.setBackground(color);
    }//GEN-LAST:event_btn_boviMouseEntered

    private void btn_boviMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_boviMouseExited
        btn_bovi.setBackground(color2);
    }//GEN-LAST:event_btn_boviMouseExited

    private void ntn_almacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ntn_almacenMouseClicked
        PanelAlmacen almacen = new PanelAlmacen();
        showPanel(almacen);
    }//GEN-LAST:event_ntn_almacenMouseClicked

    private void ntn_almacenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ntn_almacenMouseEntered
        ntn_almacen.setBackground(color);
    }//GEN-LAST:event_ntn_almacenMouseEntered

    private void ntn_almacenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ntn_almacenMouseExited
        ntn_almacen.setBackground(color2);
    }//GEN-LAST:event_ntn_almacenMouseExited

    private void ntn_almacenComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ntn_almacenComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ntn_almacenComponentMoved

    private void btn_vwntasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vwntasMouseClicked
        PanelVentas panelVentas = new PanelVentas();
        showPanel(panelVentas);
    }//GEN-LAST:event_btn_vwntasMouseClicked

    private void btn_vwntasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vwntasMouseEntered
        btn_vwntas.setBackground(color);
    }//GEN-LAST:event_btn_vwntasMouseEntered

    private void btn_vwntasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vwntasMouseExited
        btn_vwntas.setBackground(color2);
    }//GEN-LAST:event_btn_vwntasMouseExited

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
            java.util.logging.Logger.getLogger(MenuCapturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCapturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCapturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCapturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCapturista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_bovi;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JPanel btn_vwntas;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel ntn_almacen;
    private javax.swing.JPanel panelPrecentacion;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panelcontenedor;
    private javax.swing.JLabel txt_fecha;
    private javax.swing.JLabel txt_hora;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_username;
    private javax.swing.JLabel txtiduser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run(){
        Thread ct = Thread.currentThread();

        while (ct == hilo1) {
            calcula();
            txt_hora.setText(hora + ":" + minutos + ":" + segundos);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

       private void showPanel(JPanel p) {

        p.setSize(920, 470);
        p.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        contenido.revalidate();
        contenido.repaint();
    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        //verificar si la hora es am o pm
        if (ampm.equals("PM")) {

            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;

        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
}
