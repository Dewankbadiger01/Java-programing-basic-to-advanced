// Find the Largest and Smallest Together
public class LargestSmallest {
    static int [] findMinMax(int arr[]){
        if(arr== null || arr.length==0){
            return new int[]{};
        }
        int largest=arr[0];
        int Smallest=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }else if(arr[i]<Smallest){
            Smallest=arr[i];
        }
        }
        return new int[]{largest,Smallest};
    }
    public static void main(String[] args){
int[] arr = {10, 25, 7, 40, 18};
int[] ans=findMinMax(arr);
System.out.println("Largest"+ans[0]);
System.out.println("Smallest"+ans[1]);
    }
}