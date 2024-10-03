/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericiogestoreventos;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class EjericioGestorEventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Evento event1 = new Evento("AA01", "Matrimonio Juan", LocalDate.of(2024,06,23));
        Evento event2 = new Evento("AA02", "Quermes Michael", LocalDate.of(2024,12,19));
        
        Cliente client1 = new Cliente("AA01", "Juan Manuel");
        Cliente client2 = new Cliente("AA02", "Michael Scott");
        
        Lugar lugar1 = new Lugar("A01", "Santuario natural Lomas de Zamora");
        Lugar lugar2 = new Lugar("B02", "Playa Rak'un San");
        
        Reserva reserva1 = new Reserva(event1, "AS01");
        Reserva reserva2 = new Reserva(event1, "AS02");
        Reserva reserva3 = new Reserva(event2, "E01");
        Reserva reserva4 = new Reserva(event2, "E02");
        
        Scanner leer = new Scanner(System.in);
        
        
        do {
            System.out.println("*** MENU GESTION DE EVENTOS ***");
            System.out.println("1. Agregar evento a lista de reservas");
            System.out.println("2. Quitar evento de lista de reservas");
            System.out.println("3. Mostrar informacion de lista de reservas");
            System.out.println("4. Salir");
            System.out.println("Seleccione la opcion del menu: ");
            int opc = leer.nextInt();
            switch(opc){
                case 1 -> {
                    System.out.println("\nLos eventos disponibles para agregar a lista de reservas son ingrese cual quiere agregar: ");
                    System.out.println("1." + event1.getNombre());
                    System.out.println("2." + event2.getNombre());
                    int opc2 = leer.nextInt();
                    switch(opc2){
                        case 1 -> {
                            System.out.println("Agregando reservas...");
                            event1.agregarReserva(reserva1);
                            event1.agregarReserva(reserva2);
                            lugar1.agregarEvento(event1);
                            client1.agregarReserva(reserva1);
                            client1.agregarReserva(reserva2);
                            System.out.println("Reserva realizada con exito!\n");
                        }
                        case 2 -> {
                            System.out.println("Agregando reservas...");
                            event2.agregarReserva(reserva3);
                            event2.agregarReserva(reserva4);
                            lugar2.agregarEvento(event2);
                            client2.agregarReserva(reserva3);
                            client2.agregarReserva(reserva4);
                            System.out.println("Reserva realizada con exito!\n");
                        }
                        default -> {
                            System.out.println("Opcion invalida");
                        }
                    }
                    
                }
                case 2 -> {
                    if(event1.getReservas().isEmpty() && event2.getReservas().isEmpty()){
                        System.out.println("\nLista de reservas vacias, intentelos mas tarde\n");
                    } else {
                        System.out.println("\nLos eventos reservados son los siguentes, seleccione cual desea eliminar de la lista: ");
                        System.out.println("1." + event1.getNombre());
                        System.out.println("2." + event2.getNombre());
                        int opc4 = leer.nextInt();
                        switch(opc4){
                            case 1 ->{
                                if (!event1.getReservas().isEmpty()){
                                    System.out.println("Lista del evento vacia intentelo con otro evento\n");
                                } else {
                                    System.out.println("Eliminando reservas del evento...");
                                    event1.eliminarReserva(reserva1);
                                    event1.eliminarReserva(reserva2);
                                    System.out.println("Eliminando lugar de la reserva...");
                                    lugar1.eliminarEvento(event1);
                                    System.out.println("Eliminando informacion del cliente...");
                                    client1.quitarReserva(reserva1);
                                    client1.quitarReserva(reserva2);
                                    System.out.println("Reserva eliminada con exito!\n");
                                }
                        }
                            case 2 ->{
                                if (event2.getReservas().isEmpty()){
                                    System.out.println("Lista del evento vacia intentelo con otro evento\n");
                                } else {
                                    System.out.println("Eliminando reservas del evento...");
                                    event2.eliminarReserva(reserva3);
                                    event2.eliminarReserva(reserva4);
                                    System.out.println("Eliminando lugar de la reserva...");
                                    lugar2.eliminarEvento(event2);
                                    System.out.println("Eliminando informacion del cliente...");
                                    client2.quitarReserva(reserva3);
                                    client2.quitarReserva(reserva4);
                                    System.out.println("Reserva eliminada con exito!\n");
                                }
                            }
                            default -> {
                                System.out.println("Opcion invalida");
                            }
                        }
                    }
                }
                case 3 -> {
                    if(event1.getReservas().isEmpty() && event2.getReservas().isEmpty()){
                        System.out.println("\nLista de reservas vacias, intentelos mas tarde\n");
                    } else {
                        System.out.println("\nLos eventos reservados son los siguentes, seleccione cual desea ver informacion: ");
                        System.out.println("1." + event1.getNombre());
                        System.out.println("2." + event2.getNombre());
                        int opc3 = leer.nextInt();
                        switch(opc3){
                            case 1 ->{
                                if(event1.getReservas().isEmpty()){
                                    System.out.println("Lista de evento vacia, intentelo con otro evento\n");
                                } else{
                                    System.out.println("Evento disponible: ");
                                    event1.mostrarInfoEvento();
                                    System.out.println("Informacion del lugar: ");
                                    lugar1.mostrarInfoLugar();
                                    System.out.println("Informacion del cliente: ");
                                    client1.mostrarInfoReserva(); 
                                }
                            }
                            case 2 ->{
                                if(event2.getReservas().isEmpty()){
                                    System.out.println("Lista de evento vacia, intentelo con otro evento\n");
                                } else{
                                    System.out.println("Evento disponible: ");
                                    event2.mostrarInfoEvento();
                                    System.out.println("Informacion del lugar: ");
                                    lugar2.mostrarInfoLugar();
                                    System.out.println("Informacion del cliente: ");
                                    client2.mostrarInfoReserva();
                                }
                            }
                            default ->{
                                System.out.println("Opcion invalida");
                            }
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo del menu...");
                    return;
                }
            }
        } while (true);
        
        //agregando a la lista de la clase evento
//        event1.agregarReserva(reserva1);
//        event1.agregarReserva(reserva2);
//        event2.agregarReserva(reserva3);
//        event2.agregarReserva(reserva4);
//        lugar1.agregarEvento(event1);
//        lugar2.agregarEvento(event2);
//        client1.agregarReserva(reserva1);
//        client1.agregarReserva(reserva2);
//        client2.agregarReserva(reserva3);
//        client2.agregarReserva(reserva4);
//        
//        System.out.println("Eventos registrados actualmente:");
//        event1.mostrarInfoEvento();
//        event2.mostrarInfoEvento();
//        System.out.println("Lugares disponibles de los eventos: ");
//        lugar1.mostrarInfoLugar();
//        lugar2.mostrarInfoLugar();
//        System.out.println("Informacion de clientes con eventos reservados: ");
//        client1.mostrarInfoReserva();
//        client2.mostrarInfoReserva();





    }
    
}
