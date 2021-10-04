import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    @Test
    public void searchProfiles() {
        boolean actual ;
        boolean expected ;
        Search  search = new  Search();
        Profiles  profiles = new  Profiles();
        profiles.SetProfiles("A1");
        profiles.SetProfiles("B2");
        profiles.SetProfiles("C3");
        profiles.SetProfiles("D4");
        //assertEquals('H', "Hello".charAt(5));
        actual = search.SearchProfiles("A1");
        assertTrue(actual);

        actual = search.SearchProfiles("B2");
        assertTrue(actual);

        actual = search.SearchProfiles("C3");
        assertTrue(actual);

        actual = search.SearchProfiles("D4");
        assertTrue(actual);

    }
}