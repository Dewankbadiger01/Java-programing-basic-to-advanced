public class LargestArray {
    static int findmax(int arr[]){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
if(arr[i]>largest){
    largest=arr[i];
}
        }
        return largest;
    }
        public static void main(String[] args){
            int[] arr = {10, 25, 7, 40, 18};
            int result=findmax(arr);
            System.out.println("Largest : "+result);
        }
    }
