package add_var1;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Data<T> {
    private final Generator2 <T> general;

    private Data(Generator2 <T> general) {
        this.general = general;
    }


    public static <T> Data<T> of (Collection<T> collection1){

        return new Data<>(n -> {
            for (T i : collection1) {
                n.emti(i);
            }
        });
    }
/*
public interface GenContext<T> {
    void emti(T value);
}

public interface Generator2<T> {
    void generator2(GenContext<T> genConst);
}

public class Data<T> {
    private final Generator2 <T> general;

    private Data(Generator2 <T> general) {
        this.general = general;
    }
 */
//    public Data<T> union(Collection<T> collection2) {
//        return new Data<>(n -> {
//           /* general.generator2(n);*/
//            collection2.forEach(item1 -> n.emti(item1));
//        });
//    }
    ////////////////////////////////////////////////////
public Data<T> union(Collection<T> collection1){
    return new Data<>(n -> {
        general.generator2(n);
        for (T value :collection1){
            n.emti(value);
        }
    });
}

/*@FunctionalInterface
public interface Predicate<T> {
   boolean test(T t);
}*/
    public Data<T> filter(Predicate<T> predicate) {
        return new Data<>(n -> general.generator2(value -> {
            if (predicate.test(value )) {
                n.emti(value);
            }
        }));
    }

/*@FunctionalInterface
public interface Function<T, R> {
   R apply(T t);
}*/
//s -> s + ", length=" + s.length()
    public <R> Data<R> map(Function<T, R> function) {
        return new Data<>(n -> general.generator2(
                value1 -> n.emti(function.apply(value1))
        ));
    }

    /*@FunctionalInterface
public interface Consumer<T> {
   void accept(T t);
}*/
    public void forEach(Consumer<T> consumer) {
        general.generator2(n -> consumer.accept(n));
    }
}
