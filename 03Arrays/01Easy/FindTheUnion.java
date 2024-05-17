import java.util.ArrayList;
import java.util.HashSet;

public class FindTheUnion {
    public static void main(String[] args) {
        int[] arr1 =  {1,3,3,4,4,8};
        int[] arr2 = {2,5,6,6,7};
        ArrayList<Integer> union = findUnionOptimized(arr1, arr2);
        System.out.println(union.toString());
    }

    public static ArrayList<Integer> findUnionOptimized(int[] arr1, int[] arr2){
        int i =0,j = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while(i<arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if(al.size()==0 || al.get(al.size()-1)!=arr1[i]){
                    al.add(arr1[i]);
                }
                i++;
            }
            else if (arr2[j] < arr1[i]){
                if(al.size()==0 || al.get(al.size()-1)!=arr2[j]){
                    al.add(arr2[j]);
                }
                j++;
            }

        }
        while (i < arr1.length) {
            if(arr1[i]!=al.get(al.size()-1)) al.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
           if(arr2[j]!=al.get(al.size()-1)) al.add(arr2[j]);
           j++;
        }
        return al;
    }

    public static int[] findUnionUsingSet(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        while(left < arr1.length && right < arr2.length){
            
            if(arr1[left] < arr2[right]){
                set.add(arr1[left++]);
                
            }else if(arr2[right] < arr1[left]){
                set.add(arr2[right++]);
            }
            else{
                set.add(arr1[left]);
                left++;
                right++;
            }
        }

        while(left < arr1.length){
            set.add(arr1[left++]);
        }

        while(right < arr2.length){
            set.add(arr2[right++]);
        }
        int[] res = new int[set.size()];
        int i = 0;
        for(int e: set){
            res[i++] = e;
        }

        return res;

    }
}
