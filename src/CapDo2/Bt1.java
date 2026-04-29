package CapDo2;
import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mời bạn nhập tổng thu nhập hàng năm (triệu đồng): ");
        double thuNhap = input.nextDouble();

        double thuePhaiTra = 0;

        if (thuNhap >= 0 && thuNhap <= 5) {
            thuePhaiTra = thuNhap * 0.05;
        }
        else if (thuNhap > 5 && thuNhap <= 10) {
            thuePhaiTra = thuNhap * 0.10;
        }
        else if (thuNhap > 10 && thuNhap <= 18) {
            thuePhaiTra = thuNhap * 0.15;
        }
        else if (thuNhap > 18 && thuNhap <= 32) {
            thuePhaiTra = thuNhap * 0.20;
        }
        else if (thuNhap > 32 && thuNhap <= 52) {
            thuePhaiTra = thuNhap * 0.25;
        }
        else if (thuNhap > 52 && thuNhap <= 80) {
            thuePhaiTra = thuNhap * 0.30;
        }
        else if (thuNhap > 80) {
            thuePhaiTra = thuNhap * 0.35;
        }
        else {
            System.out.println("Thu nhập không hợp lệ!");
        }

        if (thuNhap >= 0) {
            System.out.println("Với thu nhập " + thuNhap + " triệu đồng.");
            System.out.println("Số tiền thuế bạn phải trả là: " + thuePhaiTra + " triệu đồng.");
        }

        input.close();
    }
}
