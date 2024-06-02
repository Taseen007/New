public class Account {
    private String accountNumber;
    private String balance;
    private double interest;
    private String minimumBalance;
    private String transactionLimit;


    public Account(String accountNumber, String balance, double interest, String minimumBalance, String transactionLimit){
        this.accountNumber= accountNumber;
        this.balance= balance;
        this.interest=interest;
        this.minimumBalance=minimumBalance;
        this.transactionLimit=transactionLimit;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getBalance(){
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    public String getTransactionLimit() {
        return transactionLimit;
    }

    public void setInterest(double interest){
        System.out.println(this.interest);
    }
}
