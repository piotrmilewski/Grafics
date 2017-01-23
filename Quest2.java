import java.lang.*;
import cs1.Keyboard;
public class Quest2{
    Woo woo = new Woo();
    Character player = woo.getPlayer();
    
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
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Let's hope we'll finally find her this time.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	
       	prints = "All this running around is making me kidna hungry.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}


	prints = "Gosh, how many paths are there\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
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
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}

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

	    prints = "Guess luck isn't in our favor\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}

	    prints = "I hope you brought enough potions";
	    System.out.println(prints);	    
	}
	
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	
	prints = "Geez, how much did Sirbow spend on this yard. It's huge.\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}


	prints = "Hey, I think I see a shortcut!. Should we take it?\n\n";
	System.out.println(prints);
	prints = "Enter 'yes or 'no'";
	System.out.println(prints);
	System.out.print("\nSelection: ");
	selection = Keyboard.readString();
	selection = selection.toLowerCase();
	    
	if (selection.equals("yes")){
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}

	    prints = "NOT A SHORTCUT. NOT A SHORTCUT.\n\n";
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
	}
	else if (selection.equals("no")){
	    prints = "I'm not a big fan of shortcuts either :)";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}

	    prints = "Hey, I see a hooligan ahead";
	    System.out.println(prints);
	    woo.spawn();
	    woo.fight();
	    if (!player.isAlive()){
		System.out.print("\nReturning to map...");
		return true;
	    }
	}
	else{
	    System.out.print("\nI don't know about you, but I'm trying to save a princess here. Yes or no?\n");
	    System.out.print("\nSelection: ");
	    selection = Keyboard.readString();
	    selection = selection.toLowerCase();
	}
	       	    	    	
	prints = "I see the prison ahead!\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

    
	prints = "The princess should be in there!\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

    
	prints = "*You trip*\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

    
	prints = "Oh no, minions!\n\n";
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

	prints = "LETS GO. LETS GO.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}


	prints = "THEY'RE CATCHING UP\n\n";
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
	selection = Keyboard.readString();
	selection = selection.toLowerCase();

	while (true){
	    if (selection.equals("left")){
		prints = "Okay I think we lost most of them.\n\n";
		System.out.println(prints);
		try {
		    // thread to sleep for 2 second
		    Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		
		prints = "Lets handle these two and move along";
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
		
		try {
		    // thread to sleep for 2 second
		Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		prints = "Alright time is money, time is money.\n\n";
		System.out.println(prints);
		break;
	    }
	    
	    else if (selection.equals("right")){
		prints = "Okay we lost them.\n\n";
		System.out.println(prints);
		break;
	    }
	    
	    else{
		System.out.print("\nThere are only two directions!Left or right?");
		System.out.print("\nSelection: ");
		selection = Keyboard.readString();
		selection = selection.toLowerCase();
	    }
	}

	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	prints = "Is that the princess ahead!?\n\n";
	System.out.println(prints);
	
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
	prints = "*Floor begins to rumble*\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	

	prints = "Oh god. What now!?\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
	
	 prints = "Mysterious voice: You...\n\n";
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
   
	 prints = "Giovanni?\n\n";
	 System.out.println(prints);
	 try {
	     // thread to sleep for 2 second
	     Thread.sleep(2000);
	 } catch (InterruptedException e) {}
   

	 prints = "Mysterious voice: Haha, you wish I was Giovanni.\n\n";
	 System.out.println(prints);
	 try {
	     // thread to sleep for 2 second
	     Thread.sleep(2000);
	 } catch (InterruptedException e) {}
   
		
	 prints = "Mysterious voice: My name is Mirak.\n\n";
	 System.out.println(prints);
	 try {
	     // thread to sleep for 2 second
	     Thread.sleep(2000);
	 } catch (InterruptedException e) {}
   

	 prints = "Mirak: Defeat me if you want to save this dear princess of yours\n\n";
	 System.out.println(prints);
	 try {
	     // thread to sleep for 2 second
	     Thread.sleep(2000);
	 } catch (InterruptedException e) {}

	 prints = "One more fight won't hurt, right?";
	 System.out.println(prints);

	 Monster monster = new Mirak();
	 woo.fight();
	 if (!player.isAlive()){
	     System.out.print("\nReturning to map...");
	     return true;
	 }
	 
	 prints = "Mirak: NOOOOOOOOOO.\n\n";
	 System.out.println(prints);
	 try {
	     // thread to sleep for 2 second
	     Thread.sleep(2000);
	 } catch (InterruptedException e) {}
   
		
	 prints = "*Mirak vanishes*\n\n";
	 System.out.println(prints);
	 try {
	     // thread to sleep for 2 second
	     Thread.sleep(2000);
	 } catch (InterruptedException e) {}
   

	 prints = "Dang it. The princess isn't here...";
	 System.out.println(prints);
	 try {
	     // thread to sleep for 2 second
	     Thread.sleep(2000);
	 } catch (InterruptedException e) {}

	 prints = "Guess we gotta go back and tell the king...again...\n\n";
	 System.out.println(prints);
	 
	 return false;      
    }
}
