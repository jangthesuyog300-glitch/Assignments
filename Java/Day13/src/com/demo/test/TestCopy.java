package com.demo.test;
import java.io.*;

public class TestCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("myfile.txt");
			FileOutputStream fos = new FileOutputStream("newfile.txt");
			int i =fis.read();
			while(i!=-1) {
				fos.write(i);
				i=fis.read();
				}
			fis.close();
			fos.close();
			
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
