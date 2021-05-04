package GameOperations;

import Entities.Game;
import Entities.Player;


public interface GameServiceIF {
	
	void add(Game game);
	
	void update(Game game);
	
	void delete(Game game);
	
	void sell(Player player,Game game);
	
}
