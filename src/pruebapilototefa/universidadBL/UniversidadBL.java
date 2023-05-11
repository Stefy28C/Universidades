/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapilototefa.universidadBL;
/**
 *
 * @author egualteros
 */
public class UniversidadBL {
    // VAMOS  a establecer las variables que usa nuetsro sistema   
   private int id,nit,Ingresos,Egresos;
    private String Universidad,Direccion;
    //get= me consiggue los datos set= me los muestra
    //A continuacion la seccion de getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNit() {
        return nit;
    }
    public void setNit(int nit) {
        this.nit = nit;
    }
    public int getIngresos() {
        return Ingresos;
    }
    public void setIngresos(int Ingresos) {
        this.Ingresos = Ingresos;
    }
    public int getEgresos() {
        return Egresos;
    }
    public void setEgresos(int Egresos) {
        this.Egresos = Egresos;
    }
    public String getUniversidad() {
        return Universidad;
    }
    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    } 
}
