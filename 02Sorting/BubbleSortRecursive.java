import java.util.Arrays;

public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,2,9,6};
        bubbleSortRecursive(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
        
    }

    public static void bubbleSortRecursive(int[] arr, int n){
        if(n==1) return;
        for(int i=0; i<n; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] =  arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubbleSortRecursive(arr, n - 1);
    }
}
