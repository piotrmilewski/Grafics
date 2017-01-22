import java.util.ArrayList;
public abstract class Monster extends LivingEntity{
    protected ArrayList<String> _inventory;

    public ArrayList<String> fillArrayList(ArrayList<String> _data){
	for (int x = 0; x < 3; x+=1){
		      if (Math.random()*3 > 2.01){
			  _data.add("health_potion");
		      }
		      else if (Math.random()*3 == 2){
			  _data.add("magic_dulce");
			      }
		      else if (Math.random()*3 > 1){
			  _data.add("attack_potion");
		      }
		     
		      else{
			  _data.add("defense_potion");
		      }
	}		      
	return _data;
    }
        
    
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
    




	

    


