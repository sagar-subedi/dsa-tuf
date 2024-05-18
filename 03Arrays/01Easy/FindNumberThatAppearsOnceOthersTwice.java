import java.util.HashMap;

public class FindNumberThatAppearsOnceOthersTwice {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(findNumberThatAppearsOnceOptimal(arr));
        
    }

    public static int findNumberThatAppearsOnceUsingHashMap(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e: arr){
            boolean eExists = map.containsKey(e);
            map.put(e, eExists?map.get(e)+1:1);
        }
        for(int e: map.keySet()){
            if(map.get(e)==1){
                
                return e;
            }
        }
        return -1;
    }

    public static int findNumberThatAppearsOnceOptimal(int[] arr){
        int xor = 0;
        for(int e: arr){
            xor^=e;
        }
        return xor;

    }
}
