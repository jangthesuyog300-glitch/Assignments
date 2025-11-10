package com.demo.test;
import com.demo.service.QueueList;

public class TestQueueList {

	public static void main(String[] args) {
		QueueList lst =new QueueList();
		lst.enqeue(11);
		lst.enqeue(16);
		lst.enqeue(13);
		lst.enqeue(10);
		lst.deqeue();
		lst.deqeue();
		lst.deqeue();
		lst.deqeue();
		lst.deqeue();
	}

}
