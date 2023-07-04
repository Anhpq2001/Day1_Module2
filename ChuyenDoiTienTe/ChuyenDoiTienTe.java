package ChuyenDoiTienTe;
import  java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount USD need translate to VND:");
        double money = scanner.nextDouble();
        double result = money * 23000;
        System.out.println("Result:" + result + " VND");
    }
}
