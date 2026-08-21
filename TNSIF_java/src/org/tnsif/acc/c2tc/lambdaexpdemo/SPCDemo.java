package org.tnsif.acc.c2tc.lambdaexpdemo;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SPCDemo {

	public static void main(String[] args) {
		
		Supplier< String > supplier = () -> "hello CITNC";
		String suplierValue = supplier.get();
		System.out.println(suplierValue);
		
		Predicate<Integer> eligible = (salary) -> salary >= 30000;
		System.out.println(eligible.test(40000));
		
		Consumer<String> consumer = message -> System.out.println("consumer");
		consumer.accept("this is test message");
	}

}
