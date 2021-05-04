package CampaignOperations;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public abstract class BaseCampaignManager implements CampaignServiceIF{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getCampaingName() + " baþladý.");
		System.out.println("Ýndirim Oraný : " + campaign.getDiscount());
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getCampaingName() + " indirim oraný " + 
		campaign.getDiscount() + " olarak güncellenmiþtir.");
	}
	

	public final void delete(Campaign campaign) {
		
		System.out.println(campaign.getCampaingName() + " sona ermiþtir.");
	}

	@Override
	public void discountCalculation(Player player, Campaign campaign, Game game) {
		
			
		System.out.println("Sayýn " + player.getFirstName() + ",\n");
		System.out.println(campaign.getCampaingName()+" ile " + game.getGameName() + " oyununu " + 
				(game.getGamePrice() - ( game.getGamePrice() * campaign.getDiscount())) + " TL'ye aldýnýz.");
	}

			

	
}
