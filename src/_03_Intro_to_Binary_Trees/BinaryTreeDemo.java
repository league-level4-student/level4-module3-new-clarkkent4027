package _03_Intro_to_Binary_Trees;

import java.util.Iterator;

public class BinaryTreeDemo {

	/*
	 * A Binary Tree is a data structure that makes use of nodes and references like
	 * a LinkedList, but instead of the nodes pointing to a previous node or next
	 * node in an unordered list they each points to two child nodes that are below
	 * them in the hierarchy.
	 * 
	 * Some important properties of BinaryTree are:
	 * 
	 * -The left node is always a smaller value than its parent and the right node
	 * is always a larger value. This is a property you have seen in some form
	 * already via Binary Search.
	 * 
	 * -Empty nodes are null references.
	 * 
	 * -The parent node at the very top of the tree is called the root.
	 * 
	 * 1. Read through the BinaryTree and Node classes.
	 * 
	 * 2. Create a BinaryTree of any type you like.
	 * 
	 * 3. Try using some BinaryTree methods to insert, search for, delete and print
	 * elements.
	 * 
	 * 4. Save the root into a Node Object and use references to traverse through
	 * the BinaryTree and perform an operation on every element(You may choose to do
	 * this recursively or iteratively). Then print it out to see if it worked.
	 * 
	 */

	public static void main(String[] args) {
		BinaryTree<Integer> iLikeTrees;
		iLikeTrees = new BinaryTree<Integer>();
		iLikeTrees.insert(5);
		iLikeTrees.getRoot();
		iLikeTrees.insert(3);
		Node<Integer> head = new Node<Integer>(5);
		Node<Integer> current = new Node<Integer>(5);
		System.out.println(iLikeTrees.getRoot().getValue());
		iLikeTrees.insert(10);
		iLikeTrees.insert(7);
		iLikeTrees.insert(4);
		iLikeTrees.insert(6);
		iLikeTrees.insert(8);
		iLikeTrees.insert(2);
		iLikeTrees.delete(10);
		iLikeTrees.search(3);
		head = iLikeTrees.getRoot();
		iLikeTrees.printVertical();
		add(head);
		iLikeTrees.printVertical();

	}

	public static void add(Node<Integer> current) {
		current.setValue(current.getValue() + 2);
		if (current.getLeft() != null) {
			add(current.getLeft());
		}
		if (current.getRight() != null) {
			add(current.getRight());
		}
	}

}
