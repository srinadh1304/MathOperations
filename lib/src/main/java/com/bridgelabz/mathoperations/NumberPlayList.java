package com.bridgelabz.mathoperations;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlayList {

	public static void main(String[] args) {
		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i=0;i<5;i++) myNumberList.add(i);
		
		Iterator<Integer> it = myNumberList.iterator();
		while(it.hasNext()) {
			Integer i =it.next();
			System.out.println("Mth1: Iterator value : "+i);
		}
		
		System.out.println();
		class MyConsumer implements  Consumer<Integer>{
				public void accept(Integer t) {
					System.out.println("Mth2: consumer impl value : "+t);
				}
		}
		MyConsumer action = new MyConsumer();
		myNumberList.forEach(action);
		
		System.out.println();
		myNumberList.forEach(new Consumer<Integer>(){
			public void accept(Integer t) {
				System.out.println("Mth3: foreach anonymous class value : "+t);
			}
		});
		
		System.out.println();
		Consumer<Integer> myListAction =  n -> {
			System.out.println("Mth4: foreach lambda impl value : "+ n);
		};
		myNumberList.forEach(myListAction);
		
		
		System.out.println();
		myNumberList.forEach(n->{
			System.out.println("Mth5: foreach lambda impl value : "+ n);
		});
		
		System.out.println();
		Function<Integer, Double> toDoubleFunction = Integer::doubleValue;
		myNumberList.forEach(n->{
			System.out.println("Mth5: foreach lambda double value : "+ toDoubleFunction.apply(n));
		});
		
		System.out.println();
		Predicate<Integer> isEvenFunction = n ->  n%2==0;
		myNumberList.forEach(n->{
			System.out.println("Mth5: foreach value of : "+n+" check for even : " +isEvenFunction.test(n));
		});
		
		
		System.out.println();
		myNumberList.stream().forEach(n ->{
			System.out.println("Mth8: stream forEach value : "+n);
		});
 	}
}
