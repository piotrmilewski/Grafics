import java.util.ArrayList;
public abstract class Monster extends LivingEntity{
    protected ArrayList<String> _inventory;

    public void fillItems(){ //used to fill inventory of monster
	_inventory = new ArrayList<String>();
	for (int x = 0; x < 3; x+=1){
	    if (Math.random() < 0.25){
		_inventory.add("Potion");
	    }
	    else if (Math.random()*3 < .5){
		_inventory.add("Rare Sweet");
	    }
	    else if (Math.random()*3 < .75){
		_inventory.add("AttackUp");
	    }
	    else{
		_inventory.add("DefenseUp");
	    }
	}		      
    }    
    
    public String drop(){ //Assuming that monster has an inventory of 3 items, each have an equal chance of being dropped
	if (Math.random()*10 > 6){
	    return _inventory.get(0); //first item in inventory
	}
	else if (Math.random()*10 > 3){ //second item
	    return _inventory.get(1);
	}
	else{ //third item
	    return _inventory.get(2);
	}
    }
}
    




	

    


