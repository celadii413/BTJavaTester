package CapDo3;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mảng có bao nhiêu số? ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.println("Nhập các số (phải nhập theo thứ tự tăng dần):");
        for (int i = 0; i < n; i++) {
            System.out.print("Số thứ " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.print("Nhập số mục tiêu (target): ");
        int target = input.nextInt();

        int trai = 0;
        int phai = numbers.length - 1;

        boolean timThay = false;

        while (trai < phai) {
            int tongHienTai = numbers[trai] + numbers[phai];

            if (tongHienTai == target) {
                System.out.println("Kết quả: [" + (trai + 1) + ", " + (phai + 1) + "]");
                timThay = true;
                break;
            }
            else if (tongHienTai < target) {
                trai = trai + 1;
            }
            else {
                phai = phai - 1;
            }
        }

        if (timThay == false) {
            System.out.println("Không tìm thấy cặp số nào có tổng bằng " + target);
        }

        input.close();
    }
}
