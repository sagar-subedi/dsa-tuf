import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){

        int[] arr = {6,9,10,3,2,4,400,5,1};

        selectionSort(arr);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr ){
            list.add(i);
        }
        System.out.println(Arrays.toString(arr));
    }



    public static void selectionSort(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){

                //if arr[j] < arr[i] -> swap ith and jth element
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
