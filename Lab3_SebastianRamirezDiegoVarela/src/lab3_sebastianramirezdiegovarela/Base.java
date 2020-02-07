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
public class Base extends Jugador{

     private double Altura;

    public Base() {
    super();
    }

    public Base(double Altura) {
        super(Altura);
        this.Altura = 1.93;
    }

    public Base(int camiseta, int tiroDe3, int defensa, int tiroDeMedia, int rebote, int bandeja, int pases, int posteo) {
        super(camiseta, tiroDe3, defensa, tiroDeMedia, rebote, bandeja, pases, posteo,1.93);
    }
    
    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Base{" + "Altura=" + Altura + '}';
    }

}
