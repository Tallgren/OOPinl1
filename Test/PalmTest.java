import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {
    Palm palmTest = new Palm("Laura", 5);

    @Test
    void getMängdVätska() {
        //Testar rätt
        assert (palmTest.getMängdVätska(palmTest) == 2.5);
        //Testar fel
        assert (palmTest.getMängdVätska(palmTest) != 3);
    }
}