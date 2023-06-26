import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    private DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard( 1234567890, "12/28", 123, 12345678, 123456);
    }

    @Test
    public void debitCardHasCardNumber(){
        assertEquals(1234567890, debitCard.getCardNumber());
    }

    @Test
    public void debitCardHasExpiryDate(){
        assertEquals("12/28", debitCard.getExpiryDate());
    }

    @Test
    public void debitCardHasSecurityNumber(){
        assertEquals(123, debitCard.getSecurityNumber());
    }

    @Test
    public void debitCardHasAccountNumber(){
        assertEquals(12345678, debitCard.getAccountNumber());
    }

    @Test
    public void debitCardHasSortCode(){
        assertEquals(123456, debitCard.getSortCode());
    }

    @Test
    public void debitCardCanLogTransaction(){
        String result = debitCard.logTransaction(25.00);
        assertEquals("You were charged £25.0.", result);
    }

    @Test
    public void debitCardStartsWithEmptyTransactionList(){
        assertEquals(0, debitCard.getTransactions().size());
    }

    @Test
    public void debitCardCanBeCharged(){
        debitCard.charge(25.00);
        assertEquals("You were charged £25.0.", debitCard.getTransactions().get(0));
    }
}
