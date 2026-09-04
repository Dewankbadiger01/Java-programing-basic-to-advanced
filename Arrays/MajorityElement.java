public class MajorityElement {
    static int majorityElement(int arr[]){
        int Ruchita=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                Ruchita=arr[i];
                count=1;
            }else if(arr[i]==Ruchita){
                count++;
            }else{
                count--;
            }
        }
        return Ruchita;
    }
    public static void main(String[] args){
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans=majorityElement(arr);
        System.out.println(ans);
    }
}