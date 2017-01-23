import java.lang.*;
import cs1.Keyboard;
public class Quest1{
    Woo woo = new Woo();
    Character player = Woo.getPlayer(); //takes player from Woo
    public boolean newQuest(){

	String prints;
	String selection;
	prints = "Welcome to the Caves of Anarchy. Here you will begin your first quest.\n\n";
	prints += "Are you sure you would like to continue? (yes) or (no)";
	System.out.println(prints);

	while (true){
	    System.out.print("\nSelection: ");
	    selection = Keyboard.readString();
	    selection = selection.toLowerCase();
	    
	    if (selection.toLowerCase().equals("yes")){ //confirms if you would like to start
		prints = "Alright, let's begin\n\n";
		System.out.println(prints);
		break;
	    }	
	    else if (selection.toLowerCase().equals("no")) {
		prints = "Returning to map...";
		System.out.println(prints);
		return true;
	    }
	    else{
		System.out.print("\nThat isn't an option. Yes or no?");
	    }
	}
	//begins story for quest	    
	prints = " Onwards we go!\n\n";
	System.out.println(prints);  
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
   
	prints = "Here, within the Caves of Anarchy, we will find Princess Peony.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
       	prints = "However, the Caves of Anarchy is a rather dangerous area, where many monsters hide.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
	prints = "To your left, watch out!\n\n";
	System.out.println(prints);	
	    	
	woo.spawn();
	woo.fight();
	if (!player.isAlive()){ //when dying, you return to map (will be used later on as well)
	    System.out.print("\nReturning to map...");
	    return true;
	}
	prints = "That was a rather close one, now wasn't it.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
    
	prints = "Watch out here, it's rather steep!\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
    
	prints = "Let's not die just yet haha.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
    
	prints = "Behind you!\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
    
	woo.spawn();
	woo.fight();
	if (!player.isAlive()){
	    System.out.print("\nReturning to map...");
	    return true;
	}
	prints = "Oh man, the amount of surprises we're finding today\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Let's try to avoid as many of these 'things' as possible\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Would you go down the left path or the right path?\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	prints = "Please enter 'left' or 'right'";
	System.out.println(prints);

	while (true){ //chooses path
	    System.out.print("\nSelection: ");
	    selection = Keyboard.readString();
	    selection = selection.toLowerCase();
	    if (selection.equals("left")){
		prints = "Oh no there's a bunch of monsters ahead of us!\n\n";
		System.out.println(prints);
		woo.spawn();
		woo.fight();
		if (!player.isAlive()){
		    System.out.print("\nReturning to map...");
		    return true;
		}
		woo.spawn();
		woo.fight();
		if (!player.isAlive()){
		    System.out.print("\nReturning to map...");
		    return true;
		}
		woo.spawn();
		woo.fight();
		if (!player.isAlive()){
		    System.out.print("\nReturning to map...");
		    return true;
		}
		try {
		    // thread to sleep for 2 second
		    Thread.sleep(2000);
		} catch (InterruptedException e) {}
		prints = "Phew that wasn't fun now was it\n\n";
		System.out.println(prints);
		break;
	    }
	    else if (selection.equals("right")){
		prints = "Dang theres one monster ahead\n\n";
		System.out.println(prints);
		try {
		    // thread to sleep for 2 second
		    Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		prints = "Let's do this quickly and efficiently\n\n";
		System.out.println(prints);
		try {
		    // thread to sleep for 2 second
		    Thread.sleep(2000);
		} catch (InterruptedException e) {}
		woo.spawn();
		woo.fight();
		if (!player.isAlive()){
		    System.out.print("\nReturning to map...");
		    return true;
		}
		try {
		    // thread to sleep for 2 second
		    Thread.sleep(2000);
		} catch (InterruptedException e) {}
		prints = "Alright, not bad\n\n";
		System.out.println(prints);
		break;
	    }
	    else{ //in case player chooses something not available to them
		System.out.print("\nOh come on, man. Left or right?");
	    }
	}
	
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "I think I see the princess ahead!\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Mysterious voice: Not so fast.\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
		
	prints = "Who is that!?\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Mysterious voice: My name is Giovanni.\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Giovanni: I believe you're looking for the princess, yes?\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Giovanni: Well, sorry to tell you this but she's not here.\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Giovanni: But if you want to get out here alive, you're going to have to defeat me.\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Welp, guess we gotta do what we gotta do\n\n";
	System.out.println(prints);

        woo.spawnBoss(1); //creates one boss
	woo.fight(); //fights boss
	if (!player.isAlive()){
	    System.out.print("\nYou have lost to the boss. Returning to map...");
	    return true;
	}
	
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
	prints = "Giovanni: You win this time.\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Giovanni: There will be more...\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "*Giovanni vanishes*\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "We've been fooled!\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	
	prints = "We better go tell the king the bad news...\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
	return false;    //false so you may talk to king  
    }
}
