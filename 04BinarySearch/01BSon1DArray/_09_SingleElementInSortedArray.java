public class _09_SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        System.out.println(findSingleElementInSortedArray(arr));
    }

    public static int findSingleElementInSortedArray(int[] arr){

        int l = 0;
        int h = arr.length - 1;

        if(arr.length==1 || arr[0] != arr[1]){
            return arr[0];
        }

        if(arr[arr.length-1]!=arr[arr.length-2]){
            return arr[arr.length-1];
        }

        while(l <= h){
            int mid = l + (h-l)/2;
            if(arr[mid] != arr[mid-1] && arr[mid]!= arr[mid+1]){
               return arr[mid];
            }
            else if(mid%2==0){
                if(arr[mid]==arr[mid-1]){
                    //search left
                    h = mid - 1;
                }
                else{
                    //search right
                    l = mid + 1;
                }
            }
            else if(mid%2==1){
                if(arr[mid]==arr[mid-1]){
                    //search right
                    l = mid + 1;
                }
                else{
                    //search left
                    h = mid -1;
                }
            }
        }


        return -1;
    }
}
