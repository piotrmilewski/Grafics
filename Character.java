import java.util.ArrayList;

public class Character{

    protected String _name;
    protected int _level;
    protected int _spattack;
    protected int _experience;
    
    public String getName(){
	return _name;
    }

    public String setName(String name){
	_name = name;
	return getName();
    }

    public void sortinventory(){
	//Implement inventory sorting
    }
}
