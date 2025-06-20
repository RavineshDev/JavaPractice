package java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunction {
	
	public static void main(String[] args) {
		Function<String, Integer> f = (str) -> str.length();
    	System.out.println(f.apply("ram"));
    	
    	Consumer<Integer> c = (val) -> System.out.println((int)Math.pow(2, val));
    	c.accept(5);
    	
    	Supplier<String> s = () -> "Karma";
    	System.out.println(s.get());
    	
    	Predicate<String> p = (str) -> str.startsWith("p");
    	System.out.println(p.test("Prem"));
    	
    	
    	
    	BiPredicate<String, String> bp = (s1, s2) -> s1.equals(s2);
    	System.out.println(bp.test("ram", "ram"));
    	
    	BiFunction<String, String, Integer> bifu = (s1, s2) -> s1.length() + s2.length();
    	System.out.println(bifu.apply("ram", "shyam"));
    	
    	BiConsumer<String, String> bic = (s1, s2) -> System.out.println(s1+" is a "+s2);
    	bic.accept("Ram", "doctor");
	}

}
