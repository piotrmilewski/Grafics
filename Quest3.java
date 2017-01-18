import cs1.Keyboard;
public class Quest3 extends Maps{
    public boolean void newQuest(){
	String prints;
	String selection;
	prints = "Welcome to the Chicken. Here you will begin your third quest.\n";
	prints += "Are you sure you would like to continue? (yes) or (no)";
	System.out.println(prints);
	selection = Keyboard.readString();
	if (selection.toLowerCase() == "yes"){
	    prints = "eh heuid gow odher ubhoal eijfi jn  (Press enter to continue)\n";
	    System.out.println(prints);  
	    selection = Keyboard.readString(); 
	    prints = "eh heuid gow odher ubhoal eijfi jn  (Press enter to continue)\n";
	    System.out.println(prints);
	    selection = Keyboard.readString();
	    prints = "eh heuid gow odher ubhoal eijfi jn (Press enter to continue)\n";
	    System.out.println(prints);
	    selection = Keyboard.readString();
	    prints = "To your left, watch out!\n";
	    System.out.println(prints);
	    spawn();
	    fight();
	    prints = "eh heuid gow odher ubhoal eijfi jn  (Press enter to continue)\n";
	    System.out.println(prints);
	    selection = Keyboard.readString();
	    prints += "eh heuid gow odher ubhoal eijfi jn \n";
	    System.out.println(prints);
	    spawn();
	    fight();
	    return false;
	}
    
	else{
	    prints = "Returning to map...";
	    System.out.println(prints);
	    break;
	}
    
    }
