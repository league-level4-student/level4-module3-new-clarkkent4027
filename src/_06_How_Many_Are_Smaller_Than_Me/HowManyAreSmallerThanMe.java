package _06_How_Many_Are_Smaller_Than_Me;

import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanMe {

	/*
	 * Given an AVLTree filled with the random numbers from 1 to 20, and a single
	 * number within the AVL Tree, figure out how many numbers in the AVLTree are
	 * smaller than the provided number and return the result.
	 * 
	 * You may want to create a helper method to search through the AVLTree and
	 * count iteratively or recursively.
	 */
	int count;

	public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
		System.out.println(me);

		count = 0;
		AVLNode<Integer> node = new AVLNode<Integer>(null);
		node = avlTree.getRoot();
		if (node != null) {
			findSmaller(node, me);
		}
		System.out.println(count);
		return count;

	}

	public void findSmaller(AVLNode<Integer> node, int me) {
		if (node.getValue() < me) {
			count++;
			if (node.getLeft() != null) {
				findSmaller(node.getLeft(), me);
			}
			if (node.getRight() != null) {
				findSmaller(node.getRight(), me);
			}
		}

	}

}
