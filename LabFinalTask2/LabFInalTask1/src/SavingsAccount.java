public class SavingsAccount extends Account{


    public SavingsAccount(String accountNumber, String balance, double interest, String minimumBalance, String transactionLimit) {
        super(accountNumber, balance, interest, minimumBalance, transactionLimit);
    }

    public void displayBob(){


        System.out.println("Minimum Balance:1000"+ this.getBalance());
        System.out.println("Transaction Limit:5000"+ this.getTransactionLimit());
        System.out.println(this.getInterest());
    }


}


