public class _06_CountOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,2,3,3,4,5,6};

        System.out.println(countOccurance(arr, 2));
    }

    public static int countOccurance(int[] arr, int x){
        int countOnLeft = 0;
        int countOnRight = 0;
        int index = binarySearch(arr, x);

      if(index != -1){
        while(arr[index-countOnLeft-1]==arr[index]){
            countOnLeft++;
        }


        while(arr[index+countOnRight+1]==arr[index]){
            countOnRight++;
        }
      }
        return countOnLeft + countOnRight + 1;
    }

    public static int binarySearch(int[] arr, int x){
        int l = 0;
        int  r = arr.length -1;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]< x){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }


        return -1;
    }
}