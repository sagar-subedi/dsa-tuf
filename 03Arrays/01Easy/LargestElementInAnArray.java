import utils.ArrayUtils;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.getArrayFromInput();
        System.out.println(findLargestElement(arr));
        
    }

    public static int findLargestElement(int[] arr){
        int largest = 0;
        for(int e: arr){
            if(e>largest) largest = e;
        }
        return largest;
    }
}
