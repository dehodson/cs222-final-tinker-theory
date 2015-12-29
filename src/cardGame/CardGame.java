package cardGame;


public class CardGame {

	public static void main(String[] args) {
		
		//initialize the library and combat systems before we run the GUI.
		Library.initialize();
		
		Combat.initialize();
		
		Gui.openGUI();
		
	}
}