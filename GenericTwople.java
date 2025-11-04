public class GenericTwople<T1, T2>
{
	private final T1 first;
	private final T2 second;

	public GenericTwople(T1 first, T2 second)
	{
		this.first = first;
		this.second = second;
	}

	public T1 getFirst()
	{
		return first;
	}

	public T2 getSecond()
	{
		return second;
	}

	public String toString()
	{
		String firstStr = (first == null) ? "null" : first.toString();
		String secondStr = (second == null) ? "null" : second.toString();
		return "<" + firstStr + ", " + secondStr + ">";
	}
}
