package PracticeCodes.firstWeek.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Practice implements Predicate, Function , Consumer, Supplier {

    public static void main(String[] args) {
        Integer a=10;
        Predicate<Integer> isEven=b->b%2==0;
        Function<String,Integer> lengthOfString=b->{return b.length();};
        Consumer<String> greeting=c->{
            System.out.println("Hi "+c);
        };
        Supplier<Integer> randomNumber=()->{return (int) (Math.random()*9999+1);};
        System.out.println(isEven.test(10));
        System.out.println(lengthOfString.apply("Dhivahar"));
        greeting.accept("Dhivahar");
        System.out.println(randomNumber.get());
    }

    @Override
    public boolean test(Object o) {
        return false;
    }

    @Override
    public Object apply(Object o) {
        return null;
    }

    @Override
    public void accept(Object o) {

    }

    @Override
    public Object get() {
        return null;
    }
}
