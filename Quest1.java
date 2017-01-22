import java.lang.*;
import cs1.Keyboard;
public class Quest1{
    Woo woo = new Woo();
    public boolean newQuest(){

	String prints;
	String selection;
	prints = "Welcome to the Caves of Anarchy. Here you will begin your first quest.\n";
	prints += "Are you sure you would like to continue? (yes) or (no)";
	System.out.println(prints);
	selection = Keyboard.readString();

	if (selection.toLowerCase().equals("")){
	    prints = "Alright, let's begin";
	    System.out.println(prints);
	}	
	else if(selection.toLowerCase().equals("no")) {
	    prints = "Returning to map...";
	    System.out.println(prints);
	    return true;
	}
	    
	prints = " Onwards we go!\n";
	System.out.println(prints);  
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
   
	prints = "Here, within the Caves of Anarchy, we will find Princess Zara.\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
	
       	prints = "However, the Caves of Anarchy is a rather dangerous area, where many monsters hide.\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
	
	prints = "To your left, watch out!\n";
	System.out.println(prints);	
	    	
	woo.spawn();
	woo.fight();
	prints = "That was a rather close one, now wasn't it.\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	prints = "Watch out here, it's rather steep!\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	prints = "Let's not die just yet haha.\n";
	System.out.println(prints);
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	prints = "Behind you!\n";
	System.out.println(prints);

	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
    
	woo.spawn();
	woo.fight();

	prints = "Oh man, the amount of surprises we're finding today";
	System.out.println(prints);
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

	prints = "Let's try to avoid as many of these 'things' as possible";
	System.out.println(prints);
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

	prints = "Would you go down the left path or the right path?";
	System.out.println(prints);
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}
	prints = "Please enter 'left' or 'right'";
	System.out.println(prints);
	selection = Keyboard.readString();
	if (selection.equals("left")){
	    prints = "Oh no there's a bunch of monsters ahead of us!";
	    System.out.println(prints);
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	    woo.spawn();
	    woo.fight();
	    try {
		// thread to sleep for 1 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}
	    prints = "Phew that wasn't fun now was it";
	    System.out.println(prints);
	}
	else if (selection.equals("right")){
	    prints = "Dang theres one monster ahead";
	    System.out.println(prints);
	    try {
		// thread to sleep for 1 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}

	    prints = "Let's do this quickly and efficiently";
	    System.out.println(prints);
	    try {
		// thread to sleep for 1 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}
	    woo.spawn();
	    woo.fight();
		
	    try {
		// thread to sleep for 1 second
		Thread.sleep(3000);
	    } catch (InterruptedException e) {}
	    prints = "Alright, not bad";
	    System.out.println(prints);
	}
	
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

	prints = "I think I see the princess ahead!";
	System.out.println(prints);
	try {
	    // thread to sleep for 1 second
	    Thread.sleep(3000);
	} catch (InterruptedException e) {}

	prints = "Would you like to heal up? Yes or No";
	prints += "Please enter 'yes' or 'no'";
	System.out.println(prints);
	selection = Keyboard.readString();
	//if (selection.equals("yes")){
	//}
    
	return false;
      
   
    }
}

	   
	    
   
	    
	   

	    
   
	    
 
