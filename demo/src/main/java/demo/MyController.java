package demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	@Autowired
	private EmployeeRepository r;
	
	//@GetMapping("/")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Employee> greeting() {
		return r.findAll();
	}
	@PostMapping("/")
	public Employee greetingPost(@RequestBody Employee employee) {
		return r.save(employee);
	}
	@DeleteMapping("/")
	public String greetingDelete(@RequestParam Long id) {	
		r.deleteById(id);
		return "Record No. "+id+" has been Deleted";
	}
	@PutMapping("/")
	public Employee greetingPut(@RequestBody Employee employee) {
		return r.save(employee);
	}
}