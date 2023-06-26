import java.util.Collection;

public class DebitCard extends BankCard{

    private int accountNumber;
    private int sortCode;

    public DebitCard(long cardNumber, String expiryDate, int securityNumber, int accountNumber, int sortCode){
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public void charge(double purchaseAmount) {
        logTransaction(purchaseAmount);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getSortCode() {
        return this.sortCode;
    }

}
