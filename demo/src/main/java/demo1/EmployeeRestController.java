package demo1;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import demo1.Employee;
import demo1.EmployeeService;

@RestController
public class EmployeeRestController {
	@Autowired
 	private EmployeeService employeeService;
	
 	@GetMapping("/employees")
 	//http://localhost:9090/employees
	public List<Employee> getAllEmployees() {
		List<Employee> Book = employeeService.getAllEmployees();
		return Book;
	}
 	@GetMapping("/employee")
 	//http://localhost:9090/employee/3/get
	public Employee getSingleEmployee(@RequestParam(name="id", required=false, defaultValue="0") Long id) {
 		Employee emp=employeeService.getEmployeeById(id);
		return emp;
	}
 	@GetMapping("/employee/{id}/get")
 	//http://localhost:9090/employee/3/get
	public Employee getSingleParamEmployee(@PathVariable Long id) {
 		Employee emp=employeeService.getEmployeeById(id);
		return emp;
	}
	@PostMapping("/employee")
	public String createEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return "Record Saved";
	}
	@PutMapping("/employee")
	public String updateEmployee(@RequestBody Employee employee) {
		Employee emp=employeeService.getEmployeeById(employee.getEid());
		emp.setEmail(employee.getEmail());
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		//emp.setUpdatedAt(new Date());
		employeeService.saveEmployee(emp);
		return "Record has been updated";
	}
	@DeleteMapping("/employee")
	public String deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployeeById(employee.getEid());
		return "Record has been deleted Successfully";
	}
}

