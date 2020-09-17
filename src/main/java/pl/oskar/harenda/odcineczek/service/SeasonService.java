package pl.oskar.harenda.odcineczek.service;

import
        org.springframework.stereotype.Service;
import pl.oskar.harenda.odcineczek.entity.Episode;
import pl.oskar.harenda.odcineczek.entity.Season;
import pl.oskar.harenda.odcineczek.repository.EpisodeRepository;
import pl.oskar.harenda.odcineczek.repository.SeasonRepository;

import java.util.List;

@Service
public class SeasonService {

    private final SeasonRepository seasonRepository;
    private final EpisodeRepository episodeRepository;

    public SeasonService(SeasonRepository seasonRepository, EpisodeRepository episodeRepository) {
        this.seasonRepository = seasonRepository;
        this.episodeRepository = episodeRepository;
    }

    public Season getSeasonById(Long id) {
        return seasonRepository.findById(id).orElseGet(() -> null);
    }

    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }

    public Season addSeason(Season season) {
        for(int i=1; i<=season.getEpisodesNr(); i++){
            Episode episode = new Episode();
            episode.setEpisodeNr(i);
            episode.setSeason(season);
            episodeRepository.save(episode);
        }
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
