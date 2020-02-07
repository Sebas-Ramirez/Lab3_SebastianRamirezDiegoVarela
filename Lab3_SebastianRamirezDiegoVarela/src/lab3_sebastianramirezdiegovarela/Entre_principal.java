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
public class Entre_principal extends Entrenador {
private long sal;

    public Entre_principal() {
    super();
    }
    
    public Entre_principal(long sal) {
        this.sal = 2000000;
    }

    public long getSal() {
        return sal;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Entre_principal{" + "sal=" + sal + '}';
    }
    

}
