package lt.bit.service4hooman.s4h.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.bit.service4hooman.s4h.entity.Provider;

//@Repository
public interface ProvRepository extends JpaRepository<Provider, Integer> {

	List<Provider> findAll(); //WhereFreeIsNotNull(); //Free();
	List<Provider> findByName(String name); 
//	List<Provider> findByFreeBeforeNowOrderByFree(LocalDate now); 
//	List<Provider> findByFreeOrderByFree();

	List<Provider> findByFreeBeforeOrderByFree(LocalDate today); 
	
	
}
