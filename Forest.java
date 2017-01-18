
public class Forest extends Maps{
    int _waves; 
    int _spawnrate;

    public Forest(){
	_spawnrate = 1;
	_waves = 0;
    }

    /*public void spawn(){
        Monster Harley = new Monster();
    }*/

    public void countWave(){
	if (Character.isAlive() == true){
	    _waves += 1;
	}
    }

	     
}
