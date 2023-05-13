package ke.co.safaricom;

public class App {
    public static void main(String[] args) {
        Account sampleAccount = new Account();
        System.out.println(sampleAccount.getAccountBalance()); //0.0
        sampleAccount.deposit(1000);
        System.out.println(sampleAccount.getAccountBalance()); // 1000.0
        System.out.println(sampleAccount.withdraw(1000)); // false
        System.out.println(sampleAccount.withdraw(900)); // true
        System.out.println(sampleAccount.getAccountBalance()); // 0.0
    }
}