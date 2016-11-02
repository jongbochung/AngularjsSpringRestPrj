package org.jason.angularjs.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jason.angularjs.bean.Employee;

/* 
 * It is just a helper class which should be replaced by database implementation. 
 * If you want to keep data in database, create DAO Class and use hibernate or ibatis with Mysql or Oracle.
 */
public class EmployeeService {

	static HashMap<Integer, Employee> humanResourceIdMap = gethumanResourceIdMap();

	public EmployeeService() {
		super();

		if (humanResourceIdMap == null) {
			humanResourceIdMap = new HashMap<Integer, Employee>();
			// Creating some objects of Employee while initializing
			Employee jaosn = new Employee(1, "JASON", "JAVA DEVELOPER");
			Employee andy = new Employee(4, "ANDY", "DBA");
			Employee michael = new Employee(3, "MICHAEL", "RUBY DEVELOPER");
			Employee paul = new Employee(2, "PAUL", "UX DESIGNER");

			humanResourceIdMap.put(1, jaosn);
			humanResourceIdMap.put(4, andy);
			humanResourceIdMap.put(3, michael);
			humanResourceIdMap.put(2, paul);
		}
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>(humanResourceIdMap.values());
		return employees;
	}

	public Employee getEmployee(int id) {
		Employee employee = humanResourceIdMap.get(id);
		return employee;
	}

	public Employee addEmployee(Employee employee) {
		employee.setId(getMaxId() + 1);
		humanResourceIdMap.put(employee.getId(), employee);
		return employee;
	}

	public Employee updateEmployee(Employee employee) {
		if (employee.getId() <= 0)
			return null;
		humanResourceIdMap.put(employee.getId(), employee);
		return employee;

	}

	public void deleteEmployee(int id) {
		humanResourceIdMap.remove(id);
	}

	public static HashMap<Integer, Employee> gethumanResourceIdMap() {
		return humanResourceIdMap;
	}

	// Utility method to get max id
	public static int getMaxId() {
		int max = 0;
		for (int id : humanResourceIdMap.keySet()) {
			if (max <= id)
				max = id;

		}
		return max;
	}
}
