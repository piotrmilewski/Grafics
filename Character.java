public class Character extends LivingEntity{

    protected String _name;
    protected int _level;
    protected int _experience;
    protected int _lvlupexp;
    protected int _maxhealth;
    protected String[][] _inventory = new String[3][3];
    
    public String getName(){
	return _name;
    }

    public String setName(String name){
	_name = name;
	return getName();
    }

    public int gainCurrency(int amount){
	_currency += amount;
	return _currency;
    }

    public int loseCurrency(int amount){
	_currency -= amount;
	return _currency;
    }

    public static String desc(){
	String retStr = "\tSoldier: 200 health, 0 level, 10 attack, 10 defense, 10 speed, 0 special attack\n";
	//retStr += "\tSwordsman: ___ health, ___ level, ___ attack, ___defense, ___ speed, ___ special attack\n";
	retStr += "\tMage: 200 health, 0 level, 0 attack, 5 defense, 10 speed, 10 special attack\n";
	return retStr; 
    }

    public int levelUp(int exp){
	_experience += exp;
	if (_experience > _lvlupexp){
	    _level += 1;
	    _experience = _experience - _lvlupexp;
	    _lvlupexp += 200;
	}
	return _level;
    }

    public int gainHP(int hp){
	if (_health + hp > _maxhealth){
	    _health = _maxhealth;
	}
	else{
	    _health += hp;
	}
	return _health;
    }

    public void fillInv(){
	for (int x = 0; x < _inventory.length; x++){
	    for (int y = 0; y < _inventory[0].length; y++){
		_inventory[x][y] = "No_Item";
	    }
	}
    }
    
    public void insertInv(String name, int a){
	for (int x = 0; x < _inventory[a].length; x++){
	    if (_inventory[a][x].equals("No_Item")){
		_inventory[a][x] = name;
		break;
	    }
	}
    }

    public void removeInv(String name, int a){
	for (int x = 0; x < _inventory[a].length; x++){
	    if (_inventory[a][x].equals(name)){
		_inventory[a][x] = "No_Item";
		break;
	    }
	}
    }

    public void addItem(String name){
	if (name.substring(0,1).equals("p")){
	    insertInv(name, 0);
	}
	if (name.substring(0,1).equals("w")){
	    insertInv(name, 1);
	}
	if (name.substring(0,1).equals("a")){
	    insertInv(name, 2);
	}
    }

    public void sellItem(String name){
	if (name.substring(0,1).equals("p")){
	    removeInv(name, 0);
	}
	if (name.substring(0,1).equals("w")){
	    removeInv(name, 1);
	}
	if (name.substring(0,1).equals("a")){
	    removeInv(name, 2);
	}
    }

    public int parry(Monster mon){
	int damage = (_attack - mon.getDefense())/2;
	if (Math.random() < 0.5){
	    gainHP(mon.getAttack() - _defense);
	    mon.lowerHP(damage);
	}
	return damage;
    }

    //returns currency and inventory
    public String playerInfo(){
	String summary;
	summary = "Currency: " + _currency + "\n";
	summary += "Inventory:\n";
	for (int a = 0; a < 3; a++){
	    for (int x = 0; x < 3; x++){
		summary += "\t" + _inventory[a][x];
	    }
	    summary += "\n";
	}
	return summary;
    }
}
