package feedback.repositories;


import org.springframework.data.repository.CrudRepository;
import feedback.models.Business;

import java.util.List;

public interface BusinessRepository extends CrudRepository<Business, Long> {
    List<Business> findAll();
}
