/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert5;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class satu {
    static boolean ribuan(int bilangan){
        return bilangan >= 1000 && bilangan <= 9999;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         int[] bilangan = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan bilangan " + (i+1) + ": ");
            bilangan[i] = scanner.nextInt();
        }
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            if (ribuan(bilangan[i])) {
                System.out.println("Angka ke-" + (i+1) + ": " + bilangan[i] + " : ribuan");
            } else {
                System.out.println("Angka ke-" + (i+1) + ": " + bilangan[i] + " : bukan ribuan");
            }
        }
    }
}
