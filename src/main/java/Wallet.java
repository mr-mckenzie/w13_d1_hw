import java.util.ArrayList;
import java.util.HashMap;

public class Wallet {

    private HashMap cards;

    public Wallet(){
        this.cards = new HashMap<String, IChargeable>();
    }

    public HashMap getCards() {
        return cards;
    }

    public void addCardToWallet(String cardName, IChargeable cardToAdd) {
        cards.put(cardName.toLowerCase(), cardToAdd);
    }

    public IChargeable getCardByName(String cardName) {
        return (IChargeable) cards.get(cardName.toLowerCase());
    }

    public void payWithCard(String cardName, double priceToCharge) {
        IChargeable paymentCard = this.getCardByName(cardName);
        paymentCard.charge(priceToCharge);
    }
}
