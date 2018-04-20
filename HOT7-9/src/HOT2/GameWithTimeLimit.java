package HOT2;
//GameWithTimeLimit inherits from superclass Game
public class GameWithTimeLimit extends Game {
//Time limit variable added
private final int timeLimit = 10;
//getter for timeLimit
	public int getTimeLimit() {
		return timeLimit;
	}
	//Constructor that passes the name String to the SuperClass's constructor
	public GameWithTimeLimit(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//toString to display GameWithTimeLimit details
	public String toString()
	{
		return "GAMEWITHTIMELIMIT\n" + super.toString() + "Time Limit: " + this.getTimeLimit();
	}
}
