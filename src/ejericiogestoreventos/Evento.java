/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericiogestoreventos;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author alfon
 */
public class Evento {
    
    //atributos
    private String idEvento, nombre;
    private LocalDate fechaEvento;
    private ArrayList<Reserva> reservas;
    
    
    public Evento(){
        //this.reservas = new ArrayList<Reserva>(); -> dice que es redundante y me funciona solo inicializandolo en el constructo c/parametros
    }
    
    //constructores

    public Evento(String idEvento, String nombre, LocalDate fechaEvento) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.fechaEvento = fechaEvento;
        this.reservas = new ArrayList<>();
    }
    
    //getters and setters

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    //customers
    
    public void agregarReserva(Reserva resev){
        reservas.add(resev);
    }
    
    public void eliminarReserva(Reserva resev){
        reservas.remove(resev);
    }
    
    public void mostrarInfoEvento(){
        System.out.println("ID Evento: " + this.idEvento);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha: " + this.fechaEvento);
        System.out.println("Lista de asientos reservados: ");
        for(Reserva reserv : reservas){
            System.out.println("Asiento: " + reserv.getAsientoReservado());
        
        }
        System.out.println("");
        
    }
}
