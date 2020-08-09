package pl.oskar.harenda.odcineczek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.oskar.harenda.odcineczek.entity.Series;

public interface SeriesRepository extends JpaRepository<Series, Long> {
}
