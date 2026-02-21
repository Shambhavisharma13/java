public class OOPS7 {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
        a.eat();
    }
    
}
abstract  class Animal{
    abstract void sound();
    //no body
    void eat(){
        System.out.println("Animals eats food");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dogs bark");
    }
}
