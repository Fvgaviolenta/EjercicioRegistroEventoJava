/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericiogestoreventos;

import java.util.ArrayList;

/**
 *
 * @author alfon
 */
public class Cliente {
    //atributos
    
    private String idCliente, nombre;
    private ArrayList<Reserva> reservaRealizada;
    
    // constructores
    
    public Cliente() {
        //this.reservaRealizada = new ArrayList<Reserva>(); -> misma explicacion que en clase evento
    }

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reservaRealizada = new ArrayList<>();
    }
    
    //getters and setters

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Reserva> getReservaRealizada(){
        return reservaRealizada;
    }

    public void setReservaRealizada(ArrayList<Reserva> reservaRealizada) {
        this.reservaRealizada = reservaRealizada;
    }
    
    //customers
    
    public void agregarReserva (Reserva resev){
        reservaRealizada.add(resev);
    }
    
    public void quitarReserva (Reserva resev){
        reservaRealizada.remove(resev);
    }
    
    public void mostrarInfoReserva(){
        System.out.println("ID Cliente: " + this.idCliente);
        System.out.println("Nombre Cliente: " + this.nombre);
        boolean nombreEventoMostrado = false;
        for(Reserva reserv: reservaRealizada){
            if(!nombreEventoMostrado){
                System.out.println("Nombre evento: " + reserv.getEvento().getNombre());
                nombreEventoMostrado = true;
            }
            System.out.println("Asiento Reservado: " + reserv.getAsientoReservado());
        }
        System.out.println("");
        }
    }
    

