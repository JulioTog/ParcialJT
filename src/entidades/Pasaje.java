/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Julio
 */
public class Pasaje {
     private String origen;
     private String destino;
     private int precio;
     private boolean confirmado;
    
    public Pasaje (String origen, String destino, int precio){
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }
}
    