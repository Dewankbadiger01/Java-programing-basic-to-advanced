public class Permutations {
    public void backtrack(int[] nums,List<List<Integer>> result,List<List<Integer>> current,boolean[] used ){
        //base case
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
        }
    }
    public static void main(String[] args){

    }
}