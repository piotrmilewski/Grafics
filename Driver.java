import cs1.Keyboard;

public class Driver{

    private Character player;
    private Monster monster;
    //private Map map;

    private int questCount;
    private int maxQuests; //specify max number of quests in a game
    private int deathCount;
    private boolean Endgame;
    private boolean inQuest; //true if in a quest
    

    public Driver(){
	questCount = 0;
	deathCount = 0;
	Endgame = false;
	inQuest = false;
	newGame();
    }

    public void newGame(){
	String prints;
	String name = "";
	String nameofclass = "";
	boolean looper = true;

	prints = "Welcome young warrior, to a marvelous world where you will encounter many allies and foes, challenges and obstacles, and treasures that lie beyond the grasp of mortals.\n";
	prints += "Before we begin our journey through Kingdom Quests, may you tell me what you are called by your brethren? (Input name): ";
	System.out.print(prints);

	name = Keyboard.readString();

	prints = name + ", what a splendid name. Now, which warrior suits your fancy? (Pick a class): \n";
	prints += Character.desc();
	prints += "Selection: ";
	System.out.print(prints);

	nameofclass = Keyboard.readString();
	
	while (looper){
	    if (nameofclass.equals("Soldier")){
		player = new Soldier(name);
		looper = false;
	    }
	    /*else if (nameofclass.equals("Mage")){
		player = new Mage(name);
		looper = true;
	    }
	    else if (nameofclass.equals("Swordsman")){
		player = new Swordsman(name);
		looper = true;
		}*/
	    else{
		prints = "Invalid choice, please try again\n";
		prints += Character.desc();
		prints += "Selection: ";
	    }
	}
	

        
	prints = "A valiant choice, " + name + "\n";
	prints += "Now, we are ready to begin our journey. Ready? Well, I sure am.\n";
	System.out.print(prints);

    }//end newGame()

    public void tutorial(){
	String prints, selection;
	int dP, dM;
	monster = new Gargoyle();

	prints = "Welcome to the tutorial, my name is Carl the Guide and I will be assisting you throughout the course of the tutorial\n";
	prints += "Here approaches a Gargoyle, prepare to battle\n";
	prints += "*" + player.getName() + " puffs out his chest and raises his fists in a cowardly manner*\n\n";
	prints += "Well, that's a start. Now, you will have to decide what you will want to do during each cycle. You can either attack the monster for 100% damage or you can parry the monster's attack with a 50% success rate and then strike for 50% damage. Well let's not wait around, get in there\n";
	System.out.println(prints);

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
	    prints = "Although " + player.getName() + " killed the Gargoyle with one last blow from his fist, the Gargoyle lashed at " + player.getName() + " with one last slash and took " + player.getName() + " down with him.\n";
	    System.out.println(prints);
	}
	else if (!player.isAlive()){
	    prints = "With one last blow from his fist, " + player.getName() + " was able to take down the Gargoyle\n";
	    System.out.println(prints);
	}
	else if (!monster.isAlive()){
	    prints = "With one last slash from its claw, the Gargoyle was able to take down the mighty " + player.getName() + "\n";
	    System.out.println(prints);
	}
    }//end tutorial()
	

    public static void main(String[] args){
	String prints;
	String selection;
	
	Driver game = new Driver();
	
	prints = "Would you like to do the tutorial? (Recommended for new players)\n";
	prints += "Selection (Yes or No): ";
	System.out.print(prints);
	selection = Keyboard.readString();

	if (selection.equals("Yes")){
	    game.tutorial();
	}
	

    }//end main
    
}//end class Driver
