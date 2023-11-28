package com.mycompany.matricula2;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


public class MatriculaApoderado extends javax.swing.JFrame {

    public MatriculaApoderado() {
        initComponents();
   
    }
     public class Apoderado {
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private String numeroDNI;
        private String numeroTelefono;
        private String direccion;
        private String parentesco;

        // Constructor
        public Apoderado(String nombre, String apellidoPaterno, String apellidoMaterno,
                        String numeroDNI, String numeroTelefono, String direccion, String parentesco) {
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.numeroDNI = numeroDNI;
            this.numeroTelefono = numeroTelefono;
            this.direccion = direccion;
            this.parentesco = parentesco;
        }

        // Puedes agregar getters y setters según sea necesario
    }

    // Paso 2: Crear una lista para almacenar instancias de Apoderado
    private List<Apoderado> listaApoderados = new ArrayList<>();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreApoderado = new javax.swing.JLabel();
        NumeroTelefono = new javax.swing.JLabel();
        ApelidoPaterno = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        NombreDelApoderado = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        ApellidoPaterno = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        NumerodDeTelefono = new javax.swing.JTextPane();
        ApelidoMaterno = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ApellidoMaterno = new javax.swing.JTextPane();
        NumeroDNI = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        NumerodeDNI = new javax.swing.JTextPane();
        RegistrarApoderado = new javax.swing.JButton();
        Direccion = new javax.swing.JLabel();
        Parentesco = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        DireccionDeDomicilio = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        ParentescoConElEstudiante = new javax.swing.JTextPane();
        FacilidadDeUsoNumeroDos = new javax.swing.JButton();
        FacilidadDeUsoNumeroTres = new javax.swing.JButton();
        FacilidadDeUsoNumeroUno = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SWItalc", 0, 28)); // NOI18N
        jLabel1.setText("Registro de Apoderado");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 400, 50));

        Panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 530, 80));

        NombreApoderado.setText("Nombre del Apoderado");
        Panel.add(NombreApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        NumeroTelefono.setText("Numero de Telefono");
        Panel.add(NumeroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        ApelidoPaterno.setText("Apellido Paterno");
        Panel.add(ApelidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        jScrollPane4.setViewportView(NombreDelApoderado);

        Panel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 190, -1));

        jScrollPane5.setViewportView(ApellidoPaterno);

        Panel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 190, -1));

        jScrollPane6.setViewportView(NumerodDeTelefono);

        Panel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 190, -1));

        ApelidoMaterno.setText("Apellido Materno");
        Panel.add(ApelidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jScrollPane7.setViewportView(ApellidoMaterno);

        Panel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 190, -1));

        NumeroDNI.setText("Numero de DNI");
        Panel.add(NumeroDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jScrollPane8.setViewportView(NumerodeDNI);

        Panel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 190, -1));

        RegistrarApoderado.setText("Registrar");
        RegistrarApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarApoderadoActionPerformed(evt);
            }
        });
        Panel.add(RegistrarApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        Direccion.setText("Direccion de Domicilio");
        Panel.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 20));

        Parentesco.setText("Parentesco con el estudiante");
        Panel.add(Parentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jScrollPane9.setViewportView(DireccionDeDomicilio);

        Panel.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 190, -1));

        jScrollPane10.setViewportView(ParentescoConElEstudiante);

        Panel.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 190, -1));

        FacilidadDeUsoNumeroDos.setBackground(new java.awt.Color(204, 204, 204));
        FacilidadDeUsoNumeroDos.setText("Matricula del Estudiante");
        FacilidadDeUsoNumeroDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacilidadDeUsoNumeroDosActionPerformed(evt);
            }
        });
        Panel.add(FacilidadDeUsoNumeroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 170, 80));

        FacilidadDeUsoNumeroTres.setBackground(new java.awt.Color(204, 204, 204));
        FacilidadDeUsoNumeroTres.setText("Proceso de Pago");
        FacilidadDeUsoNumeroTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacilidadDeUsoNumeroTresActionPerformed(evt);
            }
        });
        Panel.add(FacilidadDeUsoNumeroTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 180, 80));

        FacilidadDeUsoNumeroUno.setBackground(new java.awt.Color(204, 204, 204));
        FacilidadDeUsoNumeroUno.setText("Registro del Apoderado");
        FacilidadDeUsoNumeroUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacilidadDeUsoNumeroUnoActionPerformed(evt);
            }
        });
        Panel.add(FacilidadDeUsoNumeroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Panel.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarApoderadoActionPerformed
    // Recopilar los datos del formulario
    String nombre = NombreDelApoderado.getText();
    String apellidoPaterno = ApellidoPaterno.getText();
    String apellidoMaterno = ApellidoMaterno.getText();
    String numeroDNI = NumerodeDNI.getText();
    String numeroTelefono = NumerodDeTelefono.getText();
    String direccion = DireccionDeDomicilio.getText();
    String parentesco = ParentescoConElEstudiante.getText();

    // Verificar si algún campo está vacío
    if (nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() ||
        numeroDNI.isEmpty() || numeroTelefono.isEmpty() || direccion.isEmpty() || parentesco.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios. Por favor, llénelos todos.");
        return;  // Detener la ejecución si hay algún campo vacío
    }

    // Crear una instancia de Apoderado
    Apoderado nuevoApoderado = new Apoderado(nombre, apellidoPaterno, apellidoMaterno,
                                             numeroDNI, numeroTelefono, direccion, parentesco);

    // Agregar el nuevo apoderado a la lista
    listaApoderados.add(nuevoApoderado);

    JOptionPane.showMessageDialog(this, "Apoderado registrado con éxito");
  MatriculaEstudiante matriculaEstudiante = new MatriculaEstudiante();
    matriculaEstudiante.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario

        // Limpiar los campos del formulario después de registrar
        limpiarCamposFormulario();
    }

    // Agregar un método para limpiar los campos del formulario
    
    private void limpiarCamposFormulario() {
        NombreDelApoderado.setText("");
        ApellidoPaterno.setText("");
        ApellidoMaterno.setText("");
        NumerodeDNI.setText("");
        NumerodDeTelefono.setText("");
        DireccionDeDomicilio.setText("");
        ParentescoConElEstudiante.setText("");
  
    }//GEN-LAST:event_RegistrarApoderadoActionPerformed

    private void FacilidadDeUsoNumeroDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacilidadDeUsoNumeroDosActionPerformed
 MatriculaEstudiante matriculaEstudiante = new MatriculaEstudiante();
    matriculaEstudiante.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario        
    }//GEN-LAST:event_FacilidadDeUsoNumeroDosActionPerformed

    private void FacilidadDeUsoNumeroTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacilidadDeUsoNumeroTresActionPerformed
