import java.util.Arrays;

public class RotateArrayByKElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotateArrayByKElements(arr, -2);
        System.out.println(Arrays.toString(arr));
        
    }


    //Positive k for Left rotation, negative for right
    public static void rotateArrayByKElements(int[] arr, int k){
        int[] temp = new int[arr.length];
        int newIndex;
        for(int i = 0; i<arr.length; i++){
            newIndex=(i+arr.length-k)%arr.length;
            temp[newIndex]= arr[i];
        }
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
        
    }
}
