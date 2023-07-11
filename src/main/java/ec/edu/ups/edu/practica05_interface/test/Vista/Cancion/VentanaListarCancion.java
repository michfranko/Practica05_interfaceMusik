/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista.Cancion;
import ec.edu.ups.edu.practica05_interface.test.controlador.CompositorControlador;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cancion;
import ec.edu.ups.edu.practica05_interface.test.modelo.Compositor;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jf001
 */
public class VentanaListarCancion extends javax.swing.JInternalFrame {
private CompositorControlador compositorControlador;
 private ResourceBundle mensajes;
    /**
     * Creates new form VentanaListarCancion
     */
    public VentanaListarCancion(CompositorControlador compositorControlador) {
        initComponents();
        this.compositorControlador = compositorControlador;
    }
 public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jLabel1.setText(mensajes.getString("menu.compositor"));
        jLabel2.setText(mensajes.getString("txtCodigo"));
        jLabel3.setText(mensajes.getString("txtNombre"));
        jLabel4.setText(mensajes.getString("txtApellido")); 
        jLabel5.setText(mensajes.getString("jcancion"));
        jLabel8.setText(mensajes.getString("txtComposiciones"));  
        BtnAceptar.setText(mensajes.getString("BtnAceptar"));
        BtnCancelar.setText(mensajes.getString("BtnCancelar"));
        BtnBuscar.setText(mensajes.getString("BtnBuscar"));
        btnSalir.setText(mensajes.getString("salir"));
       jPanel1.setBorder(BorderFactory.createTitledBorder(mensajes.getString("PanelLCancion")));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNumComposiciones = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCancion = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Cancion"));

        jLabel1.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel1.setText("Compositor");

        jLabel2.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel8.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel8.setText("Numero de composiciones");

        txtCodigo.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombre.setEnabled(false);

        txtApellido.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtApellido.setEnabled(false);

        txtNumComposiciones.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNumComposiciones.setEnabled(false);

        btnSalir.setBackground(new java.awt.Color(102, 102, 102));
        btnSalir.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        BtnBuscar.setBackground(new java.awt.Color(102, 102, 102));
        BtnBuscar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnAceptar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnAceptar.setText("Aceptar");
        BtnAceptar.setEnabled(false);
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setEnabled(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        tblCancion.setBackground(new java.awt.Color(153, 153, 153));
        tblCancion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Letra", "Duracion"
            }
        ));
        jScrollPane1.setViewportView(tblCancion);

        jLabel5.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel5.setText("Cancion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(txtNombre)
                                            .addComponent(txtApellido))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnAceptar)
                                            .addComponent(BtnCancelar)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(BtnBuscar)
                                .addGap(154, 154, 154)
                                .addComponent(btnSalir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAceptar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNumComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(BtnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(BtnBuscar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

    }//GEN-LAST:event_formInternalFrameActivated

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LimpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            Compositor compositor = compositorControlador.buscar(codigo);
            if (compositor != null) {
                txtApellido.setText(compositor.getApellido());
                txtNombre.setText(compositor.getNombre());
                txtNumComposiciones.setText(String.valueOf(compositor.getNumeroDeComposiciones()));
                BtnAceptar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, mensajes.getString("mensajeBuscar"));
                LimpiarCampos();
            }
        } else {
            LimpiarCampos();
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigoIngresado = Integer.parseInt(txtCodigo.getText());
            Compositor compositor = compositorControlador.buscar(codigoIngresado);

            if (compositor != null) {
                if (compositor.getNombre().equals(txtNombre.getText()) && compositor.getApellido().equals(txtApellido.getText())) {
                    txtCodigo.setEnabled(false);
                    BtnCancelar.setEnabled(true);
                    BtnAceptar.setEnabled(false);
                    BtnBuscar.setEnabled(false);
                    cargarTabla();
                } else {

                }
            } else {

            }
        } else {

        }
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        txtCodigo.setEnabled(true);
        BtnAceptar.setEnabled(true);
        BtnCancelar.setEnabled(false);
        BtnBuscar.setEnabled(true);
        DefaultTableModel modelo = (DefaultTableModel) tblCancion.getModel();
        modelo.setNumRows(0);
        LimpiarCampos();
        tblCancion.setModel(modelo);
    }//GEN-LAST:event_BtnCancelarActionPerformed
private void cargarTabla() {
        int codigo = Integer.parseInt(txtCodigo.getText());
        Compositor compositor = compositorControlador.buscar(codigo);
        DefaultTableModel modelo = (DefaultTableModel) tblCancion.getModel();
        modelo.setNumRows(0);
        List<Cancion> listaCancion = compositorControlador.listarCanciones(compositor);
        if (!listaCancion.isEmpty()) {
            for (Cancion cancion : listaCancion) {
                String codigoCancion = String.valueOf(cancion.getCodigo());
                String titulo = cancion.getTitulo();
                String letra = cancion.getLetra();
                String duracion = String.valueOf(cancion.getTiempoEnMinutos());
                Object[] rowData = {codigoCancion, titulo, letra,duracion};
                modelo.addRow(rowData);
            }
            tblCancion.setModel(modelo);
        } else {
            LimpiarCampos();
        }
    }
        private void LimpiarCampos() {
  txtCodigo.setText("");
  txtApellido.setText("");
  txtNombre.setText("");
  txtNumComposiciones.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCancion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumComposiciones;
    // End of variables declaration//GEN-END:variables
}
