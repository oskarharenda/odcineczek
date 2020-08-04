package pl.oskar.harenda.odcineczek.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskar.harenda.odcineczek.entity.Episode;

@Repository
public interface EpisodeRepository extends CrudRepository<Episode,Long> {
}
