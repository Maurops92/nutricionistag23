/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionistag23.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import nutricionistag23.accesoADatos.HistorialData;
import nutricionistag23.accesoADatos.PacienteData;
import nutricionistag23.accesoADatos.Validaciones;
import nutricionistag23.entidades.Historial;

/**
 *
 * @author jonac
 */
public class HistorialPacienteVista extends javax.swing.JInternalFrame {

    public static int pesoActual;
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form HistorialPacienteVista
     */
    public HistorialPacienteVista() {
        PacienteData pData = new PacienteData();
        initComponents();
        armarCabecera();
        llenarTabla();
        jbModificar.setEnabled(false);
        jdcFechaRegistro.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jlNombrePaciente1.setText(pData.buscarPacienteXId(PacienteVista.pacienteid).getNombre());
        jlDNIPaciente.setText(pData.buscarPacienteXId(PacienteVista.pacienteid).getDni() + "");
        jdcFechaRegistro.setDate(Date.valueOf(LocalDate.now()));
        jsPeso.setModel(new SpinnerNumberModel(0.0, 0.0, 500.0, 0.1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHistorial = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jlPA = new javax.swing.JLabel();
        jdcFechaRegistro = new com.toedter.calendar.JDateChooser();
        jbModificar = new javax.swing.JButton();
        jbCrear = new javax.swing.JButton();
        jsPeso = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlDNIPaciente = new javax.swing.JLabel();
        jlNombrePaciente1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setTitle("Registro Historico del Paciente");
        setPreferredSize(new java.awt.Dimension(410, 446));

        contenedor.setBackground(new java.awt.Color(191, 255, 183));
        contenedor.setForeground(new java.awt.Color(135, 250, 177));

        jtHistorial.setBackground(new java.awt.Color(230, 255, 227));
        jtHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtHistorial.setSelectionBackground(new java.awt.Color(68, 106, 61));
        jtHistorial.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtHistorial.getTableHeader().setReorderingAllowed(false);
        jtHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtHistorialMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtHistorial);

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione un historial");

        jlPA.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jlPA.setText("Peso");

        jdcFechaRegistro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaRegistroPropertyChange(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbCrear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel4.setText("DNI");

        jlDNIPaciente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlDNIPaciente.setForeground(new java.awt.Color(0, 86, 20));

        jlNombrePaciente1.setBackground(new java.awt.Color(255, 255, 255));
        jlNombrePaciente1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlNombrePaciente1.setForeground(new java.awt.Color(0, 86, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 16)); // NOI18N
        jLabel5.setText("Fecha Registro");

        jbCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setMaximumSize(new java.awt.Dimension(83, 32));
        jbEliminar.setMinimumSize(new java.awt.Dimension(83, 32));
        jbEliminar.setPreferredSize(new java.awt.Dimension(83, 31));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombrePaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDNIPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlPA)
                .addGap(19, 19, 19)
                .addComponent(jsPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jdcFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jbModificar)
                .addGap(12, 12, 12)
                .addComponent(jbCancelar)
                .addGap(12, 12, 12)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(jlNombrePaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlDNIPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        HistorialData hData = new HistorialData();
        PacienteData pData = new PacienteData();
        try {
            if ((double) jsPeso.getValue() > 0) {
                Historial historial = new Historial((int) modeloTabla.getValueAt(jtHistorial.getSelectedRow(), 0), pData.buscarPacienteXId(PacienteVista.pacienteid), (double) jsPeso.getValue(), jdcFechaRegistro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                hData.modificarHistorial(historial);
                tableClean();
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "No puede pesar cero o menos kilogramos");
            }
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha valida");
        }
        jbCancelar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbCrear.setEnabled(true);
        jdcFechaRegistro.setDate(Date.valueOf(LocalDate.now()));
        jsPeso.setValue((double) 0);
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtHistorialMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHistorialMouseReleased
        jbModificar.setEnabled(true);
        jbCrear.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jdcFechaRegistro.setDate(Date.valueOf((LocalDate) modeloTabla.getValueAt(jtHistorial.getSelectedRow(), 3)));
        jsPeso.setValue((double) modeloTabla.getValueAt(jtHistorial.getSelectedRow(), 2));
    }//GEN-LAST:event_jtHistorialMouseReleased

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed

        HistorialData hData = new HistorialData();
        PacienteData pData = new PacienteData();
        try {
            if ((double) jsPeso.getValue() > 0) {
                Historial historial = new Historial(pData.buscarPacienteXId(PacienteVista.pacienteid), (double) jsPeso.getValue(), jdcFechaRegistro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                hData.guardarHistorial(historial);
                tableClean();
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "No puede pesar cero o menos kilogramos");
            }
            jsPeso.setValue((double) 0);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha valida");
        }


    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        jbModificar.setEnabled(false);
        jbCrear.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jdcFechaRegistro.setDate(Date.valueOf(LocalDate.now()));
        jsPeso.setValue((double) 0);


    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        HistorialData hData = new HistorialData();
        if (JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea Eliminar?") == 0) {
            hData.eliminarHistorial((int) modeloTabla.getValueAt(jtHistorial.getSelectedRow(), 0));
            jbEliminar.setEnabled(false);
            jbModificar.setEnabled(false);
            jbCrear.setEnabled(true);
            jdcFechaRegistro.setDate(Date.valueOf(LocalDate.now()));
            jsPeso.setValue((double) 0);
            tableClean();
            llenarTabla();
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jdcFechaRegistroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaRegistroPropertyChange
        if(!Validaciones.validacionInmediataFecha(jdcFechaRegistro.getDate())) {
            JOptionPane.showMessageDialog(this, "No se permiten fechas superiores al corriente dia.");
            jdcFechaRegistro.setDate(Date.valueOf(LocalDate.now()));
        }
    }//GEN-LAST:event_jdcFechaRegistroPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private com.toedter.calendar.JDateChooser jdcFechaRegistro;
    private javax.swing.JLabel jlDNIPaciente;
    private javax.swing.JLabel jlNombrePaciente1;
    private javax.swing.JLabel jlPA;
    private javax.swing.JSpinner jsPeso;
    private javax.swing.JTable jtHistorial;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {// Arma la cabecera de la tabla
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("IDP");
        modeloTabla.addColumn("Peso");
        modeloTabla.addColumn("Fecha Registro");
        jtHistorial.setModel(modeloTabla);
        jtHistorial.getColumnModel().getColumn(0).setPreferredWidth(15);
        jtHistorial.getColumnModel().getColumn(1).setPreferredWidth(15);
        jtHistorial.getColumnModel().getColumn(2).setPreferredWidth(30);
        jtHistorial.getColumnModel().getColumn(3).setPreferredWidth(100);
        JTableHeader header = jtHistorial.getTableHeader();
        header.setDefaultRenderer(new HeaderRenderer(jtHistorial));
    }

    private void llenarTabla() {

        HistorialData hData = new HistorialData();
        List<Historial> listaHistorial = hData.listaHistorial(PacienteVista.pacienteid)
                .stream()
                .sorted(Comparator.comparing(Historial::getFechaRegistro))
                .collect(Collectors.toList());
        for (Historial historial : listaHistorial) {
            modeloTabla.addRow(new Object[]{historial.getIdHistorial(), historial.getPaciente().getIdPaciente(), historial.getPeso(), historial.getFechaRegistro()});
        }
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();//Alinea los datos de las celdas numericas a la derecha 
        tcr.setHorizontalAlignment(SwingConstants.RIGHT);
        jtHistorial.getColumnModel().getColumn(0).setCellRenderer(tcr);
        jtHistorial.getColumnModel().getColumn(1).setCellRenderer(tcr);
        jtHistorial.getColumnModel().getColumn(2).setCellRenderer(tcr);
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        jtHistorial.getColumnModel().getColumn(3).setCellRenderer(tcr);

    }

    private void tableClean() {
        //limpia la tabla de historiales
        if (jtHistorial.getRowCount() != 0) {
            int largo = jtHistorial.getRowCount() - 1;
            for (; largo >= 0; largo--) {
                modeloTabla.removeRow(largo);
            }
        }
    }
}
