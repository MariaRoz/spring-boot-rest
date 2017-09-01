package feedback.services;

import feedback.models.Business;
import feedback.repositories.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    BusinessRepository businessRepository;

    @Override
    @PreAuthorize("hasRole('USER')")
    public Business findByBusinessname(String businessname) throws UsernameNotFoundException {
        Business business = businessRepository.findByBusinessname(businessname);
        return business;
    }

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public Business findById(Long id) throws AccessDeniedException {
        Business business = businessRepository.findOne(id);
        return business;
    }

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public List<Business> findAll() throws AccessDeniedException {
        List<Business> result = businessRepository.findAll();
        return result;
    }
}