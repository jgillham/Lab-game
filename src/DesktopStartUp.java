
/**
 * Launches the game.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public class DesktopStartUp {
		/**
     * Initializes the game and launches the UI.
     */
    static public void main( String[] args ) {
    	System.out.println("Start the  game...are you ready? y Or n");
    	DesktopStartUpTest q=new DesktopStartUpTest();
    	if (q.testMain1(args[0])) {
    							System.out.println("Exit game..");
    							}
    	if (q.testMain2(args[0])) {
								System.out.println("Start game..");
								}
    	
    	
        //throw new UnsupportedOperationException();
    }


}
