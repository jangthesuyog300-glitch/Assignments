package com.demo.test;
import com.demo.stacks.CircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		CircularQueue cqueue =new CircularQueue();
		cqueue.enQueue(4);
		cqueue.enQueue(41);
		cqueue.enQueue(42);
		cqueue.enQueue(43);
		cqueue.enQueue(44);
		cqueue.enQueue(4);
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		cqueue.enQueue(421);
		cqueue.enQueue(431);
		cqueue.enQueue(422); 
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
	}

}
