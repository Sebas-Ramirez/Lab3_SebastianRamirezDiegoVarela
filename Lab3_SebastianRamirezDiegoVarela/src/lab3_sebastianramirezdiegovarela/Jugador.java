package lab3_sebastianramirezdiegovarela;

public class Jugador extends Persona {

    private int camiseta, tiroDe3, defensa, tiroDeMedia, rebote, bandeja, posteo, pases;
    private double altura;

    public Jugador() {
        super();
    }

    public Jugador(int camiseta, int tiroDe3, int defensa, int tiroDeMedia, int rebote, int bandeja, int pases, int posteo, double altura) {
        if (camiseta <= 100) {
            this.camiseta = camiseta;
        }
        if (tiroDe3 <= 100) {
            this.tiroDe3 = tiroDe3;
        }
        if (defensa <= 100) {
            this.defensa = defensa;
        }
        if (tiroDeMedia <= 100) {
            this.tiroDeMedia = tiroDeMedia;
        }
        if (rebote <= 100) {
            this.rebote = rebote;
        }
        if (bandeja <= 100) {
            this.bandeja = bandeja;
        }
        if (posteo <= 100) {
            this.posteo = posteo;
        }
        if (altura <= 100) {
            this.altura = altura;
        }
        if (pases <= 100) {
            this.pases = pases;
        }

    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public Jugador(double altura) {
        this.altura = altura;
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    public int getTiroDe3() {
        return tiroDe3;
    }

    public void setTiroDe3(int tiroDe3) {
        this.tiroDe3 = tiroDe3;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getTiroDeMedia() {
        return tiroDeMedia;
    }

    public void setTiroDeMedia(int tiroDeMedia) {
        this.tiroDeMedia = tiroDeMedia;
    }

    public int getRebote() {
        return rebote;
    }

    public void setRebote(int rebote) {
        this.rebote = rebote;
    }

    public int getBandeja() {
        return bandeja;
    }

    public void setBandeja(int bandeja) {
        this.bandeja = bandeja;
    }

    public int getPosteo() {
        return posteo;
    }

    public void setPosteo(int posteo) {
        this.posteo = posteo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Jugador{" + "camiseta=" + camiseta + ", tiroDe3=" + tiroDe3 + ", defensa=" + defensa + ", tiroDeMedia=" + tiroDeMedia + ", rebote=" + rebote + ", bandeja=" + bandeja + ", posteo=" + posteo + ", altura=" + altura + '}';
    }

}
