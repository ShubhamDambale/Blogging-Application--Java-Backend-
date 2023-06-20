package com.shubham.blog.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
	
	public static int find(Integer[] a, int total) {
		
		List<Integer> list = Arrays.asList(a);
		
		
		
		Collections.sort(list);
		
		int ans = list.get(total-2);
		
		
		return ans;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Integer a[]  = {1,2,3,4,5};
		
		
		System.out.println("Second Largest : " + find(a, 5));
	}
	
}
