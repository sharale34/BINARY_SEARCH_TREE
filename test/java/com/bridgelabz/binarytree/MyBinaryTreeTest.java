package com.bridgelabz.binarytree;

import org.junit.Test;

import com.bridgelabz.binarytreee.MyBinaryTree;

import org.junit.Assert;

public class MyBinaryTreeTest {
	@Test
	public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}
}
