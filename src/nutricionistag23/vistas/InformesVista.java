/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionistag23.vistas;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import nutricionistag23.accesoADatos.DietaData;
import nutricionistag23.accesoADatos.HistorialData;
import nutricionistag23.accesoADatos.PacienteData;
import nutricionistag23.accesoADatos.Validaciones;
import nutricionistag23.entidades.Dieta;
import nutricionistag23.entidades.Historial;
import nutricionistag23.entidades.Paciente;

/**
 *
 * @author pmora
 */
public class InformesVista extends javax.swing.JInternalFrame {

    private final DietaData DD = new DietaData();
    private final PacienteData PD = new PacienteData();
    private final HistorialData HD = new HistorialData();
    private int pacienteId;
    private String dni;
    private int idDieta;
    private boolean primerLimpiado;

    private DefaultTableModel modeloTablaDieta = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modeloTablaHistorial = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public InformesVista() {
        initComponents();
        armarCabeceraDieta();
        armarCabeceraHistorial();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        jtPaciente.setBorder(BorderFactory.createCompoundBorder(jtPaciente.getBorder(), BorderFactory.createEmptyBorder(2, 5, 0, 5)));
        primerLimpiado = true;
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
        jlPaciente = new javax.swing.JLabel();
        jtPaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaDieta = new javax.swing.JTable();
        jrbDietaNoActiva = new javax.swing.JRadioButton();
        jrbDietaActiva = new javax.swing.JRadioButton();
        jbVaciarCampos = new javax.swing.JButton();
        jtCerrar = new javax.swing.JToggleButton();
        jbBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtHistorial = new javax.swing.JTable();
        jlTablaDietas = new javax.swing.JLabel();
        jlTablaHistoriales = new javax.swing.JLabel();
        jPaneInfo = new javax.swing.JPanel();
        jLInfo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(768, 633));

        jPanel1.setBackground(new java.awt.Color(140, 184, 132));
        jPanel1.setMinimumSize(new java.awt.Dimension(752, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlPaciente.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jlPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jlPaciente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlPaciente.setText("Paciente");
        jPanel1.add(jlPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 32, -1, 27));

        jtPaciente.setEditable(false);
        jtPaciente.setBackground(new java.awt.Color(230, 255, 227));
        jtPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtPaciente.setBorder(null);
        jPanel1.add(jtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 32, 450, 27));

