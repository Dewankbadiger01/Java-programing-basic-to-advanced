public class SmallestArray {
    static int findmin(int arr[]){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
           int[] arr = {10, 25, 7, 40, 18};
           int result=findmin(arr);
           System.out.println("MINIMUM : "+result);

    }
}