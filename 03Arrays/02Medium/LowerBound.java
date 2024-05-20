public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,6};

        System.out.println(lowerBoundAlgorithmUsingLinearSearch(arr, 3));
    }       

    public static int lowerBoundAlgorithmUsingLinearSearch(int[] arr, int n){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==n) return i;
        }
        return -1;
    }

    public static int lowerBoundAlgorithmUsingBinarySearch(int[] arr, int n){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        int ans = mid;

        while(left < right){
            mid = left + (right-left)/2;
            if(arr[mid]>=n){
                ans = mid;
                right = mid-1;
            }
            if(arr[mid]<n){
                left = mid+1;
            }
           
        }
        return ans;
    }
}
