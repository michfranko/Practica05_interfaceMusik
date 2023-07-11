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
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaActualizarCliente extends javax.swing.JInternalFrame {
      private CompositorControlador controladorCompositor;
      private CantanteControlador controladorCantante;
      private ResourceBundle mensajes;
    /**
     * Creates new form VentanaCrearClientec
     */
    public VentanaActualizarCliente(CompositorControlador controladorCompositor, CantanteControlador controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
        this.controladorCompositor = controladorCompositor;
    }
   public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jLabel1.setText(mensajes.getString("seleccionAc"));
        jLabel2.setText(mensajes.getString("seleccionC"));
        jLabel3.setText(mensajes.getString("menu.compositor"));  
        jLabel4.setText(mensajes.getString("textoEx"));  
        BtnActualizar.setText(mensajes.getString("actualizar"));
        BtnSalir.setText(mensajes.getString("salir"));
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
        BtnSalir = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        tblCantante.setBackground(new java.awt.Color(153, 153, 153));
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

        BtnSalir.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnActualizar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel1.setText("Seleccione el cliente a actualizar");

        jLabel2.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel2.setText("Seleccione el nuevo cliente");

        tblClientes.setBackground(new java.awt.Color(153, 153, 153));
        tblClientes.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tblClientes);

        jLabel3.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel3.setText("Compositor");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("(seleccione el compositor que desea actualizar, el cliente que quiere remplazar y el cliente que lo remplazara)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnActualizar)
                        .addGap(52, 52, 52)
                        .addComponent(BtnSalir)
                        .addGap(511, 511, 511))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnActualizar)
                            .addComponent(BtnSalir))
                        .addGap(15, 15, 15))))
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

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        salir();
        
        this.setVisible(false);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed

        if (comprobarSeleccion()) {
            Compositor compositor = cargarCompositorSeleccionado();
            Cantante cantanteNuevo = cargarCantanteSeleccionado();
            Cantante cantanteViejo = cargarClienteSeleccionado();
            Cantante validacion = controladorCompositor.buscarCantante(compositor, cantanteNuevo.getCodigo());
            if (validacion == null) {
                controladorCompositor.actualizarCliente(compositor, cantanteViejo, cantanteNuevo);
                JOptionPane.showMessageDialog(this, mensajes.getString("mensajeActualizar"));
            } else {
                JOptionPane.showMessageDialog(this, mensajes.getString("mensajeNOActualizar"));
            }

        } else {
            if (tblCompositor.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "No :( ");
            } else if (tblCantante.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "No :( ");
            } else if (tblClientes.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "No :( ");
            } else {
                JOptionPane.showMessageDialog(this, "No :( ");
            }
        }
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        salir();
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarCantante();
        cargarCompositor();
    }//GEN-LAST:event_formInternalFrameActivated

    private void tblCompositorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompositorMouseClicked
        cargarClientes();
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

    private void cargarClientes() {
        int fila = tblCompositor.getSelectedRow();
        int codigoC = Integer.parseInt(tblCompositor.getValueAt(fila, 0).toString());
        Compositor compositor = controladorCompositor.buscar(codigoC);
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        List<Cantante> listaCantante = controladorCompositor.listarCantantes(compositor);
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
        tblClientes.setModel(modelo);
    }

    private void cargarCantante() {
        DefaultTableModel modelo = (DefaultTableModel) tblCantante.getModel();
        modelo.setNumRows(0);
        List<Cantante> listaCantante = controladorCantante.Listar();
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
    }

    private void salir() {
        DefaultTableModel modeloCantante = (DefaultTableModel) tblCantante.getModel();
        modeloCantante.setNumRows(0);
        tblCantante.setModel(modeloCantante);
        DefaultTableModel modeloCompositor = (DefaultTableModel) tblCompositor.getModel();
        modeloCompositor.setNumRows(0);
        tblCompositor.setModel(modeloCompositor);
        DefaultTableModel modeloClientes = (DefaultTableModel) tblClientes.getModel();
        modeloClientes.setNumRows(0);
        tblClientes.setModel(modeloClientes);
    }

    private Cantante cargarCantanteSeleccionado() {
        int fila = tblCantante.getSelectedRow();
        int codigo = Integer.parseInt(tblCantante.getValueAt(fila, 0).toString());
        Cantante cantante = controladorCantante.buscar(codigo);
        return cantante;

    }

    private Cantante cargarClienteSeleccionado() {
        int fila = tblClientes.getSelectedRow();
        int codigo = Integer.parseInt(tblClientes.getValueAt(fila, 0).toString());
        Cantante cantante = controladorCantante.buscar(codigo);
        return cantante;
    }

    private Compositor cargarCompositorSeleccionado() {
        int fila = tblCompositor.getSelectedRow();
        int codigo = Integer.parseInt(tblCompositor.getValueAt(fila, 0).toString());
        Compositor compositor = controladorCompositor.buscar(codigo);
        return compositor;

    }

    private boolean comprobarSeleccion() {
        if (tblCompositor.getSelectedRow() == -1 || tblCantante.getSelectedRow() == -1 || tblClientes.getSelectedRow() == -1) {

            return false;
        } else {
            return true;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblCantante;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblCompositor;
    // End of variables declaration//GEN-END:variables
}
