public class Soldier extends Character{
    
    public Soldier(String name){
	_name = name;
	_level = 1;
	_experience = 0;
	_maxhealth = 200;
	_health = 200;
	_attack = 10;
	_defense = 7;
	_speed = 10;
	_currency = 50;
	fillInv();
    }
}
