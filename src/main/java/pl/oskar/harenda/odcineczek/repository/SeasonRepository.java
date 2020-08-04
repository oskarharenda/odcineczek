package pl.oskar.harenda.odcineczek.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskar.harenda.odcineczek.entity.Season;

@Repository
public interface SeasonRepository extends CrudRepository<Season, Long> {
}
