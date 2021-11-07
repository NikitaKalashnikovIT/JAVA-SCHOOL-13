import java.util.LinkedList;
import java.util.Set;

public class Search {
//    Profiles profiles = new Profiles();
Profiles profiles = new Profiles();


   Boolean SearchProfiles(String name){
       return profiles.ProfilesAndNames.containsValue(name);
   }
}
