/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sebastianramirezdiegovarela;

/**
 *
 * @author diego
 */
public class Asistente extends Entrenador{
private long sal;

    public Asistente(long sal) {
        this.sal = 1000000;
    }

    public long getSal() {
        return sal;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    public Asistente() {
    super();
    }

    @Override
    public String toString() {
        return "Asistente{" + "sal=" + sal + '}';
    }
    
}
