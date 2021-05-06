package eTicaretKay�tSistemi.bussiness.concretes;

import eTicaretKay�tSistemi.bussiness.abstracts.CustomerService;
import eTicaretKay�tSistemi.core.utils.abstracts.EmailCheckSerivce;
import eTicaretKay�tSistemi.core.utils.abstracts.ValidationService;
import eTicaretKay�tSistemi.dataAccess.abstracts.CustomerDao;
import eTicaretKay�tSistemi.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private EmailCheckSerivce mailCheck;
	private ValidationService validation;
	
	public CustomerManager(CustomerDao customerDao,EmailCheckSerivce mailCheck, ValidationService validation) {
		
		this.customerDao = customerDao;
		this.mailCheck = mailCheck;
		this.validation = validation;
	}

	@Override
	public void register(Customer customer) {
		
		if(mailCheck.checkEmail(customer) == true && validation.verifyCustomer(customer) == true) {
			if(customerDao.register(customer)==true) {
				mailCheck.sendVerifyMail(customer);
			}else {
				return;
			}
			
		}else {
			System.out.println("L�tfen Bilgilerinizi Kontrol Ediniz.");
		}
		
		
	}

	@Override
	public void login(Customer customer) {
		if(mailCheck.checkEmail(customer) == true  && validation.verifyCustomer(customer) == true) {
			customerDao.login(customer);
		}else {
			System.out.println("Giri� Ba�ar�s�z");
		}
		
	}

}
