public class FindMissingNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        System.out.println(findMissingNumber(arr));
        
    }
    public static int findMissingNumber(int[] arr){
        int num = 1;
        for(int e: arr){
            if(num != e) return num;
            num++;
        }
        return -1;
    }
}
