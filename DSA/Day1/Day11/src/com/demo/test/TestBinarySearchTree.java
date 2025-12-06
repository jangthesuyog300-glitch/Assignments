package com.demo.test;
import com.demo.trees.*;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		
		tree.insertNode(20);
		tree.insertNode(35);
		tree.insertNode(10);
		tree.insertNode(15);
		tree.insertNode(28);
		tree.insertNode(25);
		tree.inorder();
		tree.preorder();
		tree.postorder();
		tree.deleteNode(35);
		tree.search(10);
		tree.searchNonRecursive(35);
	}

}
