package demo1;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import demo1.Laptop;

public interface LaptopService {
	List<Laptop> getAllLaptops();
	void saveLaptop(Laptop laptop);
	Laptop getLaptopById(long id);
	void deleteLaptopById(long id);
	Page<Laptop> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	void updateLaptop(Laptop laptop);
}