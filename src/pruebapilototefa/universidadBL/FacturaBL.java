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
public class FacturaBL {
    private int Id,Referrencia,PrecioUnitario;
    private String FKAlumno;
   

    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public int getReferrencia() {
        return Referrencia;
    }
    public void setReferrencia(int Referrencia) {
        this.Referrencia = Referrencia;
    }
    public int getPrecioUnitario() {
        return PrecioUnitario;
    }
    public void setPrecioUnitario(int PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }
    public String getFKAlumno() {
        return FKAlumno;
    }
    public void setFKAlumno(String FKAlumno) {
        this.FKAlumno = FKAlumno;
    }

  
}
