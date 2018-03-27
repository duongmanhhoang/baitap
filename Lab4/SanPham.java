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
public class SanPham {

    public String tenSP;
    public double donGia, giamGia;

    SanPham() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;

    }

    public SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0.0;
    }

    public void xuat() {
        System.out.println("Tên Sản Phẩm: " + tenSP);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá" + giamGia);
        System.out.println("Thuế nhập khẩu" + getThueNhapKhau());
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên Sản Phẩm: ");
        tenSP = sc.nextLine();
        System.out.print("Đơn giá: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Giảm giá: ");
        giamGia = Double.parseDouble(sc.nextLine());
    }

}
