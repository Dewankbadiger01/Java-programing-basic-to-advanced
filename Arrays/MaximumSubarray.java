public class MaximumSubarray {
    static int maximumSubarray(int arr[]){
        int currsum=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            currsum=Math.max(arr[i],currsum+arr[i]);
        max=Math.max(max,currsum);

        }
        return max;
    }
    public static void main(String[] args){
int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
int ans=maximumSubarray(arr);
System.out.println(ans);
    }
}