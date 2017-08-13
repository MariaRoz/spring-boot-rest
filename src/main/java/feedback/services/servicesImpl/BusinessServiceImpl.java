package feedback.services.servicesImpl;

import feedback.models.Business;
import feedback.repositories.BusinessRepository;
import feedback.services.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
            BusinessRepository businessRepository;

    @Override
    public List<Business> getAll() {
        return businessRepository.findAll();
    }

    @Override
    public Business getBusinessById(Integer id) {
        return null;
    }
}
