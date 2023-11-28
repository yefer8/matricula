package com.mycompany.matricula2;
import javax.swing.JOptionPane;

public class ProcesoDePago extends javax.swing.JFrame {
    
    public ProcesoDePago() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        CVV = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        NumeroDeLaTarjeta = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        FechaDeVencimientoDeLaTarjeta = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        ApellidoMaterno = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        SegundoNombre = new javax.swing.JTextPane();
        Pagar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        ApellidoPaterno = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        PrimerNombre = new javax.swing.JTextPane();
        Segundo = new javax.swing.JButton();
        Tercero = new javax.swing.JButton();
        Primero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SWItalc", 0, 32)); // NOI18N
        jLabel1.setText("Proceso de Pago");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 340, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 530, 80));

        jScrollPane4.setViewportView(CVV);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 80, -1));

        jLabel4.setText("Nombre de Propietario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setText("Apellidos Completos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel6.setText("Numero de Tarjeta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel7.setText("CVV");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel8.setText("MM/AA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jScrollPane5.setViewportView(NumeroDeLaTarjeta);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 260, -1));

        jScrollPane7.setViewportView(FechaDeVencimientoDeLaTarjeta);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 80, -1));

        jScrollPane10.setViewportView(ApellidoMaterno);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 120, -1));

        jScrollPane11.setViewportView(SegundoNombre);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 120, -1));

        Pagar.setText("Pagar");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });
        jPanel1.add(Pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jScrollPane12.setViewportView(ApellidoPaterno);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 120, -1));

        jScrollPane13.setViewportView(PrimerNombre);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, -1));

        Segundo.setBackground(new java.awt.Color(204, 204, 204));
        Segundo.setText("Matricula del Estudiante");
        Segundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegundoActionPerformed(evt);
            }
        });
        jPanel1.add(Segundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 170, 80));

        Tercero.setBackground(new java.awt.Color(204, 204, 204));
        Tercero.setText("Proceso de Pago");
        Tercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerceroActionPerformed(evt);
            }
        });
        jPanel1.add(Tercero, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 180, 80));

        Primero.setBackground(new java.awt.Color(204, 204, 204));
        Primero.setText("Registro del Apoderado");
        Primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimeroActionPerformed(evt);
            }
        });
        jPanel1.add(Primero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                               
    private void SegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegundoActionPerformed
 MatriculaEstudiante matriculaEstudiante = new MatriculaEstudiante();
    matriculaEstudiante.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario    
    }//GEN-LAST:event_SegundoActionPerformed

    private void TerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerceroActionPerformed
ProcesoDePago procesoDePago = new ProcesoDePago();
    procesoDePago.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario
        // TODO add your handling code here:
    }//GEN-LAST:event_TerceroActionPerformed

    private void PrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeroActionPerformed
       MatriculaApoderado matriculaApoderado = new MatriculaApoderado();
    matriculaApoderado.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario
    }//GEN-LAST:event_PrimeroActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
MatriculaEstudiante matriculaEstudiante = new MatriculaEstudiante();
    matriculaEstudiante.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario           // TODO add your handling code here:
    }//GEN-LAST:event_VolverActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
// Obtener los datos ingresados por el usuario
         String primerNombre = PrimerNombre.getText();
    String segundoNombre = SegundoNombre.getText();
    String apellidoPaterno = ApellidoPaterno.getText();
    String apellidoMaterno = ApellidoMaterno.getText();
    String numeroTarjeta = NumeroDeLaTarjeta.getText();
    String cvv = CVV.getText();
    String fechaVencimiento = FechaDeVencimientoDeLaTarjeta.getText();

        if (primerNombre.isEmpty() || segundoNombre.isEmpty() || apellidoPaterno.isEmpty() || 
        apellidoMaterno.isEmpty() || numeroTarjeta.isEmpty() || cvv.isEmpty() || fechaVencimiento.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        return;  // Salir del método sin mostrar el mensaje de éxito ni cerrar la ventana
    }
        JOptionPane.showMessageDialog(this, "Pago y Matricula del Estudiante Exitosa", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        
        // Limpiar los campos después de la matrícula exitosa
        PrimerNombre.setText("");
        SegundoNombre.setText("");
        ApellidoPaterno.setText("");
        ApellidoMaterno.setText("");
        NumeroDeLaTarjeta.setText("");
        CVV.setText("");
        FechaDeVencimientoDeLaTarjeta.setText("");    
        
        this.dispose();
        }//GEN-LAST:event_PagarActionPerformed

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
            java.util.logging.Logger.getLogger(ProcesoDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcesoDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcesoDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcesoDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcesoDePago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane ApellidoMaterno;
    private javax.swing.JTextPane ApellidoPaterno;
    private javax.swing.JTextPane CVV;
    private javax.swing.JTextPane FechaDeVencimientoDeLaTarjeta;
    private javax.swing.JTextPane NumeroDeLaTarjeta;
    private javax.swing.JButton Pagar;
    private javax.swing.JTextPane PrimerNombre;
    private javax.swing.JButton Primero;
    private javax.swing.JButton Segundo;
    private javax.swing.JTextPane SegundoNombre;
    private javax.swing.JButton Tercero;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
