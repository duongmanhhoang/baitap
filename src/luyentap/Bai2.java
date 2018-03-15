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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Phương trình ax^2 + bx + c=0");
        System.out.print("a: ");
        double a=sc.nextDouble();
        System.out.print("b: ");
        double b=sc.nextDouble();
        System.out.print("c: ");
        double c=sc.nextDouble(); 
        double delta=(b*b)-(4*a*c);
        if (a==0){
            
            if(b!=0){
                double x=-c/b;
                System.out.println("Nghiệm:" +x);
            }
            else if(b==0){
                if(c==0){
                    System.out.println("Vô số nghiệm");
                }
                else if(c!=0){
                    System.out.println("Vô nghiệm");
            }
            }
            }
        else if (a!=0){
            if (delta >0){
                double x=(-b+Math.sqrt(delta))/(2*a);
                double y=(-b-Math.sqrt(delta))/(2*a);
                System.out.println("Nghiệm 1: " +x );
                System.out.print("Nghiệm 2: "+y);
                
            }
            else if(delta ==0){
                double z=-b/(2*a);
                System.out.println("Nghiệm kép: " +z);
                
                
            }
            else if (delta<0){
            System.out.println("Vô nghiệm");
        }
          
        }
        
            
        
    }
    
}
