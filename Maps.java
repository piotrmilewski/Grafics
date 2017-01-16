public abstract class Maps{
    protected Character player;
    protected Monster monster;
    
    public void spawn (){
	if (Math.random()*10 > 6){
	    monster = new Gargoyle();
	}
	else if (Math.random()*10 > 3){
	    monster = new Goblin();
	}
	else {
	    monster = new Cyclops;
	}
    }

    public void fight(){
	while (player.isAlive() && monster.isAlive()){
	    prints = "Would you like to attack or parry the next monster's attack during your next turn?\n";
	    prints += "Selection (attack or parry): ";
	    System.out.print(prints);
	    selection = Keyboard.readString();

	    if (selection.equals("attack")){
		dP = player.attack(monster);
	    }
	    else{
		dP = player.parry(monster);
	    }
	    dM = monster.attack(player);

	    prints = "\n" + player.getName() + " dealt " + dP + " damage to the Gargoyle.\n";
	    prints += "Gargoyle dealt " + dM + " damage to " + player.getName() + ".\n";
	    prints += "Your health is now: " + player.getHealth() + "\n";
	    prints += "Gargoyle's health is now: " + monster.getHealth() + "\n";
	    System.out.println(prints);
	}

	if (!player.isAlive() && !monster.isAlive()){
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
    public abstract String quit();
   
}
