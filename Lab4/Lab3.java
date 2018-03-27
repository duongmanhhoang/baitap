/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author manhh
 */
public class Lab3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Sp1, Sp2;
        double donGia1, donGia2, giamGia1;
        System.out.println("Thông tin SP1");
        System.out.println("Nhập tên SP1: ");
        Sp1 = sc.nextLine();
        System.out.println("Nhập Giá Sp1:");
        donGia1 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập Giảm Giá Sp1:");
        giamGia1 = Double.parseDouble(sc.nextLine());
        System.out.println("***********************");
        System.out.println("Thông tin SP2");
        System.out.println("Nhập tên SP2: ");
        Sp2 = sc.nextLine();
        System.out.println("Nhập Giá Sp2:");
        donGia2 = Double.parseDouble(sc.nextLine());
        System.out.println("*************************");
        SanPham sp1 = new SanPham(Sp1, donGia1, giamGia1);
        SanPham sp2 = new SanPham(Sp2, donGia2);
        System.out.println("Thông tin Sản Phẩm 1:");
        sp1.xuat();
        System.out.println("**********************");
        System.out.println("Thông tin Sản Phẩm 2:");
        sp2.xuat();
        
        
    }
    
}
