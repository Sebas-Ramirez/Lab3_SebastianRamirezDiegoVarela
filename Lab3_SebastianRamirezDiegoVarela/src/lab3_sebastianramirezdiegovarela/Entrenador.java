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
public class Entrenador extends Persona {
    public String jugó;
    public String jugadafav;

    public Entrenador() {
    super();
    }

    public Entrenador(String jugó, String jugadafav) {
        
        this.jugó = jugó;
        this.jugadafav = jugadafav;
    }

    public String isJugó() {
        return jugó;
    }

    public void setJugó(String jugó) {
        this.jugó = jugó;
    }

    public String getJugadafav() {
        return jugadafav;
    }

    public void setJugadafav(String jugadafav) {
        this.jugadafav = jugadafav;
    }
    
    
}
