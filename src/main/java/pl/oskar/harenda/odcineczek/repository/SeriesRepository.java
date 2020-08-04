package pl.oskar.harenda.odcineczek.repository;

import org.springframework.data.repository.CrudRepository;
import pl.oskar.harenda.odcineczek.entity.Series;

public interface SeriesRepository extends CrudRepository<Series, Long> {
}
