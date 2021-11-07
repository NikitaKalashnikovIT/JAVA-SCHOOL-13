import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Profiles {
    static HashMap<Integer, String> ProfilesAndNames = new HashMap<Integer, String>();
    List<Integer> listKey = new ArrayList<Integer>();

    Integer SetProfiles (String name){
        Integer newId = 1;
        boolean validId = true;
        while(validId){
            validId  =  ProfilesAndNames.containsKey(newId);
            if(!validId){
                ProfilesAndNames.put(newId,name);
            }
            else{ newId++; }
        }
        return newId;
    }

    String GetProfiles (Integer id){

        return ProfilesAndNames.get(id);
    }

}
