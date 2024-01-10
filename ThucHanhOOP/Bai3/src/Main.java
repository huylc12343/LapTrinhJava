import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Tivi> danhSachTivi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        char choice;
        do {
            Tivi tivi = new Tivi();
            tivi.Nhap();
            danhSachTivi.add(tivi);

            System.out.print("Nhap tiep? (n de ket thuc): ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Đọc dòng trống
        } while (choice != 'n');

        System.out.println("Danh sach cac Tivi da nhap:");
        for (Tivi tivi : danhSachTivi) {
            tivi.HienThi();
            System.out.println("------------------------------");
        }
    }
}
