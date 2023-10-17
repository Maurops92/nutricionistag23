/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionistag23.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import nutricionistag23.accesoADatos.ComidaData;
import nutricionistag23.accesoADatos.PacienteData;
import nutricionistag23.accesoADatos.Validaciones;
import nutricionistag23.entidades.Comida;
import nutricionistag23.entidades.Paciente;

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
        jtDetalle = new javax.swing.JTextField();
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

        setMinimumSize(new java.awt.Dimension(66, 34));
        setNormalBounds(new java.awt.Rectangle(0, 0, 66, 0));
        setPreferredSize(new java.awt.Dimension(768, 633));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 63, -1, -1));

        jtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 50, 448, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalle");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 110, -1, -1));

        jtDetalle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtDetalle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtDetalle.setMinimumSize(new java.awt.Dimension(6, 28));
        jtDetalle.setPreferredSize(new java.awt.Dimension(6, 28));
        jPanel1.add(jtDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 100, 448, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calorias");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 152, -1, -1));

        jtComida.setBackground(new java.awt.Color(153, 255, 204));
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
        jtComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtComidaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtComida);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 603, 320));

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 87, -1));

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 87, -1));

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 87, -1));

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 87, -1));
        jPanel1.add(jsCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 146, 71, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione una comida.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

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
            if (Validaciones.validacionNombrePaciente(jtNombre.getText()) && Validaciones.validacionDomicilio(jtDetalle.getText()) && Validaciones.validacionCalorias((int) (jsCalorias.getValue()))) {
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JSpinner jsCalorias;
    private javax.swing.JTable jtComida;
    private javax.swing.JTextField jtDetalle;
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
