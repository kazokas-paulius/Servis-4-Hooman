package lt.bit.service4hooman.s4h.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import lt.bit.service4hooman.s4h.entity.Provider;
import lt.bit.service4hooman.s4h.repository.ProviderRepository;
import lt.bit.service4hooman.s4h.service.ProviderService;

import java.util.List;

@Service
@Validated
public class ProviderServiceImpl {

    private ProviderRepository repository;

///    @Autowired
    public void setProductRepository(ProviderRepository repository) {
        this.repository = repository;
    }

	public Provider getProviderById(Integer id) {
		return repository.getOne (id);
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
