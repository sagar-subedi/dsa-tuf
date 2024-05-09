package utils;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getArrayFromInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String[] arr = input.split(" ");
        int[] arrInt = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        return arrInt;


    }
}
