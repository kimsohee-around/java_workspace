package partC.day22.example;

import java.util.List;
import java.util.Map;

public interface CustomerAddressBook  { 

	Map<String, Customer> getCustomer();
	List<Customer>group(String group);
	public void print();
	void add(Customer person);
	void load(String File);
	void save(String File);
}
