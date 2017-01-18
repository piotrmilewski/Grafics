import cs1.Keyboard;
public class Forest extends Maps{
    String prints;
    int selection;
    public void startSpawn(){
	if (Character.isAlive() == true){
	    spawn();
	    fight();
	    prints = "Would you like to continue? Yes(1) No(2)";
	    System.out.println(prints);
	    selection = Keyboard.readInt();
	    if (selection == 2){
		break;
	    }    
	}
    }	     
}
