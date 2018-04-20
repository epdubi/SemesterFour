package HOT2;

public class HOT2Driver {

	public static void main(String[] args) {
		//create game
		Game game1 = new Game("Eric's Game");
		//Print game
		System.out.println(game1.toString());
		//create GameWithTimeLimit
		GameWithTimeLimit limit1 = new GameWithTimeLimit("Eric's Game");
		//Print Game With Time Limit
		System.out.println(limit1.toString());

	}

}
