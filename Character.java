public abstract class Character{

    protected String _name;
    protected int _level;
    protected int _spattack;
    protected int _experience;
    protected int _lvlupexp;
    protected String[][] _inventory = new String[3][3];
    
    public String getName(){
	return _name;
    }

    public String setName(String name){
	_name = name;
	return getName();
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

    public void insertinv(String name, int a){
	for (int x = 0; x < _inventory[0].length; x++){
	    if (_inventory[a][x].equals("")){
		_inventory[a][x] = name;
		break;
	    }
	}
    }

    public void removeinv(String name, int a){
	for (int x = 0; x < _inventory[0].length; x++){
	    if (_inventory[a][x].equals(name)){
		_inventory[a][x] = "";
		break;
	    }
	}
    }

    public void additem(String name){
	if (name.substring(0).equals("P")){
	    insertinv(name, 0);
	}
	if (name.substring(0).equals("W")){
	    insertinv(name, 1);
	}
	if (name.substring(0).equals("A")){
	    insertinv(name, 2);
	}
    }

    public void sellitem(String name){
	if (name.substring(0).equals("P")){
	    removeinv(name, 0);
	}
	if (name.substring(0).equals("W")){
	    removeinv(name, 1);
	}
	if (name.substring(0).equals("A")){
	    removeinv(name, 2);
	}
    }

    public static String desc(){
	String retStr = "\tSoldier: ___ health, ___ level, ___ attack, ___defense, ___ speed, ___ special attack\n";
	retStr += "\tSwordsman: ___ health, ___ level, ___ attack, ___defense, ___ speed, ___ special attack\n";
	retStr += "\tMage: ___ health, ___ level, ___ attack, ___defense, ___ speed, ___ special attack\n";
	return retStr; 
    }
}
