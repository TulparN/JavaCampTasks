package concrete;

import abstracts.GameService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void sellGame(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + " : " + gamer.getNickName() + " k�t�phanenize eklenmi�tir. ");
		
	}

	@Override
	public void addCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " : " + campaign.getCampaignName()+ " kampanyas� " + campaign.getCampaignDate()+" tarihinde ba�ar�yla yay�nlanm��t�r.");
		
	}

	@Override
	public void updateCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " : " + campaign.getCampaignName()+ " kampanyas�n�n g�ncelleme i�lemi ba�ar�yla ger�ekle�mi�tir.");
		
	}

	@Override
	public void deleteCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " : " + campaign.getCampaignName() + " kampanyas� silinmi�tir");
		
	}

}
