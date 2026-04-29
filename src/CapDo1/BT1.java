package CapDo1;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mời bạn nhập vào một chuỗi: ");
        String chuoiGoc = input.nextLine();

        String ketQua = "";

        for (int i = 0; i < chuoiGoc.length(); i++) {
            char kyTu = chuoiGoc.charAt(i);

            if (kyTu == 'a' || kyTu == 'e' || kyTu == 'i' || kyTu == 'o' || kyTu == 'u' ||
                    kyTu == 'A' || kyTu == 'E' || kyTu == 'I' || kyTu == 'O' || kyTu == 'U') {
            } else {
                ketQua = ketQua + kyTu;
            }
        }

        System.out.println("Chuỗi sau khi xóa nguyên âm là: " + ketQua);

        input.close();
    }
}
