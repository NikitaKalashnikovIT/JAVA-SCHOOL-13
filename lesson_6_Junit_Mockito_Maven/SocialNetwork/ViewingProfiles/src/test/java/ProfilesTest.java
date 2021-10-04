import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ProfilesTest {


//    @After
//    public void tearDown() throws Exception {
//
//        assertEquals('H', "Hello".charAt(3));
//    }
    private  Profiles profilesMock;

    @Test
    public void setProfiles() throws Exception{
        Profiles  profiles = new  Profiles();
        Profiles profilesMock = Mockito.mock(Profiles.class);
        int actual ;
        int expected = 52 ;

        profiles.SetProfiles("A1");
        profiles.SetProfiles("B2");
        profiles.SetProfiles("C3");
        profiles.SetProfiles("D4");

        actual =  profiles.SetProfiles("E5");
        assertEquals(expected, actual);
    }

    @Test
    public void getProfiles()throws Exception {
        Profiles  profiles = new  Profiles();
        String actual ;
        String expected = "B2"  ;
        int id = 2;

        actual = profiles.GetProfiles(2);
        assertEquals(expected, actual);
    }
}