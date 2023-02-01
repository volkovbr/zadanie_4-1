import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServisTest {
    @Test
    public void testRegisteredBonusNoLimit() {
        BonusServis servis = new BonusServis();
        int expected = 30;
        int actual = servis.calculate(1010, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredBonusOverLimit() {
        BonusServis servis = new BonusServis();
        int expected = 500;
        int actual = servis.calculate(1000_000, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoRegisteredBonusNoLimit() {
        BonusServis servis = new BonusServis();
        int expected = 10;
        int actual = servis.calculate(1000, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoRegisterdBonusOverLimit() {
        BonusServis servis = new BonusServis();
        int expected = 500;
        int actual = servis.calculate(1000_000, false);
        Assertions.assertEquals(expected, actual);
    }
}
