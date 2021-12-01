/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1y2;

/**
 *
 * @author Equipo
 */
public class Bicicleta {
    private String nroDeSerie;
    private String modelo;
    private int anio;
    private float precio;
    
    public Bicicleta(String nroDeSerie, String modelo,int anio){
        this.nroDeSerie=nroDeSerie;
        this.modelo=modelo;
        this.anio=anio; 
        this.precio=precio;
    } 
    //get
    public String getNroDeSerie(){
        return nroDeSerie;
    }

    public void setNroDeSerie(String nroDeSerie) {
        this.nroDeSerie = nroDeSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAnio() {
        return anio;
    }

    public void setAño(int anio) {
        this.anio = anio;
    }
    
    
    //Implementar los métodos getPrecio y setPrecio

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //Implementación getPrecio
    @Override
    public String toString() {
        return "Bicicleta Modelo: "+modelo + "\n año de Fabricación: " + anio + "\nPrecio: $" + this.getPrecio() + "\nNúmero de Serie: "+nroDeSerie;
    }
    
}
