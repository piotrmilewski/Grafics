import cs1.Keyboard;
public class Quest1 extends Maps{	    
    public boolean void newQuest(){
	String prints;
	String selection;
	prints = "Welcome to the Caves of Anarachy. Here you will begin your first quest.\n";
	prints += "Are you sure you would like to continue? (yes) or (no)";
	System.out.println(prints);
	selection = Keyboard.readString();
	if (selection.toLowerCase() == "yes"){		
	    prints = "As any brave fighter, a weapon must be needed (Press enter to continue)\n";
	    System.out.println(prints);  
	    selection = Keyboard.readString(); 
	    prints = "Here, within the Caves of Anarachy, you will be able to find your chosen weapon (Press enter to continue)\n";
	    System.out.println(prints);
	    selection = Keyboard.readString();
	    prints = "However, the Caves of Anarachy is a rather dangerous area, where many monsters hidden (Press enter to continue)\n";
	    System.out.println(prints);
	    selection = Keyboard.readString();
	    prints = "To your left, watch out!\n";
	    System.out.println(prints);		
	    spawn();
	    fight();
	    prints = "That was a rather close one, now wasn't it (Press enter to continue)\n";
	    System.out.println(prints);
	    selection = Keyboard.readString();
	    prints += "Oh no another one!\n";
	    System.out.println(prints);
	    spawn();
	    fight();
	    return false;
	}
    
	else{
	    prints = "Returning to castle";
	    System.out.println(prints);
	    break;
	}
    
    }
}
