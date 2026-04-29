package CapDo2;
import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mời bạn nhập vào một chuỗi: ");
        String chuoi = input.nextLine();

        boolean laDoiXung = true;

        int doDai = chuoi.length();

        for (int i = 0; i < doDai / 2; i++) {
            char kyTuDau = chuoi.charAt(i);

            char kyTuCuoi = chuoi.charAt(doDai - 1 - i);

            if (kyTuDau != kyTuCuoi) {
                laDoiXung = false;
                break;
            }
        }

        System.out.println("Kết quả đối xứng: " + laDoiXung);
        input.close();
    }
}
