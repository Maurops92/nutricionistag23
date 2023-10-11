/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionistag23.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import nutricionistag23.accesoADatos.HistorialData;
import nutricionistag23.accesoADatos.PacienteData;
import nutricionistag23.entidades.Historial;
import nutricionistag23.entidades.Paciente;

/**
 *
 * @author jonac
 */
public class HistorialPacienteVista extends javax.swing.JInternalFrame {

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
        jdcFechaRegistro.setEnabled(false);
        jlNombrePaciente1.setText(pData.buscarPacienteXId(PacienteVista.pacienteid).getNombre());
        jlDNIPaciente.setText(pData.buscarPacienteXId(PacienteVista.pacienteid).getDni() + "");
        jdcFechaRegistro.setDate(Date.valueOf(LocalDate.now()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtHistorial = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jlPA = new javax.swing.JLabel();
        jdcFechaRegistro = new com.toedter.calendar.JDateChooser();
        jbModificar = new javax.swing.JButton();
        jbCrear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jsPeso = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlDNIPaciente = new javax.swing.JLabel();
        jlNombrePaciente1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

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
        jtHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtHistorialMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtHistorial);

        jLabel2.setText("Historial");

        jlPA.setText("Peso");

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registro Historico del Paciente");

        jLabel1.setText("Nombre");

        jLabel4.setText("DNI");

        jLabel5.setText("Fecha Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombrePaciente1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlDNIPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jdcFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlPA)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jsPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCrear))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNombrePaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlDNIPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)
                        .addComponent(jdcFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPA)
                    .addComponent(jsPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar)
                    .addComponent(jbCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        HistorialData hData = new HistorialData();
        PacienteData pData = new PacienteData();
        try {
            Historial historial = new Historial((int) modeloTabla.getValueAt(jtHistorial.getSelectedRow(), 0), pData.buscarPacienteXId(PacienteVista.pacienteid), (int) jsPeso.getValue(), jdcFechaRegistro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            hData.modificarHistorial(historial);
            tableClean();
            llenarTabla();
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "No se permiten campos vacíos y/o caracteres inválidos.");
        }
        jbModificar.setEnabled(false);
        jbCrear.setEnabled(true);
        jdcFechaRegistro.setDate(Date.valueOf(LocalDate.now()));
        jsPeso.setValue(0);
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtHistorialMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHistorialMouseReleased
        jbModificar.setEnabled(true);
        jdcFechaRegistro.setEnabled(true);
        jbCrear.setEnabled(false);
        jdcFechaRegistro.setDate(Date.valueOf((LocalDate) modeloTabla.getValueAt(jtHistorial.getSelectedRow(), 3)));
    }//GEN-LAST:event_jtHistorialMouseReleased

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed

        HistorialData hData = new HistorialData();
        PacienteData pData = new PacienteData();
        if ((int) jsPeso.getValue() > 0) {
            Historial historial = new Historial(pData.buscarPacienteXId(PacienteVista.pacienteid), (int) jsPeso.getValue(), LocalDate.now());
            hData.guardarHistorial(historial);
            tableClean();
            llenarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "No puede pesar cero o menos kilogramos");
        }

    }//GEN-LAST:event_jbCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCrear;
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
    }

    private void llenarTabla() {

        HistorialData hData = new HistorialData();
        List<Historial> listaHistorial = hData.listaHistorial(PacienteVista.pacienteid);
        for (Historial historial : listaHistorial) {
            modeloTabla.addRow(new Object[]{historial.getIdHistorial(), historial.getPaciente().getIdPaciente(), historial.getPeso(), historial.getFechaRegistro()});
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();//Alinea los datos de las celdas numericas a la derecha 
            tcr.setHorizontalAlignment(SwingConstants.RIGHT);
            jtHistorial.getColumnModel().getColumn(0).setCellRenderer(tcr);
            jtHistorial.getColumnModel().getColumn(1).setCellRenderer(tcr);
            jtHistorial.getColumnModel().getColumn(2).setCellRenderer(tcr);
        }

    }

    private void tableClean() {
        //limpia la tabla de pacientes
        if (jtHistorial.getRowCount() != 0) {
            int largo = jtHistorial.getRowCount() - 1;
            for (; largo >= 0; largo--) {
                modeloTabla.removeRow(largo);
            }
        }
    }
}
