import cs1.Keyboard;
public class Quest3{
    Woo woo = new Woo();
    public boolean newQuest(){

	String prints;
	String selection;
	prints = "Welcome to the Quest 3.\n";
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

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
   
	prints = "Well, back at it again. Third time's the charm, am I right?\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
       	prints = "Oh yeah. I probably don't have to tell you this, but castle is full of his goons.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
	prints = "Speaking of goons, there's one charging right at you!\n\n";
	System.out.println(prints);	
	    	
	woo.spawn();
	woo.fight();
	
	prints = "Easy peasy lemon squeezy. You're a natural, kid.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
    
	prints = "Anyway, let's keep going.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
    
	prints = "Am I the only one that's really loving this castle? I know he's a villain and all, but he's got great taste in castles!\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
    
	prints = "Behind you!\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
    
	woo.spawn();
	woo.fight();

	prints = "Man, these guys just keep coming!\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "This castle's got millions of hallways. How does he know which is which...\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Should we take the left or the right?";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	prints = "Please enter 'left' or 'right'";
	System.out.println(prints);
	selection = Keyboard.readString();
	selection = selection.toLowerCase();
	if (selection.equals("left")){
	    prints = "Don't these guys have hobbies or something?!\n\n";
	    System.out.println(prints);
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    prints = "Let's hurry up. I can't miss the season finale of Lorule's Got Talent.\n\n";
	    System.out.println(prints);
	}
	else if (selection.equals("right")){
	    prints = "Oh hey, there's only one of them here. Lucky you.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}

	    prints = "Let's take him out real quick.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    woo.spawn();
	    woo.fight();
		
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    prints = "I think we have different definitions of 'real quick.'\n\n";
	    System.out.println(prints);
	}
	
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Well, here we are. The princess is in that room.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Mysterious voice: Stop right there.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Dude come on, it's been a long day.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Mysterious voice: My name is Sirbow.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
	prints = "Sirbow: I guess you can say I am in charge.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "In charge my...\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
	prints = "Sirbow: You defeat me and you'll get your precious princess back.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "For Lorule am I right?\n\n";
	System.out.println(prints);
	Monster monster = new Sirbow();
	woo.fight();

	prints = "Sirbow: *Cough* I suppose you win.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "*Sirbow walks into pit of fire*\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
	prints = "Princess Peony: Well good job. See you back in the castle.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Guess she really is braty.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	return false;
    }//end newQuest()
}//end class Quest3

