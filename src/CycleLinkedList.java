    class CycleLinkedNode<T>
    {
	private T data;
	private CycleLinkedNode<T> next;
	
	public CycleLinkedNode(T data, CycleLinkedNode<T> next)
	{
		this.data = data;
		this.next = next;
	}
	
	public CycleLinkedNode(T data)
	{
		this(data, null);
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public void setNext(CycleLinkedNode<T> next)
	{
		this.next = next;
	}
	
	public T getData()
	{
		return data;
	}
	
	public CycleLinkedNode<T> getNext()
	{
		return next;
	}
}
public class CycleLinkedList<T> implements List<T>{
    private CycleLinkedNode<T> start;
	private CycleLinkedNode<T> end;
	private int size;	
	
	public CycleLinkedList()
	{
		clear();
	}
		
	public void add(T element) {
        if(isEmpty()){
            start = new CycleLinkedNode<T>(element);
            end = start;
        }else {
            end.setNext(new CycleLinkedNode<T>(element));
            end = end.getNext();
            end.setNext(start);
        }
        size++;
	}

	public void insertAt(int index, T element) {
        if(index > size() || index < 0) throw new IndexOutOfBoundsException();

        CycleLinkedNode<T> currentNode = start;
		CycleLinkedNode<T> previousNode = null;

        while(index > 0){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            index--;
        }

        if(previousNode != null){
            previousNode.setNext(new CycleLinkedNode<T>(element, currentNode));
        }else{
            start = new CycleLinkedNode<T>(element, start);
        }
        size++;

	}

	public T get(int index) 
	{
        index = index % size();

        if(index < 0) index = index + size();
        
        CycleLinkedNode<T> oldStart = start;

		while(index > 0)
		{
			oldStart = oldStart.getNext();
			index --;
		}

		return oldStart.getData();
	}

	public void clear() 
	{
        start = end = null;
        size = 0;   
	}

	public boolean isEmpty() 
	{
        return start == null;
	}

	public int size() 
	{
		return size;
	}

}
