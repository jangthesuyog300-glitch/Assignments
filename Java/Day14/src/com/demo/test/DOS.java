package com.demo.test;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.DataInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class DOS {

	public static void main(String[] args) {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("myfile.txt"));
				DataInputStream dis=new DataInputStream(new FileInputStream("myfile.txt") )){
			
					dos.writeDouble(34512.0);
					dos.writeInt(777);
					dos.writeUTF("Suyog");
					System.out.println("read data");
					double num =dis.readDouble();
					int num1=dis.readInt();
					String nm=dis.readUTF();
					System.out.println(num+"-->"+num1+"--->"+nm);
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
	
		}

	}

}
