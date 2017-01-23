public class Swordsman extends Character{

    public Swordsman(String name){ //creates Swordman
	_name = name;
	_level = 1;
	_experience = 0;
	_maxhealth = 200;
	_health = 200;
	_attack = 10;
	_defense = 9;
	_currency = 50;
	fillInv();
    }
}
