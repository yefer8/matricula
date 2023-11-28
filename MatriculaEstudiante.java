package com.mycompany.matricula2;

public class MatriculaEstudiante extends javax.swing.JFrame {

    public MatriculaEstudiante() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombreestudiante = new javax.swing.JLabel();
        ApelidoPaterno = new javax.swing.JLabel();
        ApelidoMaterno = new javax.swing.JLabel();
        NumeroDeDNI = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        MatricularAlumno = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        ApellidoPaterno = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        NombreDelEstudiante = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        ApellidoMaterno = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        NumeroDNI = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        Edadd = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SWItalc", 0, 28)); // NOI18N
        jLabel1.setText("Proceso de Matricula");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 400, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 530, 80));

        jLabel2.setText("Costo de matricula: S/200.00");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 160, 20));

        Nombreestudiante.setText("Nombre del Estudiante");
        jPanel1.add(Nombreestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        ApelidoPaterno.setText("Apellido Paterno");
        jPanel1.add(ApelidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        ApelidoMaterno.setText("Apellido Materno");
        jPanel1.add(ApelidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        NumeroDeDNI.setText("Numero de DNI");
        jPanel1.add(NumeroDeDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        Edad.setText("Edad");
        jPanel1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        MatricularAlumno.setText("Matricular");
        MatricularAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatricularAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(MatricularAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jScrollPane11.setViewportView(ApellidoPaterno);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 190, -1));

        jScrollPane12.setViewportView(NombreDelEstudiante);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 190, -1));

        jScrollPane13.setViewportView(ApellidoMaterno);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 190, -1));

        jScrollPane14.setViewportView(NumeroDNI);

        jPanel1.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 190, -1));

        jScrollPane15.setViewportView(Edadd);

        jPanel1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 190, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Proceso de Pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 170, 80));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Registro del Apoderado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Matricula del Estudiante");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatricularAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatricularAlumnoActionPerformed
     // Obtener los datos del estudiante desde los campos de texto
    String nombre = NombreDelEstudiante.getText();
    String apellidoPaterno = ApellidoPaterno.getText();
    String apellidoMaterno = ApellidoMaterno.getText();
    String numeroDNI = NumeroDNI.getText();
    String edadText = Edadd.getText();

    // Verificar si algún campo está vacío
    if (nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() || numeroDNI.isEmpty() || edadText.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios. Por favor, llénelos todos.");
        return;  // Detener la ejecución si hay algún campo vacío
    }

    // Convertir la edad a entero
    int edad = Integer.parseInt(edadText);

    // Aquí puedes realizar las operaciones de matrícula o guardar los datos en una base de datos
    // Puedes imprimir los datos en la consola como ejemplo
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido Paterno: " + apellidoPaterno);
    System.out.println("Apellido Materno: " + apellidoMaterno);
    System.out.println("Número de DNI: " + numeroDNI);
    System.out.println("Edad: " + edad);

    javax.swing.JOptionPane.showMessageDialog(this, "Datos del Estudiante Registrados con Éxito");

    // Dirigirse a la clase ProcesoDePago.java
    ProcesoDePago procesoDePago = new ProcesoDePago();
    procesoDePago.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario

    // También puedes limpiar los campos de texto después de la matrícula si es necesario
    NombreDelEstudiante.setText("");
    ApellidoPaterno.setText("");
    ApellidoMaterno.setText("");
    NumeroDNI.setText("");
    Edadd.setText("");
    }//GEN-LAST:event_MatricularAlumnoActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
 MatriculaApoderado matriculaApoderado = new MatriculaApoderado();
    matriculaApoderado.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    MatriculaApoderado matriculaApoderado = new MatriculaApoderado();
    matriculaApoderado.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 MatriculaEstudiante matriculaEstudiante = new MatriculaEstudiante();
    matriculaEstudiante.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ProcesoDePago procesoDePago = new ProcesoDePago();
    procesoDePago.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatriculaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatriculaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatriculaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatriculaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatriculaEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApelidoMaterno;
    private javax.swing.JLabel ApelidoPaterno;
    private javax.swing.JTextPane ApellidoMaterno;
    private javax.swing.JTextPane ApellidoPaterno;
    private javax.swing.JLabel Edad;
    private javax.swing.JTextPane Edadd;
    private javax.swing.JButton MatricularAlumno;
    private javax.swing.JTextPane NombreDelEstudiante;
    private javax.swing.JLabel Nombreestudiante;
    private javax.swing.JTextPane NumeroDNI;
    private javax.swing.JLabel NumeroDeDNI;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    // End of variables declaration//GEN-END:variables
}
