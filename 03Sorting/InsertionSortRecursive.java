import java.util.Arrays;

public class InsertionSortRecursive {
    public static void main(String[] args){
    int[] arr = {5,4,3,2,0,1};
    insertionSortRecursive(arr, 0, arr.length);
    System.out.println(Arrays.toString(arr));

}

    public static void insertionSortRecursive(int[] arr, int i, int n){
        if(i==n) return;
        int j = i;
        while(j>0 && arr[j] < arr[j-1]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionSortRecursive(arr, i+1, n);

    }
}
