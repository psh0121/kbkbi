
public class Main {
	
	// 마지막 노드를 get하는 함수
	public static Node getLastNode(Node head)
	{
		Node lastNode = head;
		
		while(lastNode.getNext() != null)
		{
			lastNode = lastNode.getNext();
		}
		
		return lastNode;
	}
	
	// 노드를 추가하는 함수 
	public static void InsertNode(Node head, Node newNode)
	{
		Node lastNode = null;
		
		// 1. 마지막 노드를 찾는다.
		lastNode = getLastNode(head);
		
		// 2. 마지막 노드의 next에 새로운 노드를 저장한다. 
		lastNode.setNext(newNode);
	}
	
	// 노드개수를 구하는 함수 
	public static int getNodeCount(Node head)
	{
		Node temp = head;
		int count = 1;
		
		while(temp.getNext() != null)
		{
			temp = temp.getNext();
			count++;
		}
		
		return count;
	}
	
	// 노드를 삭제하는 함수 --> 0번 노드는 안지우는 함수 
	// index : 지울 대상의 인덱스
	public static boolean DeleteNode(Node head, int index)
	{
		int count;
		Node target = head;		// 지울대상 노드 
		Node before = null;		// target의 이전노드 
		
		count = getNodeCount(head);
		
		if((index >= count) || (index <= 0))
		{
			return false;
		}
		
		for(int i = 0; i < index; i++)
		{
			before = target;
			target = target.getNext();
		}
		
		if(before == null)
		{
			return false;
		}
		
		else
		{
			before.setNext(before.getNext());
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Node head = new Node(0, null);		// intValue, strValue
		
		for(int i = 0; i < 10; i++)
		{
			InsertNode(head, new Node(i+1, null));
		}
		
		DeleteNode(head, 3);

	}

}
