import cs1.Keyboard;

public class Driver{

    //private Character player;
    //private Monster monster;
    //private Map map;

    private int questCount;
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
	boolean looper = false;

	prints = "Welcome young warrior, to a marvelous world where you will encounter many allies and foes, challenges and obstacles, and treasures that lie beyond the grasp of mortals.\n";
	prints += "Before we begin our journey through Kingdom Quests, may you tell me what you are called by your brethren? (Input name): ";
	System.out.print(prints);

	name = Keyboard.readString();

	prints = name + ", what a splendid name. Now, which warrior suits your fancy? (Pick a class): \n";
	prints += Character.desc();
	prints += "Selection: ";
	System.out.print(prints);

	nameofclass = Keyboard.readString();
	/*
	while (looper){
	    if (nameofclass.equals("Soldier")){
		System.out.println(Soldier.desc());
		player = new Soldier(name);
		looper = true;
	    }
	    else if (nameofclass.equals("Mage")){
		System.out.println(Mage.desc());
		player = new Mage(name);
		looper = true;
	    }
	    else if (nameofclass.equals("Swordsman")){
		System.out.println(Swordsman.desc());
		player = new Swordsman(name);
		looper = true;
	    }
	    else{
		prints = "Invalid choice, please try again\n";
		prints += Character.desc();
		prints += "Selection: ";
	    }
	}
	*/

        
	prints = "A valiant choice, " + name + "\n";
	prints = "Now, we are ready to begin our journey. Ready? Well, I sure am.\n";
	System.out.print(prints);

    }//end newGame()

    public static void main(String[] args){
	Driver game = new Driver();

    }//end main
    
}//end class Driver
