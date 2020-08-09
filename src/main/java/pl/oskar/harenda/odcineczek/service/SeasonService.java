package pl.oskar.harenda.odcineczek.service;

import org.springframework.stereotype.Service;
import pl.oskar.harenda.odcineczek.entity.Season;
import pl.oskar.harenda.odcineczek.repository.SeasonRepository;

import java.util.List;

@Service
public class SeasonService {

    private final SeasonRepository seasonRepository;

    public SeasonService(SeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    public Season getSeasonById(Long id) {
        return seasonRepository.findById(id).orElseGet(() -> null);
    }

    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }

    public Season addSeason(Season season) {
        return seasonRepository.save(season);
    }

    public Season updateSeason(Long id, Season season) {
        seasonRepository.findById(id).orElseGet(() -> null);
        season.setId(id);
        return seasonRepository.save(season);
    }

    public void deleteSeason(Long id) {
        seasonRepository.deleteById(id);
    }
}
