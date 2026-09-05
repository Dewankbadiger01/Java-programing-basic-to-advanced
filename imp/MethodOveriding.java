class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @overide
    void sound(){
        System.out.println("Dog bark");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Dog d= new Dog();
        d.sound();
    }
}