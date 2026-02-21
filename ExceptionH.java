public class ExceptionH {
    public static void main(String[] args) {
        System.out.println("start");
        //Arthimetic-n/0
        try{
        int a=10/0;
        System.out.println(a);
        }
        catch(Exception e){
           System.out.println(e); 
        }
        finally{
        System.out.println("rest of the services");
        }
    }
    
}
