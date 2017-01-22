import java.lang.*;
import cs1.Keyboard;
public class Quest1{
    Woo woo = new Woo();
    public boolean newQuest(){

	String prints;
	String selection;
	prints = "Welcome to the Caves of Anarchy. Here you will begin your first quest.\n\n";
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
   
	prints = "Here, within the Caves of Anarchy, we will find Princess Zara.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
	
       	prints = "However, the Caves of Anarchy is a rather dangerous area, where many monsters hide.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
	
	prints = "To your left, watch out!\n\n";
	System.out.println(prints);	
	    	
	woo.spawn();
	woo.fight();
	prints = "That was a rather close one, now wasn't it.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	prints = "Watch out here, it's rather steep!\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	prints = "Let's not die just yet haha.\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	prints = "Behind you!\n\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	woo.spawn();
	woo.fight();

	prints = "Oh man, the amount of surprises we're finding today\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

	prints = "Let's try to avoid as many of these 'things' as possible\n\n";
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
	    prints = "Oh no there's a bunch of monsters ahead of us!\n\n";
	    System.out.println(prints);
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	    try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}
	    prints = "Phew that wasn't fun now was it\n\n";
	    System.out.println(prints);
	}
	else if (selection.equals("right")){
	    prints = "Dang theres one monster ahead\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}

	    prints = "Let's do this quickly and efficiently\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}
	    woo.spawn();
	    woo.fight();
		
	    try {
		// thread to sleep for 3 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}
	    prints = "Alright, not bad\n\n";
	    System.out.println(prints);
	}
	
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

	prints = "I think I see the princess ahead!\n\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}


	    
    
	return false;
      
   
    }
}

	   
	    
   
	    
	   

	    
   
	    
 
