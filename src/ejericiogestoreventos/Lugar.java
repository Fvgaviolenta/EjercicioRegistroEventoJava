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
public class Lugar {
    //atributos
    
    private String idLugar, nombre;
    private ArrayList<Evento> eventosDispo;
   
    
    //constructores

    public Lugar() {
    }

    public Lugar(String idLugar, String nombre) {
        this.idLugar = idLugar;
        this.nombre = nombre;
        this.eventosDispo = new ArrayList<>();
    }
    
    //getters and setters 

    public String getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(String idLugar) {
        this.idLugar = idLugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Evento> getEventosDispo() {
        return eventosDispo;
    }

    public void setEventosDispo(ArrayList<Evento> eventosDispo) {
        this.eventosDispo = eventosDispo;
    }
    
    //customers
    
    public void agregarEvento (Evento event){
        eventosDispo.add(event);
    }
    
    public void eliminarEvento(Evento event){
        eventosDispo.remove(event);
    }
    
    public void mostrarInfoLugar(){
        System.out.println("ID Lugar: " + this.idLugar);
        System.out.println("Nombre Lugar: " + this.nombre);
        for(Evento event: eventosDispo){
            System.out.println("Evento: " + event.getNombre());
        }
        System.out.println("");
    }
}
