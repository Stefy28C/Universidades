/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapilototefa.universidadGUI;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import pruebapilototefa.universidadBL.AlumnoBL;

import pruebapilototefa.universidadDAL.Conexion;

/**
 *
 * @author onca
 */
public class Alumnos extends javax.swing.JFrame {

    DefaultTableModel modelo;
    DefaultComboBoxModel modeloCombo;

    /**
     * Creates new form Alumnos
     */
    public Alumnos() {

        initComponents();

        String[] titulos = {
            "Id",
            "Cedula",
            "Nombre",
            "Apellido",
            "Universidad"
        };

        modelo = new DefaultTableModel(null, titulos);
        modeloCombo = new DefaultComboBoxModel();
        tblAlumnos.setModel(modelo);
        jComboUniversidad.setModel(modeloCombo);

        //llamar a la clase par aque se ejecute aqui
        mostrarDatosAlumno();
        cargarListaUniversidades();
        // la interfaz se muestra en el centro de la pantalla
        this.setLocationRelativeTo(null);
    }

    public void cargarListaUniversidades() {

        //cada vez que yo haga algun proceso debo limpiar la tabla para insertar nuevos datos 
        Conexion objConexion = new Conexion();

        try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT*FROM Universidades");
            modeloCombo.removeAllElements();
            while (resultado.next()) {
                modeloCombo.addElement(resultado.getString("Universidad"));
            }

            jComboUniversidad.setModel(modeloCombo);
        } catch (Exception e) {
            System.out.println("Error: fallo en la conexion para la consulta del combo box " + e);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtid = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboUniversidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ALUMNOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        txtCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cedula:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jButton1.setText("Ir a Factura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ir a Universidad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboUniversidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboUniversidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboUniversidadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Universidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtid)
                        .addGap(160, 160, 160))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtid)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnBorrar))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Cedula", "Nombre", "Apellido", "Universidad"
            }
        ));
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblAlumnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked
        // por medio de la interfaz agregue un evento y este evento lo que hace es que cuando le de click a un dato de la tabla me lo va a mostrar

        //el if valida si el numero de clicks es igaul a un click
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();

            //essto nos ubicara en que posicion se encuentra cada dato, por eso los numeros
            txtid.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtCedula.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());

            txtApellido.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            jComboUniversidad.setSelectedIndex(0);

        }
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void jComboUniversidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboUniversidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboUniversidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Factura

        Factura factura = new Factura();

        //Va  a ser verdadero si se da click al boton(Nos llevara hasta la otra pagina)
        factura.setVisible(true);
        //Falso si no se da clic

        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // Programar el evento borrar

        Conexion objConexion = new Conexion();

        //Nuevo objeto que recupera toda la informacion de la interfaz grafica
        AlumnoBL alumnoBL = recuperarDatosAlumnoGUI();

        //setencia de borrado
        String strSetencuaInsert = String.format("DELETE FROM Alumnos WHERE id=%d", alumnoBL.getId());

        //aqui pasamos la instruccion SQL
        objConexion.ejecutarSentenciaSQL(strSetencuaInsert);

        //una vez que borres muestranos la info que desaparecio
        this.mostrarDatosAlumno();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Configurar Boton guardar:

        Conexion objConexion = new Conexion();

        //Nuevo objeto que recupera toda la informacion de la interfaz grafica
        AlumnoBL alumnoBL = recuperarDatosAlumnoGUI();

        //insert con datos puros del formulario
        String strSetencuaInsert = String.format("UPDATE Alumnos SET Cedula='%s',Nombre='%s',Apellido='%s',FKUniversidad=(SELECT id from Universidades where Universidad='%s') WHERE Id=%d", alumnoBL.getCedula(), alumnoBL.getNombre(), alumnoBL.getApellido(), alumnoBL.getFKUniversidad(), alumnoBL.getId());

        //aqui pasamos la instruccion SQL
        objConexion.ejecutarSentenciaSQL(strSetencuaInsert);
        //una vez que borres muestranos la info que desaparecio
        this.mostrarDatosAlumno();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Configurar Boton guardar:

        Conexion objConexion = new Conexion();

        //Nuevo objeto que recupera toda la informacion de la interfaz grafica
        AlumnoBL alumnoBL = recuperarDatosAlumnoGUI();

        //insert con datos puros del formulario
        String strSetencuaInsert = String.format("INSERT INTO Alumnos(Id,Cedula,Nombre,Apellido,FKUniversidad)  " + "values  (null,'%s','%s','%s',(SELECT id from Universidades where Universidad='%s'))", alumnoBL.getCedula(), alumnoBL.getNombre(), alumnoBL.getApellido(), alumnoBL.getFKUniversidad());

        //aqui pasamos la instruccion SQL
        objConexion.ejecutarSentenciaSQL(strSetencuaInsert);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       universidades universidad=new universidades();
        universidad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void mostrarDatosAlumno() {
        //cada vez que yo haga algun proceso debo limpiar la tabla para insertar nuevos datos 
        while (modelo.getRowCount() > 0) {
            //remove limpia la tabla
            modelo.removeRow(0);
        }

        // la conexion se repite aqui porque no se comparten los objetos entre clases :)
        Conexion objConexion = new Conexion();

        try {
            ResultSet resultado = objConexion.consultarRegistros("select*from Alumnos");
            //el while recupera la informacion y la muestra una por una por ahora solo la muestra por consola
            while (resultado.next()) {
                /*System.out.println(resultado.getString("id"));
                System.out.println(resultado.getString("Universidad"));
                System.out.println(resultado.getInt("nit"));
                System.out.println(resultado.getString("Direccion"));
                System.out.println(resultado.getInt("Ingresos"));
                System.out.println(resultado.getInt("Egresos"));*/

                //en un objeto almacenamos los datos que queremos traer de la bd
                Object[] oAlumno
                        = {
                            resultado.getString("Id"),
                            resultado.getInt("Cedula"),
                            resultado.getString("Nombre"),
                            resultado.getString("Apellido"),
                            resultado.getString("FKUniversidad")
                        };

                modelo.addRow(oAlumno);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

//aqui recuperamos datos de la interfaz 
    public AlumnoBL recuperarDatosAlumnoGUI() {
        AlumnoBL alumnoBL = new AlumnoBL();

        //verificar si el id es nulo+ y se le hace una validacion con un if
        //get captura y set trae
        int Id = (txtid.getText().isEmpty()) ? 0 : Integer.parseInt(txtid.getText());
        int Cedula = Integer.parseInt(txtCedula.getText());

        //aqui lo que hicimos fue recuperar esa informacion de la base de datos
        alumnoBL.setId(Id);
        alumnoBL.setCedula(Cedula);
        alumnoBL.setNombre(txtNombre.getText());
        alumnoBL.setApellido(txtApellido.getText());
        alumnoBL.setFKUniversidad(this.jComboUniversidad.getSelectedItem().toString());

        return alumnoBL;
    }

    //Metodo par ael JcomboBox
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
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboUniversidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtid;
    // End of variables declaration//GEN-END:variables
}