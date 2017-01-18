import cs1.Keyboard;
public abstract class Maps{
    protected Monster monster;
    Character player = Woo.player;
    
    public  void spawn(){
	if (Math.random()*10 > 6){
	    monster = new Gargoyle();
	}
	
	else if (Math.random()*10 > 3){
	    monster = new Goblins();
	}
	else {
	    monster = new Cyclops();
	}
      	
    }

    public void fight(){
	boolean quit = false;
	int action = Keyboard.readInt();
	String prints;
	int dM;
	int dP;
	while (player.isAlive() && monster.isAlive()){
	    prints = "Would you like to attack or parry the next monster's attack during your next turn?\n";
	    prints += "Selection (attack(1) or parry(2) or would you like to quit(3)?): ";
	    System.out.print(prints);
	    if (action == 1){
		dP = player.attack(monster);
	    }
	    else if (action == 2){
		dP = player.parry(monster);
	    }
	    else{
		quit = true;
	        break;
	    }
    	    		
	    dM = monster.attack(player);

	    prints = "\n" + player.getName() + " dealt " + dP + " damage to the Gargoyle.\n";
	    prints += "Gargoyle dealt " + dM + " damage to " + player.getName() + ".\n";
	    prints += "Your health is now: " + player.getHealth() + "\n";
	    prints += "Gargoyle's health is now: " + monster.getHealth() + "\n";
	    System.out.println(prints);
	}

	if (quit){
	    prints = "PLAYER IS A LOSER, HE RAN BACK TO THE CASTLE AND DROPPED SOME STUFF AND MONEY";
	}
	else if (!player.isAlive() && !monster.isAlive()){
	    prints = "Although " + player.getName() + " killed the monster with one last blow from his fist, the monster lashed at " + player.getName() + " with one last slash and took " + player.getName() + " down with him.\n";
	    System.out.println(prints);
	}
	else if (!monster.isAlive()){
	    prints = "With one last blow from his fist, " + player.getName() + " was able to take down the monster\n";
	    System.out.println(prints);
	}
	else if (!player.isAlive()){
	    prints = "With one last slash from its claw, the monster was able to take down the mighty " + player.getName() + "\n";
	    System.out.println(prints);
	}
	//Castle();
   
    }
}
