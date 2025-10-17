package com.demo.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> lst = List.of(23,12,45,67,34,11,34) ;
		
		// mix num
		Optional<Integer> maxnum = lst.stream().max(Integer::compare);
		System.out.println(maxnum.get());
		
		// min num
		Optional<Integer> minnum = lst.stream().min(Integer :: compare);
		System.out.println(minnum.get());
		
		//max odd num
		maxnum = lst.stream().filter(e->e%2!=0).max(Integer :: compare);
		System.out.println(maxnum.get());
		
		//findFirst num > 5
		Optional<Integer> op = lst.stream().filter(e->e > 5).findFirst();
		if(op.isPresent()) {
			System.out.println(op.get());
		}
		else {}
		
		// find max num < 5
		Optional<Integer> ops =lst.stream().filter(e->e>5).max(Integer::compare);
		System.out.println(ops.get());
		
		// square of all num
		List<Integer> lst1 = lst.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(lst1);
		
		//len of str
		List<String> lstr=List.of("Hello","Welcome","Test","Happy");
		Optional<String> opr = lstr.stream().reduce((acc,s)->acc.length() > s.length()?acc:s);
		System.out.println(opr.get());
		
		
		//All Match
		boolean status = lst.stream().allMatch(e->{
			System.out.println("In all match "+e);
			return e>15;
		});
		System.out.println(status);
		
		status = lst.stream().anyMatch(e->{
			System.out.println("In any match "+e);
			return e>15;
		});
		System.out.println(status);
		
		status = lst.stream().noneMatch(e->{
			System.out.println("In none match "+e);
			return e>15;
		});
		System.out.println(status);
		
		

	}
	
	
}
