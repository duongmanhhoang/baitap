/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author manhh
 */
public class Bai2 {

    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        System.out.println("Nhập thông tin sản phẩm 1: ");
        sp1.nhap();
        System.out.println("-----------------------------");

        System.out.println("Nhập thông tin sản phẩm 2: ");
        sp2.nhap();
        System.out.println("-----------------------------");
        System.out.println("Thông tin sản phẩm 1: ");
        sp1.xuat();
        System.out.println("-----------------------------");
        System.out.println("Thông tin sản phẩm 2: ");
        sp2.xuat();

    }

}
