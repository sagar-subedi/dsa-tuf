public class _01_SquareRootUsingBS {
    public static void main(String[] args) {

        int num = 16;
        System.out.println(findFloorOfSquareRoot(num));
        
    }   
    
    public static int findFloorOfSquareRoot(int n){
        int l = 1;
        int h = n;
        while(l <= h){
            int mid = l + (h-l)/2;

            if(mid*mid <= n){
                l = mid + 1;
            }
            else if (mid*mid > n){
                h = mid - 1;
            }

        }


        return h;
    }
}
