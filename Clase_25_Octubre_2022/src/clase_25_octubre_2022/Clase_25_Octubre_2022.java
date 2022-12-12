/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_25_octubre_2022;

import java.util.Scanner;

public class Clase_25_Octubre_2022 {

    public static void main(String[] args) {
        Scanner ninetales = new Scanner(System.in);
        
        String nombre=ninetales.nextLine();
        String nombre2="Daniel Carrasco";
        
        if(nombre2.equalsIgnoreCase(nombre)){
            //Equals todo tiene que estar igual y ingore case con que sea lo mismo pero diferente
            System.out.println("Son iguales");
        }
        
        int largo=nombre2.length();
        System.out.println(nombre2+"Tiene "+largo+" caracteres");
        
        String mayuscula=nombre2.toUpperCase();
        String minuscula=nombre2.toLowerCase();
        
        System.out.println("En mayuscula "+mayuscula+" en minuscula "+minuscula);
        
        char letra=nombre2.charAt(0);
        //Ultima posición siempre es 
        int ultima=nombre2.length()-2;
        System.out.println("La ultima es "+ultima);
        
        System.out.println("En esa posicion esta la letra: "+letra);
        
        int indice=nombre2.indexOf('a');
        System.out.println("Posicion de a "+indice);
        
        String nuevaPalabra=nombre2.replace('a', '@');
        System.out.println("Nueva palabra: "+nuevaPalabra);
        
               //Scanner s = new Scanner (System.in);
       /*
       String palabra;
                char [] palindromo;
                int fin, inicio;
                System.out.println("Ingresa la palabra");
                palabra = s.nextLine();
                palabra = palabra.toLowerCase();
                palabra = palabra.replace(" ","");
                palindromo = palabra.toCharArray();
                fin = 0;
                inicio = palindromo.length - 1 ;

                    while(fin < inicio){
                        if(palindromo[fin] == palindromo[inicio]){
                            inicio --;
                            fin++;
                        }else{
                            System.out.println("La palabra no es un palindromo");
                            break;
                        }
                    }

                    if (fin == inicio){
                        System.out.println("La palabra es un palindromo");
                    }
                
          */      
        
    }
    
}
