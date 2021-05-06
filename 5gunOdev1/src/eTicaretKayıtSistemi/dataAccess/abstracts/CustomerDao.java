package eTicaretKay�tSistemi.dataAccess.abstracts;

import eTicaretKay�tSistemi.entities.concretes.Customer;

public interface CustomerDao {
	boolean register(Customer customer);
	void login(Customer customer);
	void delete(Customer customer);
	Customer get(String email);
	
}
