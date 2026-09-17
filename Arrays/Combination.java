import java.util.*;
public class Combination {
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> current=new ArrayList<>();
    static void backtrack(int start, int n,int k){
    if(current.size()==k){
        result.add(new ArrayList<>(current));
        return;
    }
        for(int i=start;i<=n;i++){
            current.add(i);
            backtrack(i+1,n,k);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args){
 int n = 4;
        int k = 2;

        backtrack(1, n, k);

        System.out.println(result);
    }
}