
public class Forest extends Maps{

    public Forest(){
	_spawnrate = 1;
	_waves = 0;
    }

    public void spawn (){
        Harley = new Monster();
    }

    public void countWave(){
	if (Character.isAlive() == true){
	    _wave += 1;
	}
    }

    public void quit(){
    }
	     
}
