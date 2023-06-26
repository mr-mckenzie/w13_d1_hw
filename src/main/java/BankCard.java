import java.util.ArrayList;
import java.util.Collection;

public abstract class BankCard extends PaymentCard{

    private long cardNumber;
    private String expiryDate;
    private int securityNumber;
    private ArrayList<String> transactions;

    public BankCard(long cardNumber, String expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.transactions = new ArrayList<>();
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public ArrayList<String> getTransactions() {
        return this.transactions;
    }

    public String logTransaction(double purchaseAmount){
        String newTransaction = String.format("You were charged £%s.", purchaseAmount);
        transactions.add(newTransaction);
        return newTransaction;
    }


}
