package demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import demo1.Laptop;
import demo1.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService{
	@Autowired
	private LaptopRepository laptopRepository; 

	@Override
	public List<Laptop> getAllLaptops() {
		// TODO Auto-generated method stub
		return laptopRepository.findAll();
	}

	@Override
	public void saveLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopRepository.save(laptop);
	}

	@Override
	public Laptop getLaptopById(long id) {
		// TODO Auto-generated method stub
		return laptopRepository.findById(id).get();
	}

	@Override
	public void deleteLaptopById(long id) {
		// TODO Auto-generated method stub
		laptopRepository.deleteById(id);
	}

	@Override
	public Page<Laptop> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		// TODO Auto-generated method stub
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return laptopRepository.findAll(pageable);
	}

	@Override
	public void updateLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		saveLaptop(laptop);
	}
}
