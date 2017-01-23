public class Swordsman extends Character{

    public Swordsman(String name){
	_name = name;
	_level = 0;
	_experience = 0;
	_maxhealth = 200;
	_health = 200;
	_attack = 10;
	_defense = 9;
	_currency = 0;
	fillInv();
    }
}
