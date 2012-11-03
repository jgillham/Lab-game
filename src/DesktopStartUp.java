
/**
 * Launches the game.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public class DesktopStartUp {
	//String a="y";
	/**
     * Initializes the game and launches the UI.
     */
	
    static public void main( String[] args ) {
    	//args[0]="n";
    	System.out.println("Start the  game...are you ready? y Or n");
    	//if (DesktopStartUpTest(args[0]))
    	if (DesktopStartUpTest(args[0]))

    	{
    		 System.out.println("Go!!!");
    		}
    	
    
        throw new UnsupportedOperationException();
    }

	private static boolean DesktopStartUpTest(String string) {
		// TODO Auto-generated method stub
		string.compareTo("y");
			{
			   return true;
			}
	}
}
