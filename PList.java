package LifestyleChange;

public class PList {
	
	People dummy;
	PNode head = new PNode(dummy,null);
	PNode previous = head;
	
	public PList()
	{
		head.next = head;
	}
	
	public boolean isEmpty()
	{
		if(head.next == head)
			return true;
		return false;
	}
	
	public People Search(String target)
	{
		while(previous.next != null || previous.next.ppl.getUsername() != target)
		{
			previous.next= previous.next.next;
		}
		return previous.next.ppl;
	}
	
	public void insertAfter(People ppl)
	{
		previous = previous.next;
		previous.next = new PNode(ppl, previous.next);
	}

}
