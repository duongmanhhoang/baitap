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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Giải phương trình bậc nhất");
        System.out.println("2.Giải phương trình bậc hai");
        System.out.println("3. Tính tiền điện");
        System.out.println("4.Kết thúc");
       
        System.out.print("Chọn chức năng (chọn số): ");
        int a=sc.nextInt();
        menu(a);
        
    }
    public static void menu(int a){
        switch(a){
            case 1:
                giaiPT1();
                break;
            case 2:
                giaiPT2();
                break;
            case 3:
                tinhtiendien();
                break;
            default:
                System.out.println("tạm biệt");
        }
}
    public static void giaiPT1(){
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
    public static void giaiPT2(){
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
    
    public static void tinhtiendien(){
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

