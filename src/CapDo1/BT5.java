package CapDo1;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mời bạn nhập vào một chuỗi: ");
        String chuoi = input.nextLine();

        String ketQua = "";

        boolean dangNgoaiTu = true;

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);

            if (kyTu != ' ') {
                if (dangNgoaiTu == true) {
                    char chuHoa = Character.toUpperCase(kyTu);

                    if (ketQua.length() > 0) {
                        ketQua = ketQua + " ";
                    }
                    ketQua = ketQua + chuHoa;

                    dangNgoaiTu = false;
                }
            } else {
                dangNgoaiTu = true;
            }
        }

        System.out.println("Chữ cái đầu của mỗi từ là: " + ketQua);
        input.close();
    }
}
