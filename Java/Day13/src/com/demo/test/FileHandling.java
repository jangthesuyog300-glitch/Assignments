package com.demo.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class FileHandling {
    public static void main(String[] args) {
		File f =new File("myfilecopy.txt");
		FileOutputStream fos = null;
		try {
			if(f.exists()) {
				fos = new FileOutputStream("myfilecopy.txt",true);
				System.out.println("file created");
			}
			else {
				fos = new FileOutputStream("myfilecopy.txt");
				System.out.println("hello");
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("hello");
		}
	}
}
