import java.util.Arrays;

public class _04_FloorCeil {
    public static void main(String[] args) {
        int[] arr = {0,1,3,3,4,5,6};

        System.out.println(Arrays.toString(findFloorCiel(arr, 2)));
    }

    public static int[] findFloorCiel(int[] arr, int x){

        int floor = findFloor(arr, x);
        int ciel = findCeil(arr, x);
        int[] ret = {floor, ciel};
       return ret;
    }

    public static int findFloor(int[] arr, int x){

        int l = 0;
        int r = arr.length -1;
        int retVal = -1;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid]<=x){
                l = mid + 1;
                retVal = arr[mid];
            }
            else{
                r = mid - 1;
            }
        }
        return retVal;
    }

    public static int findCeil(int[] arr, int x){

        int l = 0;
        int r = arr.length - 1;
        int retVal = -1;

        while(l<=r){
            int mid =  l + (r-l)/2;
            if(arr[mid]>=x){
                r = mid -1;
                retVal  = arr[mid];
            }
            else{
                l = mid + 1;
            }
        }

        return retVal;
    }
}
