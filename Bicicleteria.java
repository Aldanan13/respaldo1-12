/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1y2;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Equipo
 */
public class Bicicleteria  {
    //a. Declarar variable bicicleta, ganancias,cantidadDeVentas;
    private ArrayList<Bicicleta> bicicletas;
    private float ganancias;
    private int cantidadDeVentas;
    int x;
    public Bicicleteria(){
        bicicletas= new ArrayList<Bicicleta>();
        cantidadDeVentas=0;
        ganancias=0;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }
    
    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }
    
    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }
    
    public void venderBicicleta(Bicicleta bicicleta){
        bicicletas.remove(bicicleta);
        cantidadDeVentas++;
        ganancias=ganancias+bicicleta.getPrecio();
    }
    
    //b.Implementar el método addBicicleta
    
    public void addBicibleta(Bicicleta bicicleta){
        this.bicicletas.add(bicicleta);
      
    }
    

   //punto 2. Implementar método buscarBicicleta
   Scanner sc = new Scanner(System.in); 
    public String buscarBicicleta(String nroDeSerie) {
       
       System.out.println("INGRESE EL NÚMERO DE SERIE A BUSCAR:");
       String buscar=sc.nextLine();
       for(int i=0;i<bicicletas.size();i++){          
          if(bicicletas.get(i).getNroDeSerie().equalsIgnoreCase(buscar)){
               System.out.println("LA BICICLETA ENCONTRADA ES UNA: "+bicicletas.get(i).getModelo());
               System.out.println("CON NÚMERO DE SERIE: "+bicicletas.get(i).getNroDeSerie());
                 x++;
            }
        
              if(x==1){
               break;  
                      }
        }
       
              if(x==0){
                System.out.println("NULL");
                       } 
         return buscar;
    }
     
}  
   

