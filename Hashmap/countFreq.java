import java.util.*;
public class countFreq {
    public static void main(String[] args){
        	int[] arr = {1, 2, 2, 3, 1, 1};
HashMap<Integer,Integer> map=new HashMap<>();
for(int nums: arr){
    map.put(nums,map.getOrDefault(nums,0)+1);
}
System.out.print(map);
    }
}