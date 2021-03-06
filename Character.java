public class Character extends LivingEntity{

    protected String _name;
    protected int _level;
    protected int _experience;
    protected int _lvlupexp = 50;
    protected int _maxhealth;
    protected String[][] _inventory = new String[2][5];
    
    public String getName(){
	return _name;
    }
  
    public String setName(String name){
	_name = name;
	return getName();
    }

    public int gainCurrency(int amount){ //used when player defeats monster
	_currency += amount;
	return _currency;
    }

    public int loseCurrency(int amount){ //used when player dies
	if (_currency - amount <= 0){
	    _currency = 0;
	}
	else{
	    _currency -= amount;
	}
	return _currency;
    }

    public static String desc(){ //gives original stats 
	String retStr = "\tSoldier: 175 health, 10 attack, 7 defense\n";
	retStr += "\tSwordsman: 200 health, 10 attack, 9 defense\n";
	retStr += "\tMage: 200 health, 10 attack, 5 defense\n";
	return retStr; 
    }

    public int levelUp(int exp){ //updates stats when leveling up
	_experience += exp;
	if (_experience >= _lvlupexp){
	    _level += 1;
	    _experience = _experience - _lvlupexp;
	    _lvlupexp += 10;
	    _maxhealth += 10;
	    _health = _maxhealth; //heals player
	    _attack += 2;
	    _defense += 2;
	}
	return _level;
    }


    public int gainHP(int hp){ //used for items
	if (_health + hp > _maxhealth){
	    _health = _maxhealth;
	}
	else{
	    _health += hp;
	}
	return _health;
    }

    public int gainAttack(int atk){ //used for items
	_attack += atk;
	return _attack;
    }

    public int gainDefense(int def){ //used for items
	_defense += def;
	return _defense;
    }

    public void fillInv(){ //creates inventory
	for (int x = 0; x < _inventory.length; x++){
	    for (int y = 0; y < _inventory[0].length; y++){
		_inventory[x][y] = "No_Item";
	    }
	}
    }
	
    public void addItem(String name){ //gains item
	for (int a = 0; a < _inventory.length; a++){
	    for (int x = 0; x < _inventory[0].length; x++){
		if (_inventory[a][x].equals("No_Item")){
			_inventory[a][x] = name;
			return;
		}
	    }
	}
    }
    
    public void sellItem(String name){ //gives up item
	for (int a = 0; a < _inventory.length; a++){
	    for (int x = 0; x < _inventory[0].length; x++){
		String playeritem = _inventory[a][x].toLowerCase();
		if (playeritem.equals(name)){
			_inventory[a][x] = "No_Item";
			return;
		}
	    }
	}
    }

    public int parry(Monster mon){ //50% of dodging an attack
	int damage = (_attack - mon.getDefense())/2;
	if (Math.random() < 0.5){
	    gainHP(mon.getAttack() - _defense);
	    mon.lowerHP(damage);
	}
	return damage;
    }

    public String playerInfo(){ //displays current stats
	String prints;
	prints = "Name: " + _name + "\n";
	prints += "Level: " + _level + "\n";
	prints += "Experience: " + _experience + "\n";
	prints += "Health: " + _health + "\n";
	prints += "Attack: " + _attack + "\n";
	prints += "Defense: " + _defense + "\n";
	prints += "Currency: " + _currency + "\n";
	return prints;
    }

    public String printInventory(){ //displays inventory
	String prints;
	prints = "Inventory:\n";
	for (int a = 0; a < _inventory.length; a++){
	    for (int x = 0; x < _inventory[0].length; x++){
		prints += "\t" + _inventory[a][x];
	    }
	    prints += "\n";
	}
	return prints;
    }
	

    public boolean hasItem(String item){ //to check if player has an item
	for (int a = 0; a < _inventory.length; a++){
	    for (int x = 0; x < _inventory[0].length; x++){
		String playeritem = _inventory[a][x].toLowerCase();
		if (playeritem.equals(item)){
		    return true;
		}
	    }
	}
	return false; 
    }
    
    public void useItem(String item){ //used in battle
	if (item.equals("potion")){
	    gainHP(50);
	    System.out.print("\n" + _name + " gained 50 HP!\n");
	}
	else if (item.equals("max potion")){
	    gainHP(_maxhealth);
	    System.out.print("\n" + _name + "'s health has been restored!\n");
	}
	else if (item.equals("attackup")){
	    gainAttack(2);
	    System.out.print("\n" + _name + "'s attack increased by 2!\n");
	}
	else if (item.equals("defenseup")){
	    gainDefense(2);
	    System.out.print("\n" + _name + "'s defense increased by 2!\n");
	}
	else if (item.equals("rare sweet")){
	    int exp = _experience;
	    levelUp(_lvlupexp);
	    _experience = exp;
	    System.out.print("\n" + _name + " is now Level " + _level);
	}
	sellItem(item);
    }
	
    
}//end Character
