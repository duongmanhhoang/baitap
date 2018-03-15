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
public class Bai1 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Phương trình ax+b=0");
            System.out.println("a: ");
            int a=sc.nextInt();
            System.out.println("b: ");
            int b=sc.nextInt();
            double ketqua=-b/a;
            if(a!=0){

                System.out.print("x: " +ketqua);
            } 
            else if(a==0){
                if(b==0){
                    System.out.println("Vô số nghiệm");

                }
                else if(b!=0){
                    System.out.println("Vô nghiệm");
                }
            }

    }
}
        
 
               
           
         
                    
        
    
  
 
        
    
