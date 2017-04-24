import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by franc on 24.04.2017.
 */
class Test {

    @org.junit.jupiter.api.Test
    void testMethod1()
    {
        Skrzynka s = new Skrzynka();
        Jablko j = new Jablko(1, 3);
        Gruszka g = new Gruszka(0.3, 5);
        s.dodaj(j);
        s.dodaj(g);
        assertEquals(s.podajWage() ,j.podajWage() + g.podajWage());
        assertEquals(s.podajCene(), j.podajWage()*j.podajCeneZaKg() + g.podajWage()*g.podajCeneZaKg());
        Sliwka sliwa = new Sliwka(0.8, 5);
        assertFalse(s.dodaj(sliwa));
        assertEquals(s.podajWage() ,j.podajWage() + g.podajWage());
        assertEquals(s.podajCene(), j.podajWage()*j.podajCeneZaKg() + g.podajWage()*g.podajCeneZaKg());

    }
    void testMethod2()
    {

    }
}