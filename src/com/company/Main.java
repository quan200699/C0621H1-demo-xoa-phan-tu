package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println("Duyệt mảng theo chỉ số:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Duyệt mảng theo phần tử:");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
