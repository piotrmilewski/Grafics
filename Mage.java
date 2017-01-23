public class Mage extends Character{
  
    public Mage(String name){ //creates a mage
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
 
}
