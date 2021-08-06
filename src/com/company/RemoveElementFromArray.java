package com.company;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6};
        System.out.println("Mảng trước khi xóa:");
        showArray(arr);
        System.out.println("Nhập vị trí muốn xóa:");
        int deletedIndex = scanner.nextInt();
        int[] newArray = removeElementFromArray(arr, deletedIndex);
        System.out.println("Mảng sau khi xóa:");
        showArray(newArray);
    }

    public static void showArray(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static int[] removeElementFromArray(int[] arr, int deletedIndex) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < deletedIndex) {
                newArray[i] = arr[i];
            } else {
                newArray[i] = arr[i + 1];
            }
        }
        return newArray;
    }
}
