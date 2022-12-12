
package lab1_danielcarrasco;

/**
 *
 * @author Daniel
 */

import java.util.Scanner;
public class Lab1_DanielCarrasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("--Bienvenido al sitema de calculo de promedio--");
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        //Se ingresan notas de las cuatro clases
        System.out.println("Ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.println("Ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.println("Ingrese la nota final de la tercera clase: ");
        double terceraClase = entrada.nextDouble();
        
        System.out.println("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        //se hace calculo del promedio
        double sumaClase = primeraClase+segundaClase+terceraClase+cuartaClase;
        double promedio = sumaClase / 4;
        
        //Se imprime claculo del promedio
        System.out.println("----" + nombre + "El promedio de las cuatro clases es: "+ promedio);
        
    }
    
}
