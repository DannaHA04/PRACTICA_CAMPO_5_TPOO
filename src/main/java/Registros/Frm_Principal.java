
package Registros;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Frm_Principal extends javax.swing.JFrame {

    DefaultTableModel modelo;
    MantenimientoPerro perros;
    
    public Frm_Principal() {
        initComponents();
        
        String [] columnas = {"Codigo", "Nombre", "Raza", "Edad", "Peso", "Tamaño", "Genero", 
                              "Estado Salud", "Fecha Ingreso", "Monto Total Gastos"};
        modelo = new DefaultTableModel(columnas,0);
        
        tb_Informacion.setModel(modelo);
        
        perros = new MantenimientoPerro();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Raza = new javax.swing.JTextField();
        txt_FechaIngreso = new javax.swing.JTextField();
        txt_Peso = new javax.swing.JTextField();
        cmb_EstadoSalud = new javax.swing.JComboBox<>();
        cmb_Tamaño = new javax.swing.JComboBox<>();
        cbm_Genero = new javax.swing.JComboBox<>();
        txt_Edad = new javax.swing.JTextField();
        btn_Limpiar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Informacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(454, 6, 0, 0);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel2.setText("GESTIÓN DE PERRITOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 6, 216, 40);

        jLabel3.setText("Codigo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 60, 90, 16);

        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 90, 16);

        jLabel5.setText("Raza:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 110, 50, 30);

        jLabel6.setText("Tamaño:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 210, 80, 20);

        jLabel7.setText("Peso:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 180, 60, 20);

        jLabel8.setText("Edad:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 150, 60, 20);

        jLabel9.setText("Genero:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 240, 80, 20);

        jLabel10.setText("Estado de Salud:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 266, 100, 30);

        jLabel11.setText("Fecha de ingreso:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 300, 140, 20);
        getContentPane().add(txt_Codigo);
        txt_Codigo.setBounds(70, 60, 160, 22);
        getContentPane().add(txt_Nombre);
        txt_Nombre.setBounds(80, 90, 150, 22);
        getContentPane().add(txt_Raza);
        txt_Raza.setBounds(60, 120, 170, 22);
        getContentPane().add(txt_FechaIngreso);
        txt_FechaIngreso.setBounds(120, 300, 100, 22);
        getContentPane().add(txt_Peso);
        txt_Peso.setBounds(60, 180, 90, 22);

        cmb_EstadoSalud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">>>SELECCIONA<<<", "Saludable", "En tratamiento", "Recuperación", "Crítico" }));
        getContentPane().add(cmb_EstadoSalud);
        cmb_EstadoSalud.setBounds(120, 270, 160, 22);

        cmb_Tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">>>SELECCIONA<<<", "Pequeño", "Mediano", "Grande" }));
        getContentPane().add(cmb_Tamaño);
        cmb_Tamaño.setBounds(80, 210, 160, 22);

        cbm_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">>>SELECCIONA<<<", "Macho", "Hembra" }));
        getContentPane().add(cbm_Genero);
        cbm_Genero.setBounds(80, 240, 160, 22);
        getContentPane().add(txt_Edad);
        txt_Edad.setBounds(60, 150, 90, 22);

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Limpiar);
        btn_Limpiar.setBounds(20, 350, 80, 30);

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Agregar);
        btn_Agregar.setBounds(120, 350, 90, 30);

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir);
        btn_Salir.setBounds(70, 390, 90, 30);

        tb_Informacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_Informacion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 50, 452, 360);

        setSize(new java.awt.Dimension(788, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        
        txt_Codigo.setText("");
        txt_Nombre.setText("");
        txt_Raza.setText("");
        txt_Edad.setText("");
        txt_Peso.setText("");
        txt_FechaIngreso.setText("");
        
        cmb_Tamaño.setSelectedIndex(0);
        cbm_Genero.setSelectedIndex(0);
        cmb_EstadoSalud.setSelectedIndex(0);      
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        
        int rpta = JOptionPane.showOptionDialog(this, "¿Estas seguro de salir?", "Mensaje de Confirmacion", 
                                     JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(rpta == 0) System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed
    
    private void ActualizaTabla(){
        
        modelo.setRowCount(0);        
        ArrayList<Perro> lista = perros.obtenerPerros();
        
        for(Perro perro1 : lista){
            
            Object[] datofila = {perro1.getCodigo(),
                                 perro1.getNombre(),
                                 perro1.getEdad(),
                                 perro1.getEstadoSalud(),
                                 perro1.getFechaIngreso(),
                                 perro1.getGenero(),
                                 perro1.getPeso(),
                                 perro1.getRaza(),
                                 perro1.getTamaño()};
            modelo.addRow(datofila);
        }
    }
    
    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        
        //USO DE MANEJO DE ERRORES
        
        if (txt_Codigo.getText().isEmpty() || txt_Nombre.getText().isEmpty()
                || txt_Raza.getText().isEmpty() || txt_Edad.getText().isEmpty()
                || txt_Peso.getText().isEmpty() || txt_FechaIngreso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }
        try {
            // Capturar los datos desde los campos
            String codigo = txt_Codigo.getText();
            String nombre = txt_Nombre.getText();
            String raza = txt_Raza.getText();
            int edad = Integer.parseInt(txt_Edad.getText());
            double peso = Double.parseDouble(txt_Peso.getText());
            String tamaño = cmb_Tamaño.getSelectedItem().toString();
            String genero = cbm_Genero.getSelectedItem().toString();
            String estadoSalud = cmb_EstadoSalud.getSelectedItem().toString();

            // Convertir la fecha desde String a Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaIngreso = dateFormat.parse(txt_FechaIngreso.getText());
            
            // Crear el objeto Perro usando el constructor con parámetros
            Perro objetoPerro = new Perro(codigo, nombre, raza, edad, peso, tamaño, genero, estadoSalud, fechaIngreso);

            // Agregar el perro a la lista
            perros.agregarPerro(objetoPerro);

            // Actualizar la tabla
            ActualizaTabla();

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Perro registrado correctamente.");

            // Limpiar los campos
            btn_LimpiarActionPerformed(evt);

        } catch (NumberFormatException ex) {
            // Manejar errores de formato de número (edad y peso)
            JOptionPane.showMessageDialog(this, "Edad y Peso deben ser números válidos.");
        } catch (Exception ex) {
            // Manejar cualquier otro error
            JOptionPane.showMessageDialog(this, "Error al registrar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JComboBox<String> cbm_Genero;
    private javax.swing.JComboBox<String> cmb_EstadoSalud;
    private javax.swing.JComboBox<String> cmb_Tamaño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Informacion;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_FechaIngreso;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Peso;
    private javax.swing.JTextField txt_Raza;
    // End of variables declaration//GEN-END:variables
}
