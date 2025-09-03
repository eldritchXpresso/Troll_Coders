public class Program2Test {
    public static void main(String[] args) {
        Program2 program2 = new Program2();
        if (program2.classifyTobaccoAsh("caked","dark",false,3).equals("Espanada")) {
            System.out.println("Espanada (caked,dark,false,3) test passed.");
        } else {
            System.out.println("Espanada (caked,dark,false,3) test failed.");
        }

        if (program2.classifyTobaccoAsh("flaky","pale",false,2).equals("Heritage")) {
            System.out.println("Heritage (flaky,pale,false,2) test passed.");
        } else {
            System.out.println("Heritage (flaky,pale,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("caked","dark",true,1).equals("Roman")) {
            System.out.println("Roman (caked,dark,true,1) test passed.");
        } else {
            System.out.println("Roman (caked,dark,true,1) test failed.");
        }

        if (program2.classifyTobaccoAsh("caked","brown",false,2).equals("UNKNOWN")) {
            System.out.println("Londoner (caked,brown,false,2) test successfully returned \"UNKNOWN\" due to multiple possible matches.");
        } else {
            System.out.println("Londoner (caked,brown,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("granular","gray",false,2).equals("Lunkah")) {
            System.out.println("Lunkah (granular,gray,false,2) test passed.");
        } else {
            System.out.println("Lunkah (granular,gray,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("flaky","gray",false,2).equals("MacDuffy")) {
            System.out.println("MacDuffy (granular,gray,false,2) test passed.");
        } else {
            System.out.println("MacDuffy (granular,gray,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("caked","brown",true,2).equals("Old Wood")) {
            System.out.println("Old Wood (caked,brown,true,2) test passed.");
        } else {
            System.out.println("Old Wood (caked,brown,true,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("caked","gray",false,2).equals("Top Hat")) {
            System.out.println("Top Hat (caked,gray,false,2) test passed.");
        } else {
            System.out.println("Top Hat (caked,gray,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("flaky","dark",false,2).equals("Trichinopoly")) {
            System.out.println("Trichinopoly (flaky,dark,false,2) test passed.");
        } else {
            System.out.println("Trichinopoly (flaky,dark,false,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("fluffy","pale",true,2).equals("West Country")) {
            System.out.println("West Country (fluffy,pale,true,2) test passed.");
        } else {
            System.out.println("West Country (fluffy,pale,true,2) test failed.");
        }

        if (program2.classifyTobaccoAsh("spongy","red",false,5).equals("INVALID_DATA")) {
            System.out.println("INVALID (spongy,red,false,5) test passed.");
        } else {
            System.out.println("INVALID (spongy,red,false,5) test failed.");
        }

    }
}
