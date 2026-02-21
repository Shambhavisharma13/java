public class OOPS4 {
    public static void main(String[] args){
        Dog d=new Dog();
        d.speak();
        d.eat();
        d.breathe();

        babyDog bd = new babyDog();
        bd.sleep();

    }
}
 class Animal{
    void breathe(){
        System.out.println("Breathing");

    }
    void eat(){
        System.out.println("Eating");
    }
 }
 class Dog extends Animal{
    void speak(){
        System.out.println("speaking");
    }

 }
class babyDog extends Dog{
    void sleep(){
        System.out.println("Baby sleeping");

    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("cat is speaking");  
      }
}
class Tiger extends Animal{
    void speak(){
        System.out.println("MEOW");
    }
}