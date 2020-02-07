/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sebastianramirezdiegovarela;

public class Dueño extends Persona{

private long netw;    
private String nacimiento;

public Dueño() {
    super();
    }

    public Dueño(long netw, String nacimiento) {
        
        this.netw = netw;
        this.nacimiento = nacimiento;
        
    }
    public void setNombre(String nombre){
        super.setNombre(nombre);
    }
    public long getNetw() {
        return netw;
    }

    public void setNetw(long netw) {
        this.netw = netw;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

}
