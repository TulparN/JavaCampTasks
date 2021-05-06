package eTicaretKay�tSistemi.core.utils.abstracts;

import java.util.List;

import eTicaretKay�tSistemi.entities.concretes.Customer;

public interface EmailCheckSerivce {
	boolean checkEmail(Customer customer);
	void sendVerifyMail(Customer customer);
	boolean existsEmail(List<Customer> customers, Customer customer);
}
