package registro;

public class Registro {

    /**
     *
     * @author viivi
     */
    public class Registro extends javax.swing.JInternalFrame {
        /**
         * Creates new form FormCliente
         */
    public Registro() {
        initComponents();
        validar();
    }

    public final void validar() {
        if (!jTxCorreoE.getText().contains("@") || !jTxCorreoE.getText().contains(".")) {
            jLbCorreoE.setText("El correo esta mal escrito");
        } else {
            jLbCorreoE.setText("");
        }
        try {
            int num = Integer.parseInt(jTxGrado.getText());
            jLbCupo.setText("");
        } catch (NumberFormatException ex) {
            jLbCupo.setText("El numero debe ser numerico");

        }
        try {
            int num = Integer.parseInt(jTxIdentificacion.getText());
            jLbId.setText("");
        } catch (NumberFormatException ex) {
            jLbId.setText("El numero debe ser numerico");

        }

        if (jTxNombres.getText().isEmpty()) {
            jLbNombre.setText("debe ingresar un nombre");
        } else if (jTxNombres.getText().length() > 15) {
            jLbNombre.setText("el usuari debe tener maximo 15 carateres");
        } else {
            jLbNombre.setText("");
        }
        if (jTxApellidos.getText().isEmpty()) {
            jLbApellido.setText("debe ingresar un apellido");
        } else if (jTxApellidos.getText().length() > 20) {
            jLbApellido.setText("el usuari debe tener maximo 15 carateres");
        } else {
            jLbApellido.setText("");
        }
        if (jTxDireccion.getText().isEmpty()) {
            jLbDireccion.setText("debe ingresar un direccion");
        } else if (jTxDireccion.getText().length() > 15) {
            jLbDireccion.setText("el usuari debe tener maximo 15 carateres");
        } else {
            jLbDireccion.setText("");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxIdentificacion = new javax.swing.JTextField();
        jTxNombres = new javax.swing.JTextField();
        jTxApellidos = new javax.swing.JTextField();
        jTxDireccion = new javax.swing.JTextField();
        jTxCorreoE = new javax.swing.JTextField();
        jTxGrado = new javax.swing.JTextField();
        jBtNuevo = new javax.swing.JButton();
        jBtGuardar = new javax.swing.JButton();
        jBtActualizar = new javax.swing.JButton();
        jBtEliminar = new javax.swing.JButton();
        jBtConsultar = new javax.swing.JButton();
        jBtSalir = new javax.swing.JButton();
        jLbCorreoE = new javax.swing.JLabel();
        jLbCupo = new javax.swing.JLabel();
        jLbId = new javax.swing.JLabel();
        jLbNombre = new javax.swing.JLabel();
        jLbApellido = new javax.swing.JLabel();
        jLbDireccion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(153, 204, 255));
        setTitle("Registro de Usuarios");

        jLabel1.setText("Identificación:");

        jLabel2.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Direccion:");

        jLabel6.setText("Correo Eletronico:");

        jLabel7.setText("Grado:");

        jTxIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxIdentificacionKeyReleased(evt);
            }
        });

        jTxNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxNombresKeyReleased(evt);
            }
        });

        jTxApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxApellidosKeyReleased(evt);
            }
        });

        jTxDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxDireccionKeyReleased(evt);
            }
        });

        jTxCorreoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxCorreoEKeyReleased(evt);
            }
        });

        jTxGrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxGradoKeyReleased(evt);
            }
        });

        jBtNuevo.setText("Nuevo");

        jBtGuardar.setText("Guardar");

        jBtActualizar.setText("Actualizar");

        jBtEliminar.setText("Eliminar");

        jBtConsultar.setText("Consultar");

        jBtSalir.setText("Salir");

        jLbCorreoE.setForeground(new java.awt.Color(0, 0, 204));

        jLbCupo.setForeground(new java.awt.Color(0, 0, 204));

        jLbId.setForeground(new java.awt.Color(204, 204, 255));
        jLbId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLbIdKeyReleased(evt);
            }
        });

        jLbNombre.setForeground(new java.awt.Color(0, 0, 204));
        jLbNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLbNombreKeyReleased(evt);
            }
        });

        jLbApellido.setForeground(new java.awt.Color(0, 0, 204));
        jLbApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLbApellidoKeyReleased(evt);
            }
        });

        jLbDireccion.setForeground(new java.awt.Color(0, 0, 204));
        jLbDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLbDireccionKeyReleased(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registroimg.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jBtNuevo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtActualizar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtConsultar))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jBtSalir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLbApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                    .addComponent(jLbCorreoE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLbCupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLbId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(100, 100, 100))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTxCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(jTxApellidos)
                                    .addComponent(jTxNombres)
                                    .addComponent(jTxIdentificacion))
                                .addComponent(jTxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBtNuevo)
                                .addComponent(jBtGuardar)
                                .addComponent(jBtActualizar)
                                .addComponent(jBtEliminar)
                                .addComponent(jBtConsultar)
                                .addComponent(jBtSalir)))
                        .addGap(18, 18, 18)
                        .addComponent(jLbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLbCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLbCupo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTxIdentificacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTxApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTxDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(357, 357, 357))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxCorreoEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxCorreoEKeyReleased
        validar();        // TODO add your handling code here:
    }//GEN-LAST:event_jTxCorreoEKeyReleased

    private void jTxGradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxGradoKeyReleased
        validar();
    }//GEN-LAST:event_jTxGradoKeyReleased

    private void jLbIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLbIdKeyReleased
        validar();
    }//GEN-LAST:event_jLbIdKeyReleased

    private void jLbNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLbNombreKeyReleased
        validar();
    }//GEN-LAST:event_jLbNombreKeyReleased

    private void jLbApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLbApellidoKeyReleased
        validar();
    }//GEN-LAST:event_jLbApellidoKeyReleased

    private void jLbDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLbDireccionKeyReleased
        validar();
    }//GEN-LAST:event_jLbDireccionKeyReleased

    private void jTxNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxNombresKeyReleased
        validar();
    }//GEN-LAST:event_jTxNombresKeyReleased

    private void jTxIdentificacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxIdentificacionKeyReleased
        validar();
    }//GEN-LAST:event_jTxIdentificacionKeyReleased

    private void jTxApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxApellidosKeyReleased
        validar();
    }//GEN-LAST:event_jTxApellidosKeyReleased

    private void jTxDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxDireccionKeyReleased
        validar();
    }//GEN-LAST:event_jTxDireccionKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBtActualizar;
    public javax.swing.JButton jBtConsultar;
    public javax.swing.JButton jBtEliminar;
    public javax.swing.JButton jBtGuardar;
    public javax.swing.JButton jBtNuevo;
    public javax.swing.JButton jBtSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbApellido;
    private javax.swing.JLabel jLbCorreoE;
    private javax.swing.JLabel jLbCupo;
    private javax.swing.JLabel jLbDireccion;
    private javax.swing.JLabel jLbId;
    private javax.swing.JLabel jLbNombre;
    public javax.swing.JTextField jTxApellidos;
    public javax.swing.JTextField jTxCorreoE;
    public javax.swing.JTextField jTxDireccion;
    public javax.swing.JTextField jTxGrado;
    public javax.swing.JTextField jTxIdentificacion;
    public javax.swing.JTextField jTxNombres;
    // End of variables declaration//GEN-END:variables
}
