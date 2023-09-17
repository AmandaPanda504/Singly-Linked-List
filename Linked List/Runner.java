public class Runner{


	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addElement(7);
		list.addElement(8);
		list.addElement(16);

		
		System.out.println(" ");
		list.show();

		list.addElementAtIndex(1,90);

		list.show();


		list.deleteNthElement(1);
		list.show();

		list.deleteLastElement();
		list.show();

		list.reverse();
		list.show();




		
	}
	
}