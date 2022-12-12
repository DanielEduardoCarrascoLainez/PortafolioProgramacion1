/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioenclase_24_octubre_danielcarrasco;
import java.util.Scanner;
public class EjercicioEnClase_24_octubre_DanielCarrasco {


    public static void main(String[] args) {
        Scanner ninetales = new Scanner(System.in);
        Scanner vulpix = new Scanner(System.in);
        
        
        System.out.println("Bienvenidx, ingrese el numero de mes que quiere");
        System.out.println("---------Meses---------");
        System.out.println("1-.Enero");
        System.out.println("2-.Febrero");
        System.out.println("3-.Marzo");
        System.out.println("4-.Abril");
        System.out.println("5-.Mayo");
        System.out.println("6-.Junio");
        System.out.println("7-.Julio");
        System.out.println("8-.Agosto");
        System.out.println("9-.Septiembre");
        System.out.println("10-.Octubre");
        System.out.println("11-.Noviembre");
        System.out.println("12-.Diciembre");
        
        System.out.println("Ingrese un mes");
        int mes= ninetales.nextInt();
        System.out.println("Ingrese un year");
        int year= vulpix.nextInt();
        int nDias= 10;
        
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nDias=31;
                break;
            case 2:
                if (((year % 4==0)&&(year% 100==0))||(year % 400==0)){
                    nDias=29;
                }else{
                    nDias=28;
                }
                break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                nDias=30;
                break;
        }
        System.out.println("Numero de dias= "+ nDias);
    }
    
}
