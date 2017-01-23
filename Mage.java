public class Mage extends Character{

    private int _spattack;
    
    public Mage(String name){
	_name = name;
	_level = 1;
	_experience = 0;
	_maxhealth = 200;
	_health = 200;
	_attack = 10;
	_defense = 5;
	_currency = 50;
	fillInv();
    }

    public int attack(LivingEntity x){
	int damage = _attack - x.getDefense();
	if (damage < 0) damage = 0;
	if (Math.random() < 0.5) damage *= 2;
	x.lowerHP(damage);
	return damage;
    }
    
    public int parry(Monster mon){
	int damage = (_attack - mon.getDefense())/2;
	if (Math.random() < 0.5){
	    gainHP(mon._attack - _defense);
	    if (Math.random() < 0.5) damage *= 2;
	    mon.lowerHP(damage);
	}
	return damage;
    }

        public String playerInfo(){
	String prints;
	prints = "Name: " + _name + "\n";
	prints += "Level: " + _level + "\n";
	prints += "Experience: " + _experience + "\n";
	prints += "Health: " + _health + "\n";
	prints += "Attack: " + _attack + "\n";
	prints += "Defense: " + _defense + "\n";
	prints += "Speed: " + _speed + "\n";
	prints += "Currency: " + _currency + "\n";
	prints += "Inventory:\n";
	for (int a = 0; a < 3; a++){
	    for (int x = 0; x < 3; x++){
		prints += "\t" + _inventory[a][x];
	    }
	    prints += "\n";
	}
	return prints;
    }


}
