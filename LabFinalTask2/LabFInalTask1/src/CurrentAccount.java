public class CurrentAccount extends Account{

    public CurrentAccount(String accountNumber, String balance, double interest, String minimumBalance, String transactionLimit) {
        super(accountNumber, balance, interest, minimumBalance, transactionLimit);
    }
    public void displayAlice(){
        System.out.println("Minimum Balance:500"+ this.getBalance());
        System.out.println("Transaction Limit:2000"+ this.getTransactionLimit());
        System.out.println(this.getInterest());
    }
}
