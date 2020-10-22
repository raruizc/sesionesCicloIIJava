/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import java.util.Scanner;
/**
 *
 * @author Ricardo
 */
public class Sesion2 {
    
    public static boolean Validador(int a, int b, int c, int d){
        if (b > c && d > a && c + d > a + b && c > 0 && b > 0 && a%2 ==0)
        {
            return true;
        }
        else{
            return false;
        }        
    }
    
    public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        A = Integer.parseInt(sc.nextLine().trim());
        B = Integer.parseInt(sc.nextLine().trim());
        C = Integer.parseInt(sc.nextLine().trim());
        D = Integer.parseInt(sc.nextLine().trim());
        
        if(Validador(A,B,C,D) == true){
            System.out.println("Valores aceptados");            
        }
        else{
            System.out.println("Valores no aceptados");
        }
    }   
    
}
