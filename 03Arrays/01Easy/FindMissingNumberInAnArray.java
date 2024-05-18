public class FindMissingNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        System.out.println(findMissingNumberUsingXORProperty(arr, 7));
        
    }
    public static int findMissingNumber(int[] arr){
        int num = 1;
        for(int e: arr){
            if(num != e) return num;
            num++;
        }
        return -1;
    }

    public static int findMissingNumberUsingHash(int[] arr, int n){
        //hash the frequencies
        int[] hash = new int[n+1];
        
        for(int i = 0; i<arr.length; i++){
            hash[arr[i]]++;
        }

        for(int i =1; i<hash.length; i++){
            if(hash[i]==0){
                return i;
            }
        }

        return -1;
    }

    //optimized 1
    //using property: sum of first n natural numbers = n(n+1)/2
    public static int findMissingNumberUsingSummationProperty(int[] arr, int n){
        int arraySum = 0;
        int naturalsum = (int) n*(n+1)/2;

        for(int e: arr){
            arraySum += e;
        }

        return naturalsum - arraySum;

    } 

    //optimized 2
    //using property: xor of same numbers is 0, xor with 0 is same number
    public static int findMissingNumberUsingXORProperty(int[] arr, int n){
        int xor1=0;
        int xor2=0;
        for(int e: arr){
            xor2^=e;
        }
        for(int i =1; i <=n; i++){
            xor1^=i;
        }

        return xor2-xor1;
    }
}
