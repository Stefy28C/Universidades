/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapilototefa.universidadDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author egualterosC:\Users\egualteros\Desktop\netbeans\Basesqllite
 */
public class Conexion {
    String strConexionDB="jdbc:sqlite:C:\\Users\\onca\\Documents\\Basesqllite\\universibd.s3db";
    Connection conn=null;      
    //constructor que nos permite conectarnos al string de conexion
    public Conexion(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            //Crear una conexion
            conn=DriverManager.getConnection(strConexionDB);
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            //Me atrapa el error
            System.out.println("No se pudo establecer la conexion "+e);
        }
    }    
    //aqui vamos a devolver un 1 si es correcto y un 0 si no lo es aqui lo que haremos es ejecutar una insercion cuando se le de click al boton
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        //atrapar en el caso de que haya error
        try{
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            System.out.println("Se inserto bien ");
            return 1;
        }catch(SQLException e){
            System.out.println("algo salio mal"+e);
            return 0;
        }
    }
      //Consultar a las universidades
    //Utilizamos Result ser para obtener datos de una columna correspondinetes a una fila
    //el metodo recibe una instruccion SQL y por medio de esta me va a retornar a la lista de empleados
    //este metodo sirve para devolver informacion y comprobar si existe o no
    public ResultSet consultarRegistros(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            //devuelveme la consulta hacia universidades
            return respuesta;
        } catch (Exception e) {
            System.out.println("ALgo salio mal con consultar registros "+e);
            return null;
        }
    }
    //aqui hay que devolver algo
}
