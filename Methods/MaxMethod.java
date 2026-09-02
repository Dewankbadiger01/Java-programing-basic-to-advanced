import java.util.*;
public class MaxMethod {
    static int max(int a, int b){
         return (a > b ) ? a : b;
    }
    public static void main(String[] args){
      int result=max(10,8);
      System.out.print(result);
    }
}