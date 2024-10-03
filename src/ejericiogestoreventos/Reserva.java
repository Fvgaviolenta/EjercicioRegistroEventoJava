/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericiogestoreventos;

/**
 *
 * @author alfon
 */
public class Reserva {
    
    //atributos
    private Evento evento;
    private String asientoReservado;
    
    //constructores 

    public Reserva() {
    }

    public Reserva(Evento evento, String asientoReservado) {
        this.evento = evento;
        this.asientoReservado = asientoReservado;
    }
    
    //getters and setters 

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getAsientoReservado() {
        return asientoReservado;
    }

    public void setAsientoReservado(String asientoReservado) {
        this.asientoReservado = asientoReservado;
    }
    
}
