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
	    _lvlupexp + 200;
	}
	return _level;
    }

    public void insertinv(String name, int a){
	for (int x = 0; x < _inventory[0]; x++){
	    if (_inventory[a][x].equals("")){
		_inventory[a][x] = name;
		break;
	    }
	}
    }

    public void removeint(String name, int a){
	for (int x = 0; x < _inventory[0]; x++){
	    if (_inventory[a][x].equals(name)){
		_inventory[a][x] = "";
		break;
	    }
	}
    }

    public void additem(String name){
	if (name[0].equals("P")){
	    accessinv(name, 0);
	}
	if (name[0].equals("W")){
	    accessinv(name, 1);
	}
	if (name[0].equals("A")){
	    accessinv(name, 2);
	}
    }

    public void sellitem(String name){
	if (name[0].equals("P")){
	    removeinv(name, 0);
	}
	if (name[0].equals("W")){
	    removeinv(name, 1);
	}
	if (name[0].equals("A")){
	    removeinv(name, 2);
	}
    }

    
}
