import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    private GiftCard giftcard;

    @Before
    public void before(){
        giftcard = new GiftCard(50.00);
    }

    @Test
    public void giftcardHasBalance(){
        assertEquals(50.00, giftcard.getBalance(), 0.0);
    }

    @Test
    public void giftcardCanSEtBalance(){
        giftcard.setBalance(60.00);
        assertEquals(60.00, giftcard.getBalance(), 0.0);
    }

    @Test
    public void giftcardCanBeCharged__success(){
        giftcard.charge(20.00);
        assertEquals(30.00, giftcard.getBalance(), 0.0);

    }

    @Test
    public void giftcardCanBeCharged__fail(){
        giftcard.charge(60.00);
        assertEquals(50.00, giftcard.getBalance(), 0.0);
    }
}
