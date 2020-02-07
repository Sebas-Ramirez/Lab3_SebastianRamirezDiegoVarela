package lab3_sebastianramirezdiegovarela;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lab3_SebastianRamirezDiegoVarela {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Equipo> equipos = new ArrayList();
        System.out.print("1. Crear Equipo\n"
                + "2. Agregar personal\n"
                + "3. Modificar Equipo\n"
                + "4. Eliminar Equipo\n"
                + "5. Jugara\n"
                + "6. Entrenara\n"
                + "Ingrese opcion: ");
        switch (input.nextInt()) {
            case 1:
                System.out.print("Ingrese nombre del equipo: ");
                String nombre = input.nextLine();
                nombre = input.nextLine();
                System.out.print("Ingrese numero de campeonatos: ");
                int campeonatos = input.nextInt();
                System.out.print("Ingrese nombre del dueño: ");
                String dueno = input.nextLine();
                dueno = input.nextLine();
                System.out.print("Ingrese net worth del dueño: ");
                int net = input.nextInt();
                System.out.print("Ingrese nacimiento: ");
                String nacimiento = input.nextLine();
                nacimiento = input.nextLine();
                Dueño de = new Dueño(net, nacimiento);
                de.setNombre(nombre);
                equipos.add(new Equipo(nombre, new Date(), campeonatos, de));

                break;//creacion de equipo
            case 2:
                for (int i = 0; i < equipos.size(); i++) {
                    System.out.println("[" + equipos.get(i) + "] " + equipos.get(i).getNombre());
                }
                System.out.println("1. Agregar Jugador\n"
                        + "2. Agregar medico\n"
                        + "3. Agregar entrenador\n"
                        + "Ingrese opcion: ");
                switch (input.nextInt()) {
                    case 1:

                        System.out.print("Ingrese la posicion del equipo: ");
                        int posicion = input.nextInt();
                        System.out.print("Ingrese numero de camisa: ");
                        int camisa = input.nextInt();
                        System.out.print("Ingrese tiro de 3: ");
                        int tiro_de_3 = input.nextInt();
                        System.out.print("Ingrese defensa: ");
                        int defensa = input.nextInt();
                        System.out.print("Ingrese tiro de media: ");
                        int tiro_de_media = input.nextInt();
                        System.out.print("Ingrese rebote: ");
                        int rebote = input.nextInt();
                        System.out.print("Ingrese bandeja: ");
                        int bandeja = input.nextInt();
                        System.out.print("Ingrese pases: ");
                        int pases = input.nextInt();
                        System.out.print("Ingrese posteo: ");
                        int posteo = input.nextInt();
                        System.out.println("1. Base\n"
                                + "2. Escolta\n"
                                + "3. Alero\n"
                                + "4. Alero-Pivot\n"
                                + "5. Centro\n"
                                + "Ingrese tipo de jugador: ");
                        switch (input.nextInt()) {
                            case 1:
                                equipos.get(posicion).personal.add(new Base(camisa, tiro_de_3, defensa, tiro_de_media, rebote, bandeja, pases, posteo));
                                break;
                            case 2:
                                equipos.get(posicion).personal.add(new Escolta(camisa, tiro_de_3, defensa, tiro_de_media, rebote, bandeja, pases, posteo));
                                break;
                            case 3:
                                equipos.get(posicion).personal.add(new Alero(camisa, tiro_de_3, defensa, tiro_de_media, rebote, bandeja, pases, posteo));
                                break;
                            case 4:
                                equipos.get(posicion).personal.add(new Alero_Pivot(camisa, tiro_de_3, defensa, tiro_de_media, rebote, bandeja, pases, posteo));
                                break;
                            case 5:
                                equipos.get(posicion).personal.add(new Centro(camisa, tiro_de_3, defensa, tiro_de_media, rebote, bandeja, pases, posteo));
                                break;
                            default:
                                throw new AssertionError();
                        }//fin jugador
                        break;
                    case 2://medico
                        System.out.print("Ingrese colegio: ");
                        String colegio = input.nextLine();
                        colegio = input.nextLine();

                        break;
                }//fin switch personal
                break;
            case 3:
                for (int i = 0; i < equipos.size(); i++) {
                    System.out.println("[" + equipos.get(i) + "] " + equipos.get(i).getNombre());
                }
                System.out.print("Ingrese la posicion del equipo: ");
                int e = input.nextInt();
                System.out.println("Que desea modificar?");
                System.out.println("1) Equipo");
                System.out.println("2) Jugador");
                switch (input.nextInt()) {
                    case 1:
                        System.out.println("Que desea modificar?");
                        System.out.println("1) Nombre \n"
                                + "2) Numero de campeonatos\n"
                                + "3) Dueño\n");
                        switch (input.nextInt()) {
                            case 1:
                                System.out.println("Ingrese le nuevo nombre:");
                                String nuenom = input.nextLine();
                                nuenom = input.nextLine();
                                equipos.get(e).setNombre(nuenom);
                                break;
                            case 2:
                                System.out.println("Ingrese el nuevo numero de campeonatos:");
                                int nuecam = input.nextInt();
                                equipos.get(e).setCampeonatos(nuecam);
                                break;
                            case 3:
                                System.out.print("Ingrese nombre del dueño: ");
                                String nuedueno = input.nextLine();
                                dueno = input.nextLine();
                                System.out.print("Ingrese net worth del dueño: ");
                                int nuenet = input.nextInt();
                                System.out.print("Ingrese nacimiento: ");
                                String nuenacimiento = input.nextLine();
                                nacimiento = input.nextLine();
                                Dueño nue = new Dueño(nuenet, nuenacimiento);
                                nue.setNombre(nuedueno);
                                break;
                        }
                    case 2:
                        for (int i = 0; i < equipos.get(e).getPersonal().size(); i++) {
                    System.out.println("[" + equipos.get(i) + "] " + equipos.get(e).getPersonal().get(i));
                }
                        System.out.println("Ingrese la posicion del jugador que quiere cambiar:");
                        int pos=input.nextInt();
                        System.out.println("Que quiere cambiar del jugador?\n"
                                + "1) Numero de camisa\n"
                                + "2) Tiro de 3\n"
                                + "3) Defensa\n"
                                + "4) Tiro de media \n"
                                + "5) Rebote\n"
                                + "6) Bandeja\n"
                                + "7) Pases\n"
                                + "8) Posteo\n");
                        switch(input.nextInt()){
                            case 1:
                                System.out.println("Ingrese el nuevo numero de camisa:");
                                int nuecam=input.nextInt();
                                ((Jugador)equipos.get(e).getPersonal().get(pos)).setCamiseta(nuecam);
                                break;
                                case 2:
                                System.out.println("Ingrese el nuevo Tior de 3:");
                                int tiro=input.nextInt();
                                ((Jugador)equipos.get(e).getPersonal().get(pos)).setTiroDe3(tiro);
                                break;
                                case 3:
                                System.out.println("Ingrese la nueva defensa:");
                                int def=input.nextInt();
                                ((Jugador)equipos.get(e).getPersonal().get(pos)).setDefensa(def);
                                break;
                                case 4:
                                System.out.println("Ingrese el nuevo tiro de media:");
                                int med=input.nextInt();
                                ((Jugador)equipos.get(e).getPersonal().get(pos)).setTiroDeMedia(med);
                                break;
                                case 5:
                                System.out.println("Ingrese el nuevo rebote:");
                                int reb=input.nextInt();
                                ((Jugador)equipos.get(e).getPersonal().get(pos)).setRebote(reb);
                                break;
                                case 6:
                                System.out.println("Ingrese el nuevo bandeja:");
                                int ban=input.nextInt();
                                ((Jugador)equipos.get(e).getPersonal().get(pos)).setBandeja(ban);
                                break;
                                case 7:
                                System.out.println("Ingrese el nuevo pases:");
                                int pas=input.nextInt();
                                ((Jugador)equipos.get(e).getPersonal().get(pos)).setPases(pas);
                                break;
                                case 8:
                                System.out.println("Ingrese el nuevo posteo:");
                                int post=input.nextInt();
                                ((Jugador)equipos.get(e).getPersonal().get(pos)).setPosteo(post);
                                break;
                        }
                        break;
                }
                break;
            default:
                throw new AssertionError();
        }//fin switch principal
    }

}
