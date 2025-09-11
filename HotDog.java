public class HotDog {
  
  // write a program that can list hot dog toppings and
  //  add the prices to be displayed alongside that
  //
  // steps:
  //      define the name and cost of each topping
  //      create a string (name) and int (price) for each
  //       possible dog using loops
  //      format the results as shown in the program
  //       output template
  //
  // topping names + prices:
  //      Dog in Bun, $0.99
  //      Ketchup, $0.15
  //      Mustard, $0.17
  //      Chopped Onions, $0.20
  //      Tomato Wedge, $0.25
  //      Sweet Relish, $0.30
  //      Sport Peppers, $0.35
  //      Sauerkraut, $0.45
  
  public long printMenu( ) {
    
    // each combo is represented by a binary string
    // one char for each possible topping, ex 1101000 is a
    //  hot dog with ketchup, mustard, and tomato
    // this formula prevents duplicates

    int countMax = 128;
    String name = "", combo;
    double price = 0;

    for ( int i = 0; i < countMax; i++ ) {
      
      combo = String.format( "%7s", Integer.toBinaryString(i) ).replace( ' ' , '0' );
      price = 99;
      
      // add with if any toppings present
      if ( combo.contains( "1" ) ) {                                
        name = "with";
      }
      // check for toppings
      if ( combo.charAt( 6 ) == '1' ) {
        name += " Ketchup,";
        price += 15;
      }
      if ( combo.charAt( 5 ) == '1' ) {
        name += " Mustard,";
        price += 17;
      }
      if ( combo.charAt( 4 ) == '1' ) {
        name += " Chopped Onions,";
        price += 20;
      }
      if ( combo.charAt( 3 ) == '1' ) {
        name += " Tomato Wedge,";
        price += 25;
      }
      if ( combo.charAt( 2 ) == '1' ) {
        name += " Sweet Relish,";
        price += 30;
      }
      if ( combo.charAt( 1 ) == '1' ) {
        name += " Sport Peppers,";
        price += 35;
      }
      if ( combo.charAt( 0 ) == '1' ) {
        name += " Sauerkraut,";
        price += 45;
      }

      // delete the last comma
      if ( combo.contains( "1" ) ) {
        name = name.substring( 0, name.length() - 1 );
      }

      // display the results
      // System.out.println( ( i + 1 ) + " Dog in Bun " + name + " $" + ( price / 100 ) );
      System.out.printf( "%3d Dog in Bun %-100s $%.2f%n", ( i + 1 ), name, ( price / 100 ) );

    }

    return Long.valueOf( countMax );

  }

  public static void main( String[] args ) {

    HotDog obj = new HotDog( );
    long count = obj.printMenu( );
    assert count == 24;

  }
}
