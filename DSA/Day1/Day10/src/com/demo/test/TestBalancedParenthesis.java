package com.demo.test;
import com.demo.stacks.*;

public class TestBalancedParenthesis {

	public static void main(String[] args) {
		String str ="{{[](){[]}}}";
		String str1="{{}[{]}}";
		String str2="({[][]({{}})}";
		boolean status =checkParenthesis(str);
		if(status)
		{
			System.out.println("Balanced Parenthesis");
		}
		else 
		{
			System.out.println("unbalanced Parenthesis");
		}
		
		 status =checkParenthesis(str1);
		if(status)
		{
			System.out.println("Balanced Parenthesis");
		}
		else 
		{
			System.out.println("unbalanced Parenthesis");
		}
		 status =checkParenthesis(str2);
		if(status)
		{
			System.out.println("Balanced Parenthesis");
		}
		else 
		{
			System.out.println("unbalanced Parenthesis");
		}

	}

	private static boolean checkParenthesis(String str) {
		MyStackListGeneric<Character> st=new MyStackListGeneric<>();
		for(int i=0;i<str.length();i++) {
			Character ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				else {
					Character ch2=st.pop();
					switch(ch) {
					case ']' ->{
						if(ch2!='[') {
							return false;
						}
					}
					case ')' ->{
						if(ch2!='(') {
							return false;
						}
					}
					case '}' ->{
						if(ch2!='{') {
							return false;
						}
					}
					}
				}
			}
		}
		return st.isEmpty();
	}

}
