package demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import demo1.Laptop;
import demo1.LaptopService;

@Controller("/laptop")
public class LaptopController {
	@Autowired
	private LaptopService laptopService;
	
	// display list of Laptops

//	public String viewHomePage(Model model) {
//		return findPaginated(1, "firstName", "asc", model);		
//	}
//	
//	@GetMapping("/showNewLaptopForm")
//	public String showNewLaptopForm(Model model) {
//		// create model attribute to bind form data
//		Laptop Laptop = new Laptop();
//		model.addAttribute("Laptop", Laptop);
//		return "new_Laptop";
//	}
//	
//	@PostMapping("/saveLaptop")
//	public String saveLaptop(@ModelAttribute("Laptop") Laptop Laptop) {
//		// save Laptop to database
//		laptopService.saveLaptop(Laptop);
//		return "redirect:/";
//	}
//	
//	@GetMapping("/showFormForUpdate/{lid}")
//	public String showFormForUpdate(@PathVariable ( value = "lid") long lid, Model model) {
//		
//		// get Laptop from the service
//		Laptop Laptop = laptopService.getLaptopById(lid);
//		
//		// set Laptop as a model attribute to pre-populate the form
//		model.addAttribute("Laptop", Laptop);
//		return "update_Laptop";
//	}
//	
//	@GetMapping("/deleteLaptop/{id}")
//	public String deleteLaptop(@PathVariable (value = "id") long id) {
//		
//		// call delete Laptop method 
//		this.laptopService.deleteLaptopById(id);
//		return "redirect:/";
//	}
//	
//	
//	@GetMapping("/page/{pageNo}")
//	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
//			@RequestParam("sortField") String sortField,
//			@RequestParam("sortDir") String sortDir,
//			Model model) {
//		int pageSize = 5;
//		
//		Page<Laptop> page = laptopService.findPaginated(pageNo, pageSize, sortField, sortDir);
//		List<Laptop> listLaptops = page.getContent();
//		
//		model.addAttribute("currentPage", pageNo);
//		model.addAttribute("totalPages", page.getTotalPages());
//		model.addAttribute("totalItems", page.getTotalElements());
//		
//		model.addAttribute("sortField", sortField);
//		model.addAttribute("sortDir", sortDir);
//		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
//		
//		model.addAttribute("listLaptops", listLaptops);
//		return "index";
//	}
}
