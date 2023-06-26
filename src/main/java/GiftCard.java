public class GiftCard extends PaymentCard{

    private double balance;

    public GiftCard(double balance){
        this.balance = balance;
    }

    public void charge(double purchaseAmount) {
        if ((getBalance() >= purchaseAmount) && (purchaseAmount > 0)){
            setBalance(getBalance() - purchaseAmount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}
