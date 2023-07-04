package Operator;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input width:");
        double width = scanner.nextDouble();
        System.out.println("Input Height:");
        double height = scanner.nextDouble();

        System.out.println("Area is: " + (width * height));
    }
}
