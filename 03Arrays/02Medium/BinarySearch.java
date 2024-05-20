public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearchRecursive(arr,0, arr.length-1,4));
        
    }

    public static int binarySearchIterative(int[] arr, int num){
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

    public static int binarySearchRecursive(int[] arr, int left, int right, int num){
        int mid = left+(right-left)/2;

        if(arr[mid] == num){
            return mid;
        }
        else if(arr[mid] < num){
            return binarySearchRecursive(arr, mid+1, right, num);
        }
        else if(arr[mid] > num) {
            return binarySearchRecursive(arr, left, mid-1, num);
        }
        return -1;
    }
}