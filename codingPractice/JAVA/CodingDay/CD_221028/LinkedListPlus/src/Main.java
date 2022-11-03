
public class Main {

	public static void main(String[] args) {
		ListContainer list = new ListContainer();
		
		list.insertNode(new Node(0, "0"));
		list.insertNode(new Node(1, "11"));
		list.insertNode(new Node(0, "22"));
		list.insertNode(new Node(1, "33"));
		list.insertNode(new Node(0, "44"));
		
		list.deleteNodeByIntValue(0);
		
		System.out.println(list.getNodeCount());

	}

}
