package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
public class MyPageController {
	@Autowired
	private EmployeeRepository r;

	@GetMapping("/page") // only for retrieving Data/Resource
	public String myhome(Model model) {
		List<Employee> d=r.findAll();
		model.addAttribute("data", d);
		return "NewFile";
		
	}


}
