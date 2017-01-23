public class Soldier extends Character{
    
    public Soldier(String name){
	_name = name;
	_level = 1;
	_experience = 0;
	_maxhealth = 175;
	_health = 175;
	_attack = 10;
	_defense = 7;
	_currency = 50;
	fillInv();
    }
}