ProcesoDePago procesoDePago = new ProcesoDePago();
    procesoDePago.setVisible(true);
    this.dispose(); // Cierra la ventana actual si es necesario
        // TODO add your handling code here:
    }//GEN-LAST:event_FacilidadDeUsoNumeroTresActionPerformed

    private void FacilidadDeUsoNumeroUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacilidadDeUsoNumeroUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacilidadDeUsoNumeroUnoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(MatriculaApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatriculaApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatriculaApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatriculaApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatriculaApoderado().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApelidoMaterno;
    private javax.swing.JLabel ApelidoPaterno;
    private javax.swing.JTextPane ApellidoMaterno;
    private javax.swing.JTextPane ApellidoPaterno;
    private javax.swing.JLabel Direccion;
    private javax.swing.JTextPane DireccionDeDomicilio;
    private javax.swing.JButton FacilidadDeUsoNumeroDos;
    private javax.swing.JButton FacilidadDeUsoNumeroTres;
    private javax.swing.JButton FacilidadDeUsoNumeroUno;
    private javax.swing.JLabel NombreApoderado;
    private javax.swing.JTextPane NombreDelApoderado;
    private javax.swing.JLabel NumeroDNI;
    private javax.swing.JLabel NumeroTelefono;
    private javax.swing.JTextPane NumerodDeTelefono;
    private javax.swing.JTextPane NumerodeDNI;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Parentesco;
    private javax.swing.JTextPane ParentescoConElEstudiante;
    private javax.swing.JButton RegistrarApoderado;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
