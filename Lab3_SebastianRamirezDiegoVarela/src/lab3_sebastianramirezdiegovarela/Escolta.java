/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sebastianramirezdiegovarela;
public class Escolta extends Jugador {

    private double Altura;

    public Escolta() {
    super();
    }

    public Escolta(double Altura) {
        super(Altura);
        this.Altura = Altura;
    }
    
    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Escolta{" + "Altura=" + Altura + '}';
    }

    
    
}
