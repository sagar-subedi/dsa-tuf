import java.util.Arrays;

public class _05_LastOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,4,5,6};

        System.out.println(Arrays.toString( new int[] {findFirstOccurance(arr,3),findLastOccurance(arr, 3)}));
    }

    public static int findLastOccurance(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int latestIndex = -1;

        while(low <=high) {
            int mid = low + (high - low)/2;
            if(arr[mid]==target){
                latestIndex = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return latestIndex;
    }


    public static int findFirstOccurance(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int latestIndex = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                latestIndex = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return latestIndex;
    }
    
}
