/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventana;

import javax.swing.JPanel;

/**
 *
 * @author suare
 */
public class PanelBovinos extends javax.swing.JPanel {

    /**
     * Creates new form PanelBovinos
     */
    public PanelBovinos() {
        initComponents();
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

        panelMenu = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Bovinos = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panelbovino = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonClaro150x30.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        panelMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 150, 30));

        jButton3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        jButton3.setText("Registrar bovino");
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonClaro150x30.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelMenu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        jButton4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        jButton4.setText("Buscar bovino");
        jButton4.setBorder(null);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonClaro150x30.png"))); // NOI18N
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelMenu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 150, 30));

        jButton5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        jButton5.setText("Modificar bovino");
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonClaro150x30.png"))); // NOI18N
        jButton5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelMenu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 150, 30));

        Bovinos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Bovinos.setForeground(new java.awt.Color(255, 255, 255));
        Bovinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        Bovinos.setText("Bovinos");
        Bovinos.setBorder(null);
        Bovinos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bovinos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonClaro150x30.png"))); // NOI18N
        Bovinos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        Bovinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BovinosActionPerformed(evt);
            }
        });
        panelMenu.add(Bovinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 150, 30));

        jButton6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonClaro150x30.png"))); // NOI18N
        jButton6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonOscuro150x30.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelMenu.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 150, 30));

        add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        panelbovino.setBackground(new java.awt.Color(255, 255, 255));
        panelbovino.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(panelbovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 900, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AgregarBovinos agregarBovinos = new AgregarBovinos();
        showPanel(agregarBovinos);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        BuscarBovino buscarBovino = new BuscarBovino();
        showPanel(buscarBovino);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ModificarBovino modificarBovino = new ModificarBovino();
        showPanel(modificarBovino);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void BovinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BovinosActionPerformed
        TablaBovinos tablaBovinos = new TablaBovinos();
        showPanel(tablaBovinos);
    }//GEN-LAST:event_BovinosActionPerformed

  private void showPanel(JPanel p) {
        
        p.setSize(898, 440);
        p.setLocation(0, 0);
        panelbovino.removeAll();
        panelbovino.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        panelbovino.revalidate();
        panelbovino.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bovinos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelbovino;
    // End of variables declaration//GEN-END:variables
}
