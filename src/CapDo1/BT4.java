package CapDo1;
import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mời bạn nhập vào một chuỗi: ");
        String chuoi = input.nextLine();

        int soTu = 0;
        boolean dangTrongTu = false;

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);

            if (kyTu != ' ') {
                if (dangTrongTu == false) {
                    soTu = soTu + 1;
                    dangTrongTu = true;
                }
            } else {
                dangTrongTu = false;
            }
        }

        System.out.println("Số từ trong chuỗi trên là: " + soTu);
        input.close();
    }
}
