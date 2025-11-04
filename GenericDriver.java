import java.util.List;

public class ObjectDriver
{
	public static void main(String[] args)
	{
		ObjectMap stadiums = new ObjectMap();
		stadiums.put("Bridgeforth Stadium", 25000);
		stadiums.put("Michigan Stadium", 109901);
		stadiums.put("Lane Stadium", 66233);

		System.out.println("Bridgeforth Stadium: " + stadiums.get("Bridgeforth Stadium"));

		String largestStadium = largestStadium(stadiums);

		System.out.println(largestStadium + ": " + stadiums.get(largestStadium);
	}

	public static String largestStadium(ObjectMap stadiumsMap)
	{
		String largestStadiumName = null;

		int largestCapacity = 0;

		for(String stadiumName : stadiumsMap.keySet())
		{
			Object capacityObject = stadiumsMap.get(stadiumName);
			int capacity;

			if(cpacityObject instanceof String)
			{
				String capacityString = (String) capacityObject;
				capacityString = capacityString.replace(",", "");
				capacity = Integer.parseInt(capacityString);
			}
			else
			{
				capacity = (Integer) capacityObject;
			}

			if(largestStadiumName == null || capacity > largestCapacity)
			{
				largestStadiumName = capacity;
			}
		}
		return largestStadiumName;
	}
}


