package com.demo.test;
import java.util.List;
import java.util.ArrayList; 
import com.demo.beans.Employee;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;


public class CSV {
	public static void main(String[] args) {
		List<Employee>lst=new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("empdata.txt"))){
			String line =br.readLine();
			while(line!=null) {
				String[] arr = line.split(",");
				Employee emp=new Employee();
				emp.setEmpid(Integer.parseInt(arr[0]));
				emp.setEname(arr[1]);
				emp.setDesg(arr[2]);
				emp.setSal(Double.parseDouble(arr[3]));
				lst.add(emp);
				line=br.readLine();
			}
			lst.forEach(System.out::println);

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Hello");
		}
		lst.add(new Employee(34,"priyanka","admin",50000));
		lst.add(new Employee(30,"shruti","hr",510000));
		try(BufferedWriter bw =new BufferedWriter(new FileWriter("empdata.txt"));){
			for(Employee e:lst) {
				String str=e.getEmpid()+" "+e.getEname()+" "+e.getDesg()+" "+e.getSal()+"\n";
				bw.write(str);
			}
		}catch(IOException e) {
		System.out.println(e.getMessage());
	}

}
}
