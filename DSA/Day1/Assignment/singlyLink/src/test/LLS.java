package test;
import com.demo.service.*;

public class LLS {

	public static void main(String[] args) {
		SingleLL list=new SingleLL();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.display();
		System.out.println();
		list.reverse();

	}

}
