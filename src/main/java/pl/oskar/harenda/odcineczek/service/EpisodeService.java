package pl.oskar.harenda.odcineczek.service;

import org.springframework.stereotype.Service;
import pl.oskar.harenda.odcineczek.entity.Episode;
import pl.oskar.harenda.odcineczek.repository.EpisodeRepository;
import pl.oskar.harenda.odcineczek.repository.SeasonRepository;

import java.util.List;

@Service
public class EpisodeService {

    private final EpisodeRepository episodeRepository;
    private final SeasonRepository seasonRepository;

    public EpisodeService(EpisodeRepository episodeRepository, SeasonRepository seasonRepository) {
        this.episodeRepository = episodeRepository;
        this.seasonRepository = seasonRepository;
    }

    public Episode getEpisodeById(Long id) {
        return episodeRepository.findById(id).orElseGet(() -> null);
    }

    public List<Episode> getAllEpisodes() {
        return episodeRepository.findAll();
    }

    public Episode addEpisode(Episode episode) {
        return episodeRepository.save(episode);
    }

    public Episode updateEpisode(Long id, Episode episode) {
        episodeRepository.findById(id).orElseGet(() -> null);
        episode.setId(id);
        return episodeRepository.save(episode);
    }

    public void deleteEpisode(Long id) {
        episodeRepository.deleteById(id);
    }

    //TODO
    public Episode getRandomEpisode() {
        int randomSeason = (int) (Math.random() * ((seasonRepository.findAll().size()) + 1)) + 1;
        int randomEpisode = 21;
        Episode episode = new Episode();


        return episode;
    }
}
