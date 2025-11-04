import java.util.ArrayList;
import java.util.List;

public class ObjectMap<K, V> implements MapInterface<K, V>
{
	private ArrayList<Twople<K, V>> pairs = new ArrayList<>();

	public void put(K key, V value)
	{
		Twople<K, V> kvp = find(key);
		if(kvp != null)
		{
			pairs.remove(kvp);
		}
		pairs.add(new Twople<>(key, value));
	}

	public V get(K key)
	{
		Twople<K, V> kvp = find(key);
		if(kvp != null)
		{
			return kvp.getSecond();
		}
		return null;
	}

	private Twople<K, V> find(K key)
	{
		for(Twople<K, V> kvp : pairs)
		{
			if(kvp.getFirst().equals(key))
			{
				return kvp;
			}
		}
		return null
	}

	public V remove(K key)
	{
		Twople<K, V> kvp = find(key);
		if(kvp != null)
		{
			pairs.remove(kvp);
			return kvp.getSecond();
		}
		return null;
	}
	public int size()
	{
		return pairs.size();
	}
	public boolean isEmpty()
	{
		return size() == 0;
	}

	public List<K> keySet()
	{
		ArrayList<K> keys = new ArrayList<>(1);
		for(Twople<K, V> kvp : pairs)
		{
			keys.add(kvp.getFirst());
		}
		return keys;
	}
}
