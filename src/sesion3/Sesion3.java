/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Sesion3 {
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);
        double n, m;
        int dias =  1;
        n = Double.parseDouble(sc.nextLine().trim());
        m = Double.parseDouble(sc.nextLine().trim());
        while(m >= 1 && m <n){
            m += (m*0.03);
            n += (n*0.02);            
            dias++;
        }
        System.out.println(dias);
        System.out.println(min_maquina());        
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
}
