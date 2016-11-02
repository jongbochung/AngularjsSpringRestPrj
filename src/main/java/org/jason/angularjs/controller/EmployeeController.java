package org.jason.angularjs.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.jason.angularjs.bean.Employee;
import org.jason.angularjs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private HttpServletRequest request;
	EmployeeService employeeService = new EmployeeService();

	@RequestMapping(value = "/employees", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Employee> getEmployees() {

		List<Employee> listOfCountries = employeeService.getAllEmployees();
		return listOfCountries;
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST, headers = "Accept=application/json")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);

	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);

	}
}
