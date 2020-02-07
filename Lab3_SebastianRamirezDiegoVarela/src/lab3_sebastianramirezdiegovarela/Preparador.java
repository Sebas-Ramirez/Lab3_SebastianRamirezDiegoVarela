/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sebastianramirezdiegovarela;

public class Preparador extends Entrenador {

    @Override
    public String toString() {
        return "Preparador{" + "sal=" + sal + '}';
    }
private long sal;

    public Preparador(long sal) {
        this.sal = 1000000;
    }

    public long getSal() {
        return sal;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    public Preparador() {
        super();
    }    
    
}
