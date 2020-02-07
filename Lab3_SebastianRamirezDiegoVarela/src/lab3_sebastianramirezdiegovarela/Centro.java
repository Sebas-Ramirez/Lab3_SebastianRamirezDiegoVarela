/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_sebastianramirezdiegovarela;

public class Centro extends Jugador {
    private double Altura;

    public Centro() {
    super();
    }

    public Centro(double Altura) {
        super(Altura);
        this.Altura = 2.13;
    }

    public Centro(int camiseta, int tiroDe3, int defensa, int tiroDeMedia, int rebote, int bandeja, int pases, int posteo) {
        super(camiseta, tiroDe3, defensa, tiroDeMedia, rebote, bandeja, pases, posteo, 2.13);
    }
    
    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Centro{" + "Altura=" + Altura + '}';
    }
    
    


    
}
