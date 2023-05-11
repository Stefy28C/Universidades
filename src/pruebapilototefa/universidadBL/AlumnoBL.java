/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapilototefa.universidadBL;

/**
 *
 * @author onca
 */
public class AlumnoBL {
    private int Id,Cedula;
    private String Nombre,Apellido,FKUniversidad;
    
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public String getFKUniversidad() {
        return FKUniversidad;
    }
    public void setFKUniversidad(String FKUniversidad) {
        this.FKUniversidad = FKUniversidad;
    }
   
}
