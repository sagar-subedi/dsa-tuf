import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] arr = {1,1,3,3,4,4,5};
        System.out.println(removeDuplicatesBruteforce(arr));

    }

    public static int removeDuplicatesBruteforce(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int e: arr){
            set.add(e);
        }
        int index = 0;
        for(int e: set){
            arr[index++] = e;
        }
        return index;
    }

    public static int removeDuplicatesOptimal(int[] arr){
        int i=0;

        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
