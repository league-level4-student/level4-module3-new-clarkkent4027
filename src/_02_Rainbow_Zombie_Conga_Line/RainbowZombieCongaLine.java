package _02_Rainbow_Zombie_Conga_Line;

import java.util.Iterator;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class RainbowZombieCongaLine {

	/*
	 * You are hosting a rainbow zombie conga dance party! Zombies are not very
	 * smart(maybe that's why they crave brains) and need your help to direct them
	 * through the choreography.
	 * 
	 * Each method is a dance move you will need to implement.
	 * 
	 * When you think you've gotten your zombies trained well enough you can start
	 * the party by running the main method in RainbowZombieDanceParty and typing
	 * how many rounds you want in the console to see if they followed your
	 * choreography correctly.
	 * 
	 * Note: The party will always start with a rainbow brains and every 5 rounds
	 * the head and tail of the dance line will be removed.
	 */

	private LinkedList<Zombie> congaLine;
	private ZombieHatColor[] zombieHats;

	public RainbowZombieCongaLine() {

		congaLine = new LinkedList<Zombie>();
		zombieHats = ZombieHatColor.values();

	}

	// Make the passed in zombie the first Zombie in the conga line!
	public void engine(Zombie dancer) {
		congaLine.add(dancer);
		Node<Zombie> hed = new Node<Zombie>(dancer);
		congaLine.getHead().setPrev(hed);
	hed.setNext(congaLine.getHead());
	congaLine.setHead(hed);
	}

	// Make the passed in zombie the last Zombie in the conga line!
	public void caboose(Zombie dancer) {
		congaLine.add(dancer);
		Node<Zombie> tayl = new Node<Zombie>(dancer);
		tayl = congaLine.getTail();
	}

	// Place the zombie at the designated position in the conga line!
	public void jumpInTheLine(Zombie dancer, int position) {
		congaLine.add(dancer);
		Node<Zombie> current = congaLine.getHead();
		Node<Zombie> pos = new Node<Zombie>(dancer);
		int spot = 0;
		while (current != null) {
			if (position ==spot) {
			Node <Zombie> previous = current.getPrev();
	previous.setNext(pos);
	pos.setNext(current);
	current.setPrev(pos);
	pos.setPrev(previous);
			}
			spot = spot + 1;
			current = current.getNext();
		}
	}

		

			
		


		
	

	/*
	 * Remove all zombies with the same hat color as the passed in zombie from the
	 * conga line!
	 */
	public void everyoneOut(Zombie dancer) {
		Node<Zombie> current = congaLine.getHead();
		ZombieHatColor hatCuller = dancer.getZombieHatColor();
		int spot = 0;
		while (current != null) {
			if (hatCuller == current.getValue().getZombieHatColor()) {
				congaLine.remove(spot);

			}
			spot = spot + 1;
			current = current.getNext();
		}
	}

	/*
	 * Remove the first zombie with the same hat color as the passed in zombie from
	 * the conga line!
	 */
	public void youAreDone(Zombie dancer) {

		Node<Zombie> current = congaLine.getHead();
		ZombieHatColor hatCuller = dancer.getZombieHatColor();
		int spot = 0;
		while (current != null) {
			if (hatCuller == current.getValue().getZombieHatColor()) {
				congaLine.remove(spot);
				break;

			}
			spot = spot + 1;
			current = current.getNext();
		}
	}

	/*
	 * Make two more zombies with the same hat color as the passed in zombie and add
	 * one to the front, one to the end and one in the middle.
	 */
	public void brains(Zombie dancer) {
		Node<Zombie> head = new Node<Zombie>(dancer);
		head = congaLine.getHead();
		ZombieHatColor hatCuller = dancer.getZombieHatColor();

		congaLine.add(dancer);
		hatCuller = dancer.getZombieHatColor();
		Node<Zombie> tail = new Node<Zombie>(dancer);
		tail = congaLine.getTail();

		congaLine.add(dancer);
		hatCuller = dancer.getZombieHatColor();
		

	}

	/*
	 * Add the passed in zombie to the front and then add one zombie of each hat
	 * color to the end of the line.
	 */
	public void rainbowBrains(Zombie dancer) {
		Node<Zombie> head = new Node<Zombie>(dancer);
		head = congaLine.getHead();

Zombie zombieR = new Zombie(ZombieHatColor.R);
congaLine.add(zombieR);
Zombie zombieO = new Zombie(ZombieHatColor.O);
congaLine.add(zombieO);
Zombie zombieY = new Zombie(ZombieHatColor.Y);
congaLine.add(zombieY);
Zombie zombieG = new Zombie(ZombieHatColor.G);
congaLine.add(zombieG);
Zombie zombieB = new Zombie(ZombieHatColor.B);
congaLine.add(zombieB);
Zombie zombieI = new Zombie(ZombieHatColor.I);
congaLine.add(zombieI);
Zombie zombieV = new Zombie(ZombieHatColor.V);
congaLine.add(zombieV);
	}
	public LinkedList<Zombie> getCongaLine() {
		return congaLine;
	}
}
