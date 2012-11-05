
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
	//new DesktopStartUpTest();
    static public void main( String[] args ) {
    	System.out.println("Start the  game...are you ready? y Or n");
    	DesktopStartUpTest q=new DesktopStartUpTest();
    	if (!(q.testMain("y"))) {
    							System.out.println("Exit game..");
    							}
        //throw new UnsupportedOperationException();
    }


}
