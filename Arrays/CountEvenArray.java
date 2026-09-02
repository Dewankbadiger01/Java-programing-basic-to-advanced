public class CountEvenArray {
    static int CountEven(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    } // Closes CountEven method

    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 40, 18};
        int Even = CountEven(arr);
        System.out.println(Even); // Outputs: 3
    } // Closes main method
} // Closes CountEvenArray class (No extra brace after this!)
