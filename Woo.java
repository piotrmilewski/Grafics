import cs1.Keyboard;

public class Woo{

    private Character player;
    //    private String name;
    private Monster monster;
    //private Map map;

    private int kingEncounters; //number of times you've spoken with the king
    private int questCount;
    private int maxQuests; //specify max number of quests in a game
    private int deathCount;
    private boolean Endgame;
    private boolean inQuest; //true if in a quest
    

    public Woo(){
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
	nameofclass = nameofclass.toLowerCase();
	
	while (looper){
	    if (nameofclass.equals("soldier")){
		player = new Soldier(name);
		looper = false;
	    }
	    else if (nameofclass.equals("mage")){
		player = new Mage(name);
		looper = false;
	    }
	    /*else if (nameofclass.equals("swordsman")){
		player = new Swordsman(name);
		looper = false;
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
	else if (!monster.isAlive()){
	    prints = "With one last blow from his fist, " + player.getName() + " was able to take down the Gargoyle\n";
	    System.out.println(prints);
	}
	else if (!player.isAlive()){
	    prints = "With one last slash from its claw, the Gargoyle was able to take down the mighty " + player.getName() + "\n";
	    System.out.println(prints);
	}

	prints = "Well done my young apprentice. That was a battle well fought\n";
	prints += "You are now ready to face the perils that you will encounter at Kingdom Quests. Your first order of business will be to speak to the King. He'll guide you from there.\n\n";
	prints += "Now off you go, I'm sending you off to the Castle.\n";
	prints += "Carl, out!";
	System.out.println(prints);
	
    }//end tutorial()

    //WORK IN PROGRESS
    /*public void Castle(){
	String prints, selection;

	prints = "Welcome to King Zbigniew's Castle. We hope you enjoy your stay.\n\n";
	prints += "What would you like to do?\n";
	prints += "\t1. Speak with the King\n\t2. Visit the shop\n\t3. Visit the infirmary\n\t4. Use the restrooms\n\t5. Leave the Castle\n";
	prints += "Selection (1,2,3,4, or 5): ";
	System.out.println(prints);

	selection = Keyboard.readInt();

	if (selection == 1){
	}
	else if (selection == 2){
	}
	else if (selection == 3){
	}
	else if (selection == 4){
	}
	else if (selection == 5){
	}
	}*/
	
	

    public static void main(String[] args){
	String prints;
	String selection;
	
	Woo game = new Woo();

	Quest1.newQuest();
	prints = "Would you like to do the tutorial? (Recommended for new players)\n";
	prints += "Selection (Yes or No): ";
	System.out.print(prints);
	selection = Keyboard.readString();
	selection = selection.toLowerCase();

	if (selection.equals("yes")){
	    game.tutorial();
	}
	else{
	    prints = "Are you sure you don't want to do the tutorial?\n";
	    prints += "Selection (Yes or No): ";
	    System.out.print(prints);
	    selection = Keyboard.readString();
	    selection = selection.toLowerCase();

	    if (selection.equals("no")){
		game.tutorial();
	    }
	}
	

    }//end main
    
}//end class Woo
