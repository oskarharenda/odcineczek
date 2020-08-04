package pl.oskar.harenda.odcineczek.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskar.harenda.odcineczek.entity.Description;

@Repository
public interface DescriptionRepository extends CrudRepository<Description, Long> {
}
