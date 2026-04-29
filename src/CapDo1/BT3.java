package CapDo1;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mời bạn nhập vào số nguyên dương n: ");
        int n = input.nextInt();

        int tong = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                tong = tong + i;
            }
        }

        System.out.println("Tổng các số chẵn từ 0 đến " + n + " là: " + tong);
        input.close();
    }
}
