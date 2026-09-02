public class CountOddArray {
    static int CountOdd(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {10, 24, 7, 68, 78};
        int odd=CountOdd(arr);
        System.out.println(odd);
    }
}