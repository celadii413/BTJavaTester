package CapDo2;
import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mời bạn nhập vào một chuỗi: ");
        String chuoiGoc = input.nextLine();

        String ketQua = "";

        for (int i = 0; i < chuoiGoc.length(); i++) {
            char kyTuHienTai = chuoiGoc.charAt(i);

            boolean daTonTai = false;

            for (int j = 0; j < ketQua.length(); j++) {
                if (kyTuHienTai == ketQua.charAt(j)) {
                    daTonTai = true;
                    break;
                }
            }

            if (daTonTai == false) {
                ketQua = ketQua + kyTuHienTai;
            }
        }

        System.out.println("Chuỗi sau khi xóa ký tự lặp lại: " + ketQua);
        input.close();
    }
}
