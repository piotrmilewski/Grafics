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
	    
	    if (selection == 1){ //initiates an encounter with a monster	  	
		System.out.println("Wild monster appears. Initiate fighting sequence.\n");
		woo.spawn();
		woo.fight();
		if (!player.isAlive()){ //player is sent back to the map if he dies
		    System.out.print("\nReturning to map...");
		    return;
		}
	    }
	    else if (selection == 2){ //enter inventory
		while (true){
		    System.out.print(player.printInventory());
		    System.out.print("\nWhich item would you like to use? (Enter quit to leave inventory)");
		    System.out.print("\nSelection: ");
		    String item = Keyboard.readString().toLowerCase();
		    if (item.equals("quit")){ //leave inventory
			break;
		    }
		    if (player.hasItem(item)){ //checks if player has item before using it 
			player.useItem(item);
		    }
		    else{ //if item is not in player's inventory, returns this message
			System.out.print("\nYou don't have that item. Try visiting the shop!");
		    }
		}
	    }
	    else if (selection == 3){ //leave forest
		System.out.print("\nReturning to map...");
		return;
	    }
	    else{ //Accounts for when user input is invalid 
		System.out.print("\nThat isn't one of the choices...");
	    }
	}
    }//end forest()
}//end class Forest
    
