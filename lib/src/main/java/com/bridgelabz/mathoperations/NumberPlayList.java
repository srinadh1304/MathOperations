package com.bridgelabz.mathoperations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlayList {

	public static void main(String[] args) {

		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int index=0 ; index<5 ; index++)
			myNumberList.add(index);
		Iterator<Integer> iterator = myNumberList.iterator();
		while(iterator.hasNext()) {
			Integer eachInteger = iterator.next();
			System.out.println("Iterator Value: "+eachInteger);
		}
		class MyConsumer implements Consumer<Integer>{
			public void accept(Integer t) {
				System.out.println("Method2 : Consumer Impl Value: "+t);
			}
		}
		MyConsumer action = new MyConsumer();
		myNumberList.forEach(action);


		myNumberList.forEach(new Consumer<Integer>(){
			public void accept(Integer t) {
				System.out.println("Method3 : forEach anonymous class Value: "+t);
			}
		});

		Consumer<Integer> myListAction = n -> {
			System.out.println("Method4 : forEach Lambda Impl Value: "+n);
		};
		myNumberList.forEach(myListAction);
		myNumberList.forEach(n ->{
			System.out.println("Method5 : forEach Lambda Impl Value: "+n);
		});
		Function<Integer, Double> toDoubleFunction = Integer::doubleValue;
		myNumberList.forEach(n -> {
			System.out.println("Mth6 : forEach Value: " + toDoubleFunction.apply(n));
		});
		Predicate<Integer> isEvenFunction = n -> n > 0 && n % 2 == 0;
		myNumberList.forEach(n -> {
			System.out.println("Method7 : forEach Value of: " + n + " check for Even : " + isEvenFunction.test(n));
		});
	}
}
