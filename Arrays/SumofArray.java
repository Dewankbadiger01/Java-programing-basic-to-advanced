public class SumofArray {
    static int findsum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
                    int[] arr = {10, 25, 7, 40, 18};
                    int result=findsum(arr);
                    System.out.println("sum of array : "+result);
    }
}