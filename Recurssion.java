public class Recurssion{
    public static int factorial(int n){
        if(n==1)
        return n;
        //kaam
        return n * factorial(n-1);

    }
public static int fibo(int n){
    if(n==0|| n==1){
      return n;  
    }
    return fibo(n-1)+fibo(n-2);
}
    public static int desc_count(int n){
        if(n==0)
            return n;
        System.out.print(n+"");
        return desc_count(n-1);
    }  

    public static void main(String[] args) {
        System.out.print(desc_count(10));
    }
}
