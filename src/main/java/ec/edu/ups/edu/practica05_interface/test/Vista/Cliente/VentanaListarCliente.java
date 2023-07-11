/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista.Cliente;

import ec.edu.ups.edu.practica05_interface.test.controlador.CantanteControlador;
import ec.edu.ups.edu.practica05_interface.test.controlador.CompositorControlador;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaListarCliente extends javax.swing.JInternalFrame {
    private ResourceBundle mensajes;
    private CompositorControlador controladorCompositor;
    private CantanteControlador controladorCantante;

    /**
     * Creates new form VentanaCrearClientec
     */
    public VentanaListarCliente(CantanteControlador controladorCantante, CompositorControlador controladorCompositor) {
        initComponents();
        this.controladorCantante = controladorCantante;
        this.controladorCompositor = controladorCompositor;
    }
    
      public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jLabel1.setText(mensajes.getString("jmensajev"));
        jLabel3.setText(mensajes.getString("menu.compositor")); 
        jLabel4.setText(mensajes.getString("cliente")); 
        btnSalir.setText(mensajes.getString("salir"));
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCompositor = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCantante = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        tblCompositor.setBackground(new java.awt.Color(153, 153, 153));
        tblCompositor.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        tblCompositor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Numero de composiciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCompositor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCompositorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCompositor);

        tblCantante.setBackground(new java.awt.Color(102, 102, 102));
        tblCantante.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        tblCantante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Nombre artistico", "Genero Musical", "# de sencillos", "# de conciertos", "# de giras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCantante);

        btnSalir.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel3.setText("Compositor");

        jLabel4.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel4.setText("Cliente");

        jLabel1.setText("(Seleccione un compositor para poder  listar sus clientes)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(572, 572, 572)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel3)))))
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnSalir)
                .addContainerGap())
        );

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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        salir();
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

        cargarCompositor();
    }//GEN-LAST:event_formInternalFrameActivated

    private void tblCompositorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompositorMouseClicked
        cargarCantante();
    }//GEN-LAST:event_tblCompositorMouseClicked

    private void cargarCompositor() {
        DefaultTableModel modelo = (DefaultTableModel) tblCompositor.getModel();
        modelo.setNumRows(0);
        List<Compositor> listaCompositors = controladorCompositor.Listar();
        for (Compositor compositor : listaCompositors) {
            String codigo = String.valueOf(compositor.getCodigo());
            String nombre = compositor.getNombre();
            String edad = String.valueOf(compositor.getEdad());
            String nacionalidad = compositor.getNacionalidad();
            String apellido = compositor.getApellido();
            String salario = String.valueOf(compositor.getSalario());
            String numComposiciones = String.valueOf(compositor.getNumeroDeComposiciones());
            Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, numComposiciones};
            modelo.addRow(rowData);

        }
        tblCompositor.setModel(modelo);
    }

    private void cargarCantante() {
        int fila = tblCompositor.getSelectedRow();
        int codigoC = Integer.parseInt(tblCompositor.getValueAt(fila, 0).toString());
        Compositor compositor = controladorCompositor.buscar(codigoC);
        DefaultTableModel modelo = (DefaultTableModel) tblCantante.getModel();
        modelo.setNumRows(0);
        List<Cantante> listaCantante = controladorCompositor.listarCantantes(compositor);
        if (!listaCantante.isEmpty()) {
            for (Cantante cantante : listaCantante) {
                String codigo = String.valueOf(cantante.getCodigo());
                String nombre = cantante.getNombre();
                String apellido = cantante.getApellido();
                String edad = String.valueOf(cantante.getEdad());
                String nacionalidad = cantante.getNacionalidad();
                String salario = String.valueOf(cantante.getSalario());
                String nombreArtistico = cantante.getNombreArtistico();
                String generoMusical = cantante.getGeneroMusical();
                String numSencillos = String.valueOf(cantante.getNumeroDeSencillos());
                String numConciertos = String.valueOf(cantante.getNumeroDeConciertos());
                String numGiras = String.valueOf(cantante.getNumeroDeGiras());
                Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, nombreArtistico, generoMusical, numSencillos, numConciertos, numGiras};
                modelo.addRow(rowData);
            }
            tblCantante.setModel(modelo);
        }else{
            JOptionPane.showMessageDialog(this, "NO DATA :( ");
        }
    }

    private void salir() {
        DefaultTableModel modeloCantante = (DefaultTableModel) tblCantante.getModel();
        modeloCantante.setNumRows(0);
        tblCantante.setModel(modeloCantante);
        DefaultTableModel modeloCompositor = (DefaultTableModel) tblCompositor.getModel();
        modeloCompositor.setNumRows(0);
        tblCompositor.setModel(modeloCompositor);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblCantante;
    private javax.swing.JTable tblCompositor;
    // End of variables declaration//GEN-END:variables
}
