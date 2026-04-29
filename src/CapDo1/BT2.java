package CapDo1;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mảng của bạn có bao nhiêu số? ");
        int n = input.nextInt();

        int[] mang = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            mang[i] = input.nextInt();
        }

        if (n < 2) {
            System.out.println("Kết quả: " + Integer.MIN_VALUE);
        } else {
            int lonNhat = Integer.MIN_VALUE;
            int lonThuHai = Integer.MIN_VALUE;

            for (int i = 0; i < mang.length; i++) {
                int soHienTai = mang[i];
                if (soHienTai > lonNhat) {
                    lonThuHai = lonNhat;
                    lonNhat = soHienTai;
                } else if (soHienTai > lonThuHai && soHienTai != lonNhat) {
                    lonThuHai = soHienTai;
                }
            }

            if (lonThuHai == Integer.MIN_VALUE) {
                System.out.println("Không có số lớn thứ hai (các số giống nhau).");
            } else {
                System.out.println("Số lớn thứ hai trong mảng là: " + lonThuHai);
            }
        }

        input.close();
    }
}
