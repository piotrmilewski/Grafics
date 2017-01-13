public abstract class Character{

    protected String _name;
    protected int _level;
    protected int _spattack;
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

    public static String desc(){
	String retStr = "\tSoldier: ___ health, ___ level, ___ attack, ___defense, ___ speed, ___ special attack\n";
	retStr += "\tSwordsman: ___ health, ___ level, ___ attack, ___defense, ___ speed, ___ special attack\n";
	retStr += "\tMage: ___ health, ___ level, ___ attack, ___defense, ___ speed, ___ special attack\n";
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
    }

    public void insertInv(String name, int a){
	for (int x = 0; x < _inventory[0].length; x++){
	    if (_inventory[a][x].equals("")){
		_inventory[a][x] = name;
		break;
	    }
	}
    }

    public void removeInv(String name, int a){
	for (int x = 0; x < _inventory[0].length; x++){
	    if (_inventory[a][x].equals(name)){
		_inventory[a][x] = "";
		break;
	    }
	}
    }

    public void addItem(String name){
	if (name.substring(0).equals("P")){
	    insertInv(name, 0);
	}
	if (name.substring(0).equals("W")){
	    insertInv(name, 1);
	}
	if (name.substring(0).equals("A")){
	    insertInv(name, 2);
	}
    }

    public void sellItem(String name){
	if (name.substring(0).equals("P")){
	    removeInv(name, 0);
	}
	if (name.substring(0).equals("W")){
	    removeInv(name, 1);
	}
	if (name.substring(0).equals("A")){
	    removeInv(name, 2);
	}
    }

    public void parry(Monster mon){
        if (Math.random() < 0.5){
	    gainHP(mon_attack - _defense);
	    mon.lowerHP((mon._attack - _defense)/2);
	}
    }
}
