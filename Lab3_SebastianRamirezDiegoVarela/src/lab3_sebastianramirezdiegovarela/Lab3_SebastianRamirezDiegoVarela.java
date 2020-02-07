package lab3_sebastianramirezdiegovarela;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lab3_SebastianRamirezDiegoVarela {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Equipo> equipos = new ArrayList();
        System.out.print("1. Crear Equipo\n"
                + "2. Agregar personal\n"
                + "3. Modificar Equipo\n"
                + "4. Eliminar Equipo\n"
                + "5. Despedir personal\n"
                + "6. Jugara\n"
                + "7. Entrenara\n"
                + "8. Salir\n"
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
                Dueño de=new Dueño(net,nacimiento);
                de.setNombre(nombre);
                equipos.add(new Equipo(nombre,new Date(),campeonatos,de));
                
                break;//creacion de equipo
            case 2:
                for (int i = 0; i < equipos.size(); i++) {
                     System.out.println("["+equipos.get(i)+"] "+equipos.get(i).getNombre());
                }
                int posicion = input.nextInt();
                System.out.println("1. Agregar Jugador\n"
                        + "2. Agregar medico\n"
                        + "3. Agregar entrenador\n"
                        + "Ingrese opcion: ");
                switch (input.nextInt()) {
                    case 1:
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
                                equipos.get(posicion).personal.add(new Base(camisa,tiro_de_3,defensa,tiro_de_media,rebote,bandeja,pases,posteo));
                                break;
                            case 2:
                                equipos.get(posicion).personal.add(new Escolta(camisa,tiro_de_3,defensa,tiro_de_media,rebote,bandeja,pases,posteo));
                                break;
                            case 3:
                                equipos.get(posicion).personal.add(new Alero(camisa,tiro_de_3,defensa,tiro_de_media,rebote,bandeja,pases,posteo));
                                break;
                            case 4:
                                equipos.get(posicion).personal.add(new Alero_Pivot(camisa,tiro_de_3,defensa,tiro_de_media,rebote,bandeja,pases,posteo));
                                break;
                            case 5:
                                equipos.get(posicion).personal.add(new Centro(camisa,tiro_de_3,defensa,tiro_de_media,rebote,bandeja,pases,posteo));
                                break;
                            default:
                                throw new AssertionError();
                        }//fin jugador
                        break;
                    case 2://medico
                        System.out.print("Ingrese colegio: ");
                        String colegio = input.nextLine();
                        colegio = input.nextLine();
                        equipos.get(posicion).personal.add(new Medico(colegio));
                        break;
                    case 3:
                        System.out.print("El entrenador fue jugador?(s/n): ");
                        char resp = input.next().charAt(0);
                        boolean fue;
                        switch (resp) {
                            case 's':
                            case 'S':
                                fue = true;
                                break;
                            case 'n':
                            case 'N':
                                fue = false;
                            default:
                                throw new AssertionError();
                        }
                        System.out.print("Ingrese jugada favorita: ");
                        String jugada = input.nextLine();
                        jugada = input.nextLine();
                        equipos.get(posicion).personal.add(new Entrenador(fue,jugada));
                        break;
                }//fin switch personal
                break;
            case 4:
                for (int i = 0; i < equipos.size(); i++) {
                     System.out.println("["+equipos.get(i)+"] "+equipos.get(i).getNombre());
                }
                posicion = input.nextInt();
                equipos.remove(posicion);
                break;
            case 5:
                
                break;
            case 8:
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }//fin switch principal
    }
    
}
