package CampaignOperations;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public abstract class BaseCampaignManager implements CampaignServiceIF{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getCampaingName() + " ba�lad�.");
		System.out.println("�ndirim Oran� : " + campaign.getDiscount());
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getCampaingName() + " indirim oran� " + 
		campaign.getDiscount() + " olarak g�ncellenmi�tir.");
	}
	

	public final void delete(Campaign campaign) {
		
		System.out.println(campaign.getCampaingName() + " sona ermi�tir.");
	}

	@Override
	public void discountCalculation(Player player, Campaign campaign, Game game) {
		
			
		System.out.println("Say�n " + player.getFirstName() + ",\n");
		System.out.println(campaign.getCampaingName()+" ile " + game.getGameName() + " oyununu " + 
				(game.getGamePrice() - ( game.getGamePrice() * campaign.getDiscount())) + " TL'ye ald�n�z.");
	}

			

	
}
