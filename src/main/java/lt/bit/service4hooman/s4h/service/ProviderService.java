package lt.bit.service4hooman.s4h.service;

import lt.bit.service4hooman.s4h.entity.Provider;

import java.util.List;

public interface ProviderService {
    Provider getProviderById(Integer id);
    void saveProvider(Provider provider);
    void updateProvider(Integer id, Provider provider);
    void deleteProvider(Integer id);
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    List<Provider> getProviders();
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
    List<Provider> findAllFree();
}
