package ru.zak.orders;

public class orders {
    public static void main(String[] args) {
        int t = 4;
        int n = 0;
        int[] arr = {8, 2, 9, 17, 4, 4, 10};
        sort(arr);

        if (t <= arr.length) {
            for (int i = 0; i < t; i++) {
                n += arr[i];
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                n += arr[i];
            }
        }
        System.out.println(n);
    }


    public static void sort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (i != index) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }

}