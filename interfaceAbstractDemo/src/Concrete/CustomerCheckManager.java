package Concrete;

import Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager  implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		 return true;
	}

	

}
