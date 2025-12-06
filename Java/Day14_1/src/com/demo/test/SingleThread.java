package com.demo.test;
import com.demo.beans.*;

public class SingleThread {

	public static void main(String[] args) {
		Myclass ob =new Myclass();

        int ans=ob.factorial(5);
        System.out.println(ans);
        
        ob.TablePrint(7);
        
        boolean status=ob.isPrime(7);
        System.out.println(status);

	}

}
