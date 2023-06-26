import java.util.ArrayList;

public class Wallet {

    private ArrayList<IChargeable> cards;

    public Wallet(){
        this.cards = new ArrayList<>();
    }

    public ArrayList<IChargeable> getCards() {
        return cards;
    }

    public void setCards(ArrayList<IChargeable> cards) {
        this.cards = cards;
    }

//    public IChargeable choosePaymentMethod(IChargeable paymentMethod){
//
//    }
}
