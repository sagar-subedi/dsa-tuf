import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,6,2};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivotElement = arr[low]; //can take first, or last or a random element
        int i = low;
        int j = high;

        while(i < j){
            while(arr[i] <= pivotElement && i < high){
                i++;
            }

            while(arr[j] > pivotElement && j > low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
        return j;
    }
}
