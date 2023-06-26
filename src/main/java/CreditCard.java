public class CreditCard extends BankCard{

    private double availableCredit;

    public CreditCard(long cardNumber, String expiryDate, int securityNumber, double availableCredit){
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public void charge(double purchaseAmount) {
        if (purchaseAmount <= availableCredit && purchaseAmount >0){
            availableCredit -= (purchaseAmount * 1.1);
        }
    }
}
