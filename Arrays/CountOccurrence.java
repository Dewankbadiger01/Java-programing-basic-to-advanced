public class CountOccurrence {
    static int counttarget(int arr[] , int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 10, 30, 10, 40};
        int target=10;
        int ans=counttarget(arr,target);
        System.out.println(ans);
    }
}