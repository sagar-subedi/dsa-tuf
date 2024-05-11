public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isArraySortedBruteForce(arr));
        System.out.println(isArraySortedOptimal(arr));

    }

    public static boolean isArraySortedBruteForce(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]> arr[j]) return false;
            }
        }

        return true;
    }

    public static boolean isArraySortedOptimal(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]) return false;
        }

        return true;
    }
}
