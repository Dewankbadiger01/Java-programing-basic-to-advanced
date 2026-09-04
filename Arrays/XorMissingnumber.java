public class XorMissingnumber {
    static int missingNumberXor(int arr[]){
        int n=arr.length;
        int xor=0;
        for(int i=0;i<=n;i++){
            xor^=i;
        }
        for(int num: arr){
            xor^=num;
        }
        return xor;
    }
    public static void main(String[] args){
        int[] arr = {3, 0, 1};
        int ans=missingNumberXor(arr);
        System.out.println(ans);

    }
}