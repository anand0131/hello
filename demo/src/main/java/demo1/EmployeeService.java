package demo1;

import java.util.List;

import org.springframework.data.domain.Page;
import demo1.Employee;


public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	void updateEmployee(Employee employee);
}