/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionistag23.vistas;

import java.awt.Color;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import nutricionistag23.accesoADatos.ComidaData;
import nutricionistag23.accesoADatos.DietaComidaData;
import nutricionistag23.accesoADatos.DietaData;
import nutricionistag23.entidades.Comida;
import nutricionistag23.entidades.DiasEnum;
import nutricionistag23.entidades.DietaComida;
import nutricionistag23.entidades.HorariosEnum;
import static nutricionistag23.vistas.DietaVista.idDieta;

/**
 *
 * @author pmora
 */
public class DietaComidaVista extends javax.swing.JInternalFrame {

    private final ComidaData CD = new ComidaData();
    private final DietaData DD = new DietaData();
    private final DietaComidaData DCD = new DietaComidaData();

    private DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public DietaComidaVista() {;
        initComponents();
        armarCabecera();
        llenarTabla();
        iniComboBoxes();
        reinicializarComboBoxes();
        jsFiltro.setModel(new SpinnerNumberModel(0, 0, 5000, 10));
        jtNombreDieta.setText(DD.buscarDieta(idDieta).toString());
        jtNombreDieta.setBorder(BorderFactory.createCompoundBorder(jtNombreDieta.getBorder(), BorderFactory.createEmptyBorder(2, 5, 0, 5)));
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
        jtNombreDieta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaDietaComida = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbVaciarCampos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtCerrar = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jbEliminarCrono = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jcbHorario = new javax.swing.JComboBox<>();
        jcbDia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbComida = new javax.swing.JComboBox<>();
        jsFiltro = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPaneInfo = new javax.swing.JPanel();
        jLInfo = new javax.swing.JLabel();
        jbEliminar1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Configuracion de la Dieta");
        setPreferredSize(new java.awt.Dimension(577, 472));

        jPanel1.setBackground(new java.awt.Color(191, 255, 183));
        jPanel1.setMinimumSize(new java.awt.Dimension(548, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(548, 568));

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Dieta");

        jtNombreDieta.setEditable(false);
        jtNombreDieta.setBackground(new java.awt.Color(230, 255, 227));
        jtNombreDieta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtNombreDieta.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Dia");

        jTablaDietaComida.setBackground(new java.awt.Color(230, 255, 227));
        jTablaDietaComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablaDietaComida.setSelectionBackground(new java.awt.Color(68, 106, 61));
        jTablaDietaComida.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTablaDietaComida.getTableHeader().setResizingAllowed(false);
        jTablaDietaComida.getTableHeader().setReorderingAllowed(false);
        jTablaDietaComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTablaDietaComidaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaDietaComida);

        jbAgregar.setText("Agregar");
        jbAgregar.setMaximumSize(new java.awt.Dimension(83, 32));
        jbAgregar.setMinimumSize(new java.awt.Dimension(83, 32));
        jbAgregar.setPreferredSize(new java.awt.Dimension(83, 32));
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbVaciarCampos.setText("Limpiar");
        jbVaciarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVaciarCamposActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel8.setText("Seleccione una celda");

        jtCerrar.setText("Cerrar");
        jtCerrar.setMaximumSize(new java.awt.Dimension(83, 32));
        jtCerrar.setMinimumSize(new java.awt.Dimension(83, 32));
        jtCerrar.setPreferredSize(new java.awt.Dimension(83, 32));
        jtCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCerrarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Horario");

        jbEliminarCrono.setText("Limpiar Dieta");
        jbEliminarCrono.setMaximumSize(new java.awt.Dimension(83, 32));
        jbEliminarCrono.setMinimumSize(new java.awt.Dimension(83, 32));
        jbEliminarCrono.setPreferredSize(new java.awt.Dimension(83, 32));
        jbEliminarCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarCronoActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel2.setText("Comida");

        jsFiltro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsFiltroStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel3.setText("Filtrar Por calorias (Max)");

        jButton1.setText("Detalle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPaneInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPaneInfoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPaneInfoLayout.setVerticalGroup(
            jPaneInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPaneInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPaneInfoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jbEliminar1.setText("Eliminar");
        jbEliminar1.setEnabled(false);
        jbEliminar1.setMaximumSize(new java.awt.Dimension(83, 32));
        jbEliminar1.setMinimumSize(new java.awt.Dimension(83, 32));
        jbEliminar1.setPreferredSize(new java.awt.Dimension(83, 32));
        jbEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPaneInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jcbComida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jsFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addComponent(jcbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jcbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(jbVaciarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jbEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbEliminarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251)
                .addComponent(jtCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPaneInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jcbComida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jsFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbVaciarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbEliminarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablaDietaComidaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaDietaComidaMouseReleased
        restaurarEstadoInicialBotones();

        DietaComida dietaComida;
        Object celda = modeloTabla.getValueAt(jTablaDietaComida.getSelectedRow(), jTablaDietaComida.getSelectedColumn());
        HorariosEnum horario = null;
        DiasEnum dia = (DiasEnum) (modeloTabla.getValueAt(jTablaDietaComida.getSelectedRow(), 0));
        Comida comida = null;

        if (celda != null && celda instanceof DietaComida) {
            dietaComida = (DietaComida) celda;
            comida = dietaComida.getComida();
            horario = dietaComida.getHorario();
            jbAgregar.setEnabled(false);
            jbModificar.setEnabled(true);
            jbEliminar1.setEnabled(true);
            jcbDia.setEnabled(false);
            jcbHorario.setEnabled(false);
        } else if (celda == null) { // si la celda esta en blanco, configura las comboBox de Horario y Dia. La comboBox de Comida queda en null
            horario = HorariosEnum.valueOf(modeloTabla.getColumnName(jTablaDietaComida.getSelectedColumn()));
        } else { // si se selecciona alguna celda de la columna "dia" se desactivan los campos
            dia = null;
            jbAgregar.setEnabled(false);
            jcbDia.setEnabled(false);
            jcbHorario.setEnabled(false);
            jcbComida.setEnabled(false);
        }

        jcbDia.setSelectedItem(dia);
        jcbComida.setSelectedItem(comida);
        jcbHorario.setSelectedItem(horario);
    }//GEN-LAST:event_jTablaDietaComidaMouseReleased

    private void jbVaciarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVaciarCamposActionPerformed
        restaurarEstadoInicialBotones();
        reinicializarComboBoxes();
        tableClean();
        llenarTabla();
    }//GEN-LAST:event_jbVaciarCamposActionPerformed

    private void jtCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jtCerrarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed

        DietaComida dietaComida = new DietaComida();
        dietaComida.setComida((Comida) jcbComida.getSelectedItem());
        dietaComida.setDia((DiasEnum) jcbDia.getSelectedItem());
        dietaComida.setHorario((HorariosEnum) jcbHorario.getSelectedItem());
        dietaComida.setDieta(DD.buscarDieta(idDieta));
        if (manejoEscrituraCelda(dietaComida.getHorario(), dietaComida.getDia())) {
            DCD.guardarDietaComida(dietaComida);
        }
        tableClean();
        llenarTabla();

    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        DietaComida dietaComida = (DietaComida) modeloTabla.getValueAt(jTablaDietaComida.getSelectedRow(), jTablaDietaComida.getSelectedColumn());
        dietaComida.setComida((Comida) jcbComida.getSelectedItem());
        DCD.modificarDietaComida(dietaComida);
        restaurarEstadoInicialBotones();
        tableClean();
        llenarTabla();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jcbComida.getSelectedItem() != null) {
            Comida comida = (Comida) jcbComida.getSelectedItem();
            JOptionPane.showMessageDialog(this, "Detalle:\n" + comida.getDetalle() + "\n\n" + comida.getCantCalorias() + " cal.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jsFiltroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsFiltroStateChanged
        if ((int) jsFiltro.getValue() != 0) {
            List<Comida> listaComida = CD.listaComida()
                    .stream().filter(comida -> comida.getCantCalorias() <= ((int) jsFiltro.getValue()))
                    .sorted(Comparator.comparingInt(Comida::getCantCalorias))
                    .collect(Collectors.toList());
            jcbComida.setModel(new DefaultComboBoxModel(listaComida.toArray(new Comida[listaComida.size()])));
        } else {
            List<Comida> listaComida = CD.listaComida().stream().sorted(Comparator.comparingInt(Comida::getCantCalorias)).collect(Collectors.toList());
            jcbComida.setModel(new DefaultComboBoxModel(listaComida.toArray(new Comida[listaComida.size()])));
        }
    }//GEN-LAST:event_jsFiltroStateChanged

    private void jbEliminarCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarCronoActionPerformed
        int opt = JOptionPane.showConfirmDialog(this, "¿Desea eliminar todas las consumisiones?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            DCD.eliminarDietaComidaTotal(DietaVista.idDieta);
            restaurarEstadoInicialBotones();
            tableClean();
            llenarTabla();
        }
    }//GEN-LAST:event_jbEliminarCronoActionPerformed

    private void jPaneInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneInfoMouseEntered
        jPaneInfo.setBackground(new Color(195, 255, 184));
        jLInfo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jPaneInfoMouseEntered

    private void jPaneInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneInfoMouseExited
        jPaneInfo.setBackground(new Color(140, 184, 132));
        jLInfo.setForeground(Color.WHITE);
    }//GEN-LAST:event_jPaneInfoMouseExited

