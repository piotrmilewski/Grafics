import cs1.Keyboard;
public class Forest {
    Woo woo = new Woo();
    public void forest(){
	String prints;
	int selection;
	prints = "Welcome to the forest! Sometimes I come here to relax 'cause it's beautiful here.";
	prints += "\nWould you like to enter? Yes(1) No(2)";
	System.out.println(prints);
	selection = Keyboard.readInt();
	if (selection == 1){	  	
	    while (Woo.getPlayer().isAlive()){
		woo.spawn();
		woo.fight();
		prints = "Would you like to continue? Yes(1) No(2)";
		System.out.println(prints);
		selection = Keyboard.readInt();
		if (selection == 2){
		    break;
		}
	    }    
	}
    }//end forest()
}
    
