
public class Node {
	private NodeData data;
	private Node next;
	
	///////////////////////////////////////////////////////////////
	// 생성자
	
	// 기본생성자 
	public Node()
	{
		data = new NodeData();		// null을 설정하는 건 의미가 없음.  
		next = null;
	}
	
	// 오버로딩된 생성자
	public Node(NodeData data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	
	public Node(int intValue, String strValue, Node next)
	{
		this.data = new NodeData(intValue, strValue);
		this.next = next;
	}
	
	public Node(int intValue, String strValue)
	{
		this.data = new NodeData(intValue, strValue);
	}
	
	///////////////////////////////////////////////////////////////
	// Getter, Setter
	
	public NodeData getData() {
		return data;
	}

	public void setData(NodeData data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
