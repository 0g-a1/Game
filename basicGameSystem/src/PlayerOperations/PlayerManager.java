package PlayerOperations;

import java.util.ArrayList;

import Entities.Player;

public class  PlayerManager implements PlayerServiceIF {

	ArrayList<Player> players = new ArrayList<Player>();
		
	private PlayerCheckServiceIF _playerCheckService;
	
	public PlayerManager(PlayerCheckServiceIF playerCheckService) {
		_playerCheckService = playerCheckService;
	}
	
	
	@Override
	public void signUp(Player player) {
		
		if(_playerCheckService.checkIfRealPerson(player)) 
		{
			System.out.println(player.getFirstName() + " " + player.getLastName() + " kayýt oldu." );
			players.add(player);
		}
		else 
		{
			System.err.println("Not a valid person");
		}
		
	}

	@Override
	public void infoUpdate(Player player) {
		
		
	}

	@Override
	public final void deleteMembership(Player player) {

		System.out.println(player.getFirstName()+" " + player.getLastName() + " oyuncunun üyeliði silindi.");
	}

	
}
