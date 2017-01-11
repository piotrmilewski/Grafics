import util.java.ArrayList;
public abstract class Monster extends Monster{
    public String dropped(ArrayList<String> a){ //Assuming that monster has an inventory of 3 items, each have an equal chance of being dropped
	if (Math.random()*10 > 6){
	    return a.get(1); //first item in inventory
	}
	else if (Math.random()*10 > 3){ //second item
	    return a.get(2); 
	}
	else{ //third item
	    return a.get(3);
	}
    }
}
	



	
 

