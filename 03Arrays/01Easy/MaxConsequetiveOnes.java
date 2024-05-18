public class MaxConsequetiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,0,1,1,1,0,0,1,1,1};
        System.out.println(findMaxCosequetiveOnes(arr));
        
    }

    public static int findMaxCosequetiveOnes(int[] arr){
        int maxCount = 0; //tracks maximum count among series
        int count = 0; //track current series' count

        for(int e: arr){
            if(e == 0){
                count = 0;
            }
            else if(e==1){
                count++;
            }
            maxCount = count>maxCount?count:maxCount;
        }

        return maxCount;
    }
}
