import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    public Wallet wallet;
    public CreditCard visa;
    public DebitCard masterCard;
    public GiftCard voucher;

    @Before
    public void before() {
        wallet = new Wallet();
        visa = new CreditCard(1234, "12/24", 123, 5000);
        masterCard = new DebitCard(4321, "06/25", 321, 13424, 563412);
        voucher = new GiftCard(75);
        wallet.addCardToWallet("Visa", visa);
        wallet.addCardToWallet("MasterCard", masterCard);
        wallet.addCardToWallet("Voucher", voucher);
    }

    @Test
    public void canAddCardToWallet() {
        GiftCard newCard = new GiftCard(10);
        wallet.addCardToWallet("GiftCard", newCard);
        assertEquals(4, wallet.getCards().size());
    }

    @Test
    public void canGetCardByName() {
        IChargeable cardFromWallet =  wallet.getCardByName("Visa");
        assertEquals(visa, cardFromWallet);
    }

    @Test
    public void canPayWithCard() {
        wallet.getCardByName("MasterCard").charge(22.45);
        assertEquals(masterCard.getTransactions().get(0), "You were charged £22.45.");
        wallet.getCardByName("voucher").charge(73);
        assertEquals(2.0, voucher.getBalance(), 0.0);
        wallet.getCardByName("ViSa").charge(10);
        assertEquals(4989, visa.getAvailableCredit(), 0);
    }
}
