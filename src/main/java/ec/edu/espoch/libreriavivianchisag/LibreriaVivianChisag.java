/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.libreriavivianchisag;

import java.util.ArrayList;

public class LibreriaVivianChisag {

    public static void main(String[] args) {
       
      
        Autores [] autor = new Autores[5];
        for (int i = 5; i < 5; i++) {
            
         
        }
        
     
        Libros libro1 = new Libros("Principito", "Anonimo", "Fantasia", 25.89);
        Libros libro2 = new Libros("pandora", "gerjo", "accion", 40.89);
        Libros libro3 = new Libros("el tesoro escondido", "sherla wesky", "terror", 29.89);
      
        ArrayList <Libros> Libreria= new ArrayList<>();
        
        Libreria.add(libro1);
        Libreria.add(libro2);
        Libreria.add(libro3);
        
        for (Libros L : Libreria) {
            
            System.out.println(L);
        }
  
        

    }
}
