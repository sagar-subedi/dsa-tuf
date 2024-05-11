import utils.*;
import java.util.Arrays;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        // int[] arr = ArrayUtils.getArrayFromInput();

        int[] arr = {12,35,1,10,34,1};
        
        // int res = getSecondLargestByBruteForce(arr);
        // res = getSecondLargesSubOptimal(arr);
        int res = getSecondLargestOptimal(arr);
        GeneralUtils.print(res);
        
    }

    //bruteforce, sort and return second element if exists
    public static int getSecondLargestByBruteForce(int[] arr){
        Arrays.sort(arr);
        return arr.length>=2?arr[1]:-1;
    }

    //find the largest element at first traversal, and find the element
    //just greater in the second traversal
    public static int getSecondLargesSubOptimal(int[] arr){
        if(arr.length<2) return -1;
        int largest = arr[0];
        int smallest = arr[0];

        for(int e: arr){
            if(e > largest) largest = e;
            else if(e < smallest) smallest = e;
        }

        int secondLargest = smallest;

        for(int e: arr){
            if(e > secondLargest && e != largest) secondLargest = e;
        }
        if(secondLargest == largest) return -1;
        return secondLargest;
    }

    public static int getSecondLargestOptimal(int[] arr){
        if(arr.length<2) return -1;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int e: arr){
            if(e>largest){
                secondLargest = largest;
                largest = e;
            }
            else if(e>secondLargest && e!=largest){
                secondLargest = e;
            }
        }

        return secondLargest;

    }
    
}