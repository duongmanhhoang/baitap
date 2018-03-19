/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author manhh
 */
public class Bai3 {

    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d]: ", i);
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        
//Tính phần tử nhỏ nhất và lớn nhất
        int nhonhat, lonnhat;
        nhonhat = arr[0];
        lonnhat = arr[0];
        for (int i = 0; i < n; i++) {
            if (nhonhat > arr[i]) {
                nhonhat = arr[i];
            }
            if (lonnhat < arr[i]) {
                lonnhat = arr[i];
            }
        }
        System.out.println("Nhỏ nhất: " + nhonhat);
        System.out.println("Lớn nhất: " + lonnhat);

       
        //tìm các số chia hết cho 3
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print("Phần tử chia hết cho 3: " + arr[i] + "\n");
           
          
        }
        
 
    }
}
}
