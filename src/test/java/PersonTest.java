import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getNombre() {
        Person p = new Person("James");
        assertEquals("James", p.getNombre());
        assertEquals("John", p.getNombre());
    }
}