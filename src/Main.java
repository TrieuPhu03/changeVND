import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("DOI TIEN USD => VND ");
        final double money = 23.500;

        System.out.print("Vui long nhap so tien can doi: ");
        double money2 = sc.nextDouble();

        double changeVND = money2 * money;
        System.out.println("So VND sau khi doi la: " + changeVND);
    }
}