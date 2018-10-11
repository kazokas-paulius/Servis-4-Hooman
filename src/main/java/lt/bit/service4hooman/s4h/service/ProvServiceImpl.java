package lt.bit.service4hooman.s4h.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import lt.bit.service4hooman.s4h.entity.Provider;
import lt.bit.service4hooman.s4h.repository.ProvRepository;
import lt.bit.service4hooman.s4h.service.ProvService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Validated
public class ProvServiceImpl implements ProvService{

    private ProvRepository repository;

///    @Autowired
//    public void setProductRepository(ProvRepository repository) {
    public ProvServiceImpl(ProvRepository repository) {
        this.repository = repository;
    }

	@Override
	public Provider getProviderById(Integer id) {
		return repository.getOne (id);
	}

	@Override
	public void saveProvider(Provider provider) {
		  repository.save(provider);
	}

	@Override
	   public void updateProvider(Integer id, Provider provider) {
//		  Note updated = repository.getOne(id);
//	        updated.setDone(done);
//	        updated.setMessage(message);
//	        repository.save(updated);
		
	}

	@Override
	public void deleteProvider(Integer id) {
		   repository.deleteById(id);
	}

	@Override
	public List<Provider> findAllFree() {
		return repository.findAll();// findAllFree();
	}

	@Override
	public List<Provider> getProviders() {
//		return new ArrayList<Provider>();
//				repository.findAll().stream().collect(Collectors.toList());
		return repository.findAll();
//		return null;
	}
}
