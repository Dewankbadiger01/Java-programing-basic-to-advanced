public class SecondLargest {
    static int Second(int arr[]){
          if (arr == null || arr.length < 2) {
            return -1;
          }
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }else if(arr[i]>second && arr[i]!=largest){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args){
        int[] arr = {10, 25, 7, 40, 18};
        int secondLargest=Second(arr);
        System.out.println(secondLargest);
    }
}