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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        /*Segundo ejercicio: Dada la edad de una persona en días, 
        calcule la edad de la persona en años, meses y días:
        Input : 30
        Output : 0 año(s) 1 mes(es) 0 día(s)*/
        int año, mes, dias;
        Scanner sc = new Scanner(System.in);
        dias = Integer.parseInt(sc.nextLine().trim());        
        año = dias/365; 
        dias -= (365 * año);
        mes = dias/30;
        dias -= (30 * mes);
                
        System.out.println( año + " año(s)\n" + mes + " mes(es)\n" + dias + " día(s)" );        
    }
    
}
