/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.edu.practica05_interface.test.Vista.Disco;

import ec.edu.ups.edu.practica05_interface.test.controlador.CantanteControlador;
import ec.edu.ups.edu.practica05_interface.test.modelo.Cantante;
import ec.edu.ups.edu.practica05_interface.test.modelo.Disco;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jf001
 */
public class VentanaBuscarDisco extends javax.swing.JInternalFrame {
 private CantanteControlador cantanteControlador;
 private ResourceBundle mensajes;
    /**
     * Creates new form VentanaBuscarDisco
     */
    public VentanaBuscarDisco(CantanteControlador cantanteControlador) {
        initComponents();
        this.cantanteControlador=cantanteControlador;
    }
            public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jLabel1.setText(mensajes.getString("menu.cantante"));
        jLabel5.setText(mensajes.getString("menu.disco"));
        jLabelC.setText(mensajes.getString("txtCodigo"));
        jLabelCC.setText(mensajes.getString("txtCodigo"));
        jLabelNombre.setText(mensajes.getString("txtNombre"));
        jLabelName.setText(mensajes.getString("txtNombre"));
        jLabelApe.setText(mensajes.getString("txtApellido"));
        jLabelArt.setText(mensajes.getString("txtArtistico"));
        jLabelMusic.setText(mensajes.getString("txtGeneroMusical")); 
        jLabelAnio.setText(mensajes.getString("txtAnioLanzamiento"));       
        BtnCancelar.setText(mensajes.getString("BtnCancelar"));
        BtnBuscar.setText(mensajes.getString("BtnBuscar"));
        btnSalir.setText(mensajes.getString("salir"));
        BtnAceptar.setText(mensajes.getString("BtnAceptar"));
       jPanel1.setBorder(BorderFactory.createTitledBorder(mensajes.getString("PanelBDisco")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabelCC = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApe = new javax.swing.JLabel();
        jLabelArt = new javax.swing.JLabel();
        jLabelMusic = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        txtGeneroMusical = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        jLabelC = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelAnio = new javax.swing.JLabel();
        txtNombreDisco = new javax.swing.JTextField();
        txtAnioLanzamiento = new javax.swing.JTextField();
        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        cbxDisco = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Disco"));

        jLabelCC.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabelCC.setText("Codigo:");

        jLabelNombre.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelApe.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabelApe.setText("Apellido:");

        jLabelArt.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabelArt.setText("Nombre artistico:");

        jLabelMusic.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabelMusic.setText("Genero musical:");

        txtCodigo.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtCodigo.setToolTipText("");

        txtNombre.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombre.setEnabled(false);

        txtApellido.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtApellido.setEnabled(false);

        txtNombreArtistico.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombreArtistico.setEnabled(false);

        txtGeneroMusical.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtGeneroMusical.setEnabled(false);

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

        jLabelC.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabelC.setText("Codigo:");

        jLabelName.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabelName.setText("Nombre:");

        jLabelAnio.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabelAnio.setText("Ano de lanzamiento:");

        txtNombreDisco.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombreDisco.setEnabled(false);

        txtAnioLanzamiento.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtAnioLanzamiento.setEnabled(false);

        BtnAceptar.setBackground(new java.awt.Color(255, 204, 102));
        BtnAceptar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnAceptar.setText("Aceptar");
        BtnAceptar.setEnabled(false);
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(255, 204, 102));
        BtnCancelar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setEnabled(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        cbxDisco.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        cbxDisco.setEnabled(false);
        cbxDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDiscoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel1.setText("cantante");

        jLabel5.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel5.setText("disco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelArt)
                            .addComponent(jLabelMusic)
                            .addComponent(jLabelApe))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(txtCodigo)
                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelCC)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(BtnBuscar)
                        .addGap(83, 83, 83)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelC)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelAnio)
                                    .addGap(24, 24, 24)
                                    .addComponent(txtAnioLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCC)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelArt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMusic))
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelC)
                    .addComponent(cbxDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName)
                    .addComponent(txtNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAnio)
                    .addComponent(txtAnioLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuscar)
                    .addComponent(btnSalir))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         limpiarCamposCantante();
         limpiarCamposDisco(); 
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            Cantante cantante = cantanteControlador.buscar(codigo);
            if (cantante != null) {
                txtApellido.setText(cantante.getApellido());
                txtGeneroMusical.setText(cantante.getGeneroMusical());
                txtNombre.setText(cantante.getNombre());
                txtNombreArtistico.setText(cantante.getNombreArtistico());
                BtnAceptar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, mensajes.getString("mensajeBuscar"));
                limpiarCamposCantante();
            }
        } else {
            JOptionPane.showMessageDialog(this, "NO DATA :( ");
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigoIngresado = Integer.parseInt(txtCodigo.getText());
            Cantante cantante = cantanteControlador.buscar(codigoIngresado);

            if (cantante != null) {
                if (cantante.getNombre().equals(txtNombre.getText()) && cantante.getApellido().equals(txtApellido.getText())) {
                    txtCodigo.setEnabled(false);
                    BtnCancelar.setEnabled(true);
                    BtnAceptar.setEnabled(false);
                    BtnBuscar.setEnabled(false);
                    cbxDisco.setEnabled(true);
                    cargarDatosCombo();
                } 
            } 
        } 
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed

        txtCodigo.setEnabled(true);
        BtnAceptar.setEnabled(true);
        BtnCancelar.setEnabled(false);
        BtnBuscar.setEnabled(true);
        cbxDisco.setEnabled(false);
        limpiarCamposDisco();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void cbxDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDiscoActionPerformed
        if (cbxDisco.getSelectedItem() != null) {
            Disco disco = (Disco) cbxDisco.getSelectedItem();
            txtNombreDisco.setText(String.valueOf(disco.getNombre()));
            txtAnioLanzamiento.setText(String.valueOf(disco.getAnioDeLanzamiento()));

        }
    }//GEN-LAST:event_cbxDiscoActionPerformed
 private void limpiarCamposCantante() {
        txtCodigo.setText("");
        txtApellido.setText("");
        txtGeneroMusical.setText("");
        txtNombre.setText("");
        txtNombreArtistico.setText("");
    }

    private void limpiarCamposDisco() {
        txtNombreDisco.setText("");
        txtAnioLanzamiento.setText("");
        cbxDisco.removeAllItems();
    }

    private void cargarDatosCombo() {
        DefaultComboBoxModel<Disco> modelo = (DefaultComboBoxModel) cbxDisco.getModel();
        Cantante cantante = this.cantanteControlador.buscar(Integer.parseInt(txtCodigo.getText()));
        modelo.removeAllElements();
        List<Disco> listaDiscos = cantante.listarDiscos();
        if (!listaDiscos.isEmpty()) {
            for (Disco disco : listaDiscos) {
                modelo.addElement(disco);
            }
            Disco disco = (Disco) modelo.getSelectedItem();
            txtNombreDisco.setText(disco.getNombre());
            txtAnioLanzamiento.setText(String.valueOf(disco.getAnioDeLanzamiento()));
        } else {
            JOptionPane.showMessageDialog(this, "NO DATA :( ");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxDisco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAnio;
    private javax.swing.JLabel jLabelApe;
    private javax.swing.JLabel jLabelArt;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelMusic;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txtAnioLanzamiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNombreDisco;
    // End of variables declaration//GEN-END:variables
}
