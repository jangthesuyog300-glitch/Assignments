package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedinputStream {

	public static void main(String[] args) {
		File f=new File("myfilecopy1.txt");
		BufferedOutputStream bos=null;
		try {
			if(f.exists()) {
				
				bos=new BufferedOutputStream(new FileOutputStream(f,true));
				System.out.println("File already exists");
			}else {
				bos=new BufferedOutputStream(new FileOutputStream(f));
				System.out.println("file created");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(BufferedInputStream bis=new BufferedInputStream(
				                           new FileInputStream("myfile.txt"));
				BufferedOutputStream bos1=bos;){
			
			int i=bis.read();
			while(i!=-1) {
				bos.write(i);
				i=bis.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
