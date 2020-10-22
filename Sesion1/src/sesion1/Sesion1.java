/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion1;

import java.util.Scanner;
/**
 *
 * @author Ricardo
 */
public class Sesion1 {

    public static boolean Validador(int a, int b, int c, int d){
        if (b > c && d > a && c + d > a + b && c > 0 && b > 0 && a%2 ==0)
        {
            return true;
        }
        else{
            return false;
        }        
    }
    public static double min_maquina() {
        double Xo = 1.0;
        double Xi = Xo / 2;
        while (Xi > 0.0) {
            Xo = Xi;
            Xi = Xo / 2.0;
        }
        return Xo;
    
    }
    
    public static void main(String[] args) {        
        /*Primer ejercicio
        double m1, m2, r, fuerza;
        double G =  6.67384e-11;
        Scanner sc = new Scanner(System.in);        
        System.out.println("Hola Mundo");
        m1 = Double.parseDouble(sc.nextLine());
        m2 = Double.parseDouble(sc.nextLine());
        r = Double.parseDouble(sc.nextLine());
        fuerza = G *(m1*m2)/(r*r);
        System.out.println("La fuerza F es: " + fuerza);*/
        
        
        Scanner sc = new Scanner(System.in);
        int año, mes, dias; // Variables Ejercicio 1
        int A, B, C, D; // Variables Ejercicio 2
        double n, m; // Variables Ejercicio 3
        int menu = 1;
        while(menu !=0){
            
            System.out.println("Inserte el número de ejercicio que quiere ejecutar\n"+
                               "---> Oprima 0 para salir del programa");
            
            menu = Integer.parseInt(sc.nextLine());
            
        
            switch(menu){
                case 0:
                    break;
                case 1:
                    /*Segundo ejercicio: Dada la edad de una persona en días, 
                    calcule la edad de la persona en años, meses y días:
                    Input : 30
                    Output : 0 año(s) 1 mes(es) 0 día(s)*/ 
                    System.out.println("Inserte el número de días");
                    dias = Integer.parseInt(sc.nextLine().trim());        
                    año = dias/365; 
                    dias -= (365 * año);
                    mes = dias/30;
                    dias -= (30 * mes);

                    System.out.println( año + " año(s)\n" + mes + " mes(es)\n" + dias + " día(s)" );
                    break;
                case 2:
                    System.out.println("Inserte el número 1 para validar");
                    A = Integer.parseInt(sc.nextLine().trim());
                    System.out.println("Inserte el número 2 para validar");
                    B = Integer.parseInt(sc.nextLine().trim());
                    System.out.println("Inserte el número 3 para validar");
                    C = Integer.parseInt(sc.nextLine().trim());
                    System.out.println("Inserte el número 4 para validar");
                    D = Integer.parseInt(sc.nextLine().trim());

                    if(Validador(A,B,C,D) == true){
                        System.out.println("Valores aceptados");            
                    }
                    else{
                        System.out.println("Valores no aceptados");
                    }
                    break;
                case 3:
                    
                    dias =  1;
                    System.out.println("Inserte la población de n");
                    n = Double.parseDouble(sc.nextLine().trim());
                    System.out.println("Inserte la población de m");
                    m = Double.parseDouble(sc.nextLine().trim());
                    while(m >= 1 && m <n){
                        m += (m*0.03);
                        n += (n*0.02);            
                        dias++;
                    }
                    System.out.println("El número de días para alcanzar a la población n es: "+dias);
                    System.out.println("El número mínimo de mi maquina es: "+min_maquina());
                    break;
                default:
                    System.out.println("Aún no se encuentra este ejercicio");
                    break;
            }
        }
        
                
    }
    
}
