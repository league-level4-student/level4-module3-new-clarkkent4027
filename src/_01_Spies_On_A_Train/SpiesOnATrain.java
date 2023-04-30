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
		HashMap<String, Integer> data = new HashMap<String, Integer>();
		Node<TrainCar> node = train.getTail();
		String sus = "";
		while (node.getPrev() != null) {
			String words[] = node.getValue().questionPassenger().split(" ");
			System.out.println(node.getValue().questionPassenger());
			sus = words[13];
			System.out.println(words[13]);
			if (data.get(sus) != null) {
				data.replace(sus, data.get(sus), data.get(sus) + 1);
			} else {
				data.put(sus, 1);
			}

			node = node.getPrev();
			for (Integer i : data.values()) {
				System.out.println(i);
			}
		}
		for (String s : data.keySet()) {
			System.out.println(s);
			if (data.get(s).equals(3)) {
				return s;
			}

		}

		return "";

	}
}
