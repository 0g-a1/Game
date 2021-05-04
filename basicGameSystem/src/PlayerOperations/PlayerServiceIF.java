package PlayerOperations;

import Entities.Player;

public interface PlayerServiceIF {
	
	void signUp(Player player);
	
	void infoUpdate(Player player);
	
	void deleteMembership(Player player);

}
