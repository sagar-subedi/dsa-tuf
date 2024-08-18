public class _07_BinarySearchOnRotatedArray {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};

        System.out.println(binarySearchOnRotatedArray(arr, 2));
        
    }
    
    public static int binarySearchOnRotatedArray(int[] arr, int target){

        int l = 0;
        int h = arr.length - 1;

        while(l <= h){

            int mid = l + (h-l)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid] >= arr[l]){
                //left half is sored
                if(target >= arr[l] && target <= arr[mid]){
                    //left/sorted half has our target, if present
                    h = mid -1;
                }
                else{
                    l = mid + 1;
                }
            }

            else{
                //right half is sorted
                if(target >= arr[mid] && target <= arr[h]){
                    //right/sorted half has our target, if present
                    l = mid + 1;
                }
                else{
                    h = mid -1;
                }
            }

        }

        return -1;
    }
}
