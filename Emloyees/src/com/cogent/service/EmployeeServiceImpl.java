/**
 * 
 */
package com.cogent.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepoImpl;

/**
 * @author dick
 *
 *         3 окт. 2022 г.
 */
public class EmployeeServiceImpl implements EmployeeService {
	
	List<EmployeeBean> employees = new ArrayList<>();

	@Override
	public void addEmloyee(EmployeeBean employeeBean) {
		employees.add(employeeBean);
	}

	@Override
	public void viewAllEmloyees() {

		for (int i = 0; i < employees.size(); i++)
			employees.get(i).toString();
	}

	@Override
	public EmployeeBean findById(long id) {

		for (int i = 0; i < employees.size(); i++)
			if (employees.get(i).getEmployeeId() == id)
				return employees.get(i);
		return null;
	}

	@Override
	public void deleteById(long id) {

		for (int i = 0; i < employees.size(); i++)
			if (employees.get(i).getEmployeeId() == id)
				employees.remove(i);
	}

	@Override
	public EmployeeBean findYoungest() {

		int index = 0;
		int minAge = Integer.MAX_VALUE;
		for (int i = 0; i < employees.size(); i++)
			if (employees.get(i).getEmployeeAge() < minAge) {
				minAge = employees.get(i).getEmployeeAge();
				index = i;
			}
		return employees.get(index);
	}

	@Override
	public List<EmployeeBean> findByCountry(String country) {

		List<EmployeeBean> resultsList = new ArrayList<>();
		for (int i = 0; i < employees.size(); i++)
			if (employees.get(i).getEmployeeCountry() == country)
				resultsList.add(employees.get(i));
		return resultsList;
	}

	@Override
	public List<EmployeeBean> findByCity(String country, String city) {

		List<EmployeeBean> resultsList = new ArrayList<>();
		for (int i = 0; i < employees.size(); i++)
			if ((employees.get(i).getEmployeeCountry()) == country && (employees.get(i).getEmployeeCity() == city))
				resultsList.add(employees.get(i));
		return resultsList;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeRepoImpl other = (EmployeeRepoImpl) obj;
		return Objects.equals(employees, other.employees);
	}

}