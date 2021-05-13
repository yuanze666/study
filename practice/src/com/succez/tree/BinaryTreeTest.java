package com.succez.tree;

import org.junit.Test;

class BinaryTreeTest {

	
	@Test
	public void testLevelOrder() {
		TNode node = new TNode();
		node.value = "A";
		node.left = new TNode();
		node.right = new TNode();
		node.left.value = "B";
		node.right.value = "C";
		node.left.left = new TNode();
		node.left.left.value = "D";
		node.left.right = new TNode();
		node.left.right.value = "E";
		System.out.print(BinaryTree.treeLevel(node, 2));
		
	}

}
