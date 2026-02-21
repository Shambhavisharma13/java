public class OOPS8 {
    public static void main(String[] args) {
       Payment p1 =new UPI(); 
       p1.pay();

       Payment p2=new CC();
       p2.pay();
    }
    
}
interface Payment{
    void pay();
}
class UPI implements Payment{
     public void pay(){
        System.out.println("Payment through UPI");
    }
}
class CC implements Payment{

}