package eTicaretKay�tSistemi.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretKay�tSistemi.core.utils.abstracts.EmailCheckSerivce;
import eTicaretKay�tSistemi.dataAccess.abstracts.CustomerDao;
import eTicaretKay�tSistemi.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	private List<Customer> customers = new ArrayList<Customer>(); 
	private EmailCheckSerivce checkService;
	
	public HibernateCustomerDao(EmailCheckSerivce checkService , List<Customer> customers ) {
		this.checkService = checkService;
		this.customers = customers;
	}

	@Override
	public boolean register(Customer customer) {
		
		if(checkService.existsEmail(customers, customer)== false) {
			customers.add(customer);
			System.out.println("Kay�t i�lemi ba�ar�l� : "+ customer.getFirstName());
			return true;
		}else {
			System.out.println("Bu email hali haz�rda mevcut");
			return false;
		}
		
		
	}

	@Override
	public void login(Customer customer) {
		System.out.println("Ba�ar�yla giri� yap�ld� : "+ customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Hesab�n�z Silinmi�tir : " + customer.getFirstName());
		
	}

	@Override
	public Customer get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
