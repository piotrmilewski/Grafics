import cs1.Keyboard;

public class Woo{

    private static Character player;
    //private String name;
    private Monster monster;
    Maps map = new Maps();
    

    private static int kingEncounters = 0; //number of times you've spoken with the king
    private static int infirmaryVisits = 0; //number of times you've been to the infirmary
    private static int questCount = 0;
    private static int maxQuests = 3; //specify max number of quests in a game
    private static int deathCount = 0;
    private static boolean Endgame = false; //true if you complete all quests and thus unlcok Endlass mode
    private static boolean inQuest = false; //true if in a quest
    private String monName;
    

    public Woo(){ //constructor
	questCount = 0;
	deathCount = 0;
	Endgame = false;
	inQuest = false;
    }

    public static Character getPlayer(){ //used to refer to player in other classes
	return player;
    }

    public void newGame(){ //allows you to create a character
	String prints;
	String name = "";
	String nameofclass = "";
	String selection; 

	prints = "Welcome young warrior, to a marvelous world where you will encounter many allies and foes, challenges and obstacles, and treasures that lie beyond the grasp of mortals.\n\n";
	System.out.print(prints);
			
	try {
	    // thread to sleep for 2 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	prints = "Before we begin our journey through Kingdom Quests, may you tell me what you are called by your brethren? (Input name): ";
	System.out.println(prints);     
	name = Keyboard.readString();

	prints = name + ", what a splendid name. Now, which warrior suits your fancy? (Pick a class): \n";
	prints += Character.desc();
	prints += "Selection: ";
	System.out.println(prints);
 
	nameofclass = Keyboard.readString();
	nameofclass = nameofclass.toLowerCase();
	
	while (true){ //this will force you to choose one of the three characters.
	    if (nameofclass.equals("soldier")){
		player = new Soldier(name);
		break;
	    }
	    else if (nameofclass.equals("mage")){
		player = new Mage(name);
		break;
	    }
	    else if (nameofclass.equals("swordsman")){
		player = new Swordsman(name);
		break;    
	    }
	    else{
		prints = "Invalid choice, please try again\n";
		prints += Character.desc();
		prints += "Selection: ";
		System.out.println(prints);
		nameofclass = Keyboard.readString();
		nameofclass = nameofclass.toLowerCase();
	    }
	}
        
	prints = "A valiant choice, " + name + "\n\n";
	System.out.println(prints);
			
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	prints = "Now, we are ready to begin our journey. Ready? Well, I sure am.\n\n";
	System.out.println(prints);

    }//end newGame()

    public void tutorial(){ //essentially a regular battle but with directions
	String prints, selection;
	int dP, dM;
	monster = new Gargoyle();

	prints = "Welcome to the tutorial, my name is Carl the Guide and I will be assisting you throughout the course of the tutorial\n\n";
	System.out.println(prints);
       	
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	    

	prints = "Here approaches a Gargoyle, prepare to battle\n\n";
	System.out.println(prints);

		
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	    
	prints = "*" + player.getName() + " puffs out his chest and raises his fists in a cowardly manner*\n\n";
	System.out.println(prints);

		
	try {

	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	    
	prints = "Well, that's a start. Now, you will have to decide what you will want to do during each cycle.\n\n";
	System.out.println(prints);

		
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	    
	prints = "You can either attack the monster for 100% damage or you can parry the monster's attack with a 50% success rate and then strike for 50% damage.\n\n";
	System.out.println(prints);

		
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	    
	prints = "Well let's not wait around, get in there\n\n";
	System.out.println(prints);

		
	try {
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
        fight();

	prints = "Well done my young apprentice. That was a battle well fought\n\n";
	System.out.println(prints);	
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	    
	prints = "You are now ready to face the perils that you will encounter at Kingdom Quests. Your first order of business will be to speak to the King. He'll guide you from there.\n\n";
	System.out.println(prints);	
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}

	   	    
	prints += "Now off you go, I'm sending you off to the Castle.\n\n";
		
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	    
	prints = "Carl, out!\n\n";
	System.out.println(prints);

			
	try {
	    // thread to sleep for 3 second
	    Thread.sleep(2000);
	} catch (InterruptedException e) {}
	
    }//end tutorial()
   
    
    public void spawn(){ //used to spawn the 3 generic monsters
	if ((Math.random()*3) > 2){
	    monster = new Gargoyle();
	    monName = monster.getClass().getSimpleName();
	    
	}
	
	else if ((Math.random()*10) > 3){
	    monster = new Goblin();
	    monName = monster.getClass().getSimpleName();
	}
	else {
	    monster = new Cyclops();
	    monName = monster.getClass().getSimpleName();
	}
    }//end spawn()

    
    public void spawnBoss(int a){ //used to spawn the three bosses
	if (a == 1){
	    monster = new Giovanni();
	    monName = monster.getClass().getSimpleName();
	}
	else if (a == 2){
	    monster = new Mirak();
	    monName = monster.getClass().getSimpleName();
	}
	else{
	    monster = new Sirbow();
	    monName = monster.getClass().getSimpleName();
	}
    }
	

    public void fight(){ //used to fight in battle
	boolean quit = false;
	int action;
	String prints;
	int dM; //damage to player
	int dP; // damage to monster
	while (player.isAlive() && monster.isAlive()){ // battle will continue if both are alive
	    prints = "What would you like to do? 1: Attack 2: Parry 3: Use Item 4: Run (ONLY FOR FOREST)\n"; 
	    prints += "Selection:  ";
	    System.out.print(prints);
	    action = Keyboard.readInt();
	    if (action == 1){
		dP = player.attack(monster);
		dM = monster.attack(player);
		
		prints = "\n" +  player.getName() + " dealt " + dP + " damage to the " + monName + ".\n";
		prints +=  monName + " dealt " + dM + " damage to " + player.getName() + ".\n";
		prints += "Your health is now: " + player.getHealth() + "\n"; //displays health
		prints += monName + "'s health is now: " + monster.getHealth() + "\n";
		System.out.print(prints);

	    }
	    else if (action == 2){ //similar to attack but has a chance of not getting hit
		dP = player.parry(monster);
		dM = monster.attack(player);
		
		prints = "\n" +  player.getName() + " dealt " + dP + " damage to the " + monName + ".\n";
		prints +=  monName + " dealt " + dM + " damage to " + player.getName() + ".\n";
		prints += "Your health is now: " + player.getHealth() + "\n";
		prints += monName + "'s health is now: " + monster.getHealth() + "\n";
		System.out.print(prints);
	    }
	    else if (action == 3){ //uses items
		while (true){
		    System.out.print(player.printInventory());
		    System.out.print("\nWhich item would you like to use? (Enter quit to leave inventory)");
		    System.out.print("\nSelection: ");
		    String item = Keyboard.readString().toLowerCase();
		    if (item.equals("quit")){
			break;
		    }
		    if (player.hasItem(item)){ //only if the item exists, may it be used
			player.useItem(item);
		    }
		    else{
			System.out.print("\nYou don't have that item. Try visiting the shop when you find time!");
		    }
		}
	    }
	    else if (action == 4){ //quits game
		quit = true;
	        break;
	    }
	}

	if (quit){
	    if (player.getCurrency() > 10){ //only if the player has enough money to lose, will they lose money
		player.loseCurrency(10);
	    }
	    prints = "PLAYER IS A LOSER, HE RAN BACK TO THE CASTLE AND DROPPED MONEY";
	}
	else if (!player.isAlive() && !monster.isAlive()){ //both die at the same time
	    prints = "Although " +  player.getName() + " killed the monster with one last blow from his fist, the monster lashed at " +  player.getName() + " with one last slash and took " +  player.getName() + " down with him.\n";
	    System.out.println(prints);
	}
	else if (!monster.isAlive()){ //monster dies
	    player.levelUp(5);
	    prints = "With one last blow from his fist, " + player.getName() + " was able to take down the monster\n";
	    prints += player.getName() + " gained 5 experience points!";
	    System.out.println(prints);
	    System.out.println("Your level is now " + player.levelUp(5));
	    String dropped = monster.drop();
	    player.addItem(dropped); //pick up item
	    System.out.print("\n" + player.getName() + " picked up 1 " + dropped + "!\n");
	    int money = monster.getCurrency();
	    player.gainCurrency(money); //pick up money
	    System.out.print("\n" + player.getName() + " gained " + monster.getCurrency() + " dollars!\n");
	}
	else if (!player.isAlive()){
	    prints = "With one last slash from its claw, the monster was able to take down the mighty " + player.getName() + "\n";
	    System.out.println(prints);
	    if (player.getCurrency() > 10){ //lose money
		player.loseCurrency(10);
	    }
	    System.out.println(player.getName() + " dropped 10 dollars on his way back to the castle");		
	}
    }//end fight()
    
    
    public void castle(){ 
	String prints;
	int selection;
	boolean flag = true;
	
	while (flag){
	    prints = "Welcome to King Zbigniew's Castle. We hope you enjoy your stay.\n\n";
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    System.out.println(prints);
	    prints = "What would you like to do?\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    prints += "\t1: Speak with the King\n\t2: Visit the shop\n\t3: Visit the infirmary\n\t4: Use the restrooms\n\t5. Leave the Castle\n";
	    prints += "Selection (1,2,3,4, or 5): ";
	    System.out.print(prints);
	    
	    selection = Keyboard.readInt();
	    
	    if (selection == 1){
		king();
	    }
	    else if (selection == 2){
		shop();
	    }
	    else if (selection == 3){
		infirmary();
	    }
	    else if (selection == 4){
		restrooms();
	    }
	    else if (selection == 5){
		flag = false;
	    }
	    else{
		prints = "You're only wasting your own time by not putting in one of the specified options.\n";
		System.out.println(prints);
	    }
	}
    }//end castle()

    public void king(){ //Used to figure out what quest you are on
	String prints;
	if (kingEncounters == 0 && questCount == 0){
	    prints = "Zbigniew: Ahh, so this is the new recruit, well pleasure to meet you. My name is King Zbigniew, king of Lorule. So, what brings you here?\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    prints = "*You tell the king that you've come to protect and serve Lorule and would like to start as soon as possible*\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    
	    prints = "Zbigniew: So you fancy yourself some work ehh? Well I've got just the job for you.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
		
	    prints = "Zbigniew: So recently, my daughter, Peony, had been kidnapped by the evil Sirbow.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    
	    prints = "Zbigniew: Personally, I don't really mind, she didn't really do much at home either.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}

	    prints = "Zbigniew: However my wife insists that we get her back.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}

	    prints = "Zbigniew: So now the job is placed upon you.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}

	    prints = "Zbigniew: Have fun finding the brat.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
		 
	    questCount += 1; //assuming you talk to the king once after every quest, your questCount and kingEncounters will increase to fit the quest requirement.
	    kingEncounters += 1;
	    inQuest = true;
	}
	else if (questCount == 1 && !(inQuest)){ //quest 2 talk
	    prints = "Zbigniew: Well, I heard you weren't able to retrieve my daughter.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
		 
	    
	    prints = "Zbigniew: That's good news for me...but once again, my wife is not happy.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
		 

	    prints = "Zbigniew: Rumor has it, my daughter has been found never the Yard of Sirbow.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
		 

	    prints = "Zbigniew: Why don't you check there? Consider this your second quest.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
		 	
	    questCount += 1;
	    kingEncounters += 1;
	    inQuest = true;
	}
	else if (questCount == 2 && !(inQuest)){ //quest 3 talk
	        prints = "Zbigniew: You know it'll be great if you could get my daughter back before dinner.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
		 
	    
	    prints = "Zbigniew: My wife's advice.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
		 

	    prints = "Zbigniew: My soldiers reported back saying she is in Sirbow's Castle.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
		 

	    prints = "Zbigniew: This will be your last chance to retrieve her back.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}

	       prints = "Zbigniew: Good luck.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    
	    questCount += 1;
	    kingEncounters += 1;
	    inQuest = true;
	}
	else if (questCount == 3 && !(inQuest)){ //post quests talk
	    prints = "Zbigniew: Congratulations " + player.getName() + ", you saved my daughter! Without you my wife would've killed me. I suppose here is a thank you.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    prints = "Zbigniew: Well I have no more quests for you, however, your service will not go unrewarded. Here, this is one-tenth of the kingdom's treasury, use it wisely.\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    prints = "*" + player.getName() + " received 500,000 gold coins!*\n\n";
	    System.out.println(prints);
	    try {
		// thread to sleep for 2 second
		Thread.sleep(2000);
	    } catch (InterruptedException e) {}
	    player.gainCurrency(500000);
	    Endgame = true;
	}
	else if (inQuest){ // unable to receive new quest talk as you are assigned a specific task
	    prints = "Did you finish that quest that I assigned you already? No? Then what are you doing here, go save my daughter!\n";
	    System.out.println(prints);
	}
	else{
	    prints = "Don't come in! I'm rather occupied with something at the moment!\n\n";
	    prints += "*You hear a loud crash and turn back*\n";
	    System.out.println(prints);
	}
    }//end king()

    public void shop(){ //used to buy items with currency
	String prints;
	int selection, buyitem;
	int cost = 0;
	String sellitem;
	String[][] inventory = new String[3][5];
	inventory[0][0] = "Potion";
	inventory[0][1] = "Max Potion";
	inventory[0][2] = "AttackUp";
	inventory[0][3] = "DefenseUp";
	inventory[0][4] = "Rare Sweet";
	inventory[1][0] = "Restores health by 50";
	inventory[1][1] = "Restores health to max";
	inventory[1][2] = "Increases attack by 2";
	inventory[1][3] = "Increases defense by 2";
	inventory[1][4] = "Raises level by 1";
	inventory[2][0] = "10";
	inventory[2][1] = "10";
	inventory[2][2] = "10";
	inventory[2][3] = "10";
	inventory[2][4] = "10";
	
	prints = "Welcome to the Shop! What would you like to do?\n";
	prints += "\t1: I would like to use some currency!\t2: I would like to gain some currency!\t3: Leave Shop\n";
	prints += "Selection (1, 2, or 3): ";
	System.out.print(prints);
	selection = Keyboard.readInt();

	while (true) {
	    if (selection == 1){
		prints = "Wonderful! What would you like?\n\n";
		for (int x = 0; x < inventory[0].length; x++){
		    prints +=  "\t" + x + ":  " + inventory[0][x] + "\t\t" + inventory[1][x] + "\t\t" + inventory[2][x] + "\n";
		}
		prints += "\nSelection(number): ";
		System.out.print(prints);
		buyitem = Keyboard.readInt();

		cost = Integer.parseInt(inventory[2][buyitem]);
		if (cost > player._currency){
		    System.out.println("You don't have enough in the money pouch to buy this item!"); 
		}
		else{
		    System.out.print("BEFORE: " + player.playerInfo());//diag
		    player.loseCurrency(cost);
		    player.addItem(inventory[0][buyitem]);
		    System.out.print("AFTER: " + player.playerInfo());//diag
		    System.out.println(inventory[0][buyitem] + " has been added to your inventory!");
		}

		prints = "Now, what would you like to do?\n";
		prints += "\t1: I would like to use some currency!\t2: I would like to gain some currency!\t3: Leave Shop\n";
		prints += "Selection(1, 2, or 3): ";
		System.out.print(prints);
		selection = Keyboard.readInt();
	    }
	    else if (selection == 2){
		prints = "Oh joy, role reversal! What do you have for me?\n";
		prints += "Your inventory:\n\n";
		//prints player's inventory
		for (int a = 0; a < player._inventory.length; a++){
		    for (int x = 0; x < player._inventory[0].length; x++){
			prints += "\t" + player._inventory[a][x];
		    }
		    prints += "\n";
		}
		prints += "\nChoose an item to sell: ";
		System.out.print(prints);
	        sellitem = Keyboard.readString();
		sellitem = sellitem.toLowerCase();

		if (player.hasItem(sellitem)){
		    System.out.print("BEFORE: " + player.playerInfo());//diag
		    for (int x = 0; x < inventory[0].length; x++){
			if (sellitem.equals(inventory[0][x])){
			    cost = Integer.parseInt(inventory[2][x]);
			}
		    }
		    player.gainCurrency(cost);
		    player.sellItem(sellitem);
		    System.out.print("AFTER: " + player.playerInfo());//diag
		    System.out.println(sellitem + " has been sold to the shop!");
		}
		else{
		    System.out.println("Look again..you don't have that item!");
		}

		prints = "Now, what would you like to do?\n";
		prints += "\t1: I would like to use some currency!\t2: I would like to gain some currency!\t3: Leave Shop\n";
		prints += "Selection(1, 2, or 3): ";
		System.out.print(prints);
		selection = Keyboard.readInt();
	    }
	    else if (selection == 3){
		System.out.println("Leaving already? Alright, nice doing business with you!");
		return;
	    }
	    else{
		prints = "This is a shop. We only buy and sell...\n";
		prints += "What would you like to do?\n";
		prints += "\t1: I would like to use some currency!\t2: I would like to gain some currency!\t3: Leave Shop\n";
		prints += "Selection(1, 2, or 3): ";
		System.out.print(prints);
		selection = Keyboard.readInt();
	    }
	}
    }//end shop()

    public void infirmary(){ //used to heal up
	String prints;
	if (infirmaryVisits == 0){
	    prints = "Why hello there, my name is Judith, the head nurse, what may I... Oh... Lemme fix you right up don't you worry about it\n\n";
	    prints += "*Judith lays you down on the bed and treats you*\n\n";
	    prints += "You're new here aren't you? Gosh you're cute. Not much of a talker are you? Well if you ever need your health restored then come on back. We're always open.\n";
	    System.out.println(prints);
	    player.gainHP(100000);
	    infirmaryVisits += 1;
	}
	else if (infirmaryVisits == 1){ //different message depending on how many time you visited
	    prints = "Oh my poor child, tsk tsk, why must they send you off to fight those nasty creatures. Why don't you just stay with me? I cook, I clean, and I make the best Meatloaf in the entire kingdom.\n\n";
	    prints += "*You consider the offer but kindly decline, Judith frowns*\n\n";
	    prints += "Well if you ever reconsider, you know where I am\n\n";
	    prints += "*Judith treats you and massages your lower back\n\n";
	    prints += "There all better\n";
	    System.out.println(prints);
	    player.gainHP(100000);
	    infirmaryVisits += 1;
	}
	else{
	    prints = player.getName() + " why must you be such a reckless one? All the more reason to love you I guess.\n\n";
	    prints += "*Your cheek's turn a deep scarlet and you lower your head*\n\n";
	    prints += "Consider my previous offer, for your own sake.\n";
	    System.out.println(prints);
	    player.gainHP(100000);
	    infirmaryVisits += 1;
	}
    }

    public void restrooms(){ //just for fun
	String prints;
	int rand = (int)(Math.random()*3.0);
	if (rand == 0){
	    prints = "*You enter the restrooms and are immediately reminded of the smell in the stuyvesant 5th floors bathroom. Reluctantly, you go in and do your business*\n\n";
	    prints += "*On your way out of the restrooms your find 5 gold. Feels good man.\n*";
	    System.out.println(prints);
	    player.gainCurrency(5);
	}
	else if (rand == 1){
	    prints = "*You enter the restrooms and see a rat. This triggers your musophobia and you run away. You then realize you no longer need to use the restroom and go get a new pair of pants.\n";
	    System.out.println(prints);
	}
	else{
	    prints = "*You enter the restrooms, slip on the floor and fall unconscious. When you wake up and leave the restroom you realize that you are missing 1 gold coin. You decide it isn't worth the effort to go back and get the coin and go back to the castle hall*\n";
	    System.out.println(prints);
	    player.loseCurrency(1);
	}
    }
    
    public static void main(String[] args){
	String prints;
	String selection;
	int action;
	
	Woo game = new Woo(); //sets up
	game.newGame(); //sets character 


	prints = "Would you like to do the tutorial? (Recommended for new players)\n";
	prints += "Selection (Yes or No): ";
	System.out.print(prints);
	selection = Keyboard.readString();
	selection = selection.toLowerCase();

	while (true) { 
	    if (selection.equals("yes")){ //plays tutorial
		game.tutorial();
		break;
	    }
	    else if (selection.equals("no")){ //goes straight to map
		prints = "Are you sure you don't want to do the tutorial?\n";
		prints += "Selection (Yes or No): ";
		System.out.print(prints);
		selection = Keyboard.readString();
		selection = selection.toLowerCase();
		
		if (selection.equals("no")){
		    game.tutorial();
		}
		else{
		    prints = "Very well. Your first order of business will be to seek guidance from the King. He awaits your arrival.";
		    System.out.print(prints);
		}
		break;
	    }
	    else{
		prints = "I'm not quite sure I understood. Did you mean yes or no? ";
		System.out.print(prints);
		selection = Keyboard.readString();
		selection = selection.toLowerCase();
	    }
	}

	prints = "\nAh yes, the great outdoors. What would you like to do?";
	prints += "\n\t1: Venture out into the woods\n\t2: Return to the castle\n\t3: Quest 1\n\t4: Quest 2\n\t5: Quest 3\n\t6: Tell me about me\n\t7: Quit Game";
	prints += "\nSelection (1, 2, 3, 4, 5, 6, or 7): ";	  	
	System.out.print(prints);

	action = Keyboard.readInt();

	while (true){
	    if (action == 1){ //goes into forest
		System.out.println("A daring soul you are.");
	        Forest woods = new Forest();
		woods.forest();
		System.out.print(prints);
		action = Keyboard.readInt();
	    }
	    else if (action == 2){ //goes back into caslte
		System.out.println("More of an indoors person, huh?");
		game.castle();
		System.out.print(prints);
		action = Keyboard.readInt();
	    }
	    else if (action == 3){ //quest1 
		if (kingEncounters >= 0 && questCount >= 0){
		    System.out.println("Onwards we go!");
		    Quest1 quest = new Quest1();
		    quest.newQuest();
		    System.out.print(prints);
		    action = Keyboard.readInt();
		}
		else { //quest is not unlocked yet
		    prints = "Wait a second... I don't think your up for this quest yet...\n";
		    prints += "\n What else would you like to do?";
		    prints += "\n\t1: Venture out into the woods\n\t2: Return to the castle\n\t3: Quest 1\n\t4: Quest 2\n\t5: Quest 3\n\t6: Tell me about me\n\t7: Quit Game";
		    prints += "\nSelection (1, 2, 3, 4, 5, 6, or 7): ";   
		    System.out.println(prints);
		    action = Keyboard.readInt();
		   
		}
	    }

	    else if (action == 4){ //quest 2
		if (kingEncounters >= 1 && questCount >= 1){
		    System.out.println("Vamonos!");
		    Quest2 quest2 = new Quest2();
		    quest2.newQuest();
		   
		    System.out.print(prints);
		    action = Keyboard.readInt();
		}
		else { //quest is not unlocked yet
		    prints = "One step at a time...this quest is not unlocked yet\n";
		    prints += "\n What else would you like to do?";
		    prints += "\n\t1: Venture out into the woods\n\t2: Return to the castle\n\t3: Quest 1\n\t4: Quest 2\n\t5: Quest 3\n\t6: Tell me about me\n\t7: Quit Game";
		    prints += "\nSelection (1, 2, 3, 4, 5, 6, or 7): ";  
		    System.out.println(prints);
		    action = Keyboard.readInt();
		   
		}
	    }

	    else if (action == 5){ //quest 3
		if (kingEncounters >= 2 && questCount >= 2){
		    System.out.println("Let's go!");
		    Quest3 quest3 = new Quest3();
		    quest3.newQuest();
		   
		    System.out.print(prints);
		    action = Keyboard.readInt();
		}
		else { //quest is not unlocked yet
		    prints = "Oh no...this quest is not unlocked yet\n";
		    prints += "\n What else would you like to do?";
		    prints += "\n\t1: Venture out into the woods\n\t2: Return to the castle\n\t3: Quest 1\n\t4: Quest 2\n\t5: Quest 3\n\t6: Tell me about me\n\t7: Quit Game";
		    prints += "\nSelection (1, 2, 3, 4, 5, 6, or 7): ";   
		    System.out.println(prints);
		    action = Keyboard.readInt();
		   
		}
	    }
	    
	    else if (action == 6){ //displays all info
		System.out.print(player.playerInfo());
		System.out.print(prints);
		action = Keyboard.readInt();
	    }
	    else if (action == 7){ //quits game
		System.out.print("Bye Bye!!");
		break;
	    }
	    else{
		prints = "Please don't make my life difficult. Choose one of the given options.";
		prints += "\n\t1: Venture out into the woods\n\t2: Return to the castle\n\t3: Quest 1\n\t4: Quest 2\n\t5: Quest 3\n\t6: Tell me about me\n\t7: Quit Game";
		prints += "\nSelection (1, 2, 3, 4, 5, 6, or 7): ";	   
		System.out.print(prints);
		action = Keyboard.readInt();
	    }

	}
	
    }//end main
}//end class Woo
