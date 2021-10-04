import org.junit.Test;

import static org.junit.Assert.*;

public class MessagesTest {

    @Test
    public void setMessag() {
        Messages messages = new Messages();
        messages.SetMessag("java урок №6");
        messages.SetMessag("05.09.2021");
        messages.SetMessag("Хулио Иглесиас");

    }

    @Test
    public void getMessag() {
        Messages messages = new Messages();

//        messages.GetMessag(0);
//        messages.GetMessag(1);
//        messages.GetMessag(2);
//        messages.GetMessag(3);

        String b = "05.09.2021";
        b = messages.GetMessag(1);
        assertEquals("05.09.2021",b);
        //assertEquals('H', "Hello".charAt(5));
        //assertArrayEquals();
    }
}