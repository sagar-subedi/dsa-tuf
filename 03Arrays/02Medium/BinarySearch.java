public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr,4));
        
    }

    public static int binarySearch(int[] arr, int num){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;

        while(left < right){
            mid = left + (right-left)/2;
            if(arr[mid]==num){
                return mid;
            }
            else if(arr[mid] < num){
                left = mid;
            }
            else if(arr[mid]>num){
                right = mid;
            }
        }
        return -1;
    }
}