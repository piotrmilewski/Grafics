import cs1.Keyboard;
public class Forest {
    Woo woo = new Woo();
    public void forest(){
	String prints;
	int selection;
	Character player = Woo.getPlayer();
	System.out.print("Welcome to the forest!");

	while (true){
	    prints = "\nWhat would you like to do? 1: Onwards! 2: Use an item! 3: Leave!";
	    prints += "\nSelection: ";
	    System.out.print(prints);
	    selection = Keyboard.readInt();
	    
	    if (selection == 1){	  	
		woo.spawn();
		woo.fight();
		if (!player.isAlive()){
		    System.out.print("\nReturning to map...");
		    return;
		}
	    }
	    else if (selection == 2){
		System.out.print(player.printInventory());
		System.out.print("\nWhich item would you like to use?");
		String item = Keyboard.readString().toLowerCase();
		if (player.hasItem(item)){
		    player.useItem(item);
		}
		else{
		    System.out.print("\nYou don't have that item. Try visiting the shop!");
		}
	    }
	    else if (selection == 3){
		System.out.print("\nReturning to map...");
		return;
	    }
	    else{
		System.out.print("\nThat isn't one of the choices...");
	    }
	}
    }//end forest()
}//end class Forest
    
