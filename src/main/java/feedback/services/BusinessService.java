package feedback.services;

import feedback.models.Business;

import java.sql.SQLException;
import java.util.List;

public interface BusinessService {
    List<Business> getAll() throws SQLException;

    Business getBusinessById(Integer id) throws SQLException;

}
