import cs1.Keyboard;
public class Quest1 extends Maps{
    Woo woo = new Woo();
    public boolean newQuest(){

	String prints;
	String selection;
	prints = "Welcome to the Caves of Anarachy. Here you will begin your first quest.\n";
	prints += "Are you sure you would like to continue? (yes) or (no)";
	System.out.println(prints);
	selection = Keyboard.readString();

	if (selection.toLowerCase().equals("yes")){
	    prints = "Alright, let's begin";
	    System.out.println(prints);
	}	
	else if(selection.toLowerCase().equals("no")) {
	    prints = "Returning to map...";
	    System.out.println(prints);
	    return true;
	}

	    /*
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
	    */	
	    woo.spawn();
	    woo.fight();
	    prints = "That was a rather close one, now wasn't it (Press enter to continue)\n";
	    System.out.println(prints);
	    selection = Keyboard.readString();
	    prints += "Oh no another one!\n";
	    System.out.println(prints);
	    spawn();
	    fight();
	    return false;
      
   
    }
}


	   
	    
   
	    
	   
