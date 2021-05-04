package GameOperations;

import CampaignOperations.CampaignServiceIF;
import Entities.Game;
import Entities.Player;


public class GameManager implements GameServiceIF {
	
	
	CampaignServiceIF _campaignService;
	public GameManager(CampaignServiceIF campaignService) {
		_campaignService = campaignService;
	}
	
	
	public GameManager() {
		
	}

	@Override
	public void add(Game game) {
		
	}
	
	@Override
	public void update(Game game) {
		
	}

	@Override
	public void delete(Game game) {
		
	} 

	@Override
	public void sell(Player player ,Game game) {
		
		System.out.println(player.getFirstName() + " " + player.getLastName() + "\n" + 
				game.getGamePrice() + " TL'ye " + game.getGameName() + " satýn aldýnýz.");
	}

	

}
