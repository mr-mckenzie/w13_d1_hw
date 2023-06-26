import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(1234567890, "12/28", 123, 1000);

    }

    @Test
    public void creditCardHasCredit(){
        assertEquals(1000, creditCard.getAvailableCredit(), 0.0);
    }

    @Test
    public void creditCArdCanBeCharged(){
        creditCard.charge(100);
        assertEquals(890, creditCard.getAvailableCredit(), 0.0);
    }
}
