public class _03_UpperBound {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,6};

        System.out.println(upperBoundAlgorithmUsingLinearSearch(arr, 2));
    }

    public static int upperBoundAlgorithmUsingLinearSearch(int[] arr, int n){

        int l = 0;
        int r= arr.length-1;
        int mid;
        int lastFoundIndex = -1;
        while (l<=r) {
            mid = l + (r-l)/2;

            if(arr[mid]>=n){
                lastFoundIndex = mid;
                //search on the left
                r = mid - 1;
            }   
            else{
                //search on the right
                l = mid + 1;
            }
        }
        return lastFoundIndex;
    }


}