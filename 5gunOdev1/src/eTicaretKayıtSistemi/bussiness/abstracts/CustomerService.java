package eTicaretKay�tSistemi.bussiness.abstracts;

import eTicaretKay�tSistemi.entities.concretes.Customer;

public interface CustomerService {

	void register(Customer customer);
	void login(Customer customer);
}
