package eTicaretKayıtSistemi.bussiness.abstracts;

import eTicaretKayıtSistemi.entities.concretes.Customer;

public interface CustomerService {

	void register(Customer customer);
	void login(Customer customer);
}
