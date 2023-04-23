package _00_Intro_to_Linked_Lists;

public class myFirstLinkedList<T> {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Sarge");
		list.add("Woody");
		list.add("Bo Peep");
		list.add("Hamm");
		list.add("Buzz");
		list.add("Trixie");
		list.add("Dolly");
		list.add("Slinky");
		list.add("Bunny");
		list.add("Rex");
		list.add("Wheezy");
		list.add("Ducky");
		list.add("Jessie");
		list.add("Mr. Potato Head");
		list.add("Mrs. Potato Head");
		list.add("Forky");
		list.add("Bullseye");
		list.remove(2);
		System.out.println(list.size());
		Node<String> node;
		node = new Node<String>(null);
		node = list.getHead();
		Node <String> current = list.getTail();
		while (current.getPrev()!=null) {
		current.setValue(current.toString().toUpperCase());	
			current = current.getPrev();
			System.out.println(current.getValue());
		}
		

	}

}
