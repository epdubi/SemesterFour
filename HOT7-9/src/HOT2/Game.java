package HOT2;
//Game is the Super/Parent Class
public class Game {
//Varibles for name and Max number of players
	private String name;
	private final int MAX_NUM_OF_PLAYERS = 7;
	
	//getters/setters for both varibles
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMAX_NUM_OF_PLAYERS() {
		return MAX_NUM_OF_PLAYERS;
	}
	
	
	//Constructor passing the Name String
	public Game(String name) {
		super();
		this.name = name;
	}
	
	//Game's toString to print out game details
	public String toString()
	{
		return "GAME\n" + "Name: " + this.getName() + "\nMax Number Of Players: " + this.getMAX_NUM_OF_PLAYERS() + "\n";
	}
	
}
