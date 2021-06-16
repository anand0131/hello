package demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import demo1.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long>{

}