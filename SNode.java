class Node
{
	int data;
	Node next;
}

class Test
{
	public static void main(String[] args)
	{
	 Node f=new Node();
	 Node s=new Node();
	 Node t=new Node();
	 f.data=10;
	 f.next=s;
	 s.data=20;
	 s.next=t;
	 t.data=30;
	 t.next=null;
	 Node ptr=f;
	 while(ptr!=null)
	 {
	   System.out.println(ptr.data);//10
	   ptr=ptr.next;
	 }

	}
  }


