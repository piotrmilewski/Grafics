import java.util.ArrayList;

public class Character{

    protected String _name;
    protected int _level;
    protected int _spattack;
    protected int _experience;
    private static ArrayList<ArrayList<String>> _inventory = new ArrayList(3);

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
