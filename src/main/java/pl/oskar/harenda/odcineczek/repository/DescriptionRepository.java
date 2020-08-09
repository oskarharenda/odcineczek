package pl.oskar.harenda.odcineczek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.oskar.harenda.odcineczek.entity.Description;

@Repository
public interface DescriptionRepository extends JpaRepository<Description, Long> {
}
