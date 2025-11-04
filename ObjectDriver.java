import java.util.List;

/**
 * Test driver for the ObjectPair class.
 */
public class ObjectDriver {

   /**
    * Create several stadium associations,
    * then print the name of the stadium
    * with the largest capacity.
    *
    * @param args Not used.
    */
   public static void main(String[] args) {

      ObjectMap stadiums = new ObjectMap();
      stadiums.put("Bridgeforth Stadium", 25000);
      stadiums.put("Michigan Stadium", 109901);
      stadiums.put("Lane Stadium", "66,233");

      System.out.println("Bridgeforth Stadium: " +
           stadiums.get( "Bridgeforth Stadium" ));

      String largestStadium = largestStadium( stadiums );
      System.out.println(largestStadium + ": " +
           stadiums.get( largestStadium ));
   }

   /**
    * Returns the name of the stadium with the largest capacity.
    *
    * @param stadiumsMap A map of ObjectTwoples where each Twople
    *                    contains a stadium name followed by an
    *                    integer capacity
    * @return The name of the stadium with the largest capacity
    */
   public static String largestStadium( ObjectMap stadiumsMap ) {

      String largestName = null;
      int maxCapacity = -1;

      for( Object key : stadiumsMap.keySet() ) {
	      String currentName = (String) key;

	Object capacityObject = stadiumsMap.get( currentName );
	int currentCapacity = -1;

	try{
		if(capacityObject instanceof Integer ) {
			currentCapacity = (Integer) capacityObject;

		} else if(capacityObject instanceof String) {
			String capacityString = (String) capacityObject;

			
   
   capacityString = capacityString.replace(",","");
   currentCapacity = Integer.parseInt(capacityString);
		}
	}catch 
	(NumberFormatException e ) {
		System.err.println("Warning: Invalid capacity string for " + currentName);
	       currentCapacity = -1;
	}
if( currentCapacity > maxCapacity) {
maxCapacity = currentCapacity;
largestName = currentName;
}
      } return largestName != null ? largestName : "No stadium with valid capacity found";


}
}
