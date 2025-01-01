package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void linearSearch(int[] arr, int key) {
        int arraySize = arr.length;
        for(int i=0;i<arraySize; i++) {
            if(arr[i] == key) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to search ");
        int key = sc.nextInt();

        linearSearch(arr, key);
    }
}
