public class _08_MinimumInSortedArray {
    public static void main(String[] args) {
        int[] arr = {7,8,9,0,1,2,3,4,5,6};

        System.out.println(findMinimumNumber(arr));
    }

    public static int findMinimumNumber(int[] arr){
        int min = arr[0];
        int l=0;
        int h=arr.length-1;


        while(l<=h){
            int mid = l + (h-l)/2;

            if (arr[l] <= arr[h]) {
                min = Math.min(min, arr[l]);
                return min;
            }
            if(arr[l] <= arr[mid]){
                //left half is sorted
                if(arr[l] < min){
                    min = arr[l];
                }
                l = mid + 1;
            }
            else{
                //right half is sorted
                if(arr[mid]<min){
                    min = arr[mid];
                }
                h = mid - 1;
            }
        }


        return min;
    }


}
