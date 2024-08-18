public class _01_MaxNumsOfOnes {
    public static void main(String[] args) {
        int[][] arr = {
            {0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,1,1},
            {0,0,0,0,0,1,1,1},
            {0,0,0,0,0,0,1,1}
        };

        System.out.println(findRowWithMaxOnes(arr));
        System.out.println(findFirstOccurance(arr[1], 1));
        
    }   
    
    public static int findRowWithMaxOnes(int[][] arr){
        int firstOccurance = arr[0].length;
        int rowWithMaxOnes = -1;

        for(int i = 0; i < arr.length; i++){
            int firstOccuranceInCurrentRow = findFirstOccurance(arr[i], 1);

            if(firstOccuranceInCurrentRow < firstOccurance && firstOccuranceInCurrentRow !=-1){
                firstOccurance = firstOccuranceInCurrentRow;
                rowWithMaxOnes = i;
            }
        }
        return rowWithMaxOnes;
    }

    public static int findFirstOccurance(int[] arr, int target){
        int l = 0;
        int h = arr.length - 1;
        int firstOccurance = -1;

        while (l <= h) {
            int mid = l + (h-l)/2;
            if(arr[mid]==target){
                firstOccurance = mid;
                h = mid -1;
            }
            else if (arr[mid] < target){
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }
        return firstOccurance;
    }
}
