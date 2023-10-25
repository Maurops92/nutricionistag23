/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionistag23.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import nutricionistag23.accesoADatos.DietaData;
import nutricionistag23.accesoADatos.PacienteData;
import nutricionistag23.accesoADatos.Validaciones;
import nutricionistag23.entidades.Dieta;
import nutricionistag23.entidades.Paciente;
import static nutricionistag23.vistas.MainMenu.getMainMenu;

/**
 *
 * @author Angel
 */
public class PacienteVista extends javax.swing.JInternalFrame {

    public static int pacienteid;
    private HistorialPacienteVista historialPacienteVista;
    private String dni;

    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form PacienteVista
     */
    public PacienteVista() {
        initComponents();
        armarCabecera();
        llenarTabla();
        jbModificar.setEnabled(false);
        jbHistorial.setEnabled(false);
        jsEstatura.setModel(new SpinnerNumberModel(0.0, 0.0, 3, 0.1));
        jsPesoActual.setModel(new SpinnerNumberModel(0.0, 0.0, 500, 0.1));
        jsPesoDeseado.setModel(new SpinnerNumberModel(0.0, 0.0, 500, 0.1));
        jtTelefono.setText("XXX-XXXXXXX");
        jtTelefono.setForeground(Color.GRAY);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
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
        jLabel4 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jrbDietaNoActiva = new javax.swing.JRadioButton();
        jrbDietaActiva = new javax.swing.JRadioButton();
        jbVaciarCampos = new javax.swing.JButton();
        jbHistorial = new javax.swing.JButton();
        jsPesoActual = new javax.swing.JSpinner();
        jsPesoDeseado = new javax.swing.JSpinner();
        jsEstatura = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jtCerrar = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jtIMC = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jPaneInfo = new javax.swing.JPanel();
        jLInfo = new javax.swing.JLabel();

        setTitle("Gestion de Pacientes");
        setPreferredSize(new java.awt.Dimension(768, 633));

        jPanel1.setBackground(new java.awt.Color(140, 184, 132));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Apellido y Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 23, -1, 32));

        jtNombre.setBackground(new java.awt.Color(230, 255, 227));
        jtNombre.setBorder(null);
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 26, 440, 27));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("DNI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 100, -1, 27));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Domicilio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 54, -1, 40));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 133, -1, 28));

        jtTelefono.setBackground(new java.awt.Color(230, 255, 227));
        jtTelefono.setToolTipText("xxx-xxxxxxx");
        jtTelefono.setBorder(null);
        jtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTelefonoMouseClicked(evt);
            }
        });
        jPanel1.add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 134, 175, 27));

        jtDni.setBackground(new java.awt.Color(230, 255, 227));
        jtDni.setBorder(null);
        jPanel1.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 100, 175, 27));

        jtDomicilio.setBackground(new java.awt.Color(230, 255, 227));
        jtDomicilio.setBorder(null);
        jPanel1.add(jtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 64, 440, 27));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Estatura (m)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 98, -1, 30));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PI-Peso Inicial (kg)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 27));

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PD-Peso Deseado (kg)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, 27));

        jtPacientes.setBackground(new java.awt.Color(230, 255, 227));
        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtPacientes.setSelectionBackground(new java.awt.Color(68, 106, 61));
        jtPacientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtPacientes.getTableHeader().setResizingAllowed(false);
        jtPacientes.getTableHeader().setReorderingAllowed(false);
        jtPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtPacientesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtPacientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 245, 610, 314));

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 245, 80, -1));

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 289, 80, -1));

        jrbDietaNoActiva.setBackground(new java.awt.Color(230, 255, 227));
        jrbDietaNoActiva.setFont(new java.awt.Font("Gabriola", 1, 16)); // NOI18N
        jrbDietaNoActiva.setForeground(new java.awt.Color(255, 255, 255));
        jrbDietaNoActiva.setText("Dieta No Activa");
        jrbDietaNoActiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDietaNoActivaActionPerformed(evt);
            }
        });
        jPanel1.add(jrbDietaNoActiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 211, -1, 30));

        jrbDietaActiva.setBackground(new java.awt.Color(230, 255, 227));
        jrbDietaActiva.setFont(new java.awt.Font("Gabriola", 1, 16)); // NOI18N
        jrbDietaActiva.setForeground(new java.awt.Color(255, 255, 255));
        jrbDietaActiva.setText("Dieta Activa");
        jrbDietaActiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDietaActivaActionPerformed(evt);
            }
        });
        jPanel1.add(jrbDietaActiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 211, -1, 30));

        jbVaciarCampos.setText("Limpiar");
        jbVaciarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVaciarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(jbVaciarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 167, -1, -1));

        jbHistorial.setText("Historial");
        jbHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHistorialActionPerformed(evt);
            }
        });
        jPanel1.add(jbHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 61, -1, -1));

        jsPesoActual.setBorder(null);
        jPanel1.add(jsPesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 100, 79, 27));

        jsPesoDeseado.setBorder(null);
        jPanel1.add(jsPesoDeseado, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 130, 79, 27));

        jsEstatura.setBorder(null);
        jPanel1.add(jsEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 75, 27));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Seleccione un paciente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 226, 183, 20));

        jtCerrar.setText("Cerrar");
        jtCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jtCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 577, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IMC");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 132, -1, 30));

        jtIMC.setEditable(false);
        jtIMC.setBackground(new java.awt.Color(230, 255, 227));
        jtIMC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtIMC.setForeground(new java.awt.Color(0, 0, 0));
        jtIMC.setBorder(null);
        jtIMC.setPreferredSize(new java.awt.Dimension(23, 16));
        jPanel1.add(jtIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 134, 58, 27));

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 24, 77, 30));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jtCerrarActionPerformed

    private void jbHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHistorialActionPerformed
        if (historialPacienteVista != null) {
            getMainMenu().removerVista(historialPacienteVista);
        }
        historialPacienteVista = new HistorialPacienteVista();
        historialPacienteVista.setVisible(true);
        getMainMenu().agregarVista(historialPacienteVista);
    }//GEN-LAST:event_jbHistorialActionPerformed

    private void jbVaciarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVaciarCamposActionPerformed
        limpiar();
        jbAgregar.setEnabled(true);
        jbModificar.setEnabled(false);
        jbHistorial.setEnabled(false);
        jrbDietaActiva.setSelected(false);
        jrbDietaNoActiva.setSelected(false);
        tableClean();
        llenarTabla();
    }//GEN-LAST:event_jbVaciarCamposActionPerformed

    private void jrbDietaActivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDietaActivaActionPerformed
        limpiar();
        tableClean();
        jbModificar.setEnabled(false);
        jbAgregar.setEnabled(true);
        jrbDietaNoActiva.setSelected(false);
        DietaData dd = new DietaData();
        //List<Dieta> dietaList = new ArrayList<>();
        Paciente paciente = null;
        PacienteData pd = new PacienteData();
        for (Dieta dieta : dd.listaDieta()) {

            if (dieta.getFechaFinal().compareTo(LocalDate.now()) > 0) {// 0 si son iguales, -1 cuando el segundo es mayor que lo primero, 1 si lo segundo es menor a lo primero
                paciente = pd.buscarPacienteXDni(dieta.getPaciente().getDni());
                modeloTabla.addRow(new Object[]{paciente.getIdPaciente(), paciente.getDni(), paciente.getNombre(), paciente.getDomicilio(), paciente.getTelefono(), paciente.getPesoActual(),
                    paciente.getPesoDeseado(), paciente.getEstatura()});
            }

        }

    }//GEN-LAST:event_jrbDietaActivaActionPerformed

    private void jrbDietaNoActivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDietaNoActivaActionPerformed
        limpiar();
        tableClean();
        jbModificar.setEnabled(false);
        jbAgregar.setEnabled(true);
        jrbDietaActiva.setSelected(false);
        DietaData dd = new DietaData();
        List<Paciente> pacienteList = new ArrayList<>();
        Paciente paciente = null;
        PacienteData pd = new PacienteData();
        pacienteList = pd.listaPaciente();
        for (Dieta dieta : dd.listaDieta()) {

            if (dieta.getFechaFinal().compareTo(LocalDate.now()) > 0) {// 0 si son iguales, -1 cuando el segundo es mayor que lo primero, 1 si lo segundo es menor a lo primero
                pacienteList.remove(pd.buscarPacienteXDni(dieta.getPaciente().getDni()));
            }
        }
        for (Paciente paciente1 : pacienteList) {
            modeloTabla.addRow(new Object[]{paciente1.getIdPaciente(), paciente1.getDni(), paciente1.getNombre(), paciente1.getDomicilio(), paciente1.getTelefono(), paciente1.getPesoActual(),
                paciente1.getPesoDeseado(), paciente1.getEstatura()});
        }
    }//GEN-LAST:event_jrbDietaNoActivaActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        try {
            if (Validaciones.validacionNombrePaciente(jtNombre.getText()) && Validaciones.validacionDomicilio(jtDomicilio.getText()) && Validaciones.validacionDNI(jtDni.getText()) && Validaciones.validacionTelefono(jtTelefono.getText())
                    && Validaciones.validacionPeso((double) jsPesoActual.getValue()) && Validaciones.validacionPeso((double) jsPesoDeseado.getValue()) && Validaciones.validacionPeso((double) jsEstatura.getValue()) && Validaciones.validacionTelefonoGuion(jtTelefono.getText())) {
                PacienteData pd = new PacienteData();
                Paciente paciente = new Paciente();
                paciente.setNombre(jtNombre.getText());
                paciente.setDni(Integer.parseInt(jtDni.getText()));
                paciente.setDomicilio(jtDomicilio.getText());
                paciente.setTelefono(jtTelefono.getText());
                paciente.setPesoActual((double) jsPesoActual.getValue());
                paciente.setPesoDeseado((double) jsPesoDeseado.getValue());
                paciente.setEstatura((double) jsEstatura.getValue());
                paciente.setIdPaciente((int) modeloTabla.getValueAt(jtPacientes.getSelectedRow(), 0));
                pd.modificarPaciente(paciente);
                tableClean();
                llenarTabla();
                limpiar();
                jbAgregar.setEnabled(true);
                jbModificar.setEnabled(false);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No se permiten campos vacíos y/o caracteres inválidos.");
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try {
            if (Validaciones.validacionNombrePaciente(jtNombre.getText()) && Validaciones.validacionDomicilio(jtDomicilio.getText()) && Validaciones.validacionDNI(jtDni.getText()) && Validaciones.validacionTelefono(jtTelefono.getText())
                    && Validaciones.validacionPeso((double) jsPesoActual.getValue()) && Validaciones.validacionPeso((double) jsPesoDeseado.getValue()) && Validaciones.validacionPeso((double) jsEstatura.getValue()) && Validaciones.validacionTelefonoGuion(jtTelefono.getText())) {
                PacienteData pd = new PacienteData();
                Paciente paciente = new Paciente();
                paciente.setNombre(jtNombre.getText());
                paciente.setDni(Integer.parseInt(jtDni.getText()));
                paciente.setDomicilio(jtDomicilio.getText());
                paciente.setTelefono(jtTelefono.getText());
                paciente.setPesoActual((double) jsPesoActual.getValue());
                paciente.setPesoDeseado((double) jsPesoDeseado.getValue());
                paciente.setEstatura((double) jsEstatura.getValue());
                pd.guardarPaciente(paciente);
                tableClean();
                llenarTabla();
                limpiar();
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "No se permiten campos vacíos y/o caracteres inválidos.");
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jtPacientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPacientesMouseReleased
        jbModificar.setEnabled(true);
        jtDni.setText(modeloTabla.getValueAt(jtPacientes.getSelectedRow(), 1).toString());
        jtNombre.setText(modeloTabla.getValueAt(jtPacientes.getSelectedRow(), 2).toString());
        jtDomicilio.setText(modeloTabla.getValueAt(jtPacientes.getSelectedRow(), 3).toString());
        jtTelefono.setText(modeloTabla.getValueAt(jtPacientes.getSelectedRow(), 4).toString());
        jsPesoActual.setValue((double) modeloTabla.getValueAt(jtPacientes.getSelectedRow(), 5));
        jsPesoDeseado.setValue((double) modeloTabla.getValueAt(jtPacientes.getSelectedRow(), 6));
        jsEstatura.setValue((double) modeloTabla.getValueAt(jtPacientes.getSelectedRow(), 7));
        jbAgregar.setEnabled(false);
        jbHistorial.setEnabled(true);
        pacienteid = (int) modeloTabla.getValueAt(jtPacientes.getSelectedRow(), 0);
        jtTelefono.setForeground(Color.BLACK);
        double imc = (double) jsPesoActual.getValue() / Math.pow((double) jsEstatura.getValue(), 2);
        imc *= 100;
        imc = (int) imc;
        imc /= 100;
        jtIMC.setText(imc + "");
    }//GEN-LAST:event_jtPacientesMouseReleased

    private void jtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTelefonoMouseClicked
        if (jtTelefono.getText().equals("XXX-XXXXXXX")) {
            jtTelefono.setText("");
            jtTelefono.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtTelefonoMouseClicked

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
        if (!jtNombre.getText().equals("") && Validaciones.validacionInmediataCaracteres(jtNombre.getText(), 2) == false) {
            JOptionPane.showMessageDialog(this, "Caracter invalido");
            jtNombre.setText("");
        }
    }//GEN-LAST:event_jtNombreKeyReleased

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            PacienteData PD = new PacienteData();
            limpiar();
            if (Validaciones.validacionDNI(dni = JOptionPane.showInputDialog(this, "Ingrese el DNI del paciente"))) {
                Paciente paciente = PD.buscarPacienteXDni(Integer.parseInt(dni));
                if (paciente != null) {
                    pacienteid = paciente.getIdPaciente();
                    jtNombre.setText(paciente.getNombre());
                    jtDomicilio.setText(paciente.getDomicilio());
                    jtDni.setText(paciente.getDni() + "");
                    jtTelefono.setText(paciente.getTelefono());
                    jtTelefono.setForeground(Color.BLACK);
                    jsPesoActual.setValue((double) paciente.getPesoActual());
                    jsPesoDeseado.setValue((double) paciente.getPesoDeseado());
                    jsEstatura.setValue((double) paciente.getEstatura());
                    double imc = (double) jsPesoActual.getValue() / Math.pow((double) jsEstatura.getValue(), 2);
                    imc *= 100;
                    imc = (int) imc;
                    imc /= 100;
                    jtIMC.setText(imc + "");
                    jbVaciarCampos.setEnabled(true);
                    jbAgregar.setEnabled(false);
                    jbModificar.setEnabled(true);
                    jbHistorial.setEnabled(true);

                }
            }
        } catch (NullPointerException e) {
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jPaneInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneInfoMouseEntered
        jPaneInfo.setBackground(new Color(195, 255, 184));
        jLInfo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPaneInfoMouseEntered

    private void jPaneInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneInfoMouseExited
        jPaneInfo.setBackground(new Color(140, 184, 132));
        jLInfo.setForeground(Color.WHITE);
    }//GEN-LAST:event_jPaneInfoMouseExited

    private void jPaneInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneInfoMouseReleased
                JOptionPane.showMessageDialog(this, "-Para agregar un paciente, complete los datos personales que se solicitan en el tope de la ventana \ny al finalizar presione el boton [Agregar].\n"
                + "\n"
                + "-Para modificar un paciente seleccionelo en la tabla, modifique el dato que desea actualizar \ny presione el boton [Modificar],\n"
                + "\n"
                + "-Para consultar o crear un Historial del paciente, seleccione en la tabla al paciente \ny presione el boton [Historial].");
    }//GEN-LAST:event_jPaneInfoMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPaneInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbHistorial;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbVaciarCampos;
    private javax.swing.JRadioButton jrbDietaActiva;
    private javax.swing.JRadioButton jrbDietaNoActiva;
    private javax.swing.JSpinner jsEstatura;
    private javax.swing.JSpinner jsPesoActual;
    private javax.swing.JSpinner jsPesoDeseado;
    private javax.swing.JToggleButton jtCerrar;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtIMC;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {// Arma la cabecera de la tabla
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Domicilio");
        modeloTabla.addColumn("Teléfono");
        modeloTabla.addColumn("PI");
        modeloTabla.addColumn("PD");
        modeloTabla.addColumn("Estatura");
        jtPacientes.setModel(modeloTabla);
        jtPacientes.getColumnModel().getColumn(0).setPreferredWidth(15);
        jtPacientes.getColumnModel().getColumn(1).setPreferredWidth(60);
        jtPacientes.getColumnModel().getColumn(2).setPreferredWidth(100);
        jtPacientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        jtPacientes.getColumnModel().getColumn(4).setPreferredWidth(80);
        jtPacientes.getColumnModel().getColumn(5).setPreferredWidth(30);
        jtPacientes.getColumnModel().getColumn(6).setPreferredWidth(30);
        jtPacientes.getColumnModel().getColumn(7).setPreferredWidth(40);
        JTableHeader header = jtPacientes.getTableHeader();
        header.setDefaultRenderer(new HeaderRenderer(jtPacientes));
        ColumnRenderer jBody = new ColumnRenderer(jtPacientes, new int[]{0, 1, 4, 5, 6, 7});
        jtDni.setBorder(BorderFactory.createCompoundBorder(jtDni.getBorder(), BorderFactory.createEmptyBorder(2, 5, 0, 5)));
        jtDomicilio.setBorder(BorderFactory.createCompoundBorder(jtDomicilio.getBorder(), BorderFactory.createEmptyBorder(2, 5, 0, 5)));
        jtNombre.setBorder(BorderFactory.createCompoundBorder(jtNombre.getBorder(), BorderFactory.createEmptyBorder(2, 5, 0, 5)));
        jtTelefono.setBorder(BorderFactory.createCompoundBorder(jtTelefono.getBorder(), BorderFactory.createEmptyBorder(2, 5, 0, 5)));
        jtIMC.setBorder(BorderFactory.createCompoundBorder(jtIMC.getBorder(), BorderFactory.createEmptyBorder(2, 5, 0, 5)));
    }

    private void llenarTabla() {

        PacienteData pd = new PacienteData();

        List<Paciente> listaPaciente = pd.listaPaciente();
        for (Paciente paciente : listaPaciente) {
            modeloTabla.addRow(new Object[]{paciente.getIdPaciente(), paciente.getDni(), paciente.getNombre(), paciente.getDomicilio(), paciente.getTelefono(), paciente.getPesoActual(),
                paciente.getPesoDeseado(), paciente.getEstatura()});

            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();//Alinea los datos de las celdas numericas a la derecha 
            tcr.setHorizontalAlignment(SwingConstants.RIGHT);
            jtPacientes.getColumnModel().getColumn(0).setCellRenderer(tcr);
            jtPacientes.getColumnModel().getColumn(1).setCellRenderer(tcr);
            jtPacientes.getColumnModel().getColumn(5).setCellRenderer(tcr);
            jtPacientes.getColumnModel().getColumn(6).setCellRenderer(tcr);
            jtPacientes.getColumnModel().getColumn(7).setCellRenderer(tcr);
        }

    }

    private void tableClean() {
        //limpia la tabla de pacientes
        if (jtPacientes.getRowCount() != 0) {
            int largo = jtPacientes.getRowCount() - 1;
            for (; largo >= 0; largo--) {
                modeloTabla.removeRow(largo);
            }
        }
    }

    private void limpiar() {
        jtNombre.setText("");       // TODO add your handling code here:
        jtDni.setText("");       // TODO add your handling code here:
        jtTelefono.setText("");       // TODO add your handling code here:
        jtDomicilio.setText("");       // TODO add your handling code here:
        jsEstatura.setValue((double) 0);
        jsPesoActual.setValue((double) 0);
        jsPesoDeseado.setValue((double) 0);
        jtTelefono.setText("XXX-XXXXXXX");
        jtIMC.setText("");
        jtTelefono.setForeground(Color.GRAY);
    }
}

class HeaderRenderer implements TableCellRenderer {

    DefaultTableCellRenderer renderer;

    public HeaderRenderer(JTable table) {
        renderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int col) {
        return renderer.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, col);
    }
}

class ColumnRenderer implements TableCellRenderer {

    DefaultTableCellRenderer renderer;

    public ColumnRenderer(JTable table, int[] column) {
        renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.RIGHT);
        for (int i : column) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int col) {
        return renderer.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, col);
    }

}
