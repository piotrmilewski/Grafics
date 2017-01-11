pubilc abstract class Character{

    protected String _name;
    protected int _health;
    protected int _attack;
    protected int _defense;
    protected int _level;
    protected int _spattack;
    protected int _speed;
    protected int _experience;
    protected int _currency;
    protected ArrayList<String> _inventory;

    public String getName(){
	return _name;
    }

    public String setName(String name){
	_name = name;
	return getName();
    }

    public int getHealth(){
	return _health;
    }
    
    public boolean isAlive(){
	return (getHealth() > 0);
    }

    public void sortinventory(){
	//Implement inventory sorting
    }

    public int lowerHP(int damage){
	if ((_health - damage) > 0){
	    _health -= damage;
	}
	else{
	    _health = 0;
	}
	return getHealth();
    }

    
}