        jTablaDieta.setBackground(new java.awt.Color(230, 255, 227));
        jTablaDieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablaDieta.setSelectionBackground(new java.awt.Color(68, 106, 61));
        jTablaDieta.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTablaDieta.getTableHeader().setResizingAllowed(false);
        jTablaDieta.getTableHeader().setReorderingAllowed(false);
        jTablaDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTablaDietaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaDieta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 99, 613, 213));

        jrbDietaNoActiva.setFont(new java.awt.Font("Gabriola", 1, 16)); // NOI18N
        jrbDietaNoActiva.setForeground(new java.awt.Color(255, 255, 255));
        jrbDietaNoActiva.setText("Dietas Culminadas");
        jrbDietaNoActiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDietaNoActivaActionPerformed(evt);
            }
        });
        jPanel1.add(jrbDietaNoActiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 65, -1, 30));

        jrbDietaActiva.setFont(new java.awt.Font("Gabriola", 1, 16)); // NOI18N
        jrbDietaActiva.setForeground(new java.awt.Color(255, 255, 255));
        jrbDietaActiva.setText("Dietas Vigentes");
        jrbDietaActiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDietaActivaActionPerformed(evt);
            }
        });
        jPanel1.add(jrbDietaActiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 65, -1, 30));

        jbVaciarCampos.setText("Limpiar");
        jbVaciarCampos.setEnabled(false);
        jbVaciarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVaciarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(jbVaciarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 62, 80, 30));

        jtCerrar.setText("Cerrar");
        jtCerrar.setMaximumSize(new java.awt.Dimension(83, 32));
        jtCerrar.setMinimumSize(new java.awt.Dimension(83, 32));
        jtCerrar.setPreferredSize(new java.awt.Dimension(83, 32));
        jtCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jtCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 568, -1, -1));

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 26, 80, 30));

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
        jScrollPane2.setViewportView(jtHistorial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 351, 613, 199));

        jlTablaDietas.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jlTablaDietas.setForeground(new java.awt.Color(255, 255, 255));
        jlTablaDietas.setText("Dietas");
        jPanel1.add(jlTablaDietas, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 69, 108, 40));

        jlTablaHistoriales.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jlTablaHistoriales.setForeground(new java.awt.Color(255, 255, 255));
        jlTablaHistoriales.setText("Historial");
        jPanel1.add(jlTablaHistoriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 321, -1, 40));

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

    private void jTablaDietaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaDietaMouseReleased

        primerLimpiado = false;
        idDieta = (int) modeloTablaDieta.getValueAt(jTablaDieta.getSelectedRow(), 0);
        tableCleanHistorial();
        llenarTablaHistorial();

    }//GEN-LAST:event_jTablaDietaMouseReleased

    private void jrbDietaNoActivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDietaNoActivaActionPerformed

        primerLimpiado = false;
        tableCleanDieta();
        jrbDietaActiva.setSelected(false);
        llenarTablaDieta(false);
    }//GEN-LAST:event_jrbDietaNoActivaActionPerformed

    private void jrbDietaActivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDietaActivaActionPerformed

        primerLimpiado = false;
        tableCleanDieta();
        jrbDietaNoActiva.setSelected(false);
        llenarTablaDieta(true);
    }//GEN-LAST:event_jrbDietaActivaActionPerformed

    private void jbVaciarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVaciarCamposActionPerformed
        limpiar();
        jrbDietaActiva.setSelected(false);
        jrbDietaNoActiva.setSelected(false);
    }//GEN-LAST:event_jbVaciarCamposActionPerformed

    private void jtCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jtCerrarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            primerLimpiado = true;
            limpiar();

            if (Validaciones.validacionDNI(dni = JOptionPane.showInputDialog(this, "Ingrese el DNI del paciente"))) {
                Paciente paciente = PD.buscarPacienteXDni(Integer.parseInt(dni));
                if (paciente != null) {
                    tableCleanDieta();
                    tableCleanHistorial();
                    jrbDietaActiva.setSelected(false);
                    jrbDietaNoActiva.setSelected(false);
                    pacienteId = paciente.getIdPaciente();
                    jtPaciente.setText(paciente.getNombre());
                    llenarTablaDieta();
                    llenarTablaHistorial();
                    jbVaciarCampos.setEnabled(true);
                    primerLimpiado = true;
                }
            }
        } catch (NullPointerException e ) {

        }catch (NumberFormatException e ) {
            JOptionPane.showMessageDialog(null, "El DNI ingresado es inválido");
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
        JOptionPane.showMessageDialog(this, "-Para ver el informe de un paciente, presione el botón [Buscar] e ingrese el DNI.\n"
                + "\n"
                + "-Para ver el historial de una dieta, seleccionela en la tabla \"Dietas\" y podrá observar el \"Historial\"\n"
                + "\n"
                + "-Los botones \"Dieta Vigentes\" y \"Dietas Culminadas\" filtran las dietas activas/corrientes y las inactivas/finalizadas.\n"
                + "\n"
                + "-Para limpiar todos los campos presione el botón [Limpiar]."
                + "\n"
                + "\n-Ref. columna \"Cumplido\" \nSIN HIST: No existe un registro de peso a la fecha final de la dieta.\nSI: El paciente cumplió con el Peso Deseado.\nNO: El paciente no cumplió con el Peso Deseado.\nACTIVO: Dieta actual del paciente.");
    }//GEN-LAST:event_jPaneInfoMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLInfo;
    private javax.swing.JPanel jPaneInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaDieta;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbVaciarCampos;
    private javax.swing.JLabel jlPaciente;
    private javax.swing.JLabel jlTablaDietas;
    private javax.swing.JLabel jlTablaHistoriales;
    private javax.swing.JRadioButton jrbDietaActiva;
    private javax.swing.JRadioButton jrbDietaNoActiva;
    private javax.swing.JToggleButton jtCerrar;
    private javax.swing.JTable jtHistorial;
    private javax.swing.JTextField jtPaciente;
    // End of variables declaration//GEN-END:variables

    // METODOS TABLA DIETA ---------------------------------------------------------------------------------------------------------||
    private void armarCabeceraDieta() {// Arma la cabecera de la tabla
        modeloTablaDieta.addColumn("ID");
        modeloTablaDieta.addColumn("Dieta");
        modeloTablaDieta.addColumn("Fecha Inicial");
        modeloTablaDieta.addColumn("Fecha Final");
        modeloTablaDieta.addColumn("Cumplido");
        jTablaDieta.setModel(modeloTablaDieta);
        jTablaDieta.getColumnModel().getColumn(0).setPreferredWidth(15);
        jTablaDieta.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTablaDieta.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTablaDieta.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTablaDieta.getColumnModel().getColumn(4).setPreferredWidth(15);

        JTableHeader header = jTablaDieta.getTableHeader();
        header.setDefaultRenderer(new HeaderRenderer(jTablaDieta));
    }

    private void llenarTablaDieta() {
        List<Dieta> listaDieta = DD.listaDietaXPaciente(pacienteId);
        agregarFilasTablaDieta(listaDieta);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();//Alinea los datos de las celdas numericas a la derecha 
        tcr.setHorizontalAlignment(SwingConstants.RIGHT);
        jTablaDieta.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        jTablaDieta.getColumnModel().getColumn(2).setCellRenderer(tcr);
        jTablaDieta.getColumnModel().getColumn(3).setCellRenderer(tcr);
        jTablaDieta.getColumnModel().getColumn(4).setCellRenderer(tcr);

    }

    private void llenarTablaDieta(boolean activo) {
        List<Dieta> listaDieta = DD.listaDietaXPaciente(pacienteId);
        if (activo) {
            listaDieta = listaDieta.stream()
                    .filter(dieta -> dieta.getFechaFinal().compareTo(LocalDate.now()) > 0)
                    .collect(Collectors.toList());
        } else {
            listaDieta = listaDieta.stream()
                    .filter(dieta -> dieta.getFechaFinal().compareTo(LocalDate.now()) < 0)
                    .collect(Collectors.toList());
        }
        agregarFilasTablaDieta(listaDieta);

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();//Alinea los datos de las celdas numericas a la derecha 
        tcr.setHorizontalAlignment(SwingConstants.RIGHT);
        jTablaDieta.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        jTablaDieta.getColumnModel().getColumn(2).setCellRenderer(tcr);
        jTablaDieta.getColumnModel().getColumn(3).setCellRenderer(tcr);
        jTablaDieta.getColumnModel().getColumn(4).setCellRenderer(tcr);

    }

    private void agregarFilasTablaDieta(List<Dieta> listaDieta) {
        List<String> listaSiNo = new ArrayList<>();
        for (Dieta dieta : listaDieta) {
            modeloTablaDieta.addRow(new Object[]{dieta.getIdDieta(), dieta.getNombre(), dieta.getFechaInicial(), dieta.getFechaFinal(), null});
            if (LocalDate.now().compareTo(dieta.getFechaFinal()) < 0) {
                listaSiNo.add("ACTIVA");
            } else if (dieta.getPesoInicial() < dieta.getPesoFinal()) {
                listaSiNo.add("SUBE");
            } else if (dieta.getPesoInicial() > dieta.getPesoFinal()) {
                listaSiNo.add("BAJA");
            } else {
                listaSiNo.add("MANTIENE");
            }
        }
        Historial historial;
        for (int i = 0; i < listaDieta.size(); i++) {
            historial = HD.buscarHistorialXIdPYFecha(pacienteId, listaDieta.get(i).getFechaFinal());
            if (historial != null) {
                double peso = historial.getPeso() - listaDieta.get(i).getPesoFinal();
                modeloTablaDieta.setValueAt(condicionDieta(listaSiNo.get(i), peso), i, 4);
            } else if (LocalDate.now().compareTo(listaDieta.get(i).getFechaFinal()) < 0) {
                modeloTablaDieta.setValueAt(listaSiNo.get(i), i, 4);
            } else {
                modeloTablaDieta.setValueAt("SIN HIST", i, 4);
            }
        }
    }

    private String condicionDieta(String condicion, double peso) {
        switch (condicion) {
            case "SUBE":
                if (peso < 0) {
                    return "NO";

                } else {
                    return "SI";
                }
            case "MANTIENE":
                if (peso != 0) {
                    return "NO";
                } else {
                    return "SI";
                }
            case "BAJA":
                if (peso > 0) {
                    return "NO";

                } else {
                    return "SI";
                }
            default:
                return condicion;
        }
    }

    private void tableCleanDieta() {
        //limpia la tabla de dietas
        if (jTablaDieta.getRowCount() != 0) {
            int largo = jTablaDieta.getRowCount() - 1;
            for (; largo >= 0; largo--) {
                modeloTablaDieta.removeRow(largo);
            }
        }
    }

    //METODOS TABLA HISTORIAL ---------------------------------------------------------------------------------------------------||
    private void armarCabeceraHistorial() {// Arma la cabecera de la tabla

        modeloTablaHistorial.addColumn("Peso");
        modeloTablaHistorial.addColumn("Fecha Registro");
        jtHistorial.setModel(modeloTablaHistorial);
        jtHistorial.getColumnModel().getColumn(0).setPreferredWidth(30);
        jtHistorial.getColumnModel().getColumn(1).setPreferredWidth(100);
        JTableHeader header = jtHistorial.getTableHeader();
        header.setDefaultRenderer(new HeaderRenderer(jtHistorial));
    }

    private void llenarTablaHistorial() {
        tableCleanHistorial();
        List<Historial> listaHistorial = HD.listaHistorial(pacienteId)
                .stream()
                .sorted(Comparator.comparing(Historial::getFechaRegistro))
                .collect(Collectors.toList());
        Historial historial = null;
        Dieta dieta = null;

        if (idDieta != 0) {
            Iterator iterar = listaHistorial.iterator();
            dieta = DD.buscarDieta(idDieta);
            while (iterar.hasNext()) {
                historial = (Historial) iterar.next();
                boolean isMenorFechaInicDieta = historial.getFechaRegistro().compareTo(dieta.getFechaInicial()) < 0;
                boolean isMayorFechaFinDieta = historial.getFechaRegistro().compareTo(dieta.getFechaFinal()) > 0;

                if (isMenorFechaInicDieta || isMayorFechaFinDieta) {
                    iterar.remove();
                }
            }
        }
        for (Historial hist : listaHistorial) {
            modeloTablaHistorial.addRow(new Object[]{hist.getPeso(), hist.getFechaRegistro()});
        }
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();//Alinea los datos de las celdas numericas a la derecha 
        tcr.setHorizontalAlignment(SwingConstants.RIGHT);
        jtHistorial.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        jtHistorial.getColumnModel().getColumn(1).setCellRenderer(tcr);
    }

    private void tableCleanHistorial() {
        //limpia la tabla de historial
        if (jtHistorial.getRowCount() != 0) {
            int largo = jtHistorial.getRowCount() - 1;
            for (; largo >= 0; largo--) {
                modeloTablaHistorial.removeRow(largo);
            }
        }
    }

    //OTROS METODOS -----------------------------------------------------------------------------------------------------------------||
    private void limpiar() {
        //Limpia los campos
        jrbDietaActiva.setSelected(false);
        jrbDietaNoActiva.setSelected(false);
        tableCleanDieta();
        tableCleanHistorial();
        if (!primerLimpiado) {
            idDieta = 0;
            llenarTablaDieta();
            llenarTablaHistorial();
            primerLimpiado = true;

        } else {
            jtPaciente.setText("");
            pacienteId = 0;
            dni = "0";
            jbVaciarCampos.setEnabled(false);
            primerLimpiado = false;
        }
    }

}
