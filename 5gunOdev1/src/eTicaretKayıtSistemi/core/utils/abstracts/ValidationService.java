package eTicaretKayıtSistemi.core.utils.abstracts;

import eTicaretKayıtSistemi.entities.concretes.Customer;

public interface ValidationService {
	boolean verifyCustomer(Customer customer);
}
