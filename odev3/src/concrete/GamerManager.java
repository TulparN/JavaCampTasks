package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {

	GamerCheckService checkService;
	
	public GamerManager(GamerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void add(Gamer gamer) {
		if(checkService.gamerCheckRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " Kay�t i�lemi ba�ar�l�");
		}else {
			System.out.println(gamer.getFirstName() + " Ger�ek bir ki�i oldu�unuz do�rulanamad�!");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" ba�ar�yla silinmi�tir.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" bilgileriniz ba�ar�yla g�ncellendi.");
		
	}

}
