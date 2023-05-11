/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapilototefa.universidadGUI;

import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pruebapilototefa.universidadBL.FacturaBL;
import pruebapilototefa.universidadBL.UniversidadBL;
import pruebapilototefa.universidadDAL.Conexion;

/**
 *
 * @author onca
 */
public class Factura extends javax.swing.JFrame {

    DefaultTableModel modelo;
  DefaultComboBoxModel modeloCombo;
    /**
     * Creates new form Factura
     */
    public Factura() {
        initComponents();
        
        String[] titulos = {
            "Id",
            "Referencia",
            "PrecioUnitario",
            "FKAlumno",
           
        };
        
         modelo = new DefaultTableModel(null, titulos);
        modeloCombo=new DefaultComboBoxModel();
        tblFactura.setModel(modelo);
        jComboAlumno.setModel(modeloCombo);
        
        //llamar a la clase par aque se ejecute aqui
        mostrarDatosFactura();
        cargarListaAlumnos();
        
        // la interfaz se muestra en el centro de la pantalla
        this.setLocationRelativeTo(null);
    }
    
     public void cargarListaAlumnos(){
        
        //cada vez que yo haga algun proceso debo limpiar la tabla para insertar nuevos datos 
       
        
        
        Conexion objConexion=new Conexion();
        
        try{
            ResultSet resultado=objConexion.consultarRegistros("SELECT*FROM Alumnos");
            modeloCombo.removeAllElements();
            while (resultado.next()){
              modeloCombo.addElement(resultado.getString("Nombre"));
        }
        
            jComboAlumno.setModel(modeloCombo);
        }catch(Exception e){
            System.out.println("Error: fallo en la conexion para la consulta del combo box"+e);
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
        jLabel2 = new javax.swing.JLabel();
        txtRefFactura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtid = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboAlumno = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("FACTURA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("RefFactura:");

        txtRefFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRefFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefFacturaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("PrecioUnitario:");

        txtPrecioUnitario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUnitarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Alumno:");

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

        jButton1.setText("Ir a Universidad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ir a Alumnos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRefFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(55, 55, 55)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(jComboAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrar))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRefFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "RefFactura", "PrecioUnitario", "Alumno"
            }
        ));
        tblFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFacturaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblFactura);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRefFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRefFacturaActionPerformed

    private void txtPrecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioUnitarioActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
          // Configurar Boton guardar:

        Conexion objConexion = new Conexion();

        //Nuevo objeto que recupera toda la informacion de la interfaz grafica
        FacturaBL facturaBL = recuperarDatosFacturaGUI();

        //insert con datos puros del formulario
        String strSetencuaInsert = String.format("INSERT INTO Facturas(Id,Referencia,PrecioUnitario,FKAlumno)  " + "values  (null,'%s','%s',(SELECT id from Alumnos where Nombre='%s'))", facturaBL.getReferrencia(), facturaBL.getPrecioUnitario(),facturaBL.getFKAlumno());

        //aqui pasamos la instruccion SQL
        objConexion.ejecutarSentenciaSQL(strSetencuaInsert);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Modificar los datos

        Conexion objConexion = new Conexion();

        //Nuevo objeto que recupera toda la informacion de la interfaz grafica
        FacturaBL facturaBL = recuperarDatosFacturaGUI();

        //setencia de borrado
       String strSetencuaInsert = String.format("UPDATE Facturas SET Referencia='%s',PrecioUnitario='%s',FKAlumno=(SELECT id from Alumnos where Nombre='%s') WHERE Id=%d", facturaBL.getReferrencia(), facturaBL.getPrecioUnitario(), facturaBL.getFKAlumno(), facturaBL.getId());

        //aqui pasamos la instruccion SQL
        objConexion.ejecutarSentenciaSQL(strSetencuaInsert);

        //una vez que borres muestranos la info que desaparecio
        this.mostrarDatosFactura();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // Programar el evento borrar

        Conexion objConexion = new Conexion();

        //Nuevo objeto que recupera toda la informacion de la interfaz grafica
        FacturaBL facturaBL = recuperarDatosFacturaGUI();

        //setencia de borrado
        String strSetencuaInsert = String.format("DELETE FROM Facturas WHERE id=%d", facturaBL.getId());

        //aqui pasamos la instruccion SQL
        objConexion.ejecutarSentenciaSQL(strSetencuaInsert);

        //una vez que borres muestranos la info que desaparecio
       this.mostrarDatosFactura();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tblFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacturaMouseClicked
        // por medio de la interfaz agregue un evento y este evento lo que hace es que cuando le de click a un dato de la tabla me lo va a mostrar

        //el if valida si el numero de clicks es igaul a un click
        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();

            //essto nos ubicara en que posicion se encuentra cada dato, por eso los numeros
            txtid.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtRefFactura.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtPrecioUnitario.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
jComboAlumno.setSelectedIndex(0);           // txtUniversidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
           // txtEgresos.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tblFacturaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // Universidad
        
        universidades universidad=new universidades();
        universidad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Ir a estudiante 
        Alumnos alumno = new Alumnos();
        alumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

     public void mostrarDatosFactura() {
        //cada vez que yo haga algun proceso debo limpiar la tabla para insertar nuevos datos 
        while (modelo.getRowCount() > 0) {
            //remove limpia la tabla
            modelo.removeRow(0);
        }

        // la conexion se repite aqui porque no se comparten los objetos entre clases :)
        Conexion objConexion = new Conexion();

        try {
            ResultSet resultado = objConexion.consultarRegistros("select*from Facturas");
            //el while recupera la informacion y la muestra una por una por ahora solo la muestra por consola
            while (resultado.next()) {
                /*System.out.println(resultado.getString("id"));
                System.out.println(resultado.getString("Universidad"));
                System.out.println(resultado.getInt("nit"));
                System.out.println(resultado.getString("Direccion"));
                System.out.println(resultado.getInt("Ingresos"));
                System.out.println(resultado.getInt("Egresos"));*/

                //en un objeto almacenamos los datos que queremos traer de la bd
                Object[] oFactura
                        = {
                            resultado.getString("Id"),
                            resultado.getInt("Referencia"),
                            resultado.getInt("PrecioUnitario"),
                            resultado.getString("FKAlumno")
                        };

                modelo.addRow(oFactura);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    
      public FacturaBL recuperarDatosFacturaGUI() {
        FacturaBL facturaBL = new FacturaBL();

        //verificar si el id es nulo+ y se le hace una validacion con un if
        //get captura y set trae
        int Id = (txtid.getText().isEmpty()) ? 0 : Integer.parseInt(txtid.getText());
        int Referencia = Integer.parseInt(txtRefFactura.getText());
int PrecioUnitario = Integer.parseInt(txtPrecioUnitario.getText());

        //aqui lo que hicimos fue recuperar esa informacion de la base de datos
        facturaBL.setId(Id);
        facturaBL.setReferrencia(Referencia);
        facturaBL.setPrecioUnitario(PrecioUnitario);
        facturaBL.setFKAlumno(this.jComboAlumno.getSelectedItem().toString());

        return facturaBL;
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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtRefFactura;
    private javax.swing.JLabel txtid;
    // End of variables declaration//GEN-END:variables
}