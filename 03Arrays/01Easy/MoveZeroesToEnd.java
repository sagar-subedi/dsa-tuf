import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4};
        moveZeroesToEndOptimized(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    private static void moveZeroesToEndOptimized(int[] arr) {
        int j = -1; //for pointing to first zero

        for(int i = 0; i < arr.length;i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        if(j==-1) return;
        for(int i = j+1; i < arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void moveZeroesToEndUsingExtraArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int[] temp = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==0){
                temp[right] = arr[i];
                right--;
            }
            else{
                temp[left] = arr[i];
                left++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
    }
}
