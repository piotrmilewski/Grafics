public class Quest1 extends Maps{
    protected _spawnrate = 5;
    protected _waves = 3;


    
    public void spawn (Monster m){
	if (Math.random()*10 > 6){
	    Gargoyle x = new Monster;
	}
	else if (Math.random()*10 > 3){
	    Goblin x = new Monster;
	}
	else {
	    Cyclops x = new Monster;
	}
    }

}
