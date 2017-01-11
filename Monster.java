import util.java.ArrayList;
public abstract class Monster extends Monster{
    public String dropped(ArrayList<String> a){
	if (Math.random()*10 > 6){
	    return a.get(1);
	}
	else if (Math.random()*10 > 3){
	    return a.get(2);
	}
	else{
	    return a.get(3);
	}
    }
}
	



	
 

