/**
 * 
 */
package com.cogent.repo;

import com.cogent.bean.CustomerBean;

/**
 * @author dick
 *
 *         26 сент. 2022 г.
 */
public class CustomerRepo {

	int size = 1;
	CustomerBean[] custArr = new CustomerBean[256];

	public CustomerRepo() {
		// TODO Auto-generated constructor stub

	}

	public void addCustomer(CustomerBean customerBean) {
		custArr[size - 1] = customerBean;
		size++;
	}

	public void viewAllCustomer() {

		System.out.println("\tCustomer Id\tCustomer Name");
		for (int i = 0; i < size - 11; i++)
			System.out.println("\t\t" + custArr[i].getCustomerId() + "\t\t" + custArr[i].getCustomerName());

	}

	public void searchCustomerById(long id) {

		System.out.println("\tCustomer Id\tCustomer Name");
		for (int i = 0; i < size - 1; i++)
			System.out.println("\t\t" + custArr[i].getCustomerId() + "\t\t" + custArr[i].getCustomerName());

	}
}
