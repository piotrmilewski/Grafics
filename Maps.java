import cs1.Keyboard;
public class Maps{
    protected String monName;
    protected Monster monster;
    public void spawn(){
	if ((Math.random()*3) > 2){
	    monster = new Gargoyle();
	    monName = monster + "";
	    
	}
	
	else if ((Math.random()*3) > 1){
	    monster = new Goblins();
	    monName = monster + "";
	}
	else {
	    monster = new Cyclops();
	    monName = monster + "";
	}
    }
      	


    public void fight(){
	boolean quit = false;
	int action = Keyboard.readInt();
	String prints;
	int dM;
	int dP;
	while ((Woo.getPlayer()).isAlive() && monster.isAlive()){
	    prints = "Would you like to attack or parry the next monster's attack during your next turn?\n";
	    prints += "Selection (attack(1) or parry(2) or would you like to quit(3)?): ";
	    System.out.print(prints);
	    if (action == 1){
		dP = Woo.getPlayer().attack(monster);
	    }
	    else if (action == 2){
		dP = Woo.getPlayer().parry(monster);
	    }
	    else{
		quit = true;
	        break;
	    }
    	    		
	    dM = monster.attack(Woo.getPlayer());

	    prints = "\n" + Woo.getPlayer().getName() + " dealt " + dP + " damage to the Gargoyle.\n";
	    prints += "Gargoyle dealt " + dM + " damage to " + Woo.getPlayer().getName() + ".\n";
	    prints += "Your health is now: " + Woo.getPlayer().getHealth() + "\n";
	    prints += "Gargoyle's health is now: " + monster.getHealth() + "\n";
	    System.out.println(prints);
	}

	if (quit){
	    prints = "PLAYER IS A LOSER, HE RAN BACK TO THE CASTLE AND DROPPED SOME STUFF AND MONEY";
	}
	else if (!Woo.getPlayer().isAlive() && !monster.isAlive()){
	    prints = "Although " +  Woo.getPlayer().getName() + " killed the monster with one last blow from his fist, the monster lashed at " +  Woo.getPlayer().getName() + " with one last slash and took " +  Woo.getPlayer().getName() + " down with him.\n";
	    System.out.println(prints);
	}
	else if (!monster.isAlive()){
	    prints = "With one last blow from his fist, " + Woo.getPlayer().getName() + " was able to take down the monster\n";
	    System.out.println(prints);
	}
	else if (!Woo.getPlayer().isAlive()){
	    prints = "With one last slash from its claw, the monster was able to take down the mighty " + Woo.getPlayer().getName() + "\n";
	    System.out.println(prints);
	}
   
    }
}