    private void jPaneInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPaneInfoMouseReleased
        JOptionPane.showMessageDialog(this, "-Para agregar una comida  a la celda de la dieta, seleccione Comida, Horario y Día y presione el botón [Agregar].\n" +
"\n" +
"-Para agregar una comida a la celda de la dieta, seleccione una celda, seleccione Comida, Horario y Día y presione el botón [Agregar].\n" +
"\n" +
"-Para ver el detalle de la comida, seleccione una comida y presione el botón [Detalle].\n" +
"\n" +
"-Para modificar una comida seleccione la celda, modifique los datos que desea actualizar y presione el botón [Modificar].\n" +
"\n" +
"-Para eliminar una comida, seleccionela en la tabla y presione el botón [Eliminar].\n" +
"\n" +
"-Para limpiar todos los campos presione el botón [Limpiar].");
    }//GEN-LAST:event_jPaneInfoMouseReleased

    private void jbEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminar1ActionPerformed
         int opt = JOptionPane.showConfirmDialog(this, "¿Desea Eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            DietaComida dietaComida = (DietaComida) modeloTabla.getValueAt(jTablaDietaComida.getSelectedRow(), jTablaDietaComida.getSelectedColumn());
            DCD.eliminarDietaComida(dietaComida);
            restaurarEstadoInicialBotones();
            tableClean();
            llenarTabla();
        }
    }//GEN-LAST:event_jbEliminar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPaneInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaDietaComida;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar1;
    private javax.swing.JButton jbEliminarCrono;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbVaciarCampos;
    private javax.swing.JComboBox<String> jcbComida;
    private javax.swing.JComboBox<String> jcbDia;
    private javax.swing.JComboBox<String> jcbHorario;
    private javax.swing.JSpinner jsFiltro;
    private javax.swing.JToggleButton jtCerrar;
    private javax.swing.JTextField jtNombreDieta;
    // End of variables declaration//GEN-END:variables

    private void iniComboBoxes() {
        List<Comida> listaComida = CD.listaComida().stream().sorted(Comparator.comparingInt(Comida::getCantCalorias)).collect(Collectors.toList());
        jcbComida.setModel(new DefaultComboBoxModel(listaComida.toArray(new Comida[listaComida.size()])));
        jcbDia.setModel(new DefaultComboBoxModel(DiasEnum.values()));
        jcbHorario.setModel(new DefaultComboBoxModel(HorariosEnum.values()));
    }

    private void armarCabecera() {// Arma la cabecera de la tabla
        int j = 1;
        modeloTabla.addColumn("Dia");

        for (HorariosEnum horario : HorariosEnum.values()) {
            modeloTabla.addColumn(horario);
            j++;
        }
        jTablaDietaComida.setModel(modeloTabla);
        for (int i = 0; i < j; i++) {
            jTablaDietaComida.getColumnModel().getColumn(i).setPreferredWidth(100);
        }
        JTableHeader header = jTablaDietaComida.getTableHeader();
        header.setDefaultRenderer(new HeaderRenderer(jTablaDietaComida));
    }

    private void llenarTabla() {
        List<DietaComida> comidaPorDia;
        for (DiasEnum dia : DiasEnum.values()) {
            comidaPorDia = DCD.listarDietaComidaXDieta(DietaVista.idDieta).stream()
                    .filter(dietaCom -> dietaCom.getDia().equals(dia))
                    .sorted(Comparator.comparing(DietaComida::getHorario))
                    .collect(Collectors.toList());
            agregarFila(comidaPorDia, dia);
        }
    }

    private void agregarFila(List<DietaComida> listaPorConsumo, DiasEnum enumD) {
        Object[] celda = {enumD, null, null, null, null, null};
        for (DietaComida dietaCom : listaPorConsumo) {
            switch (dietaCom.getHorario().toString()) {
                case "DESAYUNO":
                    celda[1] = dietaCom;
                    break;
                case "ALMUERZO":
                    celda[2] = dietaCom;
                    break;
                case "MERIENDA":
                    celda[3] = dietaCom;
                    break;
                case "CENA":
                    celda[4] = dietaCom;
                    break;
                case "SNACK":
                    celda[5] = dietaCom;
                    break;
            }
        }
        modeloTabla.addRow(celda);
    }

    private void tableClean() {
        //limpia la tabla de dietas
        if (jTablaDietaComida.getRowCount() != 0) {
            int largo = jTablaDietaComida.getRowCount() - 1;
            for (; largo >= 0; largo--) {
                modeloTabla.removeRow(largo);
            }
        }
    }

    private void restaurarEstadoInicialBotones() {
        jbAgregar.setEnabled(true);
        jbModificar.setEnabled(false);
        jbEliminar1.setEnabled(false);
        jcbDia.setEnabled(true);
        jcbHorario.setEnabled(true);
        jcbComida.setEnabled(true);
        jsFiltro.setValue((int) 0);
    }

    private void reinicializarComboBoxes() {
        jcbComida.setSelectedItem(null);
        jcbDia.setSelectedItem(null);
        jcbHorario.setSelectedItem(null);
    }

    private boolean manejoEscrituraCelda(HorariosEnum horario, DiasEnum dia) {
        DietaComida dietaComida = DCD.buscarDietaComida(DietaVista.idDieta, horario.toString(), dia.toString());

        if (dietaComida == null) {
            return true;
        }
        int opt = JOptionPane.showConfirmDialog(this, "Ya existe un consumo para este día y horario.\n¿Desea reemplazarlo?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.YES_OPTION) {
            DCD.eliminarDietaComida(dietaComida);
            return true;
        }
        return false;
    }

}
