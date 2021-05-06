package eTicaretKay�tSistemi.core.utils.concretes;

import eTicaretKay�tSistemi.core.utils.abstracts.ValidationService;
import eTicaretKay�tSistemi.entities.concretes.Customer;

public class ValidationRules implements ValidationService {

	public boolean verifyCustomer(Customer customer) {
		if(customer.getFirstName().length() > 2 && customer.getLastName().length() > 2 && customer.getPassword().length() > 6 && 
				!customer.getPassword().isEmpty() && !customer.getEmail().isEmpty())  {
			return true;
		}else {
			System.out.println("Kullan�c� Bilgileri Hatal� Veya Eksik!");
			return false;
		}
	}
}
