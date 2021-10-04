package add_var1;

import java.util.Arrays;

public class Main2 {
    public  static  void  main(String... args){
        Data.of(Arrays.asList("aa1","bbb1","cc1","dd1","i1"))
            .union(Arrays.asList("aa2","bbb2","cc2","dd2","ii2"))
            .filter(s -> s.length() > 3)
            .map(s -> s + ", length=" + s.length())
            .forEach(System.out::println);

        ;
    }
}
