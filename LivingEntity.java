public  class LivingEntity{
    
    protected int _health;
    protected int _attack;
    protected int _defense;
    protected int _currency; //used to pick/drop

    public int getHealth(){ 
	return _health;
    }

    public int getAttack(){
	return _attack;
    }

    public int getCurrency(){
	return _currency;
    }
    
    public int getDefense(){
	return _defense;
    }
    
    public  boolean isAlive(){
	return (getHealth() > 0);
    }

    public int lowerHP(int damage){ //used in battle
	if ((_health - damage) > 0){
	   _health -= damage;
	}
	else{
	    _health = 0;
	}
	return _health;
    }

    public int attack(LivingEntity x){ //both monsters/player use attack
	int damage = (int)((Math.random()*10) + _attack)  - x.getDefense();
	if (damage < 0) damage = 0;
	x.lowerHP(damage);
	return damage;
    }
}
