
public class ListContainer {
	private Node head;
	
	// 노드 개수 구하는 메소드
	public int getNodeCount()
	{
		Node temp = head;
		int count = 1;
		
		if(head == null)
			return 0;
		
		while(temp.getNext() != null)
		{
			temp = temp.getNext();
			count++;
		}
		
		return count;
	}
	
	// 마지막 노드 구하는 메소드 
	public Node getLastNode()
	{
		Node lastNode = head;
		
		if(lastNode == null)
			return null;
		
		while(lastNode.getNext() != null)
			lastNode = lastNode.getNext();
		
		return lastNode;
	}
	
	// 노드를 추가하는 메소드 
	public void insertNode(Node newNode)
	{
		Node lastNode = null;
		
		if(this.head == null)
			head = newNode;
		
		else
		{
			// 마지막노드를 찾고 그 위치에 새로운 노드를 저장한다. 
			lastNode = getLastNode();
			lastNode.setNext(newNode);
		}
	}
	
	// 노드를 추가하는 메소드 ver2
	// insert index가 기존 카운트보다 큰 값일 경우 --> 노드의 가장 뒤에 
	// index가 0보다 작은 경우 처리하지 않는다. 
	public boolean insertNodeVer2(int index, Node newNode)
	{
		Node before = null;
		Node target = this.head;
		
		// index가 음수라면 --> false
		if(index < 0)
			return false;
		
		// index가 0일 경우 --> newNode의 next에 head 넣어주고 head에 newNode를 넣어준다.
		if(index == 0)
		{
			newNode.setNext(this.head);
			this.head = newNode;
			
			return true;
		}
		
		// 가장 끝에 추가하거나 그보다 더 큰값을 입력받았을 경우 --> insertNode메소드 사용 
		if(index >= getNodeCount())
		{
			insertNode(newNode);
			
			return true;
		}
		
		// 반복문 돌아가며 index를 찾고 값을 추가한다.
		for(int i = 0; i < index; i++)
		{
			before = target;
			target = target.getNext();
		}
		
		newNode.setNext(before.getNext());
		before.setNext(newNode);
		
		return true;
	}
	
	// 특정 int형 데이터값을 가진 노드 삭제
	public boolean deleteNodeByIntValue(int intValue)
	{
		Node before = null;
		Node target = head;
		
		while(target != null)
		{
			// target의 intValue와 같은 값을 가지고 있다면 
			if(target.getData().getIntValue() == intValue)
			{
				// target이 현재 head의 참조값과 일치한다면 --> head 재설정 
				if(target == head)
				{
					head = target.getNext();
					
					target = head;
					
					continue;
				}
				
				// 이전노드와의 연결 끊어버리고 이전노드의 next는 target의 next로 바꿔버리자. 
				else
				{
					before.setNext(target.getNext());
					target = target.getNext();
					
					continue;
				}
			}
			
			// 어느것도 해당되지 않는다면 다음 target을 확인하자
			before = target;
			target = target.getNext();
		}
		
		return true;
	}
	
	// 특정 인덱스위치에 있는 노드를 삭제하는 메소드 
	public boolean deleteNode(int index)
	{
		int count;
		Node before = null;
		Node target = this.head;
		
		count = getNodeCount();
		
		// 지정된 인덱스가 잘못 입력되었을 경우 --> false
		if((index >= count) || (index < 0))
			return false;
		
		// head를 삭제할 경우 --> head 재설정
		if(index == 0)
		{
			head = head.getNext();
			return true;
		}
		
		for(int i = 0; i < index; i++)
		{
			before = target;
			target = target.getNext();
		}
		
		if(before == null)
			return false;
		
		else
			before.setNext(target.getNext());
		
		return true;
	}
}
