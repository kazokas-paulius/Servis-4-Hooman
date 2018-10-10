package lt.bit.service4hooman.s4h.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import lt.bit.service4hooman.s4h.entity.Provider;
import lt.bit.service4hooman.s4h.repository.ProviderRepository;

@Service
@Validated
public class ProviderServiceImpl {

	private ProviderRepository repository;

///    @Autowired
	public void setProductRepository(ProviderRepository repository) {
		this.repository = repository;
	}

	public List<Provider> getProviders() {
		return repository.findAll().stream().collect(Collectors.toList());
	}

	public Provider getProviderById(Integer id) {
		return repository.getOne(id);
	}

	public void saveProvider(Provider provider) {
		repository.save(provider);
	}

	public void updateProvider(Integer id, Provider provider) {
//		  Note updated = repository.getOne(id);
//	        updated.setDone(done);
//	        updated.setMessage(message);
//	        repository.save(updated);

	}

	public void deleteProvider(Integer id) {
		repository.deleteById(id);
	}

	public List<Provider> findAllFree() {
		return repository.findAll();// findAllFree();
	}
}
