public class OOPS5 {
    public static void main(String[] args) {
       Calculation c1=new Calculation();
       System.out.println(c1.sum(10,20));
       System.out.println(c1.sum(10,20,30));
       System.out.println(c1.sum(2.0f,20.0f));
    }
    
}//method overloading
class Calculation{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}
