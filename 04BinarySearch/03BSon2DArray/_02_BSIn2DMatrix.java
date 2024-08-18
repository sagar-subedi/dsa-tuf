public class _02_BSIn2DMatrix {
    

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,3},
            {4,5,6,6},
            {7,8,8,9},
            {10,10,10,11}
        };

        System.out.println(searchIn2DArray(arr, 12));
        
    }

    public static boolean searchIn2DArray(int[][] arr, int target){
        int l = 0;
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        int h = totalCols*totalRows-1;

        while(l<=h){
            int mid = l + (h-l)/2;
            int rowNo = mid/totalCols;
            int columnNo = mid%totalCols;
            if(arr[rowNo][columnNo]==target){
                return true;
            }
            else if(arr[rowNo][columnNo] < target){
                l = mid + 1;
            }
            else {
                h = mid -1;
            }
        }

        return false;
    }
}
