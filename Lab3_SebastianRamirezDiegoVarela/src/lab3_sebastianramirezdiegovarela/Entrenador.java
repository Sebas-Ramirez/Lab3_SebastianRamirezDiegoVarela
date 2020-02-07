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
    public boolean jugó;
    public String jugadafav;

    public Entrenador() {
    super();
    }

    public Entrenador(boolean jugó, String jugadafav) {
        
        this.jugó = jugó;
        this.jugadafav = jugadafav;
    }

    public boolean isJugó() {
        return jugó;
    }

    public void setJugó(boolean jugó) {
        this.jugó = jugó;
    }

    public String getJugadafav() {
        return jugadafav;
    }

    public void setJugadafav(String jugadafav) {
        this.jugadafav = jugadafav;
    }
    
    
}
