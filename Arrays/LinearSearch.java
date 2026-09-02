public class LinearSearch {
    static int search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10, 25, 7, 40, 18};
        int target=40;
        int ans=search(arr,target);
        System.out.println(ans);
    }
}