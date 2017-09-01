package feedback.services;

import feedback.models.Business;

import java.util.List;

public interface BusinessService {
    Business findById(Long id);
    Business findByBusinessname(String username);
    List<Business> findAll();
}
