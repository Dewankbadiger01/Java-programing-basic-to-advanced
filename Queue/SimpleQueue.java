import java.util.*;
public class SimpleQueue {
    ArrayList<Integer>queue=new ArrayList<>();
    void enqueue(int x){
        queue.add(x);
    }
    int front(){
        return queue.get(0);
    }
    public static void main(String[] args){
        SimpleQueue queue = new SimpleQueue();
        queue.enqueue(10);
        System.out.println(queue.front());
    }
}