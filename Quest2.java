import java.lang.*;
import cs1.Keyboard;
public class Quest2{
    Woo woo = new Woo();
    public boolean newQuest(){

	String prints;
	String selection;
	prints = "Quest 2 boys. Welcome to Yard of Sirbow.\n\n";
	prints += "Are you sure you would like to continue? (yes) or (no)";
	System.out.println(prints);
	selection = Keyboard.readString();

	if (selection.toLowerCase().equals("")){
	    prints = "Alright, let's begin\n\n";
	    System.out.println(prints);
	}	
	else if(selection.toLowerCase().equals("no")) {
	    prints = "Returning to map...";
	    System.out.println(prints);
	    return true;
	}
	    
	prints = " Onwards we go!\n\n";
	System.out.println(prints);  
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
   
	prints = "Let's hope we'll finally find her this time.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
	
       	prints = "All this running around is making me kidna hungry.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

	prints = "Gosh, how many paths are there\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

	prints = "Would you like to head east or west?";
	prints += "Please enter 'east' or 'west'";
	System.out.println(prints);

	selection = Keyboard.readString();
	if (selection.equals("east")){
	    prints = "Oh bless, its a clear path\n\n";
	    System.out.println(prints);
	}
	else{
	    prints = "WE HAVE BEEN SPOTTED\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();

	    prints = "Guess luck isn't in our favor\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}

	    prints = "I hope you brought enough potions";
	    System.out.println(prints);	    
	}
				
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
	
	prints = "Geez how much did Sirbow spend on this yard. It's huge.\n\n";
	System.out.println(prints);

	try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}


	prints = "Hey, I think I see a shortcut!. Should we take it?\n\n";
	System.out.println(prints);
	prints = "Enter 'yes or 'no'";
	System.out.println(prints);
	selection = Keyboard.readString();
	if (selection.equals("yes")){
	    try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}
	    prints = "NOT A SHORTCUT. NOT A SHORTCUT.\n\n";
	    System.out.println(prints);
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	}
	else{
	    prints = "I'm not a big fan of shortcuts either :)";
	    System.out.println(prints);
	    try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}

	    prints = "Welp, I see a hooligan ahead";
	    System.out.println(prints);
	    woo.spawn();
	    woo.fight();
	}
	       	    	    	
	prints = "I see the prison ahead!\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	prints = "The princess should be in there!\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	prints = "*You trip*\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	prints = "Oh no, minions!\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	woo.spawn();
	woo.fight();
	woo.spawn();
	woo.fight();
	woo.spawn();
	woo.fight();

	prints = "LETS GO. LETS GO.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

	prints = "THEY'RE CATCHING UP\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

	prints = "Would you go down the left path or the right path?\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
	prints = "Please enter 'left' or 'right'";
	System.out.println(prints);
	selection = Keyboard.readString();
	if (selection.equals("left")){
	    prints = "Okay I think we lost most of them.\n\n";
	    System.out.println(prints);

	    	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

		prints = "Lets handle these two and move along";
		System.out.println(prints);

	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();    
	    try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}
	    prints = "Alright time is money, time is money.\n\n";
	    System.out.println(prints);
	}
	
	else if (selection.equals("right")){
	    prints = "Okay we lost them.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}    
	}

	prints = "Is that the princess ahead!?\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
	return false;      
    }
}
