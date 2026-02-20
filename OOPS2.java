public class OOPS2 {
    public static void main(String[] args) {
        Account a1 = new Account();
 
        a1.setAccountNumber(12345678);
        a1.setPassword("1234d568fj");

        System.out.println(a1.getAccountNumber());
        System.out.println(a1.getPassword());
    }
}

class Account {
     int accountNumber;
    private String password;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    // ✅ Correct setter definition
    public void setPassword(String password) {
        this.password = password;
    }
}
