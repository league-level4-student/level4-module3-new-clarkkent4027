package _01_Spies_On_A_Train;

import java.util.HashMap;
import java.util.Iterator;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

	/*
	 * A spy has made off with important intel from your intelligence agency! You
	 * know the spy is somewhere on this train(LinkedList). Your job is to find the
	 * suspect that matches the description given to you by the list of clues(the
	 * array).
	 * 
	 * Walk through the train, questioning each of the passengers about what they
	 * have seen and return the name of the most likely suspect.
	 * 
	 * The results are randomly generated each time so you should have a general
	 * case solution that carefully compares the clues to each passenger's
	 * testimony. Remember to use String methods to break up the passengers'
	 * statements.
	 */
	String findIntel(LinkedList<TrainCar> train, String[] clues) {
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		Node<TrainCar> node = train.getTail();
		String maxfreq = "";
		while (node.getPrev() != node) {
			String words[] = node.getValue().questionPassenger().split(" ");
			System.out.println(node.getValue().questionPassenger());
			System.out.println(words[13]);
			for (int i = 0; i < words.length; i++) {
				data.put(i, words[13]);
			}
			node = node.getPrev();
			int maxcount = 0;
	
			for (int i = 0; i < data.size(); i++) {
				int count = 0;
				for (int j = 0; j < data.size(); j++) {
					if (data.get(i).equals(data.get(j))) {
						count = count +1;
					}
				}
				if (count > maxcount) {
					maxcount = count;			
					maxfreq = data.get(i);
					System.out.println("The current most frequent suspect is " + maxfreq);
				}
			}
		}
		return maxfreq;

	}

}
