package eTicaretKay�tSistemi.core.utils.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretKay�tSistemi.core.utils.abstracts.EmailCheckSerivce;
import eTicaretKay�tSistemi.entities.concretes.Customer;

public class EmailCheckManager implements EmailCheckSerivce{

	private String regex = ".*@[a-z[0-9]]";
    private Pattern pattern = Pattern.compile(regex);
	
	@Override
	public boolean checkEmail(Customer customer) {
		Matcher match = pattern.matcher(customer.getEmail());
		if(!match.find()) {
			System.out.println("L�tfen E-Mail inizi kontrol ediniz.");
			return false;
		}
		return true;
	}

	@Override
	public void sendVerifyMail(Customer customer) {
		if(checkEmail(customer)==true) {
			System.out.println("Do�rulama Maili G�nderildi.");
		}
		
	}

	@Override
	public boolean existsEmail(List<Customer> customers, Customer customer) {
		for (Customer customer1 : customers) {
			if(customer1.getEmail() == customer.getEmail()) {
				
				return true;
			}
		}
		return false;
	}

	

	

	

	

}
