package demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import demo1.Laptop;
import demo1.LaptopService;

@RestController
public class LaptopRestController {
	@Autowired
 	private LaptopService laptopService;
	
 	@GetMapping("/laptops")
 	//http://localhost:9090/Laptops
	public List<Laptop> getAllLaptops() {
		List<Laptop> Book = laptopService.getAllLaptops();
		return Book;
	}
 	@GetMapping("/laptop")
 	//http://localhost:9090/Laptop/3/get
	public Laptop getSingleLaptop(@RequestParam(name="id", required=false, defaultValue="0") Long id) {
 		Laptop emp=laptopService.getLaptopById(id);
		return emp;
	}
 	@GetMapping("/laptop/{id}/get")
 	//http://localhost:9090/Laptop/3/get
	public Laptop getSingleParamLaptop(@PathVariable Long id) {
 		Laptop emp=laptopService.getLaptopById(id);
		return emp;
	}
	@PostMapping("/laptop")
	public String createLaptop(@RequestBody Laptop Laptop) {
		laptopService.saveLaptop(Laptop);
		return "Record Saved";
	}
	@PutMapping("/laptop")
	public String updateLaptop(@RequestBody Laptop laptop) {
		Laptop laptop_emp=laptopService.getLaptopById(laptop.getLid());
		laptop_emp.setBrand(laptop.getBrand());
		laptop_emp.setCpu(laptop.getCpu());
		laptop_emp.setHdd(laptop.getHdd());
		laptop_emp.setModel(laptop.getModel());
		laptop_emp.setRam(laptop.getRam());
		laptopService.saveLaptop(laptop_emp);
		return "Record has been updated";
	}
	@DeleteMapping("/laptop")
	public String deleteLaptop(@RequestBody Laptop Laptop) {
		laptopService.deleteLaptopById(Laptop.getLid());
		return "Record has been deleted Successfully";
	}
}
