package com.greatlearning.g5ab2.dsa.gca2.question2.main;

import com.greatlearning.g5ab2.dsa.gca2.question2.model.*;
class MNCTransactions {
	Node node;
	Node prev = null;
	Node newHead = null;

	// Method to Transform Binary Search Tree to skewed tree
	void processBST(Node root) {
		if (root == null)
			return;
		processBST(root.left);
		Node rightNode = root.right;

		if (newHead == null) {
			newHead = root;
			root.left = null;
			prev = root;
		} else {
			prev.right = root;
			root.left = null;
			prev = root;
		}
		processBST(rightNode);
	}

	// Method to Print the Transformed Data
	void traverse(Node root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		traverse(root.right);
	}

	public static void main(String[] args) {

		MNCTransactions tree = new MNCTransactions();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		tree.processBST(tree.node);
		tree.traverse(tree.newHead);
	}
}
