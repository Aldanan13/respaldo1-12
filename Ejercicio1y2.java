/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1y2;

import java.util.ArrayList;


/**
 *
 * @author 
 */
public class Ejercicio1y2 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Bicicleta Bici1 = new Bicicleta("FXDHHJ","VENZO",2020);
     Bicicleta Bici2 = new Bicicleta("ADHKJK","TOP MEGA",2021);
     Bicicleta Bici3 = new Bicicleta("HFKKKL","Vayro",2021);
     
     Bicicleteria Ludmila = new Bicicleteria();
     
     Ludmila.setCantidadDeVentas(10);
     Ludmila.setGanancias(50000);
     
    //Llamado al método addBicicleta
    Ludmila.addBicibleta(Bici1);
    Ludmila.addBicibleta(Bici2);
    Ludmila.addBicibleta(Bici3);
    
    //Implementacion getPrecio y setPrecio 
    
    Bici1.setPrecio(76000);
    Bici2.setPrecio(56000);
    Bici3.setPrecio(88000);
       
    //Ejercicio 2 Buscar bicicleta por número de serie
     
     System.out.println(Bici1);
     System.out.println(Bici2);
     System.out.println(Bici3);
     
     Ludmila.buscarBicicleta("");
     
    
        
     
    

    }
    
}
