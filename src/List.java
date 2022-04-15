public interface List<T> 
{
	void add(T element);
	void insertAt(int index, T element);
	void clear();
	T get(int index);
	boolean isEmpty();

	int size(); 
}
