/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mportales.a03.problema.pkg1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPP2MPortalesA03Problema1 {
     
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Obtencion de la hipotenusa dados dos catetos");
        //declarar variables
         double co, ca, hip;
 //entrada del teclado
     Scanner teclado= new Scanner (System.in);
 //solicitar datos
         System.out.println("Introduce el cateto opuesto");
         co =teclado.nextDouble();
         System.out.println("Introduce el cateto adyacente");
         ca =teclado.nextDouble();
         //operacion con metodo Math.pow para potencia
         hip= Math.pow(co,2)*Math.pow(ca,2);
         //resultado
         System.out.println("La hipotenusa es " +hip);
    }
    
}
