/**
 * _03_BSIn2DII
 */
public class _03_BSIn2DII {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        

        System.out.println(bsIn2D(arr, 20));
        
    }



    public static boolean bsIn2D(int[][] arr, int target){
        boolean isFound = false;
        int[] arrayOfFirstElements = new int[arr.length];

        for(int i = 0; i< arr.length; i++){
            arrayOfFirstElements[i] = arr[i][0];
        }

        int lastIndexToCheck = lastIndexOfLessThanOrEqualTo(arrayOfFirstElements, target);

        for(int i = 0; i<=lastIndexToCheck; i++){
            isFound = bsIn1D(arr[i], target);
            if(isFound) return true;
        }
        return false;
    }

    public static boolean bsIn1D(int[] arr, int target){
        int l = 0;
        int h = arr.length -1;
        
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]==target) return true;
            else if (arr[mid]<target) l = mid + 1;
            else h =mid - 1;
        }
        return false;
    }

    public static int lastIndexOfLessThanOrEqualTo(int[] arr, int target){
        int l = 0;
        int h = arr.length -1;
        int lastIndexFound = -1;

        while (l <= h) {
            int mid = l + (h-l);
            if(arr[mid]<=target){
                lastIndexFound = mid;
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }

        return lastIndexFound;
    }

    public static boolean optimizedSearchIn2d(int[][] arr, int target){
        int m = arr.length; //no of rows
        int n = arr[0].length; //no of cols

        int currentRow = m - 1;
        int currentCol = 0;
        while(currentRow >= 0 && currentCol < n){
            if(arr[currentRow][currentCol]==target) return true;
            else if(arr[currentRow][currentCol]>target) currentRow--;
            else currentCol++;
        }


        return false;
    }
}