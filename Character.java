import java.util.ArrayList;

public class Character{

    /*protected String _name;
    protected int _level;
    protected int _spattack;
    protected int _experience;*/
    private static ArrayList<ArrayList<String>> _inventory = new ArrayList(3);

    /*public String getName(){
	return _name;
    }

    public String setName(String name){
	_name = name;
	return getName();
    }

    public void sortinventory(){
	//Implement inventory sorting
	}*/

    public static void fillArrayList(){
	String blank = "x";
	for (ArrayList<String> x : _inventory){
	    x = new ArrayList(5);
	    for (String y : x){
		y.add(blank);
	    }
	}
    }

    public static String printArrayList(){
	String retStr = "";
	for (ArrayList<String> x : _inventory){
	    retStr += "\n";
	    for (String y : x){
		retStr += x + ", ";
	    }
	}
	return retStr;
    }

    public static void main(String[] args){
	fillArrayList();
	System.out.println(printArrayList());
    }
}
