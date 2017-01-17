import cs1.Keyboard;
public class Quest2 extends Maps{
     public  void newQuest(){
	String prints;
	String selection;
	prints = "Welcome to the Bathroom. Here you will begin your second quest.\n";
	prints += "Are you sure you would like to continue? (yes) or (no)";
	System.out.println(prints);
	selection = Keyboard.readString();
	if (selection.toLowerCase() == "yes"){		
	    prints = "eh heuid gow odher ubhoal eijfi ju (Press enter to continue)\n";
	    System.out.println(prints);  
	    selection = Keyboard.readString(); 
	    prints = "eh heuid gow odher ubhoal eijfi jn (Press enter to continue)\n";
	    System.out.println(prints);
	    selection = Keyboard.readString();
	    prints = "eh heuid gow odher ubhoal eijfi j(Press enter to continue)\n";
	    System.out.println(prints);
	    selection = Keyboard.readString();
	    prints ="eh heuid gow odher ubhoal eijfi j\n";
	    System.out.println(prints);		
	    spawn();
	    fight();
	    prints = "eh heuid gow odher ubhoal eijfi j (Press enter to continue)\n";
	    System.out.println(prints);
	    selection = Keyboard.readString();
	    prints += "eh heuid gow odher ubhoal eijfi j\n";
	    System.out.println(prints);
	    spawn();
	    fight();      
	}
    
	else{
	    prints = "Returning to castle";
	    System.out.println(prints);
	    break;
	}
    
    }
}
