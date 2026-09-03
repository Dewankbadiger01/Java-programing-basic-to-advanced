public class CheckSorted {
    static boolean isSorted(int arr[]){
        if(arr == null || arr.length==0){
            return true;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
int[] arr = {10, 20, 15, 40, 50};

System.out.println(" Array is sorted ? : "+isSorted(arr));
    }
}