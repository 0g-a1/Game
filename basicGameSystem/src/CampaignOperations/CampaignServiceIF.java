package CampaignOperations;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface CampaignServiceIF {

	void add(Campaign campaign);
	
	void update(Campaign campaign);
	
	void delete(Campaign campaign);
	
	void discountCalculation(Player player,Campaign campaign,Game game);
	
}
