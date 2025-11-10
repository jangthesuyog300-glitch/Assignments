package com.demo.test;
import com.demo.hashing.*;

public class TestHashTable {

	public static void main(String[] args) {
		HashTable hash=new HashTable(5);
		
		hash.insertData(20);
		hash.insertData(19);
		hash.insertData(28);
		hash.insertData(7);
		hash.insertData(18);
		hash.insertData(22);
		hash.displayHashTable();
		hash.searchData(28);
		
	}

}
