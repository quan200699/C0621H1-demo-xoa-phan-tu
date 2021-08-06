package com.company;

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị không phải kiểu String:");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập chuỗi:");
        String y = scanner.nextLine();
    }
}
