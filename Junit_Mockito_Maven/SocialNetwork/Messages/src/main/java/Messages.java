import java.util.LinkedList;

public class Messages {
    static  LinkedList <String> mesages = new LinkedList<String>();
    Profiles profiles = new Profiles();

    void SetMessag(String mes){
        mesages.add(mes);
    }

    LinkedList <String> GetMessag(){
        return mesages;
    }

     String GetMessag(int mes) {

         if (profiles.ProfilesAndNames.containsKey(mes)) {
             try {
                 return mesages.get(mes);

             } catch (IndexOutOfBoundsException e) {
                 //System.out.println("No messages");
                 return "No messages";

             }


         }
         return "No messages";
     }
}
