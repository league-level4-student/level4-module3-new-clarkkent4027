package _04_Morse_Code;

import java.util.Scanner;

import _03_Intro_to_Binary_Trees.BinaryTree;
import _03_Intro_to_Binary_Trees.Node;

public class MorseDecoder {

	static BinaryTree<MorseCode> mcTree = new BinaryTree<MorseCode>();	
	static Node<MorseCode> current = mcTree.getRoot();

	public static void main(String[] args) {

		MorseDecoder md = new MorseDecoder();
		md.initialize();
		md.decode();

		Scanner scammer = new Scanner(System.in);
		System.out.println("Hello friend, please type your message in morse code and I will decode it for you.");
		String code = scammer.nextLine();
		String[] letter = code.split(" ");
		for (int i = 0; i < letter.length; i++) {
			if (letter[i].equals("1")) {
				System.out.print(" ");
				i = i + 1;
			}
			String splits = letter[i];
			System.out.print(findLetter(splits, mcTree.getRoot()));
		}

	}

	public void initialize() {

		mcTree.insert(new MorseCode("start", ""));
		mcTree.insert(new MorseCode("e", "."));
		mcTree.insert(new MorseCode("t", "-"));

		mcTree.insert(new MorseCode("i", ".."));
		mcTree.insert(new MorseCode("a", ".-"));
		mcTree.insert(new MorseCode("n", "-."));
		mcTree.insert(new MorseCode("m", "--"));

		mcTree.insert(new MorseCode("s", "..."));
		mcTree.insert(new MorseCode("u", "..-"));
		mcTree.insert(new MorseCode("r", ".-."));
		mcTree.insert(new MorseCode("w", ".--"));
		mcTree.insert(new MorseCode("d", "-.."));
		mcTree.insert(new MorseCode("k", "-.-"));
		mcTree.insert(new MorseCode("g", "--."));
		mcTree.insert(new MorseCode("o", "---"));

		mcTree.insert(new MorseCode("h", "...."));
		mcTree.insert(new MorseCode("v", "...-"));
		mcTree.insert(new MorseCode("f", "..-."));
		mcTree.insert(new MorseCode("l", ".-.."));
		mcTree.insert(new MorseCode("p", ".--."));
		mcTree.insert(new MorseCode("j", ".---"));
		mcTree.insert(new MorseCode("b", "-..."));
		mcTree.insert(new MorseCode("x", "-..-"));
		mcTree.insert(new MorseCode("c", "-.-."));
		mcTree.insert(new MorseCode("y", "-.--"));
		mcTree.insert(new MorseCode("z", "--.."));
		mcTree.insert(new MorseCode("q", "--.-"));

		mcTree.printVertical();

	}

	/*
	 * 1.) See if you can decode the following message using the binary tree and
	 * print it to the console:
	 * 
	 * -.-- --- ..- .- .-. . .- -- .- --.. .. -. --. y o u a r e a m a z i n g ! 2.)
	 * Then use the binary tree and the scanner class to create a morse code
	 * translator. The user should be able to type multiple letters in morse code on
	 * a single line and have it repeated back to them, decoded into the english
	 * alphabet.
	 * 
	 */
	void decode() {

		String morseCode = "-.-- --- ..- .- .-. . .- -- .- --.. .. -. --.";
	}

	static String findLetter(String splits, Node<MorseCode> current) {
		if (splits.length() == 0) {
			return current.getValue().getDecoded();
		} else if (splits.charAt(0) == '.') {
			return findLetter(splits.substring(1), current.getLeft());

		}
		return findLetter(splits.substring(1), current.getRight());

	}

}
