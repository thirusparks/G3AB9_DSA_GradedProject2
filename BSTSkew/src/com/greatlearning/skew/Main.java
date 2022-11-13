package com.greatlearning.skew;

public class Main {

	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void BSTToSkewed(Node root) {

		if (root == null) {
			return;
		}

		BSTToSkewed(root.left);

		Node rightNode = root.right;
		
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		BSTToSkewed(rightNode);

	}

	static void traverse(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverse(root.right);
	}

	public static void main(String[] args) {

		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		BSTToSkewed(node);
		traverse(headNode);
	}

}
