package basicGameSystem;

import java.time.LocalDate;

import CampaignOperations.BaseCampaignManager;
import Campaigns.SummerCampaignManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import GameOperations.GameManager;
import PlayerOperations.PlayerManager;
import PlayerOperations.PlayerCheckManager;

public class Main {

	public static void main(String[] args) {

		//Player
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		Player player1 = new Player(1,"Kunfu","Panda",LocalDate.of(1993, 1, 5),"123456789");
		playerManager.signUp(player1);
		Player player2 = new Player(2,"Uçan","Boða",LocalDate.of(1989, 4, 29),"987654321");
		playerManager.signUp(player2);
		
		
		System.out.println("\n ----- \n");
		
		//Game
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(1,"RPG",1000);
		gameManager.add(game1);
		Game game2 = new Game(2,"Arcade",500);
		gameManager.add(game2);
		
		gameManager.sell(player2,game1);
		
		System.out.println("\n ----- \n");
		
		
		
		//Campaign
		BaseCampaignManager campaignManager = new SummerCampaignManager();
		Campaign summerCampaign = new Campaign(1,"Yaz Kampanyasý",0.10);
		campaignManager.add(summerCampaign);
		campaignManager.discountCalculation(player2, summerCampaign, game2);
		
		
		
		
		
		

	}

}
