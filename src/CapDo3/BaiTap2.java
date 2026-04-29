package CapDo3;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mời bạn nhập vào một chuỗi: ");
        String chuoiGoc = input.nextLine();

        String ketQua = "";
        int doDaiLonNhat = 0;

        for (int i = 0; i < chuoiGoc.length(); i++) {
            for (int j = i; j < chuoiGoc.length(); j++) {
                String chuoiCon = "";
                for (int k = i; k <= j; k++) {
                    chuoiCon = chuoiCon + chuoiGoc.charAt(k);
                }

                boolean laDoiXung = true;
                int n = chuoiCon.length();
                for (int m = 0; m < n / 2; m++) {
                    if (chuoiCon.charAt(m) != chuoiCon.charAt(n - 1 - m)) {
                        laDoiXung = false;
                        break;
                    }
                }

                if (laDoiXung == true && chuoiCon.length() > doDaiLonNhat) {
                    doDaiLonNhat = chuoiCon.length();
                    ketQua = chuoiCon;
                }
            }
        }

        System.out.println("Chuỗi con đối xứng dài nhất là: " + ketQua);
        input.close();
    }
}
