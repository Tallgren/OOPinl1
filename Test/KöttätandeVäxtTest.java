import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxtTest {
    KöttätandeVäxt köttätandeVäxtTest = new KöttätandeVäxt("Meatloaf", 0.7);

    @Test
    void getMängdVätska() {
        //Testar rätt
        assert (köttätandeVäxtTest.getMängdVätska(köttätandeVäxtTest) == 0.24);
        //Testar fel
        assert (köttätandeVäxtTest.getMängdVätska(köttätandeVäxtTest) != 0.5);
    }
}