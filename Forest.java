import cs1.Keyboard;
public class Forest {
    Woo woo = new Woo();
    public void forest(){
	String prints;
	int selection;
	Character player = Woo.getPlayer();
	prints = "Welcome to the forest! Sometimes I come here to relax 'cause it's beautiful here.";
	prints += "\nWould you like to enter? 1: Yes 2: No";
	System.out.println(prints);
	selection = Keyboard.readInt();
	if (selection == 1){	  	
	    while (Woo.getPlayer().isAlive()){
		woo.spawn();
		woo.fight();
		prints = "What would you like to do? 1: Keep going! 2: Leave! 3: Use an item!";
		System.out.println(prints);
		selection = Keyboard.readInt();
		if (selection == 2){
		    break;
		}
		else if (selection == 3){
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
	    }
	}
	else if (selection == 2){
	    return;
	}
	else{
	    System.out.print("That isn't one of the choices...\n");
	    System.out.print(prints);
	    selection = Keyboard.readInt();
	}
    }//end forest()
}
    
