package ua.goit.customerdata.repository;

import org.springframework.data.repository.CrudRepository;
import ua.goit.customerdata.models.PhoneNumber;

import java.util.List;

public interface PhoneNumberRepository extends CrudRepository<PhoneNumber, Long> {
    List<PhoneNumber> findAll();

}
