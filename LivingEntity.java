public abstract class LivingEntity{
    protected int _health;
    protected int _attack;
    protected int _defense;
    protected int _speed;
    protected int _currency;
    protected ArrayList<String> _inventory;

    public int getHealth(){
	return _health;
    }

    public boolean isAlive(){
	return (getHealth() > 0);
    }

    public int lowerHP(int damage){
	if ((_health - damage) > 0){
	   _health -= damage;
	}
	else{
	    _health = 0;
	}
	return _health;
    }

    public abstract void sortinventory();

    public void attack(){
	
    }
