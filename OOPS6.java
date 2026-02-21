public class OOPS6 {
    public static void main(String[] args) {
        B c =new B();
        c.speak();
    }
    
}
class A{
    void speak(){
        System.out.println("hindi by father");
    }
}
class B extends A{
    void speak(){
        System.out.println("English");
    }

}
