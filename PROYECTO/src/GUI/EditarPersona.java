/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entidades.Departamento;
import Entidades.Empresa;
import Entidades.Persona;
import Negocios.Metodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ma210
 */
public class EditarPersona extends javax.swing.JFrame {
    
    Metodos procesos = new Metodos();

    /**
     * Creates new form RegistrarDepartamentos
     */
    public EditarPersona(java.awt.Frame parent, boolean modal) {
        initComponents();
        cargarEmpresa();
        cargarCedulas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombrePersona = new javax.swing.JTextField();
        cmbEmpresa = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbCedulas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setName("Registrar Departamento"); // NOI18N

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 12));
        jLabel1.setText("Editar Persona");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-editar (1).png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nombre ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Empresa");

        btnRegistrar.setBackground(new java.awt.Color(102, 153, 255));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvc/imagenes/disquete.png"))); // NOI18N
        btnRegistrar.setText("Guardar Persona");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(102, 153, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mvc/imagenes/cerrar-sesion.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Puesto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Salario x hora");

        txtPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuestoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Selecciona la cédula de los datos a editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPuesto)
                                    .addComponent(txtSalario)
                                    .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(91, 91, 91)
                                    .addComponent(cmbCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cmbCedulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnRegistrar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       registrarPersona();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        volverInicio();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuestoActionPerformed

    
      public void cargarEmpresa() {
        try {
            ArrayList<Empresa> usuarios = procesos.mostrarEmpresas();
            if(usuarios.size() == 0){
                    JOptionPane.showMessageDialog(rootPane,"Debe de registrar primero a una familia");
                } 
            
            else{
            for (Empresa temp : usuarios) {  
                cmbEmpresa.addItem(temp.getNombreE());
                      
            }
            }
            
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
      
      public void cargarCedulas() {
        try {
            ArrayList<Persona> usuarios = procesos.mostrarCedulas();
            if(usuarios.size() == 0){
                    JOptionPane.showMessageDialog(rootPane,"Debe de registrar primero una persona");
                } 
            
            else{
            for (Persona temp : usuarios) {  
                String cedulas = String.valueOf(temp.getCedula());
                cmbCedulas.addItem(cedulas);
                      
            }
            }
            
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EditarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
                EditarPersona dialog = new EditarPersona(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }
    
      public void registrarPersona() {
          
        String nombre = txtNombrePersona.getText();
        String puesto = txtPuesto.getText();
        int cedula = Integer.parseInt((String) cmbCedulas.getSelectedItem());
        int salario = Integer.parseInt(txtSalario.getText());
        String empresa = (String) cmbEmpresa.getSelectedItem();
        
        Empresa empresas = new Empresa(empresa);
        
        Persona personas = new Persona(nombre, salario,cedula, puesto, empresas);
        procesos.editarPersonas(personas);

        }
        
        public void volverInicio(){
         Menu ventana = new Menu(this,true);
        ventana.pack();
        setVisible(false);
        ventana.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCedulas;
    private javax.swing.JComboBox<String> cmbEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtNombrePersona;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
