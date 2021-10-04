import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Profiles profiles = new Profiles();
        Search search = new Search();
        Messages messages = new Messages();

        profiles.SetProfiles("Хичкок Петр");
        profiles.SetProfiles("Санта Мария");
        profiles.SetProfiles("Анна Леопольдовна");
        profiles.SetProfiles("Хулио Иглесиас");

        System.out.println(profiles.GetProfiles(1));
        System.out.println(profiles.GetProfiles(4));

        System.out.println(search.SearchProfiles("Анна Леопольдовна"));

        messages.SetMessag("java урок №6");
        messages.SetMessag("05.09.2021");
        messages.SetMessag("Хулио Иглесиас");
        System.out.println(messages.GetMessag());
        System.out.println(messages.GetMessag(0));
        System.out.println(messages.GetMessag(1));
        System.out.println(messages.GetMessag(2));
        System.out.println(messages.GetMessag(3));

        String b = messages.GetMessag(1);
        System.out.println(b + "111");




    }
}
