import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {
    Kaktus kaktusTest = new Kaktus("Igge", 0.2);

    @Test
    void getMängdVätska() {
        //Testar rätt
        assert (kaktusTest.getMängdVätska(kaktusTest) == 0.2);
        //Testar fel
        assert (kaktusTest.getMängdVätska(kaktusTest) != 0.5);
    }
}