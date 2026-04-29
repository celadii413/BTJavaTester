package CapDo3;
import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi s: ");
        String s = input.nextLine();
        System.out.print("Nhập chuỗi t: ");
        String t = input.nextLine();

        if (t.length() > s.length()) {
            System.out.println("Kết quả: Không tìm thấy");
            return;
        }

        int[] thongKeT = new int[256];
        for (int i = 0; i < t.length(); i++) {
            thongKeT[t.charAt(i)]++;
        }

        int trai = 0;
        int phai = 0;
        int demKhop = 0;
        int doDaiNhoNhat = Integer.MAX_VALUE;
        int viTriBatDau = 0;

        int[] thongKeCuaSo = new int[256];

        while (phai < s.length()) {
            char kyTuPhai = s.charAt(phai);
            thongKeCuaSo[kyTuPhai]++;

            if (thongKeT[kyTuPhai] > 0 && thongKeCuaSo[kyTuPhai] <= thongKeT[kyTuPhai]) {
                demKhop++;
            }

            while (demKhop == t.length()) {
                if (phai - trai + 1 < doDaiNhoNhat) {
                    doDaiNhoNhat = phai - trai + 1;
                    viTriBatDau = trai;
                }

                char kyTuTrai = s.charAt(trai);
                thongKeCuaSo[kyTuTrai]--;

                if (thongKeT[kyTuTrai] > 0 && thongKeCuaSo[kyTuTrai] < thongKeT[kyTuTrai]) {
                    demKhop--;
                }
                trai++;
            }
            phai++;
        }

        if (doDaiNhoNhat == Integer.MAX_VALUE) {
            System.out.println("Kết quả: Không tìm thấy");
        } else {
            String ketQua = "";
            for (int i = viTriBatDau; i < viTriBatDau + doDaiNhoNhat; i++) {
                ketQua = ketQua + s.charAt(i);
            }
            System.out.println("Chuỗi con nhỏ nhất là: \"" + ketQua + "\"");
        }

        input.close();
    }
}
