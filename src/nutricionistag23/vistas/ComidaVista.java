/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionistag23.vistas;

import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import nutricionistag23.accesoADatos.ComidaData;
import nutricionistag23.accesoADatos.Validaciones;
import nutricionistag23.entidades.Comida;

/**
 *
 * @author Angel
 */
public class ComidaVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form ComidaVista
     */
    public ComidaVista() {
        initComponents();
        armarCabecera();
        llenarTabla();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        jsCalorias.setModel(new SpinnerNumberModel(0, 0, 9999, 1));
        jtNombre.setBorder(BorderFactory.createCompoundBorder(jtNombre.getBorder(), BorderFactory.createEmptyBorder(2, 5, 0, 5)));
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);

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
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComida = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jsCalorias = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetalle = new javax.swing.JTextArea();
        jPaneInfo = new javax.swing.JPanel();
        jLInfo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(66, 34));
        setNormalBounds(new java.awt.Rectangle(0, 0, 66, 0));
        setPreferredSize(new java.awt.Dimension(768, 633));

        jPanel1.setBackground(new java.awt.Color(140, 184, 132));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 28, -1, 30));

        jtNombre.setBackground(new java.awt.Color(230, 255, 227));
        jtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtNombre.setBorder(null);
        jtNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jtNombre.setSelectionColor(new java.awt.Color(0, 227, 147));
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 512, 28));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalle");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 65, -1, 20));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calorias");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 184, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(230, 255, 227));

        jtComida.setBackground(new java.awt.Color(230, 255, 227));
        jtComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtComida.setSelectionBackground(new java.awt.Color(68, 106, 61));
        jtComida.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtComida.getTableHeader().setReorderingAllowed(false);
        jtComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtComidaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtComida);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 261, 603, 300));

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 261, 87, -1));

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 311, 87, -1));

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 579, 87, -1));

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 83, -1, -1));

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 361, 87, -1));
        jPanel1.add(jsCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 185, 71, -1));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione una comida.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 231, -1, -1));

        jtDetalle.setBackground(new java.awt.Color(230, 255, 227));
        jtDetalle.setColumns(20);
        jtDetalle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtDetalle.setForeground(new java.awt.Color(0, 0, 0));
        jtDetalle.setRows(5);
        jtDetalle.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jtDetalle.setSelectionColor(new java.awt.Color(0, 227, 147));
        jtDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDetalleKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jtDetalle);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 67, 512, -1));

        jPaneInfo.setBackground(new java.awt.Color(140, 184, 132));
        jPaneInfo.setForeground(new java.awt.Color(255, 255, 255));
        jPaneInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPaneInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPaneInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPaneInfoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPaneInfoMouseReleased(evt);
            }
        });

        jLInfo.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLInfo.setForeground(new java.awt.Color(255, 255, 255));
        jLInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLInfo.setText("?");

        javax.swing.GroupLayout jPaneInfoLayout = new javax.swing.GroupLayout(jPaneInfo);
        jPaneInfo.setLayout(jPaneInfoLayout);
        jPaneInfoLayout.setHorizontalGroup(
            jPaneInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPaneInfoLayout.setVerticalGroup(
            jPaneInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPaneInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Gestion Comidas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try {
            if (Validaciones.validacionNombreComida(jtNombre.getText()) && Validaciones.validacionDetalleComida(jtDetalle.getText()) && Validaciones.validacionCalorias((int) (jsCalorias.getValue()))) {
                ComidaData cd = new ComidaData();
                Comida comida = new Comida();
                comida.setNombre(jtNombre.getText());
                comida.setCantCalorias((int) (jsCalorias.getValue()));
                comida.setDetalle(jtDetalle.getText());
                cd.guardaComida(comida);
                tableClean();
                llenarTabla();
                limpiar();
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "No se permiten campos vacíos y/o caracteres inválidos.");
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        try {
            if (Validaciones.validacionNombreComida(jtNombre.getText()) && Validaciones.validacionDetalleComida(jtDetalle.getText()) && Validaciones.validacionCalorias((int) (jsCalorias.getValue()))) {
                ComidaData cd = new ComidaData();
                Comida comida = new Comida();
                comida.setNombre(jtNombre.getText());
                comida.setDetalle(jtDetalle.getText());
                comida.setCantCalorias((int) (jsCalorias.getValue()));
                comida.setIdComida((int) modeloTabla.getValueAt(jtComida.getSelectedRow(), 0));
                cd.modificarComida(comida);
                tableClean();
                llenarTabla();
                limpiar();
                jbAgregar.setEnabled(true);
                jbModificar.setEnabled(false);
                jbEliminar.setEnabled(false);
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "No se permiten campos vacíos y/o caracteres inválidos.");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        this.dispose();
        MainMenu.getMainMenu().reinicializarBotonesDesdeVistas();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jtComidaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtComidaMouseReleased
        jtNombre.setText(modeloTabla.getValueAt(jtComida.getSelectedRow(), 1).toString());
        jtDetalle.setText(modeloTabla.getValueAt(jtComida.getSelectedRow(), 2).toString());
        jsCalorias.setValue((int) modeloTabla.getValueAt(jtComida.getSelectedRow(), 3));
        jbAgregar.setEnabled(false);
        jbModificar.setEnabled(true);
        jbEliminar.setEnabled(true);

    }//GEN-LAST:event_jtComidaMouseReleased

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
        jbAgregar.setEnabled(true);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        ComidaData cData = new ComidaData();
        cData.borrarComida((int) modeloTabla.getValueAt(jtComida.getSelectedRow(), 0));
        tableClean();
        llenarTabla();
        jbAgregar.setEnabled(true);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        limpiar();

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtDetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDetalleKeyTyped
        if (jtDetalle.getText().length() > 100) {
            String texto = jtDetalle.getText().substring(0, 99);
            jtDetalle.setText(texto);
            JOptionPane.showMessageDialog(this, "Superó el límite de 100 caracteres");
        }
    }//GEN-LAST:event_jtDetalleKeyTyped

    private void jPaneInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneInfoMouseEntered
        jPaneInfo.setBackground(new Color(195, 255, 184));
        jLInfo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPaneInfoMouseEntered

    private void jPaneInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneInfoMouseExited
        jPaneInfo.setBackground(new Color(140, 184, 132));
        jLInfo.setForeground(Color.WHITE);
    }//GEN-LAST:event_jPaneInfoMouseExited

    private void jPaneInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneInfoMouseReleased
        JOptionPane.showMessageDialog(this, "-Para agregar una comida, complete los campos Nombre, Detalle, Calorias y presione el botón [Agregar].\n"
                + "\n"
                + "-Para modificar una comida, seleccionela en la tabla, modifique los datos que desea actualizar y presione el botón [Modificar].\n"
                + "\n"
                + "-Para eliminar una comida, seleccionela en la tabla y presione el botón [Eliminar].");
    }//GEN-LAST:event_jPaneInfoMouseReleased

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
       
    }//GEN-LAST:event_jtNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPaneInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JSpinner jsCalorias;
    private javax.swing.JTable jtComida;
    private javax.swing.JTextArea jtDetalle;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Detalle");
        modeloTabla.addColumn("Calorias");
        jtComida.setModel(modeloTabla);
        jtComida.getColumnModel().getColumn(0).setPreferredWidth(10);
        jtComida.getColumnModel().getColumn(1).setPreferredWidth(100);
        jtComida.getColumnModel().getColumn(2).setPreferredWidth(250);
        jtComida.getColumnModel().getColumn(3).setPreferredWidth(25);

    }

    private void llenarTabla() {

        ComidaData cd = new ComidaData();

        List<Comida> listaComida = cd.listaComida();
        for (Comida comida : listaComida) {
            modeloTabla.addRow(new Object[]{comida.getIdComida(), comida.getNombre(), comida.getDetalle(), comida.getCantCalorias()});

            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();//Alinea los datos de las celdas numericas a la derecha 
            tcr.setHorizontalAlignment(SwingConstants.RIGHT);
            jtComida.getColumnModel().getColumn(0).setCellRenderer(tcr);
            jtComida.getColumnModel().getColumn(3).setCellRenderer(tcr);
        }

    }

    private void limpiar() {
        //Limpia los campos
        jtNombre.setText("");
        jtDetalle.setText("");
        jsCalorias.setValue((int) 0);

    }

    private void tableClean() {
        //limpia la tabla de comidas
        if (jtComida.getRowCount() != 0) {
            int largo = jtComida.getRowCount() - 1;
            for (; largo >= 0; largo--) {
                modeloTabla.removeRow(largo);
            }
        }
    }

}
