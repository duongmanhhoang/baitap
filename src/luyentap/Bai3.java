/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap;
import java.util.Scanner;
/**
 *
 * @author manhh
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số điện: ");
        double sodien=sc.nextDouble();
        if((sodien>=0) &&(sodien<50)) {
            double tiendien=sodien*1000;
            System.out.println("Tiền điện: "+tiendien);
        
        }
        else{
            double tiendien=50*1000 + (sodien-50)*1200;
            System.out.println("Tiền điện:" + tiendien);
        }
        
    }
    
}
